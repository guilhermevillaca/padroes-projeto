package br.com.guilhermevillaca.padroes.estruturais.bridge;

/**
 *
 * @author villaca
 */
/**
 *
 *
 * Cenário Vamos usar um exemplo de dispositivos e controles remotos. Teremos
 * diferentes tipos de dispositivos (TV e Rádio) e diferentes tipos de controles
 * remotos (ControleRemotoBásico e ControleRemotoAvançado). Utilizaremos o
 * padrão Bridge para permitir que novos dispositivos e controles remotos possam
 * ser adicionados facilmente.
 * 
 * Explicação Dispositivo: Interface que define as operações básicas para
 * qualquer dispositivo. TV e Rádio: Implementações concretas da interface
 * Dispositivo. ControleRemoto: Classe abstrata que utiliza um Dispositivo.
 * Define métodos abstratos que devem ser implementados pelas subclasses.
 * ControleRemotoBasico: Implementação do controle remoto que pode
 * ligar/desligar e ajustar o volume. ControleRemotoAvancado: Implementação
 * avançada do controle remoto que pode silenciar o dispositivo, além das
 * funcionalidades básicas. Main: Classe principal que demonstra o uso dos
 * controles remotos com uma TV. O padrão Bridge permite adicionar novos
 * dispositivos ou controles remotos sem alterar o código existente,
 * proporcionando maior flexibilidade e escalabilidade ao sistema.
 */
public class Principal {

    public static void main(String[] args) {
        Dispositivo tv = new Televisao();
        ControleRemoto controleBasico = new ControleRemotoBasico(tv);
        ControleRemoto controleAvancado = new ControleRemotoAvancado(tv);

        System.out.println("Usando Controle Remoto Básico:");
        controleBasico.ligarDesligar();
        controleBasico.aumentarVolume();
        controleBasico.diminuirVolume();
        controleBasico.ligarDesligar();

        System.out.println("\nUsando Controle Remoto Avançado:");
        controleAvancado.ligarDesligar();
        controleAvancado.aumentarVolume();
        controleAvancado.silenciar();        
        controleAvancado.ligarDesligar();
    }
}
