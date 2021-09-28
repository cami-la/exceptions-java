package test;

import javax.swing.*;

public class UncheckedException {
    public static void main(String[] args) {

        boolean continueLooping = true;
        do {
            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Denominador: ");
            try {
                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                System.out.println("Resultado: " + resultado);
                continueLooping = false;
            } catch (ArithmeticException e) {
                JOptionPane.showMessageDialog(null, "Divisão Impossível!" + e.getMessage());
                e.printStackTrace();
            } finally {
                System.out.println("Chegou no finally!");
            }
        } while (continueLooping);
    }

    public static int dividir(int a, int b) {
        return a / b;
    }
}
