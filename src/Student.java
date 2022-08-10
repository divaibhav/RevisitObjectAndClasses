import java.util.Arrays;

public class Student {
    //attributes
    String name;
    int rollNo;
    String dob;
    String std;
    String course;
    int age;
    char section;
    int[] marks;

    int totalMarks;
    double average;

    // create constructors
    // if I create parameterized constructor, i cannot use no argument constructor.
    // defining constructor
    Student(String name, int rollNo, String dob, String std, String course, int age, char section, int[] marks){
        this.name = name;
        this.rollNo = rollNo;
        this.dob = dob;
        this.std = std;
        this.course = course;
        this.age = age;
        this.section = section;
        this.marks = marks;
    }
    public void calculateTotal(){
        for (int i = 0; i < marks.length; i++) {
            totalMarks = totalMarks + marks[i];
        }
    }
    public double calculateAverage(double noOfSUbject){
        return totalMarks / noOfSUbject;
    }
    public void display(){
        System.out.println(name);
        System.out.println(rollNo);
        System.out.println(dob);
        System.out.println(std);
        System.out.println(course);
        System.out.println(age);
        System.out.println(section);
        System.out.println(Arrays.toString(marks));
        System.out.println(totalMarks);
        System.out.println(average);
    }


}
