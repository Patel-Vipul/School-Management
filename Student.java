package projects.StudentManagementSystem;

public class Student {
    //This class represents a single student

    String name;
    int rollNo;
    String course;

    //Constructor to initialize a new student object
    public Student(String n, int r, String c) {
        this.name = n;
        this.rollNo = r;
        this.course = c;
    }

    //method to display student details
    public void displayStudents(){
        System.out.format("Student Name:= %s \nRoll no:- %d \nCourse:= %s\n",this.name, this.rollNo, this.course);
        System.out.println("----------------------");
    }
}
