package OOPS;

public class QuestionImp {
    


    public static void main(String[] args) {
        // Creating two Person objects using constructor
        Person person1 = new Person("Alice", 25);
        Person person2 = new Person("Bob", 30);

        // Printing their details
        person1.displayInfo();
        person2.displayInfo();
    }
}

// Person class
class Person {
    String name;
    int age;

    // Constructor to set attributes
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display person's info
    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

/*
 * 🧠 Java Class and Object Basics – Short Theory
Class is a blueprint for creating objects. It defines variables (attributes) and methods (functions).

Object is an instance of a class. Each object has its own copy of the class's variables.

Constructor is a special method used to initialize objects when they are created.

Instance Variables (like name, age) belong to each object and store its data.

Methods (like displayInfo()) can access and use the object's data to perform actions (e.g., print details).

🔁 Example Flow:
Class Person defines name, age, and a method displayInfo().

Constructor sets name and age when object is created.

displayInfo() prints the values of that specific object's name and age.
 */