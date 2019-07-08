/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package human;

import java.util.Arrays;
/**
 *
 * @author Shadman
 */
public class E54 {
       public static void main(String[] args){
        Fysiker a = new Fysiker();
        Human b = new Human(); 
        
        Human[] Random = new Human[10];
        for (int i = 0; i<5; i++){
            Random[i] = new Fysiker();
            Random[i+5] = new Human();
        }
        
        Arrays.sort(Random);
        Arrays.stream(Random).forEach(System.out::println);
        }
    
}
