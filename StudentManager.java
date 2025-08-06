package projects.StudentManagementSystem;

public class StudentManager {
    //This class manages the operations related to student records

    Student[] students = new Student[100];              //array to store student data;
    int studentCount = 0;

    //method to add student in array
    public void addStudent(String name, int rollNo, String course){
        if(studentCount >= students.length){
            System.out.println("Student Limit Reached");
            return;
        }
        students[studentCount] = new Student(name,rollNo,course);
        studentCount++;
        System.out.println("Student Added Successfully");
    }

    //method to delete a student by roll number
    public void deleteStudent(int roll){

        boolean found = false;
        for(int i=0; i<studentCount; i++){
            if(students[i].rollNo == roll) {
                //shifts all students after i one position to the left
                for (int j = i; j < studentCount - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[studentCount - 1] = null;
                studentCount--;
                System.out.println("Student Deleted Successfully");
                found = true;
                break;
            }
        }

        if(found == false){
            System.out.println("Student with Roll Number "+roll+" not Found");
        }
    }

    //method to display all students
    public void viewAllStudent() {
        if (studentCount == 0) {
            System.out.println("No Students Found, List is Empty");
        } else {
            for (int i = 0; i < studentCount; i++) {
                students[i].displayStudents();
            }
        }
    }

    //Method to search student by roll number
    public void searchStudent(int roll){
        boolean found = false;

        for(int i=0; i<studentCount; i++){
            if(students[i].rollNo == roll){
                System.out.println("Student Found");
                students[i].displayStudents();
                found = true;
                break;
            }
        }

        if(!found){
            System.out.println("Student with Roll Number "+roll+" is not Found");
        }

    }
}
