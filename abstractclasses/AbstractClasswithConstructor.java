package abstractclasses;
abstract class Shape {
    String color;

    //constroctor
    Shape(String color) {
        this.color = color;
        System.out.println("super");
    }

    abstract void draw();  

    void displayColor() {
        System.out.println("The color of the shape is: " + color);
    }
}




class Circle extends Shape {
    double radius;

    Circle(String color, double radius) {
        super(color);  
        this.radius = radius;
        System.out.println("child");
    }

    @Override
    void draw() {
        System.out.println("Drawing a Circle with radius " + radius);
    }

    @Override
    void displayColor() {
        System.out.println("The color of the circle is: " + color);
    }
}

class  AbstractClasswithConstructor {
    public static void main(String[] args) {
        Circle circle = new Circle("Red", 5);
        circle.draw();          
        circle.displayColor();   
    }
}


