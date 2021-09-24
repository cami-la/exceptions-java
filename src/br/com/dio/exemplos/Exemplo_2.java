package br.com.dio.exemplos;

import java.io.*;

public class Exemplo_2 {
    public static void main(String[] args) {
        escreveNoDocumento("filmes-favoritos.txt");
    }

    public static String lerDoTeclado() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();
    }

    public static void escreveNoDocumento(String nomeDoDocumento) {
        File file = new File(nomeDoDocumento);
        BufferedWriter bw = new BufferedWriter(new FileWriter(file.getName()));

        String line = lerDoTeclado();
        do {
            bw.write(line);
            bw.newLine();
            line = lerDoTeclado();
        } while (!line.isEmpty());
        bw.flush();

        bw.close();
    }
}
