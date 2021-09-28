package test;

import javax.swing.*;
import java.io.*;

public class CheckedException {
    public static void main(String[] args) {
        String nomeDoArquivo = JOptionPane.showInputDialog("Nome do arquivo a ser exibido: ");
        imprimirArquivoNoConsole(nomeDoArquivo);

        System.out.println("Com da exception ou não, o programa continua...");
    }

    public static void imprimirArquivoNoConsole(String nomeDoArquivo) {
        File file = new File(nomeDoArquivo);

        try(BufferedReader br = new BufferedReader(new FileReader(file.getName()))){
            String line = br.readLine();

            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            do{
                bw.write(line);
                bw.newLine();
                line=br.readLine();
            } while(line != null);
            bw.flush();
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Arquivo " + file.getName() + " não encontrado.");
            e.printStackTrace();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado! Por favor, contacte o suporte! " + e.getMessage());
            e.printStackTrace();
        }
    }
}
