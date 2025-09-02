import java.util.Scanner;

public class Lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter two numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int lcm = lcm(num1, num2);
        System.out.print("The lcm of two numbers are : " + lcm);
    }
    public static int lcm(int num1,int num2){
        int i = 1;
        while(i <= num2){
            int factor = num1 * i;
            if(factor % num2 == 0){
                return factor;
            }
            i++;
        }
        return 0;
    }

}
