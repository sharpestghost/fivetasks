package t5;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    //static ArrayList[] edgesMap; тут была идея с графом, но он вряд ли будет
    public static void main(String[] args) {
        int n = scanner.nextInt();
        int balance = 0;
        for (int i = 0; i < n; i++) {
            int val = scanner.nextInt();
            balance += (i % 2 == 0) ? val : -val;
        }
        System.out.println(balance);
    }
}