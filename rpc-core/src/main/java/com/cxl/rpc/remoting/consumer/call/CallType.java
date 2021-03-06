package com.cxl.rpc.remoting.consumer.call;

public enum  CallType {
    SYNC,

    FUTURE,

    CALLBACK,

    ONEWAY;


    public static String match(String name, CallType defaultCallType){
        for (CallType item: CallType.values()) {
            if (item.name().equals(name)){
                return item.name();
            }
        }
        return defaultCallType.name();
    }
}
