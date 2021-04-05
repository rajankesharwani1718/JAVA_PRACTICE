package day01.practice02;

public class MainClass {
    public static void main(String[] args) {
        A objetA = new A();
        B objectB = new B();

        System.out.println("**********************************");

        System.out.println("Protected Value  " +objetA.nameProtedted);
        System.out.println("Public Value " +objetA.namePublic);
        System.out.println("Defalut value "+objetA.nameDefault);

        System.out.println("**********************************");

        objetA.defaultMethod();
        objetA.protectedMethod();
        objetA.publicMethod();

        System.out.println("**********************************");
        System.out.println("Object B private value "+objectB.nameDefault);
        System.out.println("Object B public value " +objectB.namePublic);
        System.out.println("Object B protected value "+objectB.nameProtedted);
        System.out.println("The protected " +objectB.getProtectedValue());

        System.out.println("**********************************");

        objectB.defaultMethod();
        objectB.publicMethod();
        objectB.protectedMethod();


    }
}
