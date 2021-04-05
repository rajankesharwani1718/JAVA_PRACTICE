package day01;

import day01.practice02.A;
import day01.practice02.B;

public class MainClass {
    public static void main(String[] args) {
        A objectA = new A();
        System.out.println("Object A public value"+objectA.namePublic);
        objectA.publicMethod();
        System.out.println("**************************");
        B objectB = new B();
        System.out.println("Object B public value "+objectB.namePublic);
        System.out.println("The protected value    : " +objectB.getProtectedValue());
        objectB.publicMethod();

    }
}
