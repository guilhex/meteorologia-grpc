package org.example;

import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class ClimaController {

    @GrpcClient("clima-server")
    private ClimaServiceGrpc.ClimaServiceBlockingStub climaStub;

    @PostMapping("/cidade")
    public String cadastrarCidade(@RequestParam String nome, @RequestParam double temperatura) {
        NovaCidadeRequest request = NovaCidadeRequest.newBuilder()
                .setNome(nome)
                .setTemperaturaAtual(temperatura)
                .build();
        return climaStub.cadastrarCidade(request).getMensagem();
    }

    @GetMapping("/cidades")
    public List<String> listarCidades() {
        VazioRequest request = VazioRequest.newBuilder().build();
        return climaStub.listarCidades(request).getCidadesList();
    }

    @GetMapping("/temperatura")
    public double getTemperatura(@RequestParam String cidade) {
        CidadeRequest request = CidadeRequest.newBuilder().setNome(cidade).build();
        return climaStub.obterTemperaturaAtual(request).getTemperatura();
    }

    @GetMapping("/previsao")
    public List<Double> getPrevisao(@RequestParam String cidade) {
        CidadeRequest request = CidadeRequest.newBuilder().setNome(cidade).build();
        return climaStub.previsaoCincoDias(request).getTemperaturasList();
    }

    @GetMapping("/estatisticas")
    public EstatisticasResponseDTO getEstatisticas(@RequestParam String cidade) {
        CidadeRequest request = CidadeRequest.newBuilder().setNome(cidade).build();
        EstatisticasResponse response = climaStub.estatisticasClimaticas(request);
        return new EstatisticasResponseDTO(response.getMedia(), response.getMinima(), response.getMaxima());
    }

    record EstatisticasResponseDTO(double media, double minima, double maxima) {}
}