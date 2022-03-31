public class Quadrat{
    
    public static int quadRekursiv(int n){

        if(n == 1){
            return 1;
        }
        else{
            return quadRekursiv(n-1) + 2*n -1;
        }
    }
    
    public static int quadIterativ(int n){
        int quad = 0;
        for(int i=1; i<=n; i++){
            quad += (i*2 - 1);
        }
        return quad;
    }
}