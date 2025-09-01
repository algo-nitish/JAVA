package OOPS;

public class Abstraction {
    public static void main(String[] args) {
         Horse h = new Horse();
         h.eat();
         h.walk();

         chicken c = new chicken();
         c.eat();
         c.walk();

         System.out.println(h.color);
         h.changecolor();
         System.out.println(h.color);
    }
}

abstract class Animal{
    String color = "White";
 void eat(){
    System.out.println("Animal is eating");
 }

 abstract void walk(); // Abstract method, no body
}
 
class Horse extends Animal{
    void walk(){
        System.out.println("walks on 4 legs");
    }
   
    void changecolor(){
        color = "Black";
    }
}

 class chicken extends Animal {
    void walk(){
        System.out.println("walks on 2 legs");
    }
    void changecolor(){
        color = "Pink";
    }
 }
 //it is allows us to hide the unnecessary details  and show needed information