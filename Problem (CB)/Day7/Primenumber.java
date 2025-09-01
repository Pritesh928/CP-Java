import java.util.Scanner;

public class Primenumber {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num1 = sc.nextInt();
        if(prime(num1)  == true){
            System.out.println("prime number");
        }else{
            System.out.println("not a prime number");
        }
    }
    public static boolean prime(int num1){
        int i = 2;
        while(i < num1){
            if(num1 % i == 0){
                return false;
            }
            i++;
        }
        return true;
    }
}