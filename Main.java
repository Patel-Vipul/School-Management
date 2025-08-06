package projects.StudentManagementSystem;

import java.util.Scanner;

public class Main {
    //Contains the main method and user interaction menu
    public static void main(String[] args){

        StudentManager sm = new StudentManager();           //Management Object
        Scanner sc = new Scanner(System.in);
        int choice;
        boolean ch = true;

        while(ch){
            System.out.println("**********Menu**********");
            System.out.println("Enter '1' to Add Students");
            System.out.println("Enter '2' to Display All Students");
            System.out.println("Enter '3' to Search student by the Roll Number");
            System.out.println("Enter '4' to Delete Student");
//            System.out.println("Enter '5' to Update Student Info");
            System.out.println("Enter '6' to Exit");
            System.out.print("Enter Your Choice:= ");
            choice = sc.nextInt();

            switch(choice){
                case 1:
                    System.out.format("\nEnter Roll Number:= ");
                    int roll = sc.nextInt();
                    sc.nextLine();
                    System.out.format("\nEnter Student's Name:- ");
                    String name = sc.nextLine();
                    System.out.format("\nEnter the Course:= ");
                    String c = sc.nextLine();

                    sm.addStudent(name,roll,c);
                    break;
                case 2:
                    sm.viewAllStudent();
                    break;
                case 3:
                    System.out.print("Enter the Roll Number to Search:= ");
                    int ro = sc.nextInt();
                    sm.searchStudent(ro);
                    break;
                case 4:
                    System.out.print("Enter Roll Number to Delete:= ");
                    int r = sc.nextInt();
                    sm.deleteStudent(r);
                    break;
                case 6:
                    System.out.println("Exiting System......");
                    ch = false;
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }

        sc.close();    //close the scanner
    }

}
