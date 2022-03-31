public class Fibonacci {

    public static long fibRekursiv(int n){

        if(n==1 || n==2){
            return 1;
        }
        else{
            return fibRekursiv(n-1) + fibRekursiv(n-2);
        }
    }

    public static long fibIterativ(int n){
        int fib = 0;
        int h1 = 0;
        int h2 = 1;
        for(int i = 0; i<n; i++){
            fib = h1+h2;
            h2 = h1;
            h1 = fib;
        }
       return fib;
    }
}