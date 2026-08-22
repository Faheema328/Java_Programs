import java.util.*;


    /* public class OOPS1 {
    public static void main(String[]args){
        Pen p1=new Pen();//Pen()-->Is a constructor
        p1.colour="Pink";
        p1.type="Ball Point";
        p1.company="Meow";
        p1.cost=5.00;
        Pen p2=new Pen();
        p2.colour="Red";
        p2.type="Gel";
        p2.company="Pentonic";
        p2.cost=10.00;
        Pen p3=new Pen();
        p3.colour="Green";
        p3.type="Fountain";
        p3.company="Parker";
        p3.cost=15.00;
        Pen p4=new Pen();
        p4.colour="Yellow";
        p4.type="Marker";
        p4.company="Camlin";
        p4.cost=20.00;
        p1.printColour();
        p2.printType();
        p3.printCompany();
        p4.printCost();
    }
}
class Pen{
    String colour;
    String type;
    String company;
    double cost;
    public void printColour(){
        //Without static java directly can not call a method-->An object is used to perform this work
    System.out.println("The colour of "+this.company+" pen is:"+this.colour);
        //this-->Current object(Tells java:Which object's variable should I use?)
        //this.name=name-->Current object's name = Parameter name
    }
    public void printType(){
    System.out.println("The type of "+this.company+" pen is:"+this.type);
    }
    public void printCompany(){
    System.out.println("One of the company of "+this.type+" pen is:"+this.company);
    }
    public void printCost(){
    System.out.println("The cost of "+this.type+" pen is:"+this.cost);
    }
} */ 

    
    /* public class OOPS1{
    public static void main(String[]args){
        Student s1=new Student();//Student()-->Is a constructor
        s1.name="Faheema";
        s1.age=19;
        s1.section='H';
        s1.dept="CSE";
        s1.rollno=154;
        s1.cgpa=9.47;
        Student s2=new Student();
        s2.name="Vaji Bhanu";
        s2.age=20;
        s2.section='E';
        s2.dept="ECE";
        s2.rollno=180;
        s2.cgpa=8.80;
        Student s3=new Student();
        s3.name="Supriya";
        s3.age=18;
        s3.section='A';
        s3.dept="AIDS";
        s3.rollno=112;
        s3.cgpa=8.50;
        System.out.println("The details(name/age/section/dept/rollno/cgpa) of 3 students are:");
        s1.printName(s1, s2, s3);
        //Any object (s1/s2/s3) can call the method because the method prints using passed objects,not using 'this'
        s2.printAge(s1, s2, s3);
        s3.printSection(s1, s2, s3);
        s1.printDept(s1, s2, s3);
        s2.printRollno(s1, s2, s3);
        s3.printCgpa(s1, s2, s3);
    }
}
class Student{
    String name;
    int age;
    char section;
    String dept;
    int rollno;
    double cgpa;
    public void printName(Student s1,Student s2,Student s3){
    //Passing different student objects to print the same detail (name/age/section/dept/rollno/cgpa)of all students using one method
        System.out.println("The name of student 1 is: "+s1.name);
        System.out.println("The name of student 2 is: "+s2.name);
        System.out.println("The name of student 3 is: "+s3.name);
        System.out.println();
    }
    public void printAge(Student s1,Student s2,Student s3){
        System.out.println("The age of student 1 is: "+s1.age);
        System.out.println("The age of student 2 is: "+s2.age);
        System.out.println("The age of student 3 is: "+s3.age);
        System.out.println();
    }
    public void printSection(Student s1,Student s2,Student s3){
        System.out.println("The section of student 1 is: "+s1.section);
        System.out.println("The section of student 2 is: "+s2.section);
        System.out.println("The section of student 3 is: "+s3.section);
        System.out.println();
    }
    public void printDept(Student s1,Student s2,Student s3){
        System.out.println("The dept of student 1 is: "+s1.dept);
        System.out.println("The dept of student 2 is: "+s2.dept);
        System.out.println("The dept of student 3 is: "+s3.dept);
        System.out.println();
    }
    public void printRollno(Student s1,Student s2,Student s3){
        System.out.println("The rollno of student 1 is: "+s1.rollno);
        System.out.println("The rollno of student 2 is: "+s2.rollno);
        System.out.println("The rollno of student 3 is: "+s3.rollno);
        System.out.println();
    }
    public void printCgpa(Student s1,Student s2,Student s3){
        System.out.println("The cgpa of student 1 is: "+s1.cgpa);
        System.out.println("The cgpa of student 2 is: "+s2.cgpa);
        System.out.println("The cgpa of student 3 is: "+s3.cgpa);
        System.out.println();
    }
} */


