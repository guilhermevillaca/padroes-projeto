package br.com.guilhermevillaca.padroes.estruturais.composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author villaca
 */
public class Gestor implements Empregado {

    private String nome;
    private String cargo;
    private List<Empregado> subordinados;

    public Gestor(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
        this.subordinados = new ArrayList<>();
    }

    public void adicionarSubordinado(Empregado emp) {
        subordinados.add(emp);
    }

    public void removerSubordinado(Empregado emp) {
        subordinados.remove(emp);
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println(nome + " - " + cargo);
        for (Empregado emp : subordinados) {
            emp.mostrarDetalhes();
        }
    }
}
