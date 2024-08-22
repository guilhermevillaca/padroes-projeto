package br.com.guilhermevillaca.padroes.comportamentais.visitor;

/**
 *
 * @author villaca
 */
// Classe Circulo que implementa Visitable
public class Circulo implements Visitable {

    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    @Override
    public void aceitar(Visitor visitor) {
        visitor.visitar(this);
    }
}
