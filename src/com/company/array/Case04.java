package com.company.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 4. 피보나치수열
public class Case04 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int input1 = Integer.parseInt(bf.readLine());
        int[] numbers = new int[input1];
        numbers[0] = 1;
        numbers[1] = 1;

        for (int i = 2; i < numbers.length; i++) {
            numbers[i] = numbers[i - 2] + numbers[i - 1];
        }

        for (int value : numbers) {
            System.out.print(value + " ");
        }
    }
}