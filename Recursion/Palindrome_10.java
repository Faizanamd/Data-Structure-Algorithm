public class Palindrome_10 {

    public static boolean checkPalindrome(String word){
        return solve(word, 0, word.length()-1);

    }

    private static boolean solve(String word, int  i, int j ){
        if(i > j)   return true;
        
        if(word.charAt(i) != word.charAt(j))    return false;
        i++; j--;
        return solve(word, i, j);
    }
    public static void main(String[] args) {
        String word = "abcdba";
        System.out.println(checkPalindrome(word));
    }
    
}
