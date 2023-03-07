package br.com.dio.exceptions;

public class TamanhoDoArrayInvalidoException extends Exception{

      private int i;

        public TamanhoDoArrayInvalidoException(String message, int i) {
            super(message);
            this.i = i;
        }
}
