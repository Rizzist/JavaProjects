package com.company;

public class Main {

    public static void main(String[] args) {
        int[] w = {100, 26, 81, 5, 15};
        int[] c = sort(w);
        for (int k = 0; k < c.length; k++) {
            System.out.println(c[k]);
        }
    }

    public static int[] sort(int[] arr) {
        int[] narr = new int[arr.length];
        int[] w = arr;
        for (int i =0; i < arr.length; i++) {
            int result = Integer.MIN_VALUE;
            int index = 0;
            for (int j = 0; j < w.length-i; j++) {
                if (w[j] > result) {
                    result = w[j];
                    index = j;
                }
            }
            for (int k = 0; k < w.length-i; k++) {
                if (k < index) {
                    w[k] = w[k];
                } else if (k > index) {
                    w[k-1] = w[k];
                }
            }
            narr[i] = result;
        }
        return narr;
    }
}
