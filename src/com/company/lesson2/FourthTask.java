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

        String s;
        int a=47;
        StringBuilder sb = new StringBuilder ("0123456789");
        s=sb.append("").append(a).append("").toString();
        System.out.println(s);
        sb.delete(0,2);
        System.out.println(sb);
        sb.insert(0,4);
        System.out.println(sb);
        sb.replace(0,9,"42");
        System.out.println(sb);

        Integer[] points = new Integer[5];

    }
}
