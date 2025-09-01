package OOPS;

// Polymorphism is a concept in OOP that allows objects of different classes to  be treated as objects of a common super class.
// It is achieved through method overloading and method overriding.

public class Polymorphism {
    public static void main(String[] args) {
        calculator calc = new calculator();
        System.out.println(calc.sum(5,10));
        System.out.println(calc.sum(5,10,15));
        System.out.println(calc.sum((float)5.4,(float)10.4));

         Dog d = new Dog();
    d.eat();
}
    }

   

// Example of Method OverLoading
class calculator{
    int sum(int a, int b){
        return a+b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }
    float sum(float a, float b){
        return a+b;
    }

}


// Example of Method Overriding
class Animal{
    void eat(){
        System.out.println("eating....");
    }
}
 class Dog extends Animal{
    void eat(){
        System.out.println("eating bread...");
    }
 }