import java.util.Scanner;

public class Facctorialofano {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = sc.nextInt();
        factofno(num);
    }
    public static void factofno(int num){
        //Factorial for 0 and 1.
        if(num == 0){
            System.out.println("0");
        }else if(num == 1){
            System.out.println("1");
        }
        //Factorial for num more than 2
        long fact = 1;
        int i = 2;
        while(i <= num){
            fact *= i;
            i++;
        }
        System.out.println(fact);


    }
}
