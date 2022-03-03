package com.company.basic;

import java.util.Scanner;

// 문자찾기
public class Case02 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String input1 = in.nextLine();
        String answer = "";

        char[] c = input1.toCharArray();
        for (char v : c) {
            if (Character.isUpperCase(v)) answer += Character.toUpperCase(v);
            else answer += Character.toLowerCase(v);
        }

        System.out.println(answer);
        return ;

    }
}
