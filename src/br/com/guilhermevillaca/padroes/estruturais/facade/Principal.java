package br.com.guilhermevillaca.padroes.estruturais.facade;

/**
 *
 * @author villaca
 *
 * Explicação Memoria, SistemaOperacional e Dispositivo são subsistemas
 * complexos que representam diferentes partes do processo de inicialização de
 * um computador. ComputadorFacade é a classe Façade que fornece uma interface
 * simples para inicializar o computador, encapsulando a complexidade dos
 * subsistemas. A classe Main demonstra como o padrão Façade simplifica a
 * interação com o sistema. Em vez de lidar diretamente com os subsistemas
 * complexos, o usuário pode simplesmente chamar o método iniciarComputador() da
 * classe Façade. Esse exemplo mostra como o padrão Façade pode ser usado para
 * fornecer uma interface simplificada para um conjunto complexo de subsistemas,
 * facilitando o uso e reduzindo a dependência entre as classes do cliente e os
 * subsistemas complexos.
 */
public class Principal {

    public static void main(String[] args) {
        ComputadorFacade computador = new ComputadorFacade();
        computador.iniciarComputador();
    }
}
