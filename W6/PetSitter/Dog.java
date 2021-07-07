/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petsitter;

/**
 *
 * @author caeciliacitra
 */
public class Dog extends Pet{
    //attributes
    
    
    
    //constructor
    public Dog(){
        happiness = 3;
        fullness = 3;
        cleaniness = 3;
        health = 5;
    }
    public Dog(String newName){
        name = newName;
        happiness = 3;
        fullness = 3;
        cleaniness = 3;
        health = 5;
    }
    //methods
    
    
    @Override
    public void setName(String a){
        if(a.length()<=10){
            name = a;
        }else{
            System.out.println("Mame too long");
        }
    }
    
    public void play(){
      happiness += 2;
      cleaniness -= 2;
      fullness -=1;
      
      decreaseHelath();
      
      if(happiness > 5){
          happiness = 5;
      }
      if( cleaniness < 0){
          cleaniness = 0;
      }
      if(fullness < 0){
          fullness = 0;
      }
    }
    public void eat(){
        fullness = 5;
        
    }
    public void bath(){
        cleaniness = 5;
        happiness -= 3;
        if(happiness < 0){
            happiness = 0;
        }
       
    }
    public void sleep(){
        fullness -=2;
        health +=1;
        
        decreaseHelath();
        
        if(fullness < 0){
            fullness = 0;
        }
        
        if(health > 5){
            health = 5;
        }
        
    }
    
    private void decreaseHelath(){
       if(fullness < 3 || cleaniness < 2){
           health -=1;
       } 
    }
   }
