package com.company.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 5. 소수 (에라토스테네스 체)
public class Case05 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int input1 = Integer.parseInt(bf.readLine());
        int result = 0;
        int count = 0;
        for (int i = 2; i <= input1; i++) {
            count = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }
            if (count < 1) {
                result++;
            }
        }
        System.out.println(result);
    }
}