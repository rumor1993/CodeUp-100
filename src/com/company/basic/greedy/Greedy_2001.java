package com.company.basic.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Greedy_2001 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int pastaMin = 2001;
        int juiceMin = 2001;

        for (int i = 0; i < 5; i++) {
            int input = Integer.parseInt(bf.readLine());
            if (i < 3) {
                if (input < pastaMin) pastaMin = input;
            } else {
                if (input < juiceMin) juiceMin = input;
            }
        }

        System.out.println((float)(pastaMin + juiceMin) * 10 / 100 + (pastaMin + juiceMin));

    }
}
