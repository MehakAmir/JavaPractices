package sets;

import java.util.HashSet;

public class AddAllExample {
    public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<>();
        HashSet<String> set2 = new HashSet<>();

        // first HashSet
        set1.add("mehak");
        set1.add("sehar");
        set1.add("sara");

        //  second HashSet
        set2.add("noor");
        set2.add("sara");  
        set2.add("zainab");
        System.out.println("set1: " + set1);
        System.out.println("set2: " + set2);

       
        boolean result = set1.addAll(set2);

       
        System.out.println("Was set1 modified? " + result);
        System.out.println("Updated set1: " + set1);
    }
}

