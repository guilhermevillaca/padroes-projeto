package br.com.guilhermevillaca.padroes.estruturais.bridge;

/**
 *
 * @author villaca
 */
public class Televisao implements Dispositivo {

    private boolean ligado = false;
    private int volume = 30;

    @Override
    public void ligar() {
        ligado = true;
        System.out.println("TV ligada.");
    }

    @Override
    public void desligar() {
        ligado = false;
        System.out.println("TV desligada.");
    }

    @Override
    public void aumentarVolume() {
        if (ligado) {
            volume++;
            System.out.println("Volume da TV: " + volume);
        }
    }

    @Override
    public void diminuirVolume() {
        if (ligado) {
            volume--;
            System.out.println("Volume da TV: " + volume);
        }
    }

    @Override
    public boolean estaLigado() {
        return ligado;
    }

}
