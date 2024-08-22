/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.guilhermevillaca.padroes.comportamentais.interpreter;

/**
 *
 * @author villaca
 *
 * Explicação: Contexto: Mantém o estado atual, como a direção em que o
 * personagem está apontando. Expressões Concretas: AndarParaFrente,
 * VirarParaEsquerda, e VirarParaDireita definem como interpretar as letras A,
 * B, e C. Interpretador: Recebe uma string de comandos e a interpreta,
 * aplicando cada comando à sua respectiva expressão. Este exemplo do padrão
 * Interpreter ilustra como transformar uma sequência de comandos em ações, com
 * o interpretador navegando pela string e executando as ações correspondentes.
 */
public class Principal {

    public static void main(String[] args) {
        String codigoSecreto = "AABCA";
        Interpreter tradutor = new Interpreter();
        tradutor.interpretar(codigoSecreto);
    }
}
