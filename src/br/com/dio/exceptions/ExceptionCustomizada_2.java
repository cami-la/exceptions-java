package br.com.dio.exceptions;

import javax.swing.*;
import java.util.Arrays;

public class ExceptionCustomizada_2 {
    public static void main(String[] args){
        int[] numerador = {4, 5, 8, 10};
        int[] denominador = {2, 4, 0, 2, 8};


        for (int i = 0; i < denominador.length; i++) {
            try{
                if(denominador[i] == 0)
                    throw new DivisaoPorZeroException("Divisao por Zero",denominador[i]);
                try {
                    if (numerador[i] % denominador[i] != 0)
                        throw new DivisaoNaoExataException("Divisão não exata!", numerador[i], denominador[i]);
                }catch(ArrayIndexOutOfBoundsException e){
                    throw new TamanhoDoArrayInvalidoException("Tamanho do Array Invalido", i);
                }

                int resultado = numerador[i] / denominador[i];
                System.out.println(resultado);


            } catch (DivisaoNaoExataException | DivisaoPorZeroException | TamanhoDoArrayInvalidoException e) {
                // e.printStackTrace();
                JOptionPane.showMessageDialog(null, e.getMessage());
            }



        }


        System.out.println("O programa continua...");
    }
}


