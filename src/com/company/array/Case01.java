package com.company.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Case01 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int input1 = Integer.parseInt(bf.readLine());
        String input2 = bf.readLine();

        String[] chars = input2.split(" ");

        for (int i = 0; i < chars.length; i++) {
            if (i == 0 || Integer.parseInt(chars[i-1]) < Integer.parseInt(chars[i])) {
                System.out.print(chars[i] + " ");
            }
        }
    }
}
