import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLIst {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> list = new ArrayList<>();
    // list.add(5);
    // list.add(4);
    // list.add(3);
    // list.add(2);
    // list.add(1);

    // System.out.println(list);
    // list.set(0, 69);
    // list.remove(1);
    // System.out.println(list);

    // gettign the value from users
    for(int i =0; i<5; i++){
        list.add( sc.nextInt());
    }
    for(int i =0; i<5; i++){
        System.out.println(list.get(i));
    }
}
    
}