package com.company.string;

import java.util.Scanner;

// 대소문자 변환
public class Case02 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String input1 = in.nextLine();
        String answer = "";

        char[] c = input1.toCharArray();
        for (char v : c) {
            if (Character.isUpperCase(v)) answer += Character.toLowerCase(v);
            else answer += Character.toUpperCase(v);
        }

        System.out.println(answer);
    }
}
