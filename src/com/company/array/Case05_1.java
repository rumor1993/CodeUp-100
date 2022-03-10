package com.company.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 5. 소수 (에라토스테네스 체)
public class Case05_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int[] ch = new int[n+1];
        int answer = 0;

        for (int i = 2; i <= n; i++) {
            if (ch[i] == 0) {
                answer++;
                for (int j = i; j < n; j = j + i) {
                    ch[j] = 1;
                }
            }
        }
        System.out.println(answer);
    }
}