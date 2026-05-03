# Sistema de Previsão Meteorológica Distribuído (gRPC + Spring Boot)

Este projeto implementa um sistema distribuído cliente-servidor para consulta de dados meteorológicos. Uma API REST atua como cliente (ponte), recebendo requisições HTTP e comunicando-se internamente com um servidor gRPC responsável por processar os dados em memória.

## Como rodar o projeto

1. **Pré-requisitos:** Java 17 e Maven instalados.
2. Clone o repositório e abra na sua IDE (recomendado: IntelliJ IDEA).
3. **Geração dos Stubs:** Antes de rodar, é necessário compilar o arquivo de contrato do gRPC.
   * No painel do Maven da IDE, execute o comando `clean` e em seguida `compile`.
   * *Alternativa via terminal:* `mvn clean compile`
4. **Execução:** Rode a classe principal `Main.java` (`org.example.Main`).
5. O sistema subirá dois serviços simultaneamente:
   * **Cliente REST (Tomcat):** Porta `8080`
   * **Servidor gRPC:** Porta `9090`
6. Utilize o Postman (ou navegador) para testar os endpoints HTTP na porta 8080.

---

## Explicação do Arquivo `.proto` (`clima.proto`)

O arquivo `.proto` (Protocol Buffers) atua como o contrato de comunicação entre o cliente e o servidor. Ele define as funções disponíveis e o formato dos dados que trafegam na rede.

### Definição do Serviço (`service`)
O bloco `service ClimaService` define a interface da nossa API gRPC. É aqui que declaramos quais operações (RPCs) podem ser chamadas remotamente pelo cliente.

### Definição das Mensagens (`message`)
As `messages` são as estruturas de dados (como os DTOs em Java). Elas definem o payload de envio e retorno. Cada atributo possui um tipo (ex: `string`, `double`) e um número identificador sequencial (ex: `= 1;`), que o gRPC usa para serializar os dados em formato binário de forma extremamente eficiente.
*Exemplo:* `message CidadeRequest { string nome = 1; }`

### Explicação de cada RPC implementado
Dentro do nosso serviço, temos 5 métodos:
1. `ObterTemperaturaAtual`: Recebe um `CidadeRequest` com o nome da cidade e retorna um `TemperaturaResponse` com o valor em `double`.
2. `PrevisaoCincoDias`: Recebe a cidade e devolve um `PrevisaoResponse` contendo uma lista (`repeated double`) simulando os próximos 5 dias.
3. `ListarCidades`: Recebe um `VazioRequest` (sem parâmetros) e retorna um `ListaCidadesResponse` com todas as chaves salvas no sistema.
4. `CadastrarCidade`: Recebe um `NovaCidadeRequest` (nome e temperatura atual) para popular o mapa em memória e retorna um `StatusResponse`.
5. `EstatisticasClimaticas`: Recebe a cidade e retorna um `EstatisticasResponse` contendo a média, mínima e máxima (calculadas com base na temperatura atual).

### Como o `.proto` gera código (stubs)
Durante o processo de *build* (`mvn compile`), o plugin do Maven (`protobuf-maven-plugin`) chama o compilador nativo `protoc`. Este compilador lê o arquivo `.proto` e gera automaticamente classes Java dentro da pasta `target/generated-sources`.
Essas classes geradas (conhecidas como *Stubs* e *Messages*) cuidam de toda a complexidade de rede, serialização e desserialização. Para o nosso código Java, chamar um método no outro servidor parece uma simples chamada de método local.

---

## Fluxo Completo: Da Requisição HTTP à Chamada gRPC

O fluxo de funcionamento do sistema ocorre da seguinte maneira:

1. **Requisição HTTP (Cliente Externo):** O usuário faz uma requisição via Postman (ex: `GET http://localhost:8080/temperatura?cidade=Urutai`).
2. **Recepção no REST:** O Spring Boot intercepta essa requisição e a direciona para o método correspondente no `@RestController` (`ClimaController`).
3. **Conversão para gRPC:** O *Controller* pega o parâmetro da URL ("Urutai") e constrói o objeto de mensagem gRPC (`CidadeRequest`).
4. **Chamada de Rede:** Usando o *Stub* gerado automaticamente (`climaStub`), o cliente faz uma chamada RPC para o Servidor gRPC via TCP (na porta 9090). O payload trafega serializado em binário (Protobuf).
5. **Processamento no Servidor:** A classe `ClimaServiceImpl` (no servidor) recebe a requisição, extrai o nome da cidade, consulta o `HashMap` em memória, processa a lógica de negócio e monta a mensagem de resposta (`TemperaturaResponse`).
6. **Retorno ao Cliente:** A resposta faz o caminho inverso. O *Controller* REST recebe os dados do *Stub*, extrai os valores primitivos, e o Spring os converte nativamente para o formato JSON/Texto para responder à requisição HTTP original do Postman.

---

## Sistema em Funcionamento

**1. Listar Cidades (GET)**
![Listar Cidades](cidades.png)

**2. Obter Temperatura Atual (GET)**
![Temperatura Atual](temperatura.png)

**3. Obter Previsão de 5 dias (GET)**
![Previsao 5 Dias](previsao.png)

**4. Obter Estatísticas Climáticas (GET)**
![Estatisticas](estatisticas.png)

**5. Cadastrar Nova Cidade (POST)**
![Cadastrar Cidade](cadastrar.png)