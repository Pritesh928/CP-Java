import java.util.Scanner;

public class Sumofdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num1 = sc.nextInt();
        System.out.println(digits(num1));

    }
    public static int digits(int num1){
        int sum = 0;
        while(num1 > 0){
            sum += num1 % 10;      
            num1 /= 10;      
        }

    
        return sum;
    }
}
