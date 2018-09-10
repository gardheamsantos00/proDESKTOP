/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pro_desktop.controller;


import br.com.pro_desktop.arquivos.BD;
import br.com.pro_desktop.model.Cliente;
import java.util.List;

/**
 *
 * @author gardh
 */
public class ClienteDAO {

    // adicione mais validacoes se quiser fazer a 
    //validacao direto no DAO
    public boolean addDao(Cliente obj){
        if(obj.getIdCli() == null){
            int id = BD.listCliente.size()+1;
            obj.setIdCli(id);
            BD.listCliente.add(obj);
        }
        return true;
    }
    
    public boolean removeDao(Cliente obj){
        BD.listCliente.remove(obj);
        return true;
    }
    
    public List<Cliente> getAllCliente() {

        return BD.listCliente;
    }
}
