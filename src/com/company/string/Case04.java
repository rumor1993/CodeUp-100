package com.company.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 단어 뒤집기
// StringBuilder 이용하면 reverse() 함수용 사
public class Case04 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(bf.readLine());
        String[] strings = new String[input];

        for (int i = 0; i < input; i++) {
            String reverse = "";
            char[] chars = bf.readLine().toCharArray();
            for (int j = chars.length-1; j >= 0; j--) {
                reverse += chars[j];
            }
            strings[i] = reverse;

        }

        for (String answer : strings) {
            System.out.println(answer);
        }
    }
}
