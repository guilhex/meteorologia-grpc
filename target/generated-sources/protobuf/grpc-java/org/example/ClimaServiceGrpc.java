package org.example;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: clima.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ClimaServiceGrpc {

  private ClimaServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "ClimaService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.example.CidadeRequest,
      org.example.TemperaturaResponse> getObterTemperaturaAtualMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ObterTemperaturaAtual",
      requestType = org.example.CidadeRequest.class,
      responseType = org.example.TemperaturaResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.CidadeRequest,
      org.example.TemperaturaResponse> getObterTemperaturaAtualMethod() {
    io.grpc.MethodDescriptor<org.example.CidadeRequest, org.example.TemperaturaResponse> getObterTemperaturaAtualMethod;
    if ((getObterTemperaturaAtualMethod = ClimaServiceGrpc.getObterTemperaturaAtualMethod) == null) {
      synchronized (ClimaServiceGrpc.class) {
        if ((getObterTemperaturaAtualMethod = ClimaServiceGrpc.getObterTemperaturaAtualMethod) == null) {
          ClimaServiceGrpc.getObterTemperaturaAtualMethod = getObterTemperaturaAtualMethod =
              io.grpc.MethodDescriptor.<org.example.CidadeRequest, org.example.TemperaturaResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ObterTemperaturaAtual"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.CidadeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.TemperaturaResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ClimaServiceMethodDescriptorSupplier("ObterTemperaturaAtual"))
              .build();
        }
      }
    }
    return getObterTemperaturaAtualMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.CidadeRequest,
      org.example.PrevisaoResponse> getPrevisaoCincoDiasMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PrevisaoCincoDias",
      requestType = org.example.CidadeRequest.class,
      responseType = org.example.PrevisaoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.CidadeRequest,
      org.example.PrevisaoResponse> getPrevisaoCincoDiasMethod() {
    io.grpc.MethodDescriptor<org.example.CidadeRequest, org.example.PrevisaoResponse> getPrevisaoCincoDiasMethod;
    if ((getPrevisaoCincoDiasMethod = ClimaServiceGrpc.getPrevisaoCincoDiasMethod) == null) {
      synchronized (ClimaServiceGrpc.class) {
        if ((getPrevisaoCincoDiasMethod = ClimaServiceGrpc.getPrevisaoCincoDiasMethod) == null) {
          ClimaServiceGrpc.getPrevisaoCincoDiasMethod = getPrevisaoCincoDiasMethod =
              io.grpc.MethodDescriptor.<org.example.CidadeRequest, org.example.PrevisaoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PrevisaoCincoDias"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.CidadeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.PrevisaoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ClimaServiceMethodDescriptorSupplier("PrevisaoCincoDias"))
              .build();
        }
      }
    }
    return getPrevisaoCincoDiasMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.VazioRequest,
      org.example.ListaCidadesResponse> getListarCidadesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListarCidades",
      requestType = org.example.VazioRequest.class,
      responseType = org.example.ListaCidadesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.VazioRequest,
      org.example.ListaCidadesResponse> getListarCidadesMethod() {
    io.grpc.MethodDescriptor<org.example.VazioRequest, org.example.ListaCidadesResponse> getListarCidadesMethod;
    if ((getListarCidadesMethod = ClimaServiceGrpc.getListarCidadesMethod) == null) {
      synchronized (ClimaServiceGrpc.class) {
        if ((getListarCidadesMethod = ClimaServiceGrpc.getListarCidadesMethod) == null) {
          ClimaServiceGrpc.getListarCidadesMethod = getListarCidadesMethod =
              io.grpc.MethodDescriptor.<org.example.VazioRequest, org.example.ListaCidadesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListarCidades"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.VazioRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.ListaCidadesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ClimaServiceMethodDescriptorSupplier("ListarCidades"))
              .build();
        }
      }
    }
    return getListarCidadesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.NovaCidadeRequest,
      org.example.StatusResponse> getCadastrarCidadeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CadastrarCidade",
      requestType = org.example.NovaCidadeRequest.class,
      responseType = org.example.StatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.NovaCidadeRequest,
      org.example.StatusResponse> getCadastrarCidadeMethod() {
    io.grpc.MethodDescriptor<org.example.NovaCidadeRequest, org.example.StatusResponse> getCadastrarCidadeMethod;
    if ((getCadastrarCidadeMethod = ClimaServiceGrpc.getCadastrarCidadeMethod) == null) {
      synchronized (ClimaServiceGrpc.class) {
        if ((getCadastrarCidadeMethod = ClimaServiceGrpc.getCadastrarCidadeMethod) == null) {
          ClimaServiceGrpc.getCadastrarCidadeMethod = getCadastrarCidadeMethod =
              io.grpc.MethodDescriptor.<org.example.NovaCidadeRequest, org.example.StatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CadastrarCidade"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.NovaCidadeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.StatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ClimaServiceMethodDescriptorSupplier("CadastrarCidade"))
              .build();
        }
      }
    }
    return getCadastrarCidadeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.CidadeRequest,
      org.example.EstatisticasResponse> getEstatisticasClimaticasMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EstatisticasClimaticas",
      requestType = org.example.CidadeRequest.class,
      responseType = org.example.EstatisticasResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.CidadeRequest,
      org.example.EstatisticasResponse> getEstatisticasClimaticasMethod() {
    io.grpc.MethodDescriptor<org.example.CidadeRequest, org.example.EstatisticasResponse> getEstatisticasClimaticasMethod;
    if ((getEstatisticasClimaticasMethod = ClimaServiceGrpc.getEstatisticasClimaticasMethod) == null) {
      synchronized (ClimaServiceGrpc.class) {
        if ((getEstatisticasClimaticasMethod = ClimaServiceGrpc.getEstatisticasClimaticasMethod) == null) {
          ClimaServiceGrpc.getEstatisticasClimaticasMethod = getEstatisticasClimaticasMethod =
              io.grpc.MethodDescriptor.<org.example.CidadeRequest, org.example.EstatisticasResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EstatisticasClimaticas"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.CidadeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.EstatisticasResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ClimaServiceMethodDescriptorSupplier("EstatisticasClimaticas"))
              .build();
        }
      }
    }
    return getEstatisticasClimaticasMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ClimaServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ClimaServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ClimaServiceStub>() {
        @java.lang.Override
        public ClimaServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ClimaServiceStub(channel, callOptions);
        }
      };
    return ClimaServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ClimaServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ClimaServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ClimaServiceBlockingStub>() {
        @java.lang.Override
        public ClimaServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ClimaServiceBlockingStub(channel, callOptions);
        }
      };
    return ClimaServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ClimaServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ClimaServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ClimaServiceFutureStub>() {
        @java.lang.Override
        public ClimaServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ClimaServiceFutureStub(channel, callOptions);
        }
      };
    return ClimaServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void obterTemperaturaAtual(org.example.CidadeRequest request,
        io.grpc.stub.StreamObserver<org.example.TemperaturaResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getObterTemperaturaAtualMethod(), responseObserver);
    }

    /**
     */
    default void previsaoCincoDias(org.example.CidadeRequest request,
        io.grpc.stub.StreamObserver<org.example.PrevisaoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPrevisaoCincoDiasMethod(), responseObserver);
    }

    /**
     */
    default void listarCidades(org.example.VazioRequest request,
        io.grpc.stub.StreamObserver<org.example.ListaCidadesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListarCidadesMethod(), responseObserver);
    }

    /**
     */
    default void cadastrarCidade(org.example.NovaCidadeRequest request,
        io.grpc.stub.StreamObserver<org.example.StatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCadastrarCidadeMethod(), responseObserver);
    }

    /**
     */
    default void estatisticasClimaticas(org.example.CidadeRequest request,
        io.grpc.stub.StreamObserver<org.example.EstatisticasResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEstatisticasClimaticasMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ClimaService.
   */
  public static abstract class ClimaServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ClimaServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ClimaService.
   */
  public static final class ClimaServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ClimaServiceStub> {
    private ClimaServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClimaServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ClimaServiceStub(channel, callOptions);
    }

    /**
     */
    public void obterTemperaturaAtual(org.example.CidadeRequest request,
        io.grpc.stub.StreamObserver<org.example.TemperaturaResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getObterTemperaturaAtualMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void previsaoCincoDias(org.example.CidadeRequest request,
        io.grpc.stub.StreamObserver<org.example.PrevisaoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPrevisaoCincoDiasMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listarCidades(org.example.VazioRequest request,
        io.grpc.stub.StreamObserver<org.example.ListaCidadesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListarCidadesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void cadastrarCidade(org.example.NovaCidadeRequest request,
        io.grpc.stub.StreamObserver<org.example.StatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCadastrarCidadeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void estatisticasClimaticas(org.example.CidadeRequest request,
        io.grpc.stub.StreamObserver<org.example.EstatisticasResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEstatisticasClimaticasMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ClimaService.
   */
  public static final class ClimaServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ClimaServiceBlockingStub> {
    private ClimaServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClimaServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ClimaServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.example.TemperaturaResponse obterTemperaturaAtual(org.example.CidadeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getObterTemperaturaAtualMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.PrevisaoResponse previsaoCincoDias(org.example.CidadeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPrevisaoCincoDiasMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.ListaCidadesResponse listarCidades(org.example.VazioRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListarCidadesMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.StatusResponse cadastrarCidade(org.example.NovaCidadeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCadastrarCidadeMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.EstatisticasResponse estatisticasClimaticas(org.example.CidadeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEstatisticasClimaticasMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ClimaService.
   */
  public static final class ClimaServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ClimaServiceFutureStub> {
    private ClimaServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClimaServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ClimaServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.TemperaturaResponse> obterTemperaturaAtual(
        org.example.CidadeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getObterTemperaturaAtualMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.PrevisaoResponse> previsaoCincoDias(
        org.example.CidadeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPrevisaoCincoDiasMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.ListaCidadesResponse> listarCidades(
        org.example.VazioRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListarCidadesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.StatusResponse> cadastrarCidade(
        org.example.NovaCidadeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCadastrarCidadeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.EstatisticasResponse> estatisticasClimaticas(
        org.example.CidadeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEstatisticasClimaticasMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_OBTER_TEMPERATURA_ATUAL = 0;
  private static final int METHODID_PREVISAO_CINCO_DIAS = 1;
  private static final int METHODID_LISTAR_CIDADES = 2;
  private static final int METHODID_CADASTRAR_CIDADE = 3;
  private static final int METHODID_ESTATISTICAS_CLIMATICAS = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_OBTER_TEMPERATURA_ATUAL:
          serviceImpl.obterTemperaturaAtual((org.example.CidadeRequest) request,
              (io.grpc.stub.StreamObserver<org.example.TemperaturaResponse>) responseObserver);
          break;
        case METHODID_PREVISAO_CINCO_DIAS:
          serviceImpl.previsaoCincoDias((org.example.CidadeRequest) request,
              (io.grpc.stub.StreamObserver<org.example.PrevisaoResponse>) responseObserver);
          break;
        case METHODID_LISTAR_CIDADES:
          serviceImpl.listarCidades((org.example.VazioRequest) request,
              (io.grpc.stub.StreamObserver<org.example.ListaCidadesResponse>) responseObserver);
          break;
        case METHODID_CADASTRAR_CIDADE:
          serviceImpl.cadastrarCidade((org.example.NovaCidadeRequest) request,
              (io.grpc.stub.StreamObserver<org.example.StatusResponse>) responseObserver);
          break;
        case METHODID_ESTATISTICAS_CLIMATICAS:
          serviceImpl.estatisticasClimaticas((org.example.CidadeRequest) request,
              (io.grpc.stub.StreamObserver<org.example.EstatisticasResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getObterTemperaturaAtualMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.CidadeRequest,
              org.example.TemperaturaResponse>(
                service, METHODID_OBTER_TEMPERATURA_ATUAL)))
        .addMethod(
          getPrevisaoCincoDiasMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.CidadeRequest,
              org.example.PrevisaoResponse>(
                service, METHODID_PREVISAO_CINCO_DIAS)))
        .addMethod(
          getListarCidadesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.VazioRequest,
              org.example.ListaCidadesResponse>(
                service, METHODID_LISTAR_CIDADES)))
        .addMethod(
          getCadastrarCidadeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.NovaCidadeRequest,
              org.example.StatusResponse>(
                service, METHODID_CADASTRAR_CIDADE)))
        .addMethod(
          getEstatisticasClimaticasMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.CidadeRequest,
              org.example.EstatisticasResponse>(
                service, METHODID_ESTATISTICAS_CLIMATICAS)))
        .build();
  }

  private static abstract class ClimaServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ClimaServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.example.Clima.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ClimaService");
    }
  }

  private static final class ClimaServiceFileDescriptorSupplier
      extends ClimaServiceBaseDescriptorSupplier {
    ClimaServiceFileDescriptorSupplier() {}
  }

  private static final class ClimaServiceMethodDescriptorSupplier
      extends ClimaServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ClimaServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ClimaServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ClimaServiceFileDescriptorSupplier())
              .addMethod(getObterTemperaturaAtualMethod())
              .addMethod(getPrevisaoCincoDiasMethod())
              .addMethod(getListarCidadesMethod())
              .addMethod(getCadastrarCidadeMethod())
              .addMethod(getEstatisticasClimaticasMethod())
              .build();
        }
      }
    }
    return result;
  }
}
