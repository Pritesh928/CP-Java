import java.util.Scanner;
public class MinandMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        minof2(num1, num2);
        minof3(num1, num2, num3);
        
    }

    //min of 2 numbers
    public static void minof2(int num1,int num2){
        if(num1 < num2){
            System.out.println("The min no is " + num1);
        }else{
            System.out.println("The min no is " + num2);
        }
    }
    //min of 3
    public static void minof3(int num1,int num2,int num3){
        if(num1 < num2){
            System.out.println("The min no is " + num1);
        }else if(num2 < num3){
            System.out.println("The min no is " + num2);
        }else {
            System.out.println("The min no is " + num3);
        }
    }
}
