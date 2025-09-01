package OOPS;

public class Inheritence {
    /*
     * Inheritence is a concept in OOP that allows a class to inherit properties and methods from another class.
     * 
     */
    public static void main(String[] args) {
        // Fish Shark = new Fish();
        // Shark.eat();

        // Dog doggy = new Dog();
        // doggy.eat();
        // doggy.breath();
        // doggy.legs = 4;
        // System.out.println(doggy.legs);
    }
};
 class Animal{
    String color;
    void eat(){
         
        System.out.println("eating...");
    }
    void breath(){
        System.out.println("Breathing...");
    }
 }
// //Example of single level inheritance
//  class Fish extends Animal{
//     int fins;
//     void swim(){
//         System.out.println("swimming...");
//     }
//  }



// Example of multi-levl inheritance
class Mammal extends Animal{
    int legs;

}
// class Dog extends Mammal{
//     String breed;  //multi-level inheritance
// }

class Humans extends Animal{
    int hands;
    void speak(){
        System.out.println("speaking...");
    }
}
class Bird extends Animal{
    int wings;
    void fly(){
        System.out.println("flying...");
    }
    //defination of html - hyper text markup language --->
}