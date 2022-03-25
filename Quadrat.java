public class Quadrat{
    public Quadrat(){}
    
    public static int quadIterativ(int n){
        int quad = 0;
        for(int i=1; i<=n; i++){
            quad += (i*2 - 1);
        }
        return quad;
}
}