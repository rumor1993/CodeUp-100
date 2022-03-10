package com.company.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

// 12. 암호
public class Case12 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(bf.readLine());
        String str = bf.readLine();
        List<Character> characters = new ArrayList<>();
        String answer = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '#') {
                answer += "1";
            } else {
                answer += "0";
            }

            if (answer.length() == 7) {
                int binaryToDecimal = Integer.parseInt(answer, 2);
                char character = (char) binaryToDecimal;
                characters.add(character);
                answer = "";
            }
        }

        for (char value : characters) {
            System.out.print(value);
        }
    }
}
