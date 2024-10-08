package br.com.guilhermevillaca.padroes.comportamentais.chainofresponsability;

/**
 *
 * @author villaca
 */
public class ManipuladorConcreto1 extends Manipulador {
    @Override
    public void tratarRequisicao(String requisicao) {
        if (requisicao.equals("Requisicao1")) {
            System.out.println("ManipuladorConcreto1 tratou a requisição.");
        } else if (proximo != null) {
            proximo.tratarRequisicao(requisicao);
        }
    }
}