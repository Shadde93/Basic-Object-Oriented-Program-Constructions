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
public class E3 {
    public static void main(String[] args) {
        Human[] Human = new Human[15];
        // i = i + 1 ---> i++. Human.length=15
        for(int i=0; i < Human.length; i++){
            Human[i]= new Human();
            System.out.println(Human[i]);
            
        }
    }
}
