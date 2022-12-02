package com.dio.singleton;
public class SingletonEager {
    
    private static SingletonEager instancia = new SingletonEager(); //a diferença do lazy

    public SingletonEager() {
    super();
    } 

    public static SingletonEager getInstancia() {
    return instancia;
    } 

}
