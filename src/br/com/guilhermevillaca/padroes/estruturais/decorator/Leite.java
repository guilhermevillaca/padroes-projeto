package br.com.guilhermevillaca.padroes.estruturais.decorator;

/**
 *
 * @author villaca
 */
public class Leite extends CafeDecorator {

    public Leite(Cafe cafe) {
        super(cafe);
    }

    @Override
    public String getDescricao() {
        return cafe.getDescricao() + ", Leite";
    }

    @Override
    public double getCusto() {
        return cafe.getCusto() + 0.50;
    }
}
