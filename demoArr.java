import java.util.Arrays;
// import java.util.Scanner;

public class demoArr {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your numbers");
        String arr[] = {"Akash" , "hui" , "hui" ,"hui" , "Akash"};
        changeValue(arr);
        System.out.println(Arrays.toString(arr));


    }
    static void changeValue(String []arr){
        arr[4] = "69";
    }
    
}
