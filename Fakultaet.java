public class Fakultaet {

    public static int fakRekursiv(int n){
        if(n<=1){
            return 1;
        }
        else{
            return n * fakRekursiv(n-1);
        }
    }

    public static int fakIterativ(int n){
        int fak = 1;
        for(int i=1; i<=n; i++){
            fak *= i;
        }
        return n;
    }
}
