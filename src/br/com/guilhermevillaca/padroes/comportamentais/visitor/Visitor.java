package br.com.guilhermevillaca.padroes.comportamentais.visitor;

/**
 *
 * @author villaca
 */
// Interface Visitor que define as operações para cada tipo de elemento
public interface Visitor {

    void visitar(Circulo circulo);

    void visitar(Retangulo retangulo);

    void visitar(Triangulo triangulo);
}
