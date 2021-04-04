package day01.practice02.pointA;

import day01.practice02.A;
import day01.practice02.B;

public class MainClass {
    public static void main(String[] args) {
        D objectD = new D();

        A objectA = new A();
        System.out.println("Object A value public "+objectA.namePublic);
        objectA.publicMethod();

        B objectB = new B();
        System.out.println("Object B value public " +objectB.namePublic);
        objectB.publicMethod();
    }

}
