package com.company.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 10. 가장 짧은 문자거리
public class Case10 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] str = bf.readLine().split(" ");

        char[] s = str[0].toCharArray();
        char t = s[1];

        int[] answer = new int[s.length];

        for (int i = 0; i < s.length; i++) {
            int leftPoint = i;
            int rightPoint = i;
            int count = 0;
            while (true) {
                if (s[leftPoint] == 'e') {
                    answer[i] = count;
                    break;
                } else if (s[rightPoint] == 'e') {
                    answer[i] = count;
                    break;
                } else {
                    leftPoint++;
                    rightPoint--;
                    count++;
                }
            }
        }
        for (int result : answer) {
            System.out.print(result + " ");
        }
    }
}
