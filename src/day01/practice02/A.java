package day01.practice02;

public class A {
    private String namePrivate = "Private Name";
    protected String nameProtedted = "Protedted Name";
    public  String namePublic = "Public Name";
    String nameDefault = "Default Name";

    void defaultMethod() {
        System.out.println("Hello It is default method");
    }

    public void publicMethod() {
      System.out.println("Hello It is public mehtod");
    }

    protected void protectedMethod() {
        System.out.println("Hello It is protected Mehtod");
    }

    private void privateMethod() {
        System.out.println("Hello It is private Method");
    }
}
