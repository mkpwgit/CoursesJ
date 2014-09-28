package com.company.lesson2;

/**
 * @author kisel.nikolay@gmail.com
 * @since 28.09.2014
 */
public class FirstTask {

    static int storage(String s) {
        return s.length() * 2;
    }

    public static void main(String[] args) {
        System.out.println(storage("TEST"));
    }

}
