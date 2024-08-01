package br.com.guilhermevillaca.padroes.estruturais.bridge;

/**
 *
 * @author villaca
 */
public class ControleRemotoAvancado extends ControleRemoto {

    public ControleRemotoAvancado(Dispositivo dispositivo) {
        super(dispositivo);
    }

    @Override
    public void ligarDesligar() {
        if (dispositivo.estaLigado()) {
            dispositivo.desligar();
        } else {
            dispositivo.ligar();
        }
    }

    @Override
    public void aumentarVolume() {
        dispositivo.aumentarVolume();
    }

    @Override
    public void diminuirVolume() {
        dispositivo.diminuirVolume();
    }

    @Override
    public void silenciar() {
        System.out.println("Dispositivo silenciado.");
        while (dispositivo.estaLigado()) {
            dispositivo.diminuirVolume();
        }
    }
}
