package br.com.guilhermevillaca.padroes.comportamentais.visitor;

/**
 *
 * @author villaca
 */
// Visitante que calcula o perímetro das formas geométricas
public class PerimetroVisitor implements Visitor {

    @Override
    public void visitar(Circulo circulo) {
        double perimetro = 2 * Math.PI * circulo.getRaio();
        System.out.println("Perímetro do Círculo: " + perimetro);
    }

    @Override
    public void visitar(Retangulo retangulo) {
        double perimetro = 2 * (retangulo.getLargura() + retangulo.getAltura());
        System.out.println("Perímetro do Retângulo: " + perimetro);
    }

    @Override
    public void visitar(Triangulo triangulo) {
        // Considerando um triângulo equilátero para simplicidade
        double perimetro = 3 * triangulo.getBase();
        System.out.println("Perímetro do Triângulo: " + perimetro);
    }
}
