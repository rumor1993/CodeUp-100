package com.company.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 9. 숫자만 추출
public class Case09 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        int answer = Integer.parseInt(str.replaceAll("[A-Za-z]", ""));
        System.out.println(answer);
    }
}
