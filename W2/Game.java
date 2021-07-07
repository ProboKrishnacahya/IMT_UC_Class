/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petsitter;

import java.util.ArrayList;
import java.util.Scanner;



public class Game {
    //private Dog pet;
    private ArrayList<Dog> pet = new ArrayList<Dog>();
    
    public void playGame(){
        
        Scanner scan ;
       int pilih =0;
        do{
        System.out.println("What you want to do");
        System.out.println("1. Play with Dog");
        System.out.println("2. Feed the dog");
        System.out.println("3. give the dog a bath");
        System.out.println("4. tell it to sleep");
        System.out.println("5. New Dog");
        System.out.println("0. Exit");
        scan = new Scanner(System.in);
        System.out.print("Pilih : ");
        pilih = scan.nextInt();
        switch(pilih){
        case 1 :
            Dog adog = null; //variable adog untuk menampung objek anjing yg namanya sesuai dengan yg dicari

            while(adog == null){
                System.out.println("Which dog's name ?");
                String name = scan.next();
                
                //mencari onjek dog yang punya nama seperti yang ditulus user
                for(int i = 0; i<pet.size(); i++){
                    if(pet.get(i).getName().equalsIgnoreCase(name)){
                         adog = pet.get(i); //meemegangkan objek pet dalam arraylist yg namanya sesuai ke variable adog
                         break;
                    }
                }
               if(adog != null){ //variable adog akan tetap null (kosong) jika tidak ada objek dog dalam arraylist yg namanya sesuai 
                adog.play();
                // menampilkan status dari anjing..
                 System.out.println(adog.getName() 
                         + "'s status : Happiness (" + adog.getHappiness() +
                         ") |  Cleaniness (" + adog.getCleaniness()+
                         ") | Fullness (" + adog.getFullness() +
                         ") | Health ("+ adog.getHealth()+")");
               }else{
                   System.out.println("Pet not found");
               }
            }
            break;
        case 2:
            adog = null; //variable adog untuk menampung objek anjing yg namanya sesuai dengan yg dicari

            while(adog == null){
                System.out.println("Which dog's name ?");
                String name = scan.next();
                
                //mencari onjek dog yang punya nama seperti yang ditulus user
                for(int i = 0; i<pet.size(); i++){
                    if(pet.get(i).getName().equalsIgnoreCase(name)){
                         adog = pet.get(i); //meemegangkan objek pet dalam arraylist yg namanya sesuai ke variable adog
                         break;
                    }
                }
               if(adog != null){ //variable adog akan tetap null (kosong) jika tidak ada objek dog dalam arraylist yg namanya sesuai 
                adog.eat();
                // menampilkan status dari anjing..
                 System.out.println(adog.getName() 
                         + "'s status : Happiness (" + adog.getHappiness() +
                         ") |  Cleaniness (" + adog.getCleaniness()+
                         ") | Fullness (" + adog.getFullness() +
                         ") | Health ("+ adog.getHealth()+")");
               }else{
                   System.out.println("Pet not found");
               }
            }
            break;
        case 3 :
            adog = null; //variable adog untuk menampung objek anjing yg namanya sesuai dengan yg dicari

            while(adog == null){
                System.out.println("Which dog's name ?");
                String name = scan.next();
                
                //mencari onjek dog yang punya nama seperti yang ditulus user
                for(int i = 0; i<pet.size(); i++){
                    if(pet.get(i).getName().equalsIgnoreCase(name)){
                         adog = pet.get(i); //meemegangkan objek pet dalam arraylist yg namanya sesuai ke variable adog
                         break;
                    }
                }
               if(adog != null){ //variable adog akan tetap null (kosong) jika tidak ada objek dog dalam arraylist yg namanya sesuai 
                adog.bath();
                // menampilkan status dari anjing..
                 System.out.println(adog.getName() 
                         + "'s status : Happiness (" + adog.getHappiness() +
                         ") |  Cleaniness (" + adog.getCleaniness()+
                         ") | Fullness (" + adog.getFullness() +
                         ") | Health ("+ adog.getHealth()+")");
               }else{
                   System.out.println("Pet not found");
               }
            }
            break;
        case 4:
            adog = null; //variable adog untuk menampung objek anjing yg namanya sesuai dengan yg dicari

            while(adog == null){
                System.out.println("Which dog's name ?");
                String name = scan.next();
                
                //mencari onjek dog yang punya nama seperti yang ditulus user
                for(int i = 0; i<pet.size(); i++){
                    if(pet.get(i).getName().equalsIgnoreCase(name)){
                         adog = pet.get(i); //meemegangkan objek pet dalam arraylist yg namanya sesuai ke variable adog
                         break;
                    }
                }
               if(adog != null){ //variable adog akan tetap null (kosong) jika tidak ada objek dog dalam arraylist yg namanya sesuai 
                adog.sleep();
                // menampilkan status dari anjing..
                 System.out.println(adog.getName() 
                         + "'s status : Happiness (" + adog.getHappiness() +
                         ") |  Cleaniness (" + adog.getCleaniness()+
                         ") | Fullness (" + adog.getFullness() +
                         ") | Health ("+ adog.getHealth()+")");
     
               }else{
                   System.out.println("Pet not found");
               }
            }
            break;
        case 5: 
            Dog apet = new Dog();
            scan = new Scanner(System.in);
            System.out.println("Dog's name : ");
            String newname = scan.next();
            apet.setName(newname);
            //memasukkan objek Dog ke dalam arraylist
            pet.add(apet);
        }
            System.out.println("");
            System.out.println("");
       } while(pilih != 0);
    }
 
    
 }
