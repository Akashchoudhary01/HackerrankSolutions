//A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.

import java.util.Scanner;

public class MethodQue3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        System.out.println("Enter person's age : ");
        int age = sc.nextInt();

        if(eligibleToVote(age)){
            System.out.println("Person is eligible to vote");
        }else{
            System.out.println("Person is not eligible to vote");

        }
        sc.close();
    }
    static boolean eligibleToVote(int age){
        if(age >=18) {
            return true;
        }
        return false;

    }
    
    
}
