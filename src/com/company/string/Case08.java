package com.company.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

    // 회문문자제거 2
    public class Case08 {
        public static void main(String[] args) throws IOException {
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            String str = bf.readLine();
            String answer = "NO";

            str = str.toLowerCase().replaceAll("[^a-z]", "");

            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.reverse();

            String str1 = stringBuilder.toString().toLowerCase();

            if (str1.equals(str)) answer = "YES";
            System.out.println(answer);
        }
    }
