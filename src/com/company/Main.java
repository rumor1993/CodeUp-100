package com.company;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String number = bf.readLine();

        char[] numbers = new char[number.length()];
        for (int i = 0; i < number.length(); i++) {
            numbers[i] = number.charAt(i);
        }

        String result = "";

        for (int i = numbers.length; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                result += "0";
            }
            System.out.println("[" + result.replaceFirst("0", String.valueOf(numbers[numbers.length-i])) + "]");
            result = "";
        }
    }
}
