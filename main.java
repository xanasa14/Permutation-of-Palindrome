import java.lang.*;

public class MyClass {
    public static void main(String args[]) {
       String phrase = "vfsdvc";
        
        boolean x = isPermutationOfAPalindrome(phrase);
        System.out.println(x);
     }

private static int getCharNumber(Character ch) {
 int a = Character.getNumericValue('a');
 int z = Character.getNumericValue('z');
 int c = Character.getNumericValue(ch);
 
 if (c >= a && c <= z) return c - a;
 return -1;
}
    
public static boolean isPermutationOfAPalindrome(String phrase){
   int countOdd = 0;
   int [] table = new int [Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
   for (char c : phrase.toCharArray()){
     int x = getCharNumber(c);
     if (x != -1){
      table[x]++;
       if (table[x] % 2 == 1){
        countOdd++;
       }
       else{
        countOdd--;}
     }
     
   }
   return countOdd <= 1 ; 
 }

}
