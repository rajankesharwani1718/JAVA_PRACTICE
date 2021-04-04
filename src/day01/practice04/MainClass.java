package day01.practice04;

import day01.practice02.A;
import day01.practice02.B;

public class MainClass {
    public static void main(String[] args) {
        A objectA = new A();
        B objectB = new B();

        System.out.println("Object A value public "+objectA.namePublic);

        objectA.publicMethod();

        System.out.println("Object B value public "+objectB.namePublic);

        objectB.publicMethod();

        System.out.println("******************************************");

        C objectC = new C();

        System.out.println("Object C value of public "+objectC.namePublic);

        objectC.publicMethod();


    }
}
