package day01.practice05;

public class MainClass {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setId(1);
        employee.setName("Ratan");
        employee.setAddress("Bengaluru");


        System.out.println("Employee Name "+employee.getName());
        System.out.println("Employee Id "+employee.getId());
        System.out.println("Employee Address "+employee.getAddress());

    }
}
