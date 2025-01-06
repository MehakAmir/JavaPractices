package LoopsAndStatements;

public class SumWhile {
    public static void main(String[] args) {
        int sum = 0;
        int num = 1;

        while (num <= 100) {
            sum += num;
            num++;
        }

        System.out.println("The sum of numbers from 1 to 100 is: " + sum);
    }
}

