package br.com.guilhermevillaca.antipadroes.factorymethod;

// Implementação específica para transporte via caminhão
class Caminhao extends Transporte {
    @Override
    public void entregar() {
        System.out.println("Entrega sendo feita por caminhão.");
    }
}