//1.Unparameterized Constructor
    /* public class OOPS1{
        public static void main(String[]args){
        VegMar v1=new VegMar();//Unparameterized Constructor
        v1.printVeg1();
        VegMar v2=new VegMar();
        v2.printVeg2();
    }
}
    class VegMar{
        String veg1="Tomato";
        String veg2="Brinjal";

        VegMar(){//Unparameterized Constructor
        //Invoked automatically whenever an object is created
            System.out.println("Vegetable market constructor called!");
        }
        public void printVeg1(){
            System.out.println("Vegetable 1: "+this.veg1);
        }
        public void printVeg2(){
            System.out.println("Vegetable 2: "+this.veg2);
        }
    }; */


//2.Parameterized Constructor
    /* public class OOPS1{
        public static void main(String[]args){
            Student s=new Student("Faheema",19,'H');//Parameterized Constructor
            s.printInfo();
        }
    }
    class Student{
        String name;
        int age;
        char section;

        Student(String name,int age,char section){//Parameterized constructor is invoked
            this.name=name;
            this.age=age;
            this.section=section;
        }

        public void printInfo(){
        // 'this' refers to the object 's' that called this method
            System.out.println("Name: "+this.name);
            System.out.println("Age: "+this.age);
            System.out.println("Section: "+this.section);
        }
    } */


//3.Copy Constructor(Copies the properties of one object into another)
    /* public class OOPS1{
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Faheema";
        s1.age=19;
        s1.section='H';
        s1.printInfo();
        Student s2=new Student(s1);//Creates s2(object) by passing s1 into copy constructor
        //s2 gets a separate copy of s1's data
        s2.printInfo();// Prints s2's info(which is a copy of s1's info)
    }
}
   class Student{
    String name;
    int age;
    char section;

    Student(Student s2){//s2 is the object being copied from(i.e s1)
        //s2-->Local parameter name
        //When new Student(s1) is called from main,s1 is passed in and received here as s2
        //So inside this constructor, s2 = s1 (same object, different name)
        this.name=s2.name;//this-->Object(s2) in main
        this.age=s2.age;
        this.section=s2.section;
        //Logic — reads from source(s1/s2),writes into new object(s2 in main)
    }

    public void printInfo(){
        System.out.println("Students' name: "+this.name);
        System.out.println("Students' age: "+this.age);
        System.out.println("Students' section: "+this.section);
    }

    Student(){

    }
//Once you define any constructor(More than 1)(like the copy constructor)Java removes its auto-provided default constructor
//So without Student(){}--->Error: no suitable constructor found for Student()
//Student(){} exists only to allow s1 = new Student() to work

}; */

 
//4.Polymorphism

//A)Compile time polymorphism(Method overloading)-->Different method with same name but with different work
    /* public class OOPS1{
    public static void main(String[] args) {
        Student s=new Student();
        s.name="Faheema";
        s.age=19;
        s.printInfo(s.name,s.age);
    }
}
class Student{
    String name;
    int age;
    //Method Overloading: Same method name,different parameter count or type
    //Compiler decides at 'COMPILE TIME' which method to call — based on number & type of arguments
    public void printInfo(String name){
    //Called when ONE String argument is passed
    System.out.println("Name is: "+name);
    }
    public void printInfo(int age){
    //Called when ONE int argument is passed
        System.out.println("Age is: "+age);
    }
    public void printInfo(String name,int age){
    //Called when two arguments(String,int)are passed
        System.out.println("Name is: "+name+",Age is: "+age);
    }
} */


