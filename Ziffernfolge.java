public class Ziffernfolge {
    
    public static String ziffernfolge(int n){
        if(n==1){
            return "1";
        }
        else
            return ziffernfolge(n-1) + Integer.toString(n) + ziffernfolge(n-1);
    }
}
