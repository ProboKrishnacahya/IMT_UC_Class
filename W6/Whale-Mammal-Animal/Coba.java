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
public class Coba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mammal a;
        Animal b;
         a = new Mammal() {
            @Override
            public void move() {
                System.out.println("Saya berjalan");
            }

            @Override
            public void mboh() {
                System.out.println("mboh");
            }
        };
         a.reporduction();
         a.move();
         a.mboh();;
         System.out.println(a.getClass().toString());
         
        
         a = new Mammal() {
            @Override
            public void mboh() {
                System.out.println("i don;t know");
            }

            @Override
            public void move() {
                System.out.println("Saya merangkak");
            }
        };
         a.reporduction();
         a.move();
         a.mboh();;
         System.out.println(a.getClass().toString());
         
         b = new Whale();
         b.breath();
         System.out.println(b.getClass().toString());
         
         a = new Whale();
         a.breath();//animal
         a.move();//mammal
         a.reporduction();//mammal
         System.out.println(a.getClass().toString());
         
    }
    
}
