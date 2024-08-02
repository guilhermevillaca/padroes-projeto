package br.com.guilhermevillaca.padroes.estruturais.composite;

/**
 *
 * @author villaca
 */
public class Arquivo implements Componente {

    private String nome;

    public Arquivo(String nome) {
        this.nome = nome;
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("Arquivo: " + nome);
    }
}
