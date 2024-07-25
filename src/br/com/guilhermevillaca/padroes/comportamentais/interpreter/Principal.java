/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.guilhermevillaca.padroes.comportamentais.interpreter;

/**
 *
 * @author villaca
 */
public class Principal {
    public static void main(String[] args) {
        String codigoSecreto = "AABCA";
        Interpreter tradutor = new Interpreter();
        tradutor.interpretar(codigoSecreto);
    }
}
