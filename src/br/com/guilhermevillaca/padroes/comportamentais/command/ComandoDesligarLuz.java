package br.com.guilhermevillaca.padroes.comportamentais.command;

/**
 *
 * @author villaca
 */
public class ComandoDesligarLuz implements Comando {

    private Luz luz;

    public ComandoDesligarLuz(Luz luz) {
        this.luz = luz;
    }

    @Override
    public void executar() {
        luz.desligar();
    }
}
