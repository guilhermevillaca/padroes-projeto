package br.com.guilhermevillaca.padroes.comportamentais.chainofresponsability;

/**
 *
 * @author villaca
 */
public class ManipuladorConcreto2 extends Manipulador {
    @Override
    public void tratarRequisicao(String requisicao) {
        boolean erro = false;
        if (requisicao.equals("Requisicao2")) {
            System.out.println("ManipuladorConcreto2 tratou a requisição.");
            System.out.println("ocorreu um erro");            
        } else if (proximo != null) {
            proximo.tratarRequisicao(requisicao);
        }
    }
    
    public boolean funcionou(){
        return false;
    }
}