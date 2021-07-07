/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petsitter;

import petsitter.Game;

/**
 *
 * PetSitter is a main class of this project. It contains only a main() method to start
 * the project
 */
public class PetSitter{
  
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //TODO code application logic here
        Game game = new Game();
        game.playGame();
 
    }
    
    
}
