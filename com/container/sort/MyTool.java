package com.container.sort;

import java.util.Comparator;

public class MyTool {
    // 自然排序
    public static <T extends Comparable> void sort(T[] array) {
        for (int i = 0; i < array.length; i++) {
            int index = i;
            for (int j = i; j < array.length; j++) {
                if (array[index].compareTo(array[j]) > 0) {
                    index = j;
                }
            }
            if (index != i) {
                T temp = array[index];
                array[index] = array[i];
                array[i] = temp;
            }
        }
    }

    // 比较器排序
    public static <T> void sort(T[] array, Comparator<T> comparator) {
        for (int i = 1; i < array.length; i++) {
            if (comparator.compare(array[i], (array[i - 1])) < 0) {
                T temp = array[i];
                int j = i;
                do {
                    array[j] = array[j - 1];
                    j--;
                } while (j > 0 && comparator.compare(array[i], (array[i - 1])) < 0);
                array[j] = temp;
            }
        }
    }

}
