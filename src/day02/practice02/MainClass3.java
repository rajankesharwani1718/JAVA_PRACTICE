package day02.practice02;

public class MainClass3 {
    public static void main(String[] args) {
        A  a = new A();

        A ab = new B();

        System.out.println("Hello Adress "+ab);

        B ba =(B) ab;
        System.out.println("B adress "+ba);



    }
}
