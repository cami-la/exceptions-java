package br.com.dio.exceptions;

import javax.swing.*;
import java.io.*;

public class ExceptionCustomizada_1 {
    public static void main(String[] args) {

        String nomeDoArquivo = "romances-blake-crouch.txt";
        imprimeArquivoNoConsole(nomeDoArquivo);
        System.out.println("Vai chegar nessa linha independente de qualquer coisa!");
    }

    private static void imprimeArquivoNoConsole(String nomeDoArquivo)  {
        File file = new File(nomeDoArquivo);
        try(BufferedReader br = new BufferedReader(new FileReader(file.getName()))) {
            String line = br.readLine();

            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            do{
                bw.write(line);
                bw.newLine();
                line=br.readLine();
            } while(line != null);
            bw.flush();
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Arquivo não existe: " + e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
