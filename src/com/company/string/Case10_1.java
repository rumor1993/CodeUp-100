package com.company.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 10. 가장 짧은 문자거리
public class Case10_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] str = bf.readLine().split(" ");
        String s = str[0];
        char t = str[1].charAt(0);

        int[] answer = new int[s.length()];
        int count = 100;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t) {
                count = 0;
                answer[i] = count;
            }
            else {
                count++;
                answer[i] = count;
            }
        }

        count = 100;

        for (int i = s.length()-1; i >= 0; i--) {
            if (s.charAt(i) == t) count = 0;
            else {
                count++;
                answer[i] = Math.min(answer[i], count);
            }
        }

         for (int number : answer) {
            System.out.print(number + " ");
        }
    }
}
