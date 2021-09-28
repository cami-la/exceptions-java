package test;

import javax.swing.*;

public class ExceptionCustomizada_2 {
    public static void main(String[] args) {
        int[] numerador = {4, 2, 5, 8, 10};
        int[] denominador = {2, 0, 4, 0, 2, 8};

        for(int i = 0; i < denominador.length; i++) {
            try{
                if(numerador[i] % 2 != 0) throw new DivisaoNaoExataException(numerador[i]);

                int resultado = numerador[i] / denominador[i];
                System.out.println(resultado);
            } catch (DivisaoNaoExataException | ArithmeticException | ArrayIndexOutOfBoundsException e) {
                JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }

}

class DivisaoNaoExataException extends Exception {
    private int numerador;

    public DivisaoNaoExataException(int numerador) {
        super("O valor " + numerador + "é ímpar, por tanto, divisão não exata!");
        this.numerador = numerador;
    }
}