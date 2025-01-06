package finalkeyword;

class FinalVariableExample {
   
    final int MAX_LIMIT = 100;

    public void changeLimit() {
      
        // MAX_LIMIT = 200; // Error: cannot assign a value to final variable 'MAX_LIMIT'
    }

    public static void main(String[] args) {
        FinalVariableExample obj = new FinalVariableExample();
        System.out.println("Max Limit: " + obj.MAX_LIMIT);  
    }
}

