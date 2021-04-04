package day01.practice03;

public class Student {
    private String name = "Ratan Kesharwani";

    private void printValue() {
        System.out.print("Value of name 0"+name);
    }

   public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void printdata() {
        printValue();
    }
}
