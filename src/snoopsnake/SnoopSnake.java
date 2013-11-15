/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package snoopsnake;

import environment.ApplicationStarter;

/**
 *
 * @author it
 */
public class SnoopSnake {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        start();
        
    }

    private static void start() {
        ApplicationStarter.run("Snoop Snake", new SnakeEnvironment());
    }
    
}
