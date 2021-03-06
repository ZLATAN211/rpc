package com.cxl.rpc.remoting.consumer.call.impl;

import com.cxl.rpc.remoting.consumer.call.CallBack;
import com.cxl.rpc.remoting.net.params.RpcRequest;
import com.cxl.rpc.remoting.net.params.RpcResponse;
import com.cxl.rpc.util.RpcException;

import java.util.concurrent.TimeUnit;

public class SyncCallStrategy extends CallBack {


    @Override
    public Object export(RpcRequest request) {
        RpcResponse response;
        try {
            client.asyncSend(address, request);
            response = rpcFutureResponse.get(5000, TimeUnit.MILLISECONDS);
            if (null != response.getErrorMsg()) {
                throw new RpcException(response.getErrorMsg());
            }
            return response.getResult();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            rpcInvokerFactory.removeInvokerFuture(request.getRequestId());
        }
        return null;
    }
}
