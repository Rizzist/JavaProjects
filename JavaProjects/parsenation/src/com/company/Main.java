package com.company;

public class Main {

    public static void main(String[] args) {
        printSquareStar(8);
    }

    public static void printSquareStar(int n) {
        if (n < 5) {
            System.out.println("Invalid Value");
        } else {
            int position = 0;
            String s = "";
            for(int i = 0; i < n; i++) {
                s = "";
                if (i == 0 || i == n-1) {
                    for(int j = 0; j < n; j++) {
                        s += "*";
                    }
                } else {
                    s += "*";
                    //i need to put 2 stars if odd somewhere...
                    //i need to put 1 star if even
                    int s1 = i-1;
                    int s2 = (n-2)-i;
                    for (int j = 0; j < n-2; j++) {
                        if (j == s1) {
                            s += "*";
                        } else if (j == s2) {
                            s += "*";
                        } else {
                            s += " ";
                        }
                    }
                    s += "*";
                }
                System.out.println(s);
            }
        }
    }
}
