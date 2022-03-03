package com.company.basic;

import java.util.Scanner;

// 문자찾기
public class Case01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.nextLine();
        String input2 = scanner.nextLine();
        int count = 0;

        for (int i = 0; i < input1.length(); i++) {
            if (input2.toUpperCase().equals(String.valueOf(input1.toUpperCase().charAt(i)))) count++;
        }
        System.out.println(count);
    }
}
