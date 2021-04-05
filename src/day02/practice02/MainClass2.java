package day02.practice02;

public class MainClass2 {
    public static void main(String[] args) {
        A a = new A();
        a.setName("rajan");
        System.out.print("A anme"+a.getName());

        A ab = new B();
        ab.setName("Hello");
        System.out.print("A name "+ab.getName());


        A ac = new C();
        ac.setName("Hello");
        System.out.println("A name "+a.getName());

        B b = new B();
        b.setName("Hello");
        b.setAddress("Hello");


        B bc = new C();
        bc.setName("hsjljl");
        bc.setAddress("RAjan");

        C c = new C();
        c.setName("ehellj");
        c.setAddress("Hreljlj0");
        c.setId(0);

    }
}
