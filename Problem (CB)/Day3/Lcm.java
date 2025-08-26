import java.util.Scanner;

public class Lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        lcm(num1, num2);
    }
    public static void lcm(int num1,int num2){
        int i = 1;
        int factor = num1 * i;
        while(i <= num2){
            if(factor % num2 == 0){
                factor = factor;
            }
        }
    }
}
