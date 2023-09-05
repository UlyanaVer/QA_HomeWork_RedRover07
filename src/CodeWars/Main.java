package CodeWars;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int elem = 0;

        String numbers = "1 2 3 4 9 -1";
        String[] words = numbers.split(" ");
        for (String word : words) {
            for (int i = 0; i < words.length; i++) {
                elem = Integer.parseInt(word);
                if (elem > max && elem > 0) {
                    max = elem;
                }
                if (elem < min || elem < 0) {
                    min = elem;
                }
            }

        }
        System.out.println( Arrays.toString(words));
        System.out.println(max);
        System.out.println(min);
    }
}