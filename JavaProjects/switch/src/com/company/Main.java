package com.company;

public class Main {
    public static void main(String[] args) {
        int num = 123456789;
        System.out.println(getEvenDigitSum(num));
    }
    public static int adder(int num) {
        String numm = String.valueOf(num);
        int sum = 0;
        for(int i = 0; i < numm.length(); i++) {
            sum += Character.getNumericValue(numm.charAt(i));
            System.out.println(numm.charAt(i));
            System.out.println(sum);
        }
        return sum;
    }
    public static int getEvenDigitSum(int n) {
        boolean count = false;
        int sum = 0;
        while(n != 0) {
            int temp = n%10;
            n -= temp;
            n = n/10;
            if (count) {
                sum += temp;
                System.out.println(temp);
            } else {
                count = !count;
            }
        }
        return sum;
    }
}
