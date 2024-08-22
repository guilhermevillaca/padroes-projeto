package br.com.guilhermevillaca.padroes.comportamentais.visitor;

/**
 *
 * @author villaca
 */
// Interface Visitable que aceita um visitante
public interface Visitable {

    void aceitar(Visitor visitor);
}
