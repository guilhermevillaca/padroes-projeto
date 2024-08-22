package br.com.guilhermevillaca.padroes.comportamentais.visitor;

/**
 *
 * @author villaca
 *
 * O padrão Visitor permite que você adicione novas operações a objetos de uma
 * estrutura sem modificar as classes desses objetos. Em vez de definir
 * diretamente a operação nas classes de cada objeto, você define uma nova
 * classe de visitante que implementa a operação.
 *
 * Vamos implementar um exemplo em Java onde temos uma estrutura de elementos de
 * uma forma geométrica (como Círculo, Retângulo e Triângulo) e um visitante que
 * realiza operações nesses elementos, como calcular a área e o perímetro.
 *
 * Explicação: Cada elemento geométrico (Circulo, Retangulo, Triangulo)
 * implementa a interface Visitable, permitindo que um Visitor realize operações
 * sobre ele. AreaVisitor e PerimetroVisitor são classes concretas que
 * implementam a interface Visitor e definem o comportamento para calcular a
 * área e o perímetro, respectivamente. O método aceitar(Visitor visitor) em
 * cada elemento geométrico permite que um visitante realize operações sobre o
 * elemento, mantendo o código flexível e extensível. Este exemplo mostra como o
 * padrão Visitor pode ser utilizado para realizar operações variadas em uma
 * estrutura de objetos, sem modificar as classes dos objetos. Ele é
 * particularmente útil quando você precisa adicionar operações frequentes ou
 * complexas a uma classe sem poluir a própria classe com várias
 * responsabilidades.
 */
public class Principal {

    public static void main(String[] args) {
        // Cria elementos geométricos
        Circulo circulo = new Circulo(5);
        Retangulo retangulo = new Retangulo(4, 7);
        Triangulo triangulo = new Triangulo(3, 4);

        // Cria visitantes
        Visitor areaVisitor = new AreaVisitor();
        Visitor perimetroVisitor = new PerimetroVisitor();

        // Aplica os visitantes nos elementos
        System.out.println("Calculando áreas:");
        circulo.aceitar(areaVisitor);
        retangulo.aceitar(areaVisitor);
        triangulo.aceitar(areaVisitor);

        System.out.println("\nCalculando perímetros:");
        circulo.aceitar(perimetroVisitor);
        retangulo.aceitar(perimetroVisitor);
        triangulo.aceitar(perimetroVisitor);
    }
}
