package br.com.guilhermevillaca.padroes.estruturais.adapter;

/**
 *
 * @author villaca
 */
public class AdaptadorPagamento implements SistemaPagamentoNovo {
    private SistemaPagamentoAntigo sistemaPagamentoAntigo;

    public AdaptadorPagamento(SistemaPagamentoAntigo sistemaPagamentoAntigo) {
        this.sistemaPagamentoAntigo = sistemaPagamentoAntigo;
    }

    @Override
    public void processarPagamento(String clienteId, double valor) {
        // Adapta a chamada da nova interface para a antiga
        sistemaPagamentoAntigo.realizarPagamento(clienteId, valor);
    }
}