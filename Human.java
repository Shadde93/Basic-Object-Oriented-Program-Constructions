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
public class Human implements Comparable <Human>{
    public int age;
    public String name;

    static String[] anArray = new String[]{
        "Knatte",
        "Fnatte",
        "Tjatte",
        "Kalle",
        "Anka",
    };    
    
    
    public Human(int ageIn, String nameIn){
        age = ageIn;
        name = nameIn;
    }
    
    public int getAge(){
        return age;
    }
    public String getName(){
    return name;
    }
    public String toString(){
        return "Namn: " + name +", Ålder: "+ age + " år";
                
    }
    
 
    // Vi multiplicerar med 5 för att sannolikheten att få sista elementet i arrayen 
    // skall vara lika stor.
    public Human(){
        this (  (int) (100*Math.random()) , anArray[ (int) (5*Math.random())]);
    }
    
//E51 har impleterat comparable i klassen ovan
    public int compareTo(Human o){
        if (this.age == o.getAge()){
            return 0;
        }else if (this.age > o.getAge()){
            return 1;            
        }
        return -1;
    }
}


