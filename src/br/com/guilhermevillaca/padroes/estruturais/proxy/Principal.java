package br.com.guilhermevillaca.padroes.estruturais.proxy;

/**
 *
 * @author villaca
 *
 * Explicação Documento é a interface comum que define o método exibir().
 * DocumentoReal é a implementação concreta que representa o objeto real, ou
 * seja, o documento que será carregado e exibido. O método carregarDoDisco()
 * simula uma operação cara de carregar o documento do disco. ProxyDocumento é a
 * classe Proxy que controla o acesso ao DocumentoReal. Ela armazena uma
 * referência ao objeto real e só cria (carrega) o documento real quando
 * necessário. A classe ProxyPatternDemo demonstra como o Proxy funciona. O
 * documento é carregado do disco apenas na primeira vez que é solicitado,
 * evitando carregamentos desnecessários. Aplicação do Padrão Proxy Este exemplo
 * mostra como o padrão Proxy pode ser utilizado para controlar o acesso a um
 * objeto, adiando sua criação e carregamento até que seja realmente necessário.
 * Esse tipo de padrão é útil em situações de lazy loading, controle de acesso,
 * ou quando você precisa adicionar uma camada extra de lógica antes de acessar
 * um objeto real.
 */
public class Principal {

    public static void main(String[] args) {
        Documento documento = new ProxyDocumento("exemplo.pdf");

        // O documento será carregado do disco na primeira vez que for exibido
        documento.exibir();

        // O documento não será carregado do disco novamente
        documento.exibir();
    }
}
