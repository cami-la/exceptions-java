package test;

public class Exemplo_3 {
    public static void main(String[] args) {
        int[] numerador = {4, 2, 5, 8, 10};
        int[] denominador = {2, 4, 4, 4, 2, 8};

        for(int i = 0; i < denominador.length; i++) {
            int resultado = numerador[i] / denominador[i];
            System.out.print(resultado + " ");
        }
    }
}