//B)Run time polymorphism(Method overriding)-->Both parent and child classes have the same method name with different implementations
//The child class overrides the parent class method, and the appropriate method is called at runtime.
     /* public class OOPS1{
    public static void main(String[] args) {
        Shape s=new Square();//reference type = Shape, actual object = Square
        s.area(2);
        Shape c=new Circle();//Parent reference, child object — runtime polymorphism
        c.area(2);
    }
}
class Shape{
    public void area(int x){// Base method — overridden by subclasses
        System.out.println("Displays area:");
    }
}
class Square extends Shape{
    public void area(int s){//Overrides Shape's area()
        System.out.println("Area of square is:"+s*s);
    }
}
class Circle extends Shape{
    public void area(int r){//Overrides Shape's area()
        System.out.println("Area of circle is:"+(3.14)*r*r);
    }
} */


//5.Inheritance-->Allows a child class to inherit the variables and methods of a parent class.
    /* public class OOPS1{
        public static void main(String[] args) {
            Square s=new Square();// Square object created(inherits Shape's fields & methods)
            s.name="Triangle";
            s.alphabet='T';
            s.printInfo();
        }
    }
    class Shape{//Base Class
        String name;
        char alphabet;
}
class Square extends Shape{//Derived Class
//Square(Child class)inherits all fields and methods of Shape(Parent class)

public void printInfo(){
        System.out.println("Name of the derived class is: "+this.name);
        System.out.println("1st alphabet of "+this.name+" is: "+this.alphabet);
    }
} */


//A.Single Inheritance-->One child class inherits from one parent class
    /* public class OOPS1{
    public static void main(String[] args) {
        int b=4,h=3;
        Triangle t=new Triangle();//Triangle object gets both Shape(BC) & Triangle(DC) methods
        t.printArea(); // Calls inherited method from Shape (0 arguments)
        t.printArea(b, h); // Calls Triangle's own method (2 arguments)
    }
}
class Shape{//Base class
    String shape;
    public void printArea(){
        System.out.println("Displays area");
    }
}
class Triangle extends Shape{//Derived class
    public void printArea(int b,int h){
        this.shape="Triangle";//Overloaded version
        double areaOfTri=0.5*b*h;//0.5 avoids integer division error
        System.out.println("Area of the "+this.shape+" is: "+areaOfTri);
    }
} */


//B.Multilevel Inheritance
    /* public class OOPS1{
    public static void main(String[] args) {
        Triangle t=new Triangle();
        t.shapeClass();//Calling Shape's method through Triangle object (inherited)
        t.triangleClass();//Calling Triangle's own method
        EquiTriangle et=new EquiTriangle();
        et.shapeClass();//Inherited from Shape (2 levels up)
        et.triangleClass();//Inherited from Triangle (1 level up)
        et.equiTriangleClass();//EquiTriangle's own method
    }
}
class Shape{//Base class 
    public void shapeClass(){
        System.out.println("In the shape class");
    }
}

class Triangle extends Shape{//Derived class-1 & Base class-2 
    public void triangleClass(){
        System.out.println("In the triangle class");
    }
}
class EquiTriangle extends Triangle{//Derived class-2
    public void equiTriangleClass(){
        System.out.println("In the equitriangle class");
    }
} */


//C.Hierarchial Inheritance
    /* public class OOPS1{
    public static void main(String[] args) {
        int value=4;
        Square s=new Square();
        s.shapeClass();//Parent method
        s.squareArea(value);//Child method
        Circle c=new Circle();
        c.shapeClass();//Same parent method, different child object
        c.circleArea(value);
    }
}
class Shape{//Base class  
    //Single parent,multiple children → Hierarchical Inheritance
    public void shapeClass(){
        System.out.println("Displays Area");
    }
}
class Square extends Shape{//Derived class-1
    public void squareArea(int s){
        int area=s*s;
        System.out.println("Area of the square is: "+area);
    }
}
class Circle extends Shape{//Derived class-2
    public void circleArea(int r){
        double area=(3.14)*r*r;
        System.out.println("Area of the circle is: "+area);
    }
} */


//D.Hybrid Inheritance--->A combination of two or more types of inheritance in a single program


//6.Abstraction(Hiding internal implementation and showing only the necessary details to the user)

//A.Abstract class(Can have both abstract and non-abstract methods)
    /* public class OOPS1{
    public static void main(String[] args) {
        Horse horse=new Horse();
        horse.eat();
        horse.walk();
        Cow cow=new Cow();
        cow.eat();
        cow.walk();
    }
}
abstract class Animal{//Animal(Class) just exists as a concept — you can't create Animal object directly
    abstract void walk();//Abstract Method-->Has no body and ends with ';'
    public void eat(){//Non-Abstract method
        System.out.println("Animal eats");
    }
}
class Horse extends Animal{
    public void walk(){
        System.out.println("Horse walks with 4 legs");
    }
}
class Cow extends Animal{
    public void walk(){
        System.out.println("Cow also walks with 4 legs");
    }
} */


