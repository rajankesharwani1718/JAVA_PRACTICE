package day01.practice03;

public class MainClass {
    public static void main(String[] args) {
  /*      Student student = new Student();

        System.out.println("My name is " +student.getName());
        student.printdata();*/

/*        EnStudent enStudent = new EnStudent();
        System.out.println("My name is "+enStudent.getName());
        enStudent.printdata();*/

        MStudent mStudent = new MStudent();
        System.out.println("My Value of name "+mStudent.getName());
        mStudent.printdata();

        System.out.println("*******************************");
        mStudent.setName("Rajan Kesharwani");
        System.out.println("My Value of name "+mStudent.getName());
        mStudent.printdata();

        System.out.println("*******************************");
        mStudent.setName("Kajal Kesharwani");
        System.out.println("My Value of name "+mStudent.getName());
        mStudent.printdata();

        System.out.println("*******************************");




    }
}
