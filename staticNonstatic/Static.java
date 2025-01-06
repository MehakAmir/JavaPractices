package staticNonstatic;

class Counter {
    // Static variable
    static int count = 0;

    // Static method
    static void incrementCount() {
        count++;
    }

    void displayCount() {
        System.out.println("Count: " + count);
    }
}

public class Static {
    public static void main(String[] args) {
        Counter.incrementCount();
        System.out.println("Count: " + Counter.count);

   
        Counter obj1 = new Counter();
        obj1.displayCount();
        
        Counter obj2 = new Counter();
        obj2.displayCount();
    }
}

