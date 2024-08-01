package br.com.guilhermevillaca.padroes.estruturais.bridge;

/**
 *
 * @author villaca
 */
public abstract class ControleRemoto {

    protected Dispositivo dispositivo;

    public ControleRemoto(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    public abstract void ligarDesligar();

    public abstract void aumentarVolume();

    public abstract void diminuirVolume();
    
    public abstract void silenciar();

}
