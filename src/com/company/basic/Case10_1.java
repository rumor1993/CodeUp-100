package com.company.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 10. 가장 짧은 문자거리
public class Case10_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] str = bf.readLine().split(" ");

        char[] s = str[0].toCharArray();
        char t = s[1];

        int[] answer = new int[s.length];
        int count = 0;

        for (int i = 0; i < s.length; i++) {
            if (s[i] == 'e') answer[i] = count;
        }

        for (int result : answer) {
            System.out.print(result + " ");
        }
    }
}
