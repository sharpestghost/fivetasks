package t3;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    //Вычисление числа уникальных значений из набора переданных чисел
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scanner.nextInt();
        Set<Integer> uniqueNumbers = new HashSet();
        for (int i = 0; i < n; i++) {
            uniqueNumbers.add(scanner.nextInt());
        }
        System.out.println(uniqueNumbers.size());
    }
}
