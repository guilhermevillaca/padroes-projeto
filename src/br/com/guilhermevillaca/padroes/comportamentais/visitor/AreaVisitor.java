package br.com.guilhermevillaca.padroes.comportamentais.visitor;

/**
 *
 * @author villaca
 */
// Visitante que calcula a área das formas geométricas
public class AreaVisitor implements Visitor {

    @Override
    public void visitar(Circulo circulo) {
        double area = Math.PI * Math.pow(circulo.getRaio(), 2);
        System.out.println("Área do Círculo: " + area);
    }

    @Override
    public void visitar(Retangulo retangulo) {
        double area = retangulo.getLargura() * retangulo.getAltura();
        System.out.println("Área do Retângulo: " + area);
    }

    @Override
    public void visitar(Triangulo triangulo) {
        double area = (triangulo.getBase() * triangulo.getAltura()) / 2;
        System.out.println("Área do Triângulo: " + area);
    }
}
