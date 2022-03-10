package com.company.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Case02 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int input1 = Integer.parseInt(bf.readLine());
        String input2 = bf.readLine();
        String[] chars = input2.split(" ");
        int min = Integer.MIN_VALUE;
        int count = 0;

        for (int i = 0; i < chars.length; i++) {
            if (min < Integer.parseInt(chars[i])) {
                min = Integer.parseInt(chars[i]);
                count++;
            }
        }
        System.out.println(count);
    }
}