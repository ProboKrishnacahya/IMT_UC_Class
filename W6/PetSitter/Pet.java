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
public abstract class Pet {
     protected  String name;
    protected int health;
    int happiness;
    int fullness;
    int cleaniness;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the health
     */
    public int getHealth() {
        return health;
    }

    /**
     * @return the happiness
     */
    public int getHappiness() {
        return happiness;
    }

    /**
     * @return the fullness
     */
    public int getFullness() {
        return fullness;
    }

    /**
     * @return the cleaniness
     */
    public int getCleaniness() {
        return cleaniness;
    }
   
    
    public abstract void play();
    
    public abstract void bath();
    
    public abstract void sleep();
    public abstract void eat();
        
        
    
}
