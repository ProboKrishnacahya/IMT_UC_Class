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
public class Cat extends Pet{

    @Override
    public void play() {
        happiness = 5;
        cleaniness -= 1;
        
    }

    @Override
    public void bath() {
        happiness = 1;
        cleaniness = 5;
    }

    @Override
    public void sleep() {
        health += 2;
    }

    @Override
    public void eat() {
        fullness +=2;
    }
    // punya attrubut yg sama dengan anjing
    // bisa diajak main, mandi, makan, tidur
    // tapi respon akan beda dengan anjing
    
}
