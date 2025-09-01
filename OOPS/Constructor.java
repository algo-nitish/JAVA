package OOPS;  // Ensure your file is inside the "OOPS" package

public class Constructor {
    public static void main(String args[]) {
        // Non-parameterized constructor
        Student s1 = new Student();  

        // Parameterized constructors
        Student s2 = new Student("Shradha");
        Student s3 = new Student(123);

        // Copy constructor
        Student s4 = new Student(s2);  

        // Displaying student details
        s1.display();
        s2.display();
        s3.display();
        s4.display();
    }
}

class Student {
    String name;
    int roll;

    // 1. Non-parameterized constructor
    Student() {
        this.name = "Unknown";
        this.roll = 0;
        System.out.println("Non-parameterized constructor is called...");
    }

    // 2. Parameterized constructor (Name)
    Student(String name) {
        this.name = name;
        this.roll = 0;  // Default roll number
    }

    // 3. Parameterized constructor (Roll)
    Student(int roll) {
        this.name = "Unknown";  // Default name
        this.roll = roll;
    }

    // 4. Copy constructor (Takes another Student object)
    Student(Student s) {
        this.name = s.name;
        this.roll = s.roll;
        System.out.println("Copy constructor is called...");
    }

    // Method to display student details
    void display() {
        System.out.println("Student Name: " + name + ", Roll No: " + roll);
    }
}


 /*
     * Constructor is a special method which is invoked automatically at the time of object creation.

Constructors have the same name as class or structure.

Constructors don’t have a return type. (Not even void)

Constructors are only called once, at object creation.

Memory allocation happens when constructor is called.

Constructors are used to initialize the object.

             Types of constructors:
             1.Non-parameterized :
             2.Parameterized:
             3:copy constructor:
     */
    