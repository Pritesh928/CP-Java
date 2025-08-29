import java.util.Scanner;

public class Gcd1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

    }
    public static void gcd2(int num1, int num2){
        int i = 0;
        while(i <= num1){
            int rem = num1 / i;
            int j = 0;
            while(j <= num2){
                int rem1 = num2 / i;
                j++;
            }
            i++;
        }
    }
}
