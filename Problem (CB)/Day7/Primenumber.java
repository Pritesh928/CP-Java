import java.util.Scanner;

public class Primenumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        prime(num1);

    }
    public static void prime(int num1){
        int i = 0;
        int prime = 1;
        while(i <= num1){
            if(i % num1 != 0){
                prime = num1;
            }else{
                prime = 0;
            }
            i++;
        }
        if(prime == 0){
            System.out.println(" not a prime no");
        }else{
            System.out.println("prime number");
        }
    }
}