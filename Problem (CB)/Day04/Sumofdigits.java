import java.util.Scanner;

public class Sumofdigits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int sum = sumofdigits(num1);
        System.out.println(sum);
        
    }
    public static int sumofdigits(int num1){
        int sum = 0;
        while(num1 > 0){
            int digits = num1 % 10;
            sum += digits;
            num1 /= 10; 
        }

        return sum;
    }
}