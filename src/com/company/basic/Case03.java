package com.company.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
// 문장 속 단어
public class Case03 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input = bf.readLine();

        StringTokenizer tokenizer = new StringTokenizer(input, " ");
        String maxLengthToken = "";
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            if (maxLengthToken.length() < token.length()) maxLengthToken = token;
        }
        System.out.println(maxLengthToken);
    }
}
