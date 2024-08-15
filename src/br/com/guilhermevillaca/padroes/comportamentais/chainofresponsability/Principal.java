package br.com.guilhermevillaca.padroes.comportamentais.chainofresponsability;

/**
 *
 * @author villaca
 *
 * padrão de projeto Chain of Responsibility é utilizado quando você deseja
 * passar uma solicitação ao longo de uma cadeia de manipuladores até que um
 * deles a processe. Cada manipulador na cadeia decide se processa a solicitação
 * ou a passa para o próximo manipulador. Explicação: Manipulador.java: Define a
 * interface para os manipuladores. ManipuladorConcreto1.java,
 * ManipuladorConcreto2.java, ManipuladorConcreto3.java: Implementam o
 * tratamento de requisições específicas. Cliente.java: Configura a cadeia de
 * responsabilidade e testa o fluxo das requisições.
 */
public class Principal {

    public static void main(String[] args) {
        // Criar os manipuladores
        Manipulador manipulador1 = new ManipuladorConcreto1();
        Manipulador manipulador2 = new ManipuladorConcreto2();
        Manipulador manipulador3 = new ManipuladorConcreto3();

        // Configurar a cadeia de responsabilidade
        manipulador1.setProximo(manipulador2);
        manipulador2.setProximo(manipulador3);

        // Iniciar o processamento das requisições
        manipulador1.tratarRequisicao("Requisicao1");
        manipulador1.tratarRequisicao("Requisicao2");
        manipulador1.tratarRequisicao("Requisicao3");
        manipulador1.tratarRequisicao("Requisicao4");  // Nenhum manipulador processará esta requisição
    }
}
