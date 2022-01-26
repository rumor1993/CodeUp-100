package com.company.sort;


import java.util.Arrays;

// 선택정렬의 시간 복잡도는 O(N^2)
// 처리할 데이터가 많다면 더 효율적이지 않다.
public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
        int min, index = 0, temp;

        for (int i = 0; i < array.length; i++) {
            min = 9999;
            for (int i1 = i; i1 < array.length; i1++) {
                if (min > array[i1]) {
                    min = array[i1];
                    index = i1;
                }
            }
            temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }
        System.out.println("Arrays.toString(array) = " + Arrays.toString(array));
    }
}
