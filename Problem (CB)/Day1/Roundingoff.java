import java.util.Scanner;
public class Roundingoff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double num3 = num1 / num2;
        double num4 = num2 /num1;
        double sum = num3 + num4;
        System.out.println("The Rounding of this two numbers are " + Math.round(sum));
    }
}
