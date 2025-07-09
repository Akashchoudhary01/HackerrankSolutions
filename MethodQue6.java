//Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:
/*
 * Marks        Grade 
91-100         AA 
81-90          AB 
71-80          BB 
61-70          BC 
51-60          CD 
41-50          DD 
<=40          Fail 
 */

import java.util.Scanner;

public class MethodQue6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Marks out of 100: ");
        int marks = sc.nextInt();

        displayGrades(marks);

        sc.close();
    }

    static void displayGrades(int a) {
        if (a < 0 || a > 100) {
            System.out.println("Please enter valid marks between 0 and 100.");
        } else if (a >= 91) {
            System.out.println("Grade: AA");
        } else if (a >= 81) {
            System.out.println("Grade: AB");
        } else if (a >= 71) {
            System.out.println("Grade: BB");
        } else if (a >= 61) {
            System.out.println("Grade: BC");
        } else if (a >= 51) {
            System.out.println("Grade: CD");
        } else if (a >= 41) {
            System.out.println("Grade: DD");
        } else {
            System.out.println("Grade: Fail");
        }
    }
}
