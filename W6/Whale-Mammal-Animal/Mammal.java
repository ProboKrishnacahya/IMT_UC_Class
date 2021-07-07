/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coba;

/**
 *
 * @author caeciliacitra
 */
public abstract class Mammal implements Animal {
    private String name;
    protected int hairLength;
    
    public int getHairLength(){
        return hairLength;            
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public abstract void mboh();
    public abstract void move();
    
    
    public void reporduction(){
        System.out.println("Saya bereproduksi dengan cara beranak");
    }
    @Override
    public void breath(){
        System.out.println("Saya bernafas dengan paru2");
    }
    
}
