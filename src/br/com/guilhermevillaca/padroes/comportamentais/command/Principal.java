package br.com.guilhermevillaca.padroes.comportamentais.command;

/**
 *
 * @author villaca
 *
 * O padrão de projeto Command é utilizado para encapsular uma solicitação como
 * um objeto, permitindo parametrizar clientes com filas, solicitações e
 * operações que podem ser feitas em diferentes momentos. Ele desacopla o objeto
 * que invoca a operação do objeto que sabe como executá-la.
 *
 * Explicação: Comando.java: É a interface que declara o método executar(), o
 * qual será implementado por todos os comandos concretos.
 *
 * Luz.java: A classe que representa o receptor, ou seja, a entidade que
 * realmente executa a ação (neste caso, ligar ou desligar a luz).
 *
 * ComandoLigarLuz.java e ComandoDesligarLuz.java: Implementações concretas da
 * interface Comando. Elas encapsulam as ações de ligar e desligar a luz.
 *
 * ControleRemoto.java: Atua como o invocador, que mantém uma referência ao
 * comando e é responsável por chamar seu método executar().
 *
 * Cliente.java: A classe cliente onde os comandos são criados, atribuídos ao
 * controle remoto, e as ações são executadas.
 */
public class Principal {

    public static void main(String[] args) {
        Luz luz = new Luz();

        Comando ligarLuz = new ComandoLigarLuz(luz);
        Comando desligarLuz = new ComandoDesligarLuz(luz);

        ControleRemoto controle = new ControleRemoto();

        // Ligar a luz
        controle.setComando(ligarLuz);
        controle.pressionarBotao();

        // Desligar a luz
        controle.setComando(desligarLuz);
        controle.pressionarBotao();
    }
}
