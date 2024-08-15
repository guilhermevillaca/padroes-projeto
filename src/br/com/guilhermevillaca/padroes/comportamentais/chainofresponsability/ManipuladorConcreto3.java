package br.com.guilhermevillaca.padroes.comportamentais.chainofresponsability;

/**
 *
 * @author villaca
 */
public class ManipuladorConcreto3 extends Manipulador {
    @Override
    public void tratarRequisicao(String requisicao) {
        if (requisicao.equals("Requisicao3")) {
            System.out.println("ManipuladorConcreto3 tratou a requisição.");
        } else if (proximo != null) {
            proximo.tratarRequisicao(requisicao);
        }
    }
}