package t1;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    //Вывод "yes"/"no" для четного/нечетного числа
    public static void main(String[] args) {
        int n = scanner.nextInt();
        System.out.println(n % 2 == 0 ? "Yes" : "No");
    }
}
