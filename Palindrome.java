public class Palindrome {
    
    public static boolean istEinPalindrom(String eingabeText){
        boolean outerPalindrome = false;
        if(eingabeText.length() > 1){
        if(eingabeText.charAt(0)==eingabeText.charAt(eingabeText.length()-1))
        {
            outerPalindrome = true;
        }

        boolean innerPalindrome = false;

        String temp = "";

        temp = eingabeText.substring(1, eingabeText.length()-1);
        
        
        if(istEinPalindrom(temp)){
            innerPalindrome = true;
        }

        return (outerPalindrome && innerPalindrome);
    } else{
        return true;
    }
 
}}
