package com.company.basic.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Greedy_3120 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input = bf.readLine();

        StringTokenizer stringTokenizer = new StringTokenizer(input, " ");

        int start = Integer.parseInt(stringTokenizer.nextToken());
        int end = Integer.parseInt(stringTokenizer.nextToken());
        int count = 0;

        while (end != start) {
            if (end > start) {
                if (end >= start + 10) {
                    start += 10;
                    count++;
                } else if (end > start + 7) {
                    start += 10;
                    count++;
                } else if (end >= start + 5) {
                    start += 5;
                    count++;
                } else if (end > start + 3) {
                    start += 5;
                    count++;
                } else if (end >= start + 1) {
                    start += 1;
                    count++;
                }
            } else {
                if (end <= start - 10) {
                    start -= 10;
                    count++;
                } else if (end < start - 7) {
                    start -= 10;
                    count++;
                } else if (end <= start - 5) {
                    start -= 5;
                    count++;
                } else if (end < start - 3) {
                    start -= 5;
                    count++;
                } else if (end <= start - 1) {
                    start -= 1;
                    count++;
                }
            }
        }
        System.out.println(count);


    }
}
