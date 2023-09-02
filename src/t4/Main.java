package t4;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    //На входе число, показывающее количество слов и сами слова, на выходе - количество повторений самого частого слова
    public static void main(String[] args) {
        int n = scanner.nextInt();
        Map<String, Integer> freqMap = new HashMap();
        for (int i = 0; i < n; i++) {
            freqMap.merge(scanner.next(), 1, Integer::sum);
            /*
            Короткая версия такого добавления:
            String word = scanner.next();
            if (freqMap.containsKey(word)) {
                freqMap.put(word, freqMap.get(word) + 1);
            } else {
                freqMap.put(word, 1);
            }
             */
        }
        int max = freqMap.values().stream().max(Comparator.naturalOrder()).orElse(0);
        System.out.println(max);
    }
}