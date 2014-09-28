package com.company.lesson2;

/**
 * @author kisel.nikolay@gmail.com
 * @since 28.09.2014
 */
public class SecondTask {

    public static void main(String[] args) {
        MyFloat n1 = new MyFloat(2.3F);
        MyFloat n2 = new MyFloat(4.5F);
        System.out.println("n1 = "+n1.getF());
        System.out.println("n2 = "+n2.getF());

        n1=n2;
        System.out.println("n1 = "+n1.getF());
        System.out.println("n2 = "+n2.getF());
    }
}
