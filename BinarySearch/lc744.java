public class lc744 {
    public static void main(String[] args) {
           // Create an array of 26 characters
        char[] ch = new char[26];

        // Fill array with alphabets a to z using a loop
        for (int i = 0; i < 26; i++) {
            ch[i] = (char) ('a' + i);
        }
        char target = 'b';
    
        char result = nextGreatestLetter(ch , target);
        System.out.println(result);
    }
     static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length-1;

        while (start < end) {
            int middle = start + (end -start)/2;
            
            if(target > letters[middle]){
                start = middle +1;
            }else if(target < letters[middle]){
                end = middle -1;
            }else{
                return letters[middle];
            }
        }
        return letters[start % letters.length];
    
        
    }
    
}
