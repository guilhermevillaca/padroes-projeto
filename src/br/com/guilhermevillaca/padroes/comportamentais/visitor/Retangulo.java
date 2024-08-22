package br.com.guilhermevillaca.padroes.comportamentais.visitor;

/**
 *
 * @author villaca
 */
// Classe Retangulo que implementa Visitable
public class Retangulo implements Visitable {

    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public void aceitar(Visitor visitor) {
        visitor.visitar(this);
    }
}
