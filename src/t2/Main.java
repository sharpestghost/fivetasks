package t2;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    //Простые операции
    public static void main(String[] args) {
        double m = scanner.nextDouble();
        double n = scanner.nextDouble();
        int o = scanner.nextInt();
        double result = (Math.ceil(m + n) / o);
        System.out.println((int) result);
    }
}
