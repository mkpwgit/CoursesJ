package com.company.lesson2;

/**
 * @author kisel.nikolay@gmail.com
 * @since 28.09.2014
 */
public class FourthTask {

    public static void main(String[] args) {
        long hexLongValue = 0x0FL;
        System.out.println(hexLongValue);

        long octLongValue = 06;
        System.out.println(octLongValue);

        System.out.println("Hex: "+Long.toBinaryString(hexLongValue));
        System.out.println("Oct: "+Long.toBinaryString(octLongValue));
    }
}
