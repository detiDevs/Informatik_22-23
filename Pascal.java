public class Pascal{
    public static void main(String[] args){
        System.out.println(gibDreieck(2,0));
    }

    public static int gibDreieck(int z, int s){
        if(z==1){
            return 1;
        }
        else if(s>0){
            return 0;
        }
        else{
            return gibDreieck(z-1, s-1) + gibDreieck(z-1, s);
        }
    }
}