/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.guilhermevillaca.padroes.comportamentais.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author villaca
 */
public class Interpreter {
    
     private Map<Character, Command> commands;

    public Interpreter() {
        commands = new HashMap<>();
        commands.put('A', new AndarParaFrente());
        commands.put('B', new VirarAEsquerda());
        commands.put('C', new VirarADireita());
    }

    public void interpretar(String instruction) {
        for (char charCode : instruction.toCharArray()) {
            Command command = commands.get(charCode);
            if (command != null) {
                command.execute();
            }
        }
    }
    
}
