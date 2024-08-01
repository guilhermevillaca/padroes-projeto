package br.com.guilhermevillaca.padroes.estruturais.bridge;

/**
 *
 * @author villaca
 */
public class Radio implements Dispositivo {

    private boolean ligado = false;
    private int volume = 20;

    @Override
    public void ligar() {
        ligado = true;
        System.out.println("Rádio ligado.");
    }

    @Override
    public void desligar() {
        ligado = false;
        System.out.println("Rádio desligado.");
    }

    @Override
    public void aumentarVolume() {
        if (ligado) {
            volume++;
            System.out.println("Volume do rádio: " + volume);
        }
    }

    @Override
    public void diminuirVolume() {
        if (ligado) {
            volume--;
            System.out.println("Volume do rádio: " + volume);
        }
    }

    @Override
    public boolean estaLigado() {
        return ligado;
    }
}
