package Interface;

//Shape Interface 
interface Shape {
 double area();       
 double perimeter();   
}
//Circle class implementing Shape interface
class Circle implements Shape {
 double radius;

 // Constructor to initialize the radius
 Circle(double radius) {
     this.radius = radius;
 }

 public double area() {
     return Math.PI * radius * radius;  
 }

 public double perimeter() {
     return 2 * Math.PI * radius;  
 }
}


//Rectangle class implementing Shape interface
class Rectangle implements Shape {
 double length, width;

 Rectangle(double length, double width) {
     this.length = length;
     this.width = width;
 }

 public double area() {
     return length * width; 
 }

 public double perimeter() {
     return 2 * (length + width);  
 }
}
public class InterfaceShape {
    public static void main(String[] args) {
        // Creating objects of Circle and Rectangle
        Shape circle = new Circle(5.0);   
        Shape rectangle = new Rectangle(4.0, 6.0);

        // Printing area circle
        System.out.println("Circle Area: " + circle.area());            
        System.out.println("Circle Perimeter: " + circle.perimeter());  

        // Printing area Rectangle
        System.out.println("Rectangle Area: " + rectangle.area());            
        System.out.println("Rectangle Perimeter: " + rectangle.perimeter());  
    }
}


