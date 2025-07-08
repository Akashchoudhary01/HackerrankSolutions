//Java Program to Calculate Area and Circumference of Circle

import java.util.Scanner;

public class MethodQue4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Radius of the circle : ");
        double r = sc.nextDouble();

        AreaOfcircle(r);
        CircumferenceOfCircle(r);

        sc.close();
    }
    static double AreaOfcircle(double r){
        double areaOfcircle = Math.PI*Math.pow(r, 2);
        System.out.println(areaOfcircle);
        return areaOfcircle;
    }
    static double CircumferenceOfCircle(double r){
        double circumferenceOfCircle = 2*Math.PI*r;
        System.out.println(circumferenceOfCircle);
        return circumferenceOfCircle;

    }
    
}
