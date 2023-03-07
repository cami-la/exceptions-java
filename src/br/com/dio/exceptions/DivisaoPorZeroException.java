package br.com.dio.exceptions;

public class DivisaoPorZeroException extends Exception {

        private int denominador;

        public DivisaoPorZeroException(String message, int denominador) {
            super(message);
            this.denominador = denominador;
        }

}
