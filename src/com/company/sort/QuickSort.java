package com.company.sort;

import java.util.Arrays;

// 퀵정렬 시간 복잡도는 O(N* logN)
//
public class QuickSort {
    public static void main(String[] args) {
        int[] array = {3, 7, 8, 1, 5, 9, 6, 10, 2, 4};
        int number = 10;

        quickSort(array, 0, number - 1);

        System.out.println("Arrays.toString(array) = " + Arrays.toString(array));
    }

    static void quickSort(int[] data, int start, int end) {
        if (start >= end) return;

        int key = start;
        int i = start + 1;
        int j = end;
        int temp;

        while (i <= j) {
            while (data[i] <= data[key]) {
                i++;
            }
            while (data[j] >= data[key] && j > start) {
                j--;
            }

            if (i > j) {
                temp = data[j];
                data[j] = data[key];
                data[key] = temp;
            } else {
                temp = data[j];
                data[j] = data[i];
                data[i] = temp;
            }
        }

        quickSort(data, start, j -1);
        quickSort(data,  j + 1, end);
    }
}
