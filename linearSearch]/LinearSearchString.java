public class LinearSearchString {
    public static void main(String[] args) {
        String str = "Akash ";
        char target = 's';
        System.out.println((LinearSearchstr(str, target)));

    }


    //Using for each looop
     static boolean LinearSearchstr(String str, char target) {
        if (str.length() == 0)
            return false;
           for(char ch : str.toCharArray()){
            if(ch == target) return true;
           }
           return false;
     }
     
    /*
    using basic for-loop
    static boolean LinearSearchstr(String str, char target) {
        if (str.length() == 0)
            return false;

        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i))
                return true;

                
            }
            return false;
    }
             */
}

