/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package human;

/**
 *
 * @author shadmana
 */
public class E4 {

 
    public static void main(String[] args) {    
        
        Fysiker[] Fysiker = new Fysiker[5];
        // i = i + 1 ---> i++. Human.length=5
        for(int i=0; i < Fysiker.length; i++){
            Fysiker[i]= new Fysiker();
            System.out.println(Fysiker[i]);
            
        }
      
        Human[] Human = new Human[5];
        // i = i + 1 ---> i++. Human.length=5
        for(int i=0; i < Human.length; i++){
            Human[i]= new Human();
            System.out.println(Human[i]);
            
        }
    }
}   
