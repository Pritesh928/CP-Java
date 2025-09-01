import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("The gcd of given numbers is " + gcd(num1, num2, num2));
        
    }
    public static int gcd(int num1,int num2,int least){
        int gcd = 1;
        int i = 2;
        int min = min(num1, num2);
        while(i <= min){
            if(num1 % i == 0 && num2 % i == 0){
                gcd = i;
            }
            i++;
        }
        return gcd;
    }
    public static int min(int num1, int num2){
        int least;
        if(num1 < num2){
            least = num1;
        }else{
            least = num2;
        }
        return least;
    }
    
}
