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
public class Fysiker extends Human{
    public int year;  
    
    public Fysiker(int ageIn, String nameIn, int yearIn){
        year = yearIn;
    }
    
    public Fysiker(){
       this (  ((int)(Math.random()*100)) , anArray[ (int) (5*Math.random())], (int) (83*Math.random()+1932));
       if(age < 15){    
           age = (int)(Math.random()*75)+15;
       }
       else {
           age = age;
       }
    }
    
    public int getYear(){
        return year;        
    }
    
    public String toString(){
        return "namn: " + name +", ålder: " + age + "år, började Fysik: " + year;
    }
    
    public int compareTo(Human o){
        int A = 0;
        int B = 0;
        
        if( o instanceof Human){
            if( super.getAge() == o.getAge()){
                return 0;               
            }
            else if ( this.getAge()> o.getAge()){
                return 1;
            }
            else if (this.getAge() < o.getAge()){
                return -1;
            }           
        }
        if (A==0){
            return B;           
        }
        return A;
    }
}

