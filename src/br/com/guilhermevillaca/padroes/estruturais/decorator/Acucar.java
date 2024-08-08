package br.com.guilhermevillaca.padroes.estruturais.decorator;

/**
 *
 * @author villaca
 */
public class Acucar extends CafeDecorator {

    public Acucar(Cafe cafe) {
        super(cafe);
    }

    @Override
    public String getDescricao() {
        return cafe.getDescricao() + ", Açúcar";
    }

    @Override
    public double getCusto() {
        return cafe.getCusto() + 0.25;
    }
}
