/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pro_desktop.arquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;

/**
 *
 * @author gardh
 */
public class TestaArquivo {

    public static File getArquivo() {
        File arquivo = null;
        String pastainicial = System.getProperty("user.dir");

//caso queiram saber mais:
        System.out.println(System.getProperties());

        JFileChooser chooser = new JFileChooser(pastainicial);

        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
//ou
//chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
//ou
//chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int opcao = chooser.showSaveDialog(null);

        if (opcao == JFileChooser.APPROVE_OPTION) {
            arquivo = chooser.getSelectedFile();

            System.out.println("O Arquivo selecionado foi: "
                    + arquivo.getAbsolutePath());
        }
        return arquivo;
    }

    //quantas pastas
    //quantos arquivos
    //tamanho utilizado no disco
    public static boolean escreverTexto(File arquivo, String texto) {
        boolean retorno = false;
        try {

            BufferedWriter buff = new BufferedWriter(
                    new FileWriter(arquivo, true));
            buff.write(texto);
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

    public static void mostraDados(BufferedWriter buffer, File filho) throws IOException {

        buffer.write("\n\n" + filho.getAbsolutePath());
        buffer.write("\n" + filho.getParent());
        buffer.write("\n É diretorio? " + filho.isDirectory());
        buffer.write("\nÉ arquivo? " + filho.isFile());
        buffer.write("\nTamanho = " + filho.length() + " bytes.");
    }

    public static void gravaTexto(File diretorio, File arquivo) throws IOException {
        // subdir.mkdir();
        String[] arquivos = diretorio.list();

        //escreve efetivamento o arquivo que ta referenciado pelo File aqrquivo
        FileWriter escritor = new FileWriter(arquivo);
        BufferedWriter bufferEscritor = new BufferedWriter(escritor);

        for (int i = 0; i < arquivos.length; i++) {
            File filho = new File(diretorio, arquivos[i]);

            mostraDados(bufferEscritor, filho);

            bufferEscritor.flush(); //descarrega tudo
        }

        escritor.close();
        bufferEscritor.close();

    }

    public static void lerTexto(File arquivo) throws FileNotFoundException, IOException {
        FileReader leitor = new FileReader(arquivo);
        //cria bufferReader
        BufferedReader leitorBuffer = new BufferedReader(leitor);

        while (leitorBuffer.ready()) {
            String aux = leitorBuffer.readLine(); //le e posiciona no proximo
            System.out.println("\ncaractere = " + aux);
        }
        leitor.close();
    }

    public static void main(String[] args) throws IOException {
        File diretorio = new File("C:/xampp/");

        if (diretorio.mkdir()) {
            System.out.println("diretório criado");
        } else {
            System.out.println("diretório principal não foi criado");
        }
        File arquivo = new File(diretorio, "log.txt");
        // File subdir = new File(diretorio, "subdir1");

        gravaTexto(diretorio, arquivo);
        lerTexto(arquivo);

//        if (arquivo.exists()) {
//           arquivo.delete();
//        } else {
//            arquivo.createNewFile();
//        }
    }
}
