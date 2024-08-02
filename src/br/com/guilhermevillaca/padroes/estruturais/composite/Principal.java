package br.com.guilhermevillaca.padroes.estruturais.composite;

/**
 *
 * @author villaca
 */
public class Principal {

    public static void main(String[] args) {
        Componente arquivo1 = new Arquivo("arquivo1.txt");
        Componente arquivo2 = new Arquivo("arquivo2.txt");

        Diretorio diretorio1 = new Diretorio("diretorio1");
        Diretorio diretorio2 = new Diretorio("diretorio2");

        diretorio1.adicionarComponente(arquivo1);
        diretorio2.adicionarComponente(arquivo2);

        Diretorio raiz = new Diretorio("raiz");
        raiz.adicionarComponente(diretorio1);
        raiz.adicionarComponente(diretorio2);

        raiz.mostrarDetalhes();
    }
}
