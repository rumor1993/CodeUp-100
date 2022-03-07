package com.company.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 11. 문자열 압축
public class Case11 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        String answer = "";
        int count = 1;

        for (int i = 0; i < str.length(); i++) {
            if (str.length() > i+1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                if (count > 1) answer += str.charAt(i) + "" + count;
                else answer += str.charAt(i) + "";
                count = 1;
            }
        }
        System.out.println(answer);
    }
}
