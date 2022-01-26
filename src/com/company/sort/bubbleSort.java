package com.company.sort;

import java.util.Arrays;

// 선택정렬의 시간 복잡도는 O(N^2)
// 처리할 데이터가 많다면 더 효율적이지 않다.
// 선택정렬보다 더 비효율적임 ( 정렬 알고리중에서 가장 비효율적임 )
public class bubbleSort {
    public static void main(String[] args) {
        int temp;
        int[] array = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 9 - i; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                }
            }
        }
        System.out.println("Arrays.toString(array) = " + Arrays.toString(array));
    }
}
