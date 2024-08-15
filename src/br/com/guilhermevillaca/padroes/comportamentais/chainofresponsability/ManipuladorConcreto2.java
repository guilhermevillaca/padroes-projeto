package br.com.guilhermevillaca.padroes.comportamentais.chainofresponsability;

/**
 *
 * @author villaca
 */
public class ManipuladorConcreto2 extends Manipulador {
    @Override
    public void tratarRequisicao(String requisicao) {
        if (requisicao.equals("Requisicao2")) {
            System.out.println("ManipuladorConcreto2 tratou a requisição.");
        } else if (proximo != null) {
            proximo.tratarRequisicao(requisicao);
        }
    }
}