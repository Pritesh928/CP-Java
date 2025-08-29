import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(gcd(num1, num2));
    }
    public static int gcd(int num1,int num2){
        int rem = 1;
        while(rem == 0){
            int temp;
            rem = num1 / num2;
            temp = num1;
            num1 = num2;
            num2 = rem;
        }
        return rem;
    }
}
