package test;

public class NaoFoiPossivelAbrirOArquivoException extends Exception {

    private String nomeDoArquivo;
    private String diretorioDoArquivo;

    public NaoFoiPossivelAbrirOArquivoException(String nomeDoArquivo, String diretorioDoArquivo) {
        super("O arquivo " + nomeDoArquivo + " não foi encontrado no diretório " + diretorioDoArquivo);
        this.nomeDoArquivo = nomeDoArquivo;
        this.diretorioDoArquivo = diretorioDoArquivo;
    }

}
