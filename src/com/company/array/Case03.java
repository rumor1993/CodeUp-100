package com.company.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 3. 가위, 바위, 보
public class Case03 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int input1 = Integer.parseInt(bf.readLine());
        String input2 = bf.readLine();
        String input3 = bf.readLine();
        String[] A = input2.split(" ");
        String[] B = input3.split(" ");

        //가위, 바위, 보의 정보는
        // 1:가위, 2:바위, 3:보
        for (int i = 0; i < A.length; i++) {
            if (A[i].equals("1")) {
                if (B[i].equals("3")) {
                    System.out.println("A");
                } else if (B[i].equals("2")) {
                    System.out.println("B");
                } else {
                    System.out.println("D");
                }
            } else if (A[i].equals("2")) {
                if (B[i].equals("3")) {
                    System.out.println("B");
                } else if (B[i].equals("2")) {
                    System.out.println("D");
                } else {
                    System.out.println("A");
                }
            } else if (A[i].equals("3")) {
                if (B[i].equals("3")) {
                    System.out.println("D");
                } else if (B[i].equals("2")) {
                    System.out.println("A");
                } else {
                    System.out.println("B");
                }
            }
        }
    }
}