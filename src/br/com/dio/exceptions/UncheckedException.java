package br.com.dio.exceptions;

import javax.swing.*;

//Fazer a divisão de 2 valores inteiros
public class UncheckedException {
    public static void main(String[] args) {

        boolean continuaLooping = true;
        do {
            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Denominador: ");

            try {
                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                System.out.println("Resultado: " + resultado);
                continuaLooping = false;
            } catch (ArithmeticException ex) {
                JOptionPane.showMessageDialog(null, "Divisão impossível! " + ex.getMessage());
                ex.printStackTrace();
            } finally {
                System.out.println("Chegou no finally!");
            }
        } while(continuaLooping);

        System.out.println("O programa continua independente de exception!");
    }

    public static int dividir(int a, int b) {
        return a / b;
    }
}
