package com.cczyWyc.myRpc.proxy;

/**
 * @author wangyc
 */
public class ProxyMain {
    public static void main(String[] args) {
        JDKProxy jdkProxy = new JDKProxy(new RealHello());
    }
}
