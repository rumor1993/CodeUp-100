package com.company.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class Case05 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        char[] chars = str.toCharArray();
        String strings = "";

        String pattern = "^[a-zA-Z]*$";
        for (char word : chars) {
            if (Pattern.matches(pattern, String.valueOf(word))) {
                strings += word;
            }
        }

        char[] strs = strings.toCharArray();
        int len = strs.length - 1;

        for (int i = 0; i < chars.length; i++) {
            if (Pattern.matches(pattern, String.valueOf(chars[i]))) {
                chars[i] = strs[len];
                len--;
            }
        }

        for (char word : chars) {
            System.out.print(word);
        }
    }
}
