package com.company.basic;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int[] result = new int[10];
        char[] arrays = String.valueOf(a * b * c).toCharArray();

        for (int i = 0; i < arrays.length; i++) {
            result[arrays[i] - '0'] += 1;
        }

        for (int number : result) {
            System.out.println(number);
        }
    }
}

