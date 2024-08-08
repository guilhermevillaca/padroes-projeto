package br.com.guilhermevillaca.padroes.estruturais.decorator;

/**
 *
 * @author villaca
 */
public abstract class CafeDecorator implements Cafe {

    protected Cafe cafe;

    public CafeDecorator(Cafe cafe) {
        this.cafe = cafe;
    }

    @Override
    public String getDescricao() {
        return cafe.getDescricao();
    }

    @Override
    public double getCusto() {
        return cafe.getCusto();
    }
}
