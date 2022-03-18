public class Palindrome {
    
    public static boolean istEinPalindrom(String eingabeText){
        boolean pass = false;
        if(eingabeText.charAt(0)==eingabeText.charAt(eingabeText.length()-1))
        {
            pass = true;
        }
        boolean innerPalindrom = Palindrome.istEinPalindrom(eingabeText.substring(1, eingabeText.length()-2));
        if (pass && innerPalindrom){
            return true;
        }
        else{
            return false;
        }
    }
}
