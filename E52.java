/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package human;

/**
 *
 * @author Shadman
 */
public class E52 {
    public static void main(String[] args){
        Human a = new Human();
        Human b = new Human(); 
        
        if (a.compareTo(b) == 0){
            System.out.println(a.getName() +", som är " + a.getAge() + " år, är lika gammal som " + b.getName() +  " som är " + b.getAge() + " år" );
        }
        else if (a.compareTo(b) == 1){
            System.out.println(a.getName() + ", som är " + a.getAge() + " år är äldre än " + b.getName() + ", som är " + b.getAge() + " år" );
        }
        else if (a.compareTo(b) == -1){
            System.out.println(a.getName() + ", som är " + a.getAge() + " år är yngre än " + b.getName() + ", som är " + b.getAge() + " år" );
        }
        
    }
    
}
