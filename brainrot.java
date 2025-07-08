//Kunal is allowed to go out with his friends only on the even days of a given month. Write a program to count the number of days he can go out in the month of August.

import java.util.Scanner;

public class brainrot {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int daysInAug = 31;
        int totalDays = 0;
        for(int i = 1 ; i <=daysInAug; i++){
            if( i % 2 ==0){
                totalDays += 1;
            }
        }
    System.out.println("Kunal can go out on " + totalDays + " days in August.");
    sc.close();

    }
}