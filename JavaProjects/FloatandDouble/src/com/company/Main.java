package com.company;

public class Main {

    public static void main(String[] args) {
        float min = Float.MIN_VALUE;
        float max = Float.MAX_VALUE;
        System.out.println("f min is: " + min);
        System.out.println("f max is: " + max);

        double minn = Double.MIN_VALUE;
        double maxx = Double.MAX_VALUE;
        System.out.println("d min is: " + minn);
        System.out.println("d max is: " + maxx);

        int ii = 5/3;
        float ff = 5f/3f;
        double dd = 5d/3d;
        System.out.println("ii: " + ii);
        System.out.println("ff: " + ff);
        System.out.println("dd: " + dd);

        double conv = 0.4_535_923_700;
        double p = 2.3;
        double kg = p*conv;
        System.out.println("kg is " + kg);

        char myc = 'd';
        char uni = '\u00a9';
        System.out.println(myc);
        System.out.println(uni);

        //byte, short, int, long, float, double, char, boolean, string
        String ms = "this is string";
        System.out.println("my string is " + ms);

    }
}
