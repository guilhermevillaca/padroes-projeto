package br.com.guilhermevillaca.padroes.estruturais.adapter;

/**
 *
 * @author villaca
 */
public interface SistemaPagamentoNovo {

    void processarPagamento(String clienteId, double valor);
}
