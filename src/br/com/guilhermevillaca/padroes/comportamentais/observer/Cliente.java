package br.com.guilhermevillaca.padroes.comportamentais.observer;

/**
 *
 * @author villaca
 */
// Classe Cliente que implementa Observer
public class Cliente implements Observer {

    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(String nomeProduto, int quantidade) {
        System.out.println("Cliente " + nome + " foi notificado: Produto " + nomeProduto + " agora tem " + quantidade + " unidades em estoque.");
    }
}
