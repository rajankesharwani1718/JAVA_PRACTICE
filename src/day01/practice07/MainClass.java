package day01.practice07;



public class MainClass {
    public static void main(String[] args) {
        Doctor doctor = new Doctor();
        doctor.setId(1);
        doctor.setName("Ramesh Rastogi");
        doctor.setAddress("Delhi");
        doctor.setSpecialization("Heart Specialist");

        System.out.println("Doctor's Id "+doctor.getId());
        System.out.println("Doctor's Name "+doctor.getName());
        System.out.println("Doctor's Address "+doctor.getAddress());
        System.out.println("Doctor's Specialization "+doctor.getSpecialization());

        System.out.println("************************************");

    Engineer engineer = new Engineer();
        engineer.setId(2);
        engineer.setName("Abrahm Lincon");
        engineer.setAddress("Mumbai");
        engineer.setStream("Computer Science");

        System.out.println("Engineer's id "+engineer.getId());
        System.out.println("Engineer's name "+engineer.getName());
        System.out.println("Engineer's Address "+engineer.getAddress());
        System.out.println("Engineer's Stream "+engineer.getStream());
    }
}
