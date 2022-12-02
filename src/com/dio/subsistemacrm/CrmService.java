package com.dio.subsistemacrm;

public class CrmService {

    private CrmService(){
        super();
    }

    public static void gravarCliente (String nome, String cep, String cidade, String estado){
        System.out.println("cliente salvo no sistema de CRM");
        System.out.println(nome);
        System.out.println(cep);
        System.out.println(cidade);
        System.out.println(estado);
    }
    
}
