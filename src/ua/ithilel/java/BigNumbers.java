package ua.ithilel.java;

import java.text.DecimalFormat;

public class BigNumbers {

    public static void main(String[] args) {

        DecimalFormat dF = new DecimalFormat("###.#########");

        double b = 100.066_123_455d;
        double c = 15500088.443_311_220_1d;
        int a = 10_000_000;

        System.out.println(dF.format(b));
        System.out.println(dF.format(c));
        System.out.println(dF.format(a));

    }


}
