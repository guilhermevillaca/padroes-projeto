package br.com.guilhermevillaca.padroes.estruturais.composite;

/**
 *
 * @author villaca Explicação Empregado é a interface comum que declara o método
 * mostrarDetalhes(). Funcionario é uma classe folha (leaf) que representa um
 * empregado individual e implementa a interface Empregado. Gestor é a classe
 * composite que pode conter múltiplos subordinados. Ela também implementa a
 * interface Empregado, permitindo que gestores e funcionários sejam tratados de
 * maneira uniforme. A classe Empresa demonstra como criar uma estrutura
 * hierárquica usando esses objetos e como invocar o método mostrarDetalhes() de
 * forma recursiva. Com esse exemplo, é possível observar como o padrão
 * Composite permite a composição de objetos em estruturas de árvore para
 * representar hierarquias e como essas estruturas podem ser manipuladas de
 * maneira uniforme.
 */
public class Principal {

    public static void main(String[] args) {
        Empregado funcionario1 = new Funcionario("Alice", "Desenvolvedora");
        Empregado funcionario2 = new Funcionario("Bob", "Designer");

        Gestor gestor1 = new Gestor("Carlos", "Gerente de Projeto");
        gestor1.adicionarSubordinado(funcionario1);
        gestor1.adicionarSubordinado(funcionario2);

        Empregado funcionario3 = new Funcionario("Diana", "Analista de Testes");

        Gestor diretor = new Gestor("Eduardo", "Diretor de Tecnologia");
        diretor.adicionarSubordinado(gestor1);
        diretor.adicionarSubordinado(funcionario3);

        System.out.println("Detalhes da estrutura da empresa:");
        diretor.mostrarDetalhes();
    }
}
