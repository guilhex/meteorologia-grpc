package org.example;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@GrpcService
public class ClimaServiceImpl extends ClimaServiceGrpc.ClimaServiceImplBase {

    private final Map<String, Double> bancoCidades = new ConcurrentHashMap<>();

    public ClimaServiceImpl() {
        bancoCidades.put("Urutai", 28.5);
        bancoCidades.put("Goiania", 32.0);
    }

    @Override
    public void obterTemperaturaAtual(CidadeRequest request, StreamObserver<TemperaturaResponse> responseObserver) {
        Double temp = bancoCidades.getOrDefault(request.getNome(), 0.0);
        TemperaturaResponse response = TemperaturaResponse.newBuilder().setTemperatura(temp).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void previsaoCincoDias(CidadeRequest request, StreamObserver<PrevisaoResponse> responseObserver) {
        Double tempAtual = bancoCidades.getOrDefault(request.getNome(), 0.0);
        PrevisaoResponse response = PrevisaoResponse.newBuilder()
                .addTemperaturas(tempAtual)
                .addTemperaturas(tempAtual + 1.2)
                .addTemperaturas(tempAtual - 0.5)
                .addTemperaturas(tempAtual + 2.0)
                .addTemperaturas(tempAtual - 1.0)
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void listarCidades(VazioRequest request, StreamObserver<ListaCidadesResponse> responseObserver) {
        ListaCidadesResponse response = ListaCidadesResponse.newBuilder()
                .addAllCidades(bancoCidades.keySet())
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void cadastrarCidade(NovaCidadeRequest request, StreamObserver<StatusResponse> responseObserver) {
        bancoCidades.put(request.getNome(), request.getTemperaturaAtual());
        StatusResponse response = StatusResponse.newBuilder()
                .setMensagem("Cidade cadastrada com sucesso!")
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void estatisticasClimaticas(CidadeRequest request, StreamObserver<EstatisticasResponse> responseObserver) {
        Double tempAtual = bancoCidades.getOrDefault(request.getNome(), 0.0);
        EstatisticasResponse response = EstatisticasResponse.newBuilder()
                .setMedia(tempAtual)
                .setMaxima(tempAtual + 5.0)
                .setMinima(tempAtual - 5.0)
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}