package Student_Grade;

import java.util.Scanner;

public class Student_Grade_Calculator{
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.println("Enter the marks(out of 100):");

        System.out.println("sub_1:");
        int sub_1_marks = Sc.nextInt();

        System.out.println("sub_2:");
        int sub_2_marks = Sc.nextInt();

        System.out.println("sub_3:");
        int sub_3_marks = Sc.nextInt();

        // Total Marks
        int Total_marks = sub_1_marks + sub_2_marks +sub_3_marks ;

        // Average Percentage

        double Average_percentage = (double) Total_marks / 3;

        // Grade Calculation :Assigning grades based on the average percentage achieved.

        char grade;
        if(Average_percentage >=90){
            grade = 'A';
        }
        else if(Average_percentage >= 80){
            grade = 'B';
        }
        else if(Average_percentage >= 70){
            grade = 'C';
        }
        else if(Average_percentage >= 60){
            grade = 'D';
        }
        else{
            grade = 'F';
        }

        // Results
        System.out.println("\n Results:");
        System.out.println("Total Marks:" + Total_marks);

        System.out.println("Average Percentage:" + Average_percentage + "%");
        System.out.println("Grade:"+ grade);
         Sc.close();
    }
}
