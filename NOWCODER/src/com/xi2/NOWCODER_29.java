package com.xi2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


/**
 * @author GHOSTLaycoo
 * @date 2019/10/9 0009 - 下午 12:35
 *
 * 题目:插入与归并(25)
 */

public class NOWCODER_29 {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(in.readLine());
        String[] a = in.readLine().split(" ");
        String[] b = in.readLine().split(" ");
        int[] before = new int[N];
        int[] after = new int[N];
        for (int i = 0; i < N; i++) {
            before[i] = Integer.parseInt(a[i]);
            after[i] = Integer.parseInt(b[i]);
        }
        if (isInsert(before, after)) {
            insertion(before, after);
        } else {
            merge(before, after);
        }
    }

    /**
     * @param before
     * @param after
     */
    private static void merge(int[] before, int[] after) {
        int length = before.length;
        System.out.println("Merge Sort");
        int k = 1;
        boolean flag = false;
        while (flag == false) {
            flag = Arrays.equals(before, after);
            k = k * 2;
            for (int p = 0; p < length / k; p++)
                sort(before, p * k, (p + 1) * k - 1);
            sort(before, length / k * k, length - 1);
        }
        for (int a : before)
            System.out.print(a + " ");
    }


    private static void sort(int[] a, int begin, int end) {
        for (int i = begin; i < end; i++) {
            for (int j = i + 1; j <= end; j++) {
                if (a[j] < a[i]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    /**
     * @param before
     * @param after
     */
    private static void insertion(int[] before, int[] after) {
        System.out.println("Insertion Sort");
        int length = before.length;
        int j = 0;
        while (after[j + 1] > after[j] && j < length - 1) {
            j++;
        }
        int i = j;
        while (i > -1 && after[j + 1] < after[i]) {
            int next = after[j + 1];
            after[j + 1] = after[i];
            after[i] = next;
            i--;
            j--;
        }
        for (int a : after)
            System.out.print(a + " ");
    }

    /**
     * @param before
     * @param after
     * @return
     */
    private static boolean isInsert(int[] before, int[] after) {
        int length = before.length;
        int j = 0;
        while (after[j + 1] > after[j] && j < length - 1) {
            j++;
        }
        for (int i = j + 1; i < length; i++) {
            if (before[i] != after[i])
                return false;
        }
        return true;
    }
}