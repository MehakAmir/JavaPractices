package Interface;

interface Animals {
    static void info() {
        System.out.println("Animals are living creatures.");
    }
}

class StaticMethod {
    public static void main(String[] args) {
        Animals.info();  
    }
}

