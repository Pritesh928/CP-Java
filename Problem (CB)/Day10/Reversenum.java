import java.util.Scanner;

public class Reversenum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int reverse = reverseofdigits(num1);
        System.out.println(reverse);
    }

    public static int reverseofdigits(int num1){
        int reversenum = 0;
        while(num1 > 0){
            int digit = num1 % 10;
            reversenum = reversenum * 10 + digit;
            num1 /= 10;
        }
        return reversenum;
    }
}
