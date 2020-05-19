package com.cxl.rpc.remoting.consumer.generic;

public interface RpcGenericService {
    /**
     * generic invoke
     *
     * @param iface                 iface name
     * @param version               iface version
     * @param method                method name
     * @param parameterTypes        parameter types, limit base type like "int、java.lang.Integer、java.util.List、java.util.Map ..."
     * @param args
     * @return
     */
    Object invoke(String iface,String version,String method,String[] parameterTypes,Object[] args);
}
