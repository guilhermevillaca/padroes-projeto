package br.com.guilhermevillaca.padroes.estruturais.decorator;

/**
 *
 * @author villaca
 * 
 * Explicação Cafe é a interface comum que declara os métodos
 * getDescricao() e getCusto(). CafeSimples é a implementação concreta da
 * interface Cafe que representa um café simples. CafeDecorator é uma classe
 * abstrata que implementa a interface Cafe e contém uma referência a um objeto
 * do tipo Cafe. Esta classe serve como base para os decoradores concretos.
 * Leite e Acucar são decoradores concretos que herdam de CafeDecorator. Eles
 * adicionam funcionalidades ao objeto Cafe decorado (ou seja, adicionam leite e
 * açúcar, respectivamente). A classe Cafeteria demonstra como criar e decorar
 * um objeto Cafe com várias combinações de decoradores. Esse exemplo mostra
 * como o padrão Decorator permite adicionar dinamicamente responsabilidades
 * adicionais a um objeto de forma flexível, sem a necessidade de modificar a
 * classe base.
 */
public class Principal {

    public static void main(String[] args) {
        Cafe meuCafe = new CafeSimples();
        System.out.println(meuCafe.getDescricao() + " custa " + meuCafe.getCusto());

        // Adicionando leite ao café
        meuCafe = new Leite(meuCafe);
        System.out.println(meuCafe.getDescricao() + " custa " + meuCafe.getCusto());

        // Adicionando açúcar ao café
        meuCafe = new Acucar(meuCafe);
        System.out.println(meuCafe.getDescricao() + " custa " + meuCafe.getCusto());
    }
}
