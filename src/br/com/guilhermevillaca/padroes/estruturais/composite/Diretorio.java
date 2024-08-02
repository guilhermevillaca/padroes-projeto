package br.com.guilhermevillaca.padroes.estruturais.composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author villaca
 */
public class Diretorio implements Componente {

    private String nome;
    private List<Componente> componentes;

    public Diretorio(String nome) {
        this.nome = nome;
        this.componentes = new ArrayList<>();
    }

    public void adicionarComponente(Componente componente) {
        componentes.add(componente);
    }

    public void removerComponente(Componente componente) {
        componentes.remove(componente);
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("Diretório: " + nome);
        for (Componente componente : componentes) {
            componente.mostrarDetalhes();
        }
    }
}
