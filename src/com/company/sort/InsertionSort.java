package com.company.sort;

import java.util.Arrays;

// 선택정렬의 시간 복잡도는 O(N^2)
// 버블, 선택 중에서는 가장 효율적임 ( 정렬이 어느정도 되어있으면 가장 빠르다 )
public class InsertionSort {
    public static void main(String[] args) {
        int j = 0;
        int temp = 0;
        int[] array = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};

        for (int i = 0; i < 9; i++) {
            j = i;
            while (array[j] > array[j + 1]) {
                temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;
                j--;
            }
        }
        System.out.println("Arrays.toString(array) = " + Arrays.toString(array));
    }
}
