package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        int sum = 0;
        int avg = 0;
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while(true) {
            boolean isint = scanner.hasNextInt();
            if (isint) {
                sum += scanner.nextInt();
                count += 1;
            } else{
                break;
            }
            scanner.nextLine();
        }
        scanner.close();
        if (count == 0) {
            avg = 0;
        } else {
            avg = (int) Math.round((double) (sum)/count);
        }
        System.out.println("SUM = " + sum + " AVG = " + (int) avg);
    }
}
