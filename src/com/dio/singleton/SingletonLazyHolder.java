package com.dio.singleton;
public class SingletonLazyHolder {

    private static class InstanceHolder { //ela só serve para a instancia
    
    private static SingletonLazyHolder instancia = new SingletonLazyHolder(); 
    }

    public SingletonLazyHolder() {
    super();
    } 

    public static SingletonLazyHolder getInstancia() {
    return InstanceHolder.instancia;
    }
}
