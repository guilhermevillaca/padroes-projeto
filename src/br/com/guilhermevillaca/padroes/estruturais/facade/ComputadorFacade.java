package br.com.guilhermevillaca.padroes.estruturais.facade;

/**
 *
 * @author villaca
 */
public class ComputadorFacade {

    private Memoria memoria;
    private SistemaOperacional sistemaOperacional;
    private Dispositivo dispositivo;

    public ComputadorFacade() {
        this.memoria = new Memoria();
        this.sistemaOperacional = new SistemaOperacional();
        this.dispositivo = new Dispositivo();
    }

    public void iniciarComputador() {
        System.out.println("Iniciando computador...");
        memoria.verificarMemoria();
        dispositivo.inicializarDispositivos();
        sistemaOperacional.carregarSistemaOperacional();
        System.out.println("Computador iniciado com sucesso!");
    }
}
