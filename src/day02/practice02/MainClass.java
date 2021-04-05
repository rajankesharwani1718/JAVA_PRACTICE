package day02.practice02;

public class MainClass {
    public static void main(String[] args) {
        A a = new A();
        a.setName("Hello");
        System.out.println("Value of A   a "+a.getName());

        System.out.println("********************************");

        B b = new B();
        b.setName("Rajan Kesharwani");
        b.setAddress("Allahabad");

        System.out.println("B name "+b.getName());
        System.out.println("B address "+b.getAddress());

        System.out.println("********************************");

        C c = new C();
        c.setName("Hello India");
        c.setAddress("Bengaluru");
        c.setId(1);

        System.out.println("C name "+c.getName());
        System.out.println(" C address "+c.getAddress());
        System.out.println("C id "+c.getId());

        System.out.println("********************************");




    }
}
