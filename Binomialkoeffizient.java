import java.util.Scanner;

public class Binomialkoeffizient{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gib n ein: ");
        String input1 = scanner.nextLine();
        System.out.println("Gib k ein: ");
        String input2 = scanner.nextLine();
        try{
            int n = Integer.parseInt(input1);
            int k = Integer.parseInt(input2);
            System.out.println("N ueber k ergibt: ");
            System.out.println(gibKoeffizient(n, k));
        }
        catch(Exception e){
            System.out.println("n und k muessen natuerliche Zahlen sein");
        }
        
        scanner.close();
    }

    public static int gibKoeffizient(int n, int k){
            if(k>n){
                return 0;
            }
            else{
                if(k==n || k == 0){
                    return 1;
                }
                else{
                    return gibKoeffizient(n-1, k-1) + gibKoeffizient(n-1, k);
                }
            }
        }
    }
