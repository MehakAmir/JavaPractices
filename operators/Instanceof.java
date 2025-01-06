package operators;

interface MyInte {}
class A implements MyInte {}
class B implements MyInte{}
class C extends A {}
//case 2 class hierarchy
class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}
//case 3 
class Person{}
//case 5 
interface U {}
interface V {}
class G implements U, V {}



public class Instanceof {
    public static void main(String[] args) {
        A obj = new A();
        C obj1 = new C();
        System.out.println(obj instanceof MyInte); 
        System.out.println(obj instanceof A); 
        System.out.println(obj1 instanceof A);
        System.out.println("-------------------");
        //case 2  class hierarchy
        Animal a = new Dog();
        System.out.println(a instanceof Animal); 
        System.out.println(a instanceof Dog);     
        System.out.println(a instanceof Cat);
        System.out.println("-------------------");
        //case 3 instance of with null
        Person p = null;
        System.out.println(p instanceof Person);
        System.out.println("-------------------");
        //case 4 instance of with array 
        int[] numbers = new int[5];
        System.out.println(numbers instanceof Object);  
        System.out.println(numbers instanceof int[]);  
       // System.out.println(numbers instance of String[]); // false, because numbers is not a String array You cannot use instance of to check if an array of one type (in[]) is an instance of a different array type (String[]).
        System.out.println("-------------------");
        //case 5  multiple interface
        G c = new G();
        System.out.println(c instanceof U);  
        System.out.println(c instanceof V);  
        System.out.println(c instanceof Object);
    }
        
    }

