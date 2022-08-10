import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter student name");
        String name = scanner.nextLine();
        System.out.println("enter roll no");
        int rollNo = scanner.nextInt();
        System.out.println("enter dob");
        scanner.nextLine();
        String dob = scanner.nextLine();
        System.out.println("enter the class of student");
        String std = scanner.nextLine();
        System.out.println("enter course");
        String course = scanner.nextLine();
        System.out.println("enter age");
        int age = scanner.nextInt();
        System.out.println("enter section");
        scanner.nextLine();
        String input = scanner.nextLine();
        char section  = input.charAt(0);
        int[] marks = {10,20,30,40,50};
        Student student = new Student(name,rollNo,dob,std,course,age,section,marks);
        student.calculateTotal();
        double average = student.calculateAverage(5);
        student.average = average;
        student.display();

    }
}
