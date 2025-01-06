package practice;

public class overloading {
    
    // Method to draw a String
    public void draw(String s) {
        System.out.println("Drawing String: " + s);
    }
    
    
    public void draw(int i) {
        System.out.println("Drawing Integer: " + i);
    }
    
    
    public void draw(double f) {
        System.out.println("Drawing Double: " + f);
    }
    public void draw(int i, double f) {
        System.out.println("Drawing Integer and Double: " + i + " and " + f);
    }
    
    public static void main(String[] args) {
    	overloading artist = new overloading();
        
        // Calling overloaded methods
        artist.draw("Hello");  
        artist.draw(123);          
        artist.draw(45.67);        
        artist.draw(100, 9.87); 
    }
}

