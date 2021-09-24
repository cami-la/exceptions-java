package br.com.dio.exemplos;

import java.util.Scanner;

public class Exemplo_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int resultado = dividir(scan.nextInt(), scan.nextInt());
        System.out.println(resultado);
    }

    public static int dividir(int a, int b) {
        return a / b;
    }
}