//B.Abstract class(Have static methods(Call directly using class name — no object needed))
    /* public class OOPS1{
    public static void main(String[] args) {
        Animal.eat();//Methods can be called directly(Just with the class name)without creating an object
        Animal.walk();
        Animal.sleep();
    }
}
class Animal{
    public static void eat(){//Static method
        System.out.println("Animal eats");
    }
    public static void walk(){
        System.out.println("Animal walks");
    }
    public static void sleep(){
        System.out.println("Animal sleeps");
    }
} */


//C.Abstract class(Have constructors)
    /* public class OOPS1{
    public static void main(String[]args){
        Horse horse=new Horse();
        horse.walk();
        Cow cow=new Cow();
        cow.walk();
    }
}
abstract class Animal{
    Animal(){//Constructor inside an abstract class
        System.out.println("Animal constructor created");
    }
    abstract void walk();//Abstract method
}
class Horse extends Animal{
    Horse(){//This runs bcoz "Horse()"constructor is invoked automatically when horse object was being created
        System.out.println("Horse constructor created");
    }
    public void walk(){
        System.out.println("Horse walks with 4 legs");
    }
}
class Cow extends Animal{
    Cow(){
        System.out.println("Cow constructor created");
    }
    public void walk(){
        System.out.println("Cow also walks with 4 legs");
    }
} */


//7.Interface-->//A blueprint with only abstract methods that implementing classes(Sub classes) must define

//Interface(All fields are public,static(Does not belong to object) and final(Constant))&(All methods are public and abstract)by default
    /* public class OOPS1{
    public static void main(String[] args) {
        int eyes=2;//Final variable
        Horse horse=new Horse();
        horse.walk(eyes);
        Cow cow=new Cow();
        cow.walk(eyes);
    }
}
interface Animal{
    public void walk(int x);//All methods of interface are public and abstract by default
    //No normal method(Has body)
}
class Horse implements Animal{
    public void walk(int eyes){//Not public by default
        System.out.println("Horse walks with 4 legs");
        System.out.println("Horse has "+eyes+" eyes");
    }
}
class Cow implements Animal{
    public void walk(int eyes){
        System.out.println("Cow also walks with 4 legs");
        System.out.println("Cow has "+eyes+" eyes");
    }
} */


//***Multiple Inheritance(Jo sirf interface se hee implement hoga but class se nahi)
//Multiple Inheritance-->Child class inheriting from two or more parent classes
    /* public class OOPS1{
    public static void main(String[] args) {
        Horse horse=new Horse();
        horse.animal();
        horse.herbivore();
    }
}
interface Animal{
    void animal();//Public by default
}
interface Herbivore{
    void herbivore();
}
class Horse implements Animal,Herbivore{
    public void animal(){
        System.out.println("Horse is an animal");
    }
    public void herbivore(){
        System.out.println("Horse is a herbivore");
    }
} */

    
//8.Static properties & functions
//Static:Belongs to class,not object & Shared across all objects & Called without creating object(By using class name)
//Static-->Same memory for all objects ; Non-static-->Seperate memory for all objects
    /* public class OOPS1{
    public static void main(String[] args) {
        Student s=new Student();
        s.name="Faheema";
        s.dept="CSE";
        Student.school="Dhaanish";//Static property(school)-->Accessed using class but not object
        Student.section='H';
        Student.changeSchool();// Updates static school to "SAIU"
        Student.changeSection();
        s.printInfo();
    }
}
class Student{
    String name;
    String dept;
    static String school;//Shared across all Student objects
    static char section;
    public static void changeSchool(){//Static method
        school="SAIU";
    }
    public static void changeSection(){
        section='C';
    }
    public void printInfo(){
        System.out.println("Name:"+this.name);//For static methods we cannot use 'this'
        System.out.println("Department:"+this.dept);
        System.out.println("School:"+Student.school);//Prints changed value
        System.out.println("Section:"+Student.section);
    }
} */
