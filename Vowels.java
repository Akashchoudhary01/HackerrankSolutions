import java.util.Scanner;

public class Vowels {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String");
        String str = sc.nextLine();
        String cleaned = str.replaceAll("[ ,]+", ""); 
        String Volwels = "aeiouAEIOU";
        int count = 0;

        for(int i = 0; i < cleaned.length(); i++){
            char ch = cleaned.charAt(i);
             if(Volwels.contains(String.valueOf(ch))){
                 count++;
              
            }
        }
        
        System.out.println("String  Contains : "+ count +" Volwels");
                
        sc.close();
            
    }
    
}
