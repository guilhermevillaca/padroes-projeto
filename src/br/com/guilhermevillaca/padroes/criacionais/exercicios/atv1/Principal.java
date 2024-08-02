package br.com.guilhermevillaca.padroes.criacionais.exercicios.atv1;

/**
 *
 * @author villaca
 */
public class Principal {

    public static void main(String[] args) {

        FabricaVeiculo fabricaEletrica = new FabricaVeiculosEletricos();
        Carro carroEletrico = fabricaEletrica.criarCarro();
        Caminhao caminhaoEletrico = fabricaEletrica.criarCaminhao();

        carroEletrico.dirigir();
        caminhaoEletrico.transportar();

        FabricaVeiculo fabricaCombustao = new FabricaVeiculosCombustao();
        Carro carroCombustao = fabricaCombustao.criarCarro();
        Caminhao caminhaoCombustao = fabricaCombustao.criarCaminhao();

        carroCombustao.dirigir();
        caminhaoCombustao.transportar();

    }

}
