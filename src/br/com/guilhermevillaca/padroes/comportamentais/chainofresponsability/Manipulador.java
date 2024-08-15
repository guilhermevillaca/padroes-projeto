package br.com.guilhermevillaca.padroes.comportamentais.chainofresponsability;

/**
 *
 * @author villaca
 */
public abstract class Manipulador {
    protected Manipulador proximo;

    public void setProximo(Manipulador proximo) {
        this.proximo = proximo;
    }

    public abstract void tratarRequisicao(String requisicao);
}