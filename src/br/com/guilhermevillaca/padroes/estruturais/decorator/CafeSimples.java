package br.com.guilhermevillaca.padroes.estruturais.decorator;

/**
 *
 * @author villaca
 */
public class CafeSimples implements Cafe {

    @Override
    public String getDescricao() {
        return "Café simples";
    }

    @Override
    public double getCusto() {
        return 2.00;
    }

}
