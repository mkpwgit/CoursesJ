package com.company.lesson1;

/**
 * @author kisel.nikolay@gmail.com
 * @since 21.09.2014
 */
public class FirstTaskMain {

    private static int i;
    private static char c;

    public static void main(String[] args) {
        System.out.println("Int: "+i);
        System.out.println("Char: "+c);

        FirstTask firstTask = new FirstTask();
        System.out.println("Int from object: "+firstTask.getI());
        System.out.println("Char from object: "+firstTask.getC());
    }
}
