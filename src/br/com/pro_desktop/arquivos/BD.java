/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pro_desktop.arquivos;

import br.com.pro_desktop.model.Cliente;



import java.util.ArrayList;
import java.util.List;
import java.lang.reflect.Type;

import com.google.gson.reflect.TypeToken;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.File;

/**
 *
 * @author gardh
 */
public class BD {

    public static List<Cliente> listCliente = new ArrayList<>();
    
    
    Type type = new TypeToken<List<Cliente>>(){}.getType();
    Gson gson = new GsonBuilder().create();
    String json = gson.toJson(listCliente, type);
    
    
    List<Cliente> listaRetornoCliente = gson.fromJson(json, type);
 
    public  void grava(){
        File arquivo = TestaArquivo.getArquivo();
        if(arquivo != null) {
            if(TestaArquivo.escreverTexto(arquivo,json)){
                System.out.println(json.toString()); 
            }else {
                System.out.println("Erro ao salvar no json");
            }
        }
    }
    
    
}
