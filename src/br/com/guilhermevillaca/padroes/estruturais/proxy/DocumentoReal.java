package br.com.guilhermevillaca.padroes.estruturais.proxy;

/**
 *
 * @author villaca
 */
public class DocumentoReal implements Documento {

    private String nomeArquivo;

    public DocumentoReal(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
        carregarDoDisco();
    }

    private void carregarDoDisco() {
        System.out.println("Carregando " + nomeArquivo);
    }

    @Override
    public void exibir() {
        System.out.println("Exibindo " + nomeArquivo);
    }
}
