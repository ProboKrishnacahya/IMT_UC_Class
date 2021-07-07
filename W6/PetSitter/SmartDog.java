/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petsitter;

/**
 *
 * This is a class for a special dog that has intelligence and
 * love to learn @author caeciliacitra
 */
public class SmartDog extends Dog{
    private int intelligence;
    
    public SmartDog(){
        super();
    }
    
    @Override
    public void play(){
        super.play();
        intelligence -= 1;
        System.out.println("You are in SmartDog");
    }
    
    public void learn(){
        intelligence += 1;
        if(intelligence > 5){
            intelligence = 5;
            System.out.println("I am too smart");
        }
    }
    public int getIntelligence(){
        return intelligence;
    }
    
    
}
