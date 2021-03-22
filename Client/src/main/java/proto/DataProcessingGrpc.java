package proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: client.proto")
public final class DataProcessingGrpc {

  private DataProcessingGrpc() {}

  public static final String SERVICE_NAME = "DataProcessing";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<proto.Client.DataRequest,
      proto.Client.DataResponse> getProcessDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "processData",
      requestType = proto.Client.DataRequest.class,
      responseType = proto.Client.DataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.Client.DataRequest,
      proto.Client.DataResponse> getProcessDataMethod() {
    io.grpc.MethodDescriptor<proto.Client.DataRequest, proto.Client.DataResponse> getProcessDataMethod;
    if ((getProcessDataMethod = DataProcessingGrpc.getProcessDataMethod) == null) {
      synchronized (DataProcessingGrpc.class) {
        if ((getProcessDataMethod = DataProcessingGrpc.getProcessDataMethod) == null) {
          DataProcessingGrpc.getProcessDataMethod = getProcessDataMethod = 
              io.grpc.MethodDescriptor.<proto.Client.DataRequest, proto.Client.DataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "DataProcessing", "processData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.Client.DataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.Client.DataResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new DataProcessingMethodDescriptorSupplier("processData"))
                  .build();
          }
        }
     }
     return getProcessDataMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DataProcessingStub newStub(io.grpc.Channel channel) {
    return new DataProcessingStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DataProcessingBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DataProcessingBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DataProcessingFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DataProcessingFutureStub(channel);
  }

  /**
   */
  public static abstract class DataProcessingImplBase implements io.grpc.BindableService {

    /**
     */
    public void processData(proto.Client.DataRequest request,
        io.grpc.stub.StreamObserver<proto.Client.DataResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getProcessDataMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getProcessDataMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.Client.DataRequest,
                proto.Client.DataResponse>(
                  this, METHODID_PROCESS_DATA)))
          .build();
    }
  }

  /**
   */
  public static final class DataProcessingStub extends io.grpc.stub.AbstractStub<DataProcessingStub> {
    private DataProcessingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DataProcessingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataProcessingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DataProcessingStub(channel, callOptions);
    }

    /**
     */
    public void processData(proto.Client.DataRequest request,
        io.grpc.stub.StreamObserver<proto.Client.DataResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getProcessDataMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class DataProcessingBlockingStub extends io.grpc.stub.AbstractStub<DataProcessingBlockingStub> {
    private DataProcessingBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DataProcessingBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataProcessingBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DataProcessingBlockingStub(channel, callOptions);
    }

    /**
     */
    public proto.Client.DataResponse processData(proto.Client.DataRequest request) {
      return blockingUnaryCall(
          getChannel(), getProcessDataMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class DataProcessingFutureStub extends io.grpc.stub.AbstractStub<DataProcessingFutureStub> {
    private DataProcessingFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DataProcessingFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataProcessingFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DataProcessingFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.Client.DataResponse> processData(
        proto.Client.DataRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getProcessDataMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PROCESS_DATA = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DataProcessingImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DataProcessingImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PROCESS_DATA:
          serviceImpl.processData((proto.Client.DataRequest) request,
              (io.grpc.stub.StreamObserver<proto.Client.DataResponse>) responseObserver);
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

  private static abstract class DataProcessingBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DataProcessingBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return proto.Client.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DataProcessing");
    }
  }

  private static final class DataProcessingFileDescriptorSupplier
      extends DataProcessingBaseDescriptorSupplier {
    DataProcessingFileDescriptorSupplier() {}
  }

  private static final class DataProcessingMethodDescriptorSupplier
      extends DataProcessingBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DataProcessingMethodDescriptorSupplier(String methodName) {
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
      synchronized (DataProcessingGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DataProcessingFileDescriptorSupplier())
              .addMethod(getProcessDataMethod())
              .build();
        }
      }
    }
    return result;
  }
}
