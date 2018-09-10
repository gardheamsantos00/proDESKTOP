/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pro_desktop.arquivos;

import br.com.pro_desktop.model.Cliente;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;
import java.lang.reflect.Type;

import com.google.gson.reflect.TypeToken;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

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
 
    
    
    public static boolean escreverTexto(File arquivo, String json) {
        boolean retorno = false;
        try {

            BufferedWriter buff = new BufferedWriter(
                    new FileWriter(arquivo, true));
            buff.write(json);
            buff.close();
            retorno = true;
        } catch (IOException e) {
            System.err.println("Erro na escrta do texto. : " + e);
        } finally {
            return retorno;
        }
    }
     
    public static String lerOTexto(File arquivo) {

        StringBuilder str = new StringBuilder();

        try {
            BufferedReader buffR = new BufferedReader(new FileReader(arquivo));

            while (buffR.ready()) {
                str.append(buffR.readLine());

            }
            buffR.close();

        } catch (IOException e) {
            System.err.println("erro na leitura do arquivo" + e);
        } finally {
            return str.toString();
        }
    }

   public static File getArquivo() {
        File arquivo = null;
        String pastainicial = System.getProperty("user.dir");


        System.out.println(System.getProperties());

        JFileChooser chooser = new JFileChooser(pastainicial);

        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);

        int opcao = chooser.showSaveDialog(null);

        if (opcao == JFileChooser.APPROVE_OPTION) {
            arquivo = chooser.getSelectedFile();

            System.out.println("O Arquivo selecionado foi: "
                    + arquivo.getAbsolutePath());
        }
        return arquivo;
    }
}
