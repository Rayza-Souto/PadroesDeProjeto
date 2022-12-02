package com.dio.facade;

import com.dio.subsistema2cep.CepApi;
import com.dio.subsistemacrm.CrmService;

public class Facade {
    
    public void migrarCliente (String nome, String cep){

        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);
         
        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}
