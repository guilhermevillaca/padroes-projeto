/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.guilhermevillaca.padroes.comportamentais.interpreter;

/**
 *
 * @author villaca
 */
public class VirarAEsquerda implements Command {

    @Override
    public void execute() {
        System.out.println("Virar à esquerda");
    }

}
