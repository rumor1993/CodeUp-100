package com.company.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 회문문자제거 1
public class Case07 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        String answer = "NO";

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.reverse();

        String str1 = stringBuilder.toString().toLowerCase();
        String str2 = str.toLowerCase();

        if (str1.equals(str2)) answer = "YES";
        System.out.println(answer);
    }
}
