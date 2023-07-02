public class ReverseString_8 {
    public static String reverseWord(String str)
    {
        // Reverse the string str
        char[] charArray = str.toCharArray();
        solve(charArray, 0, str.length()-1);
        
        return new String(charArray);
    }
    
    private static void solve(char[] charArray, int i, int j){
        if(i > j)   return;
        
        char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
            i++;
            j--;
        solve(charArray , i ,j);
    }

    public static void main(String[] args) {
        String str = "abcdef";
        str = reverseWord(str);
        System.out.println(str);

    }

}
