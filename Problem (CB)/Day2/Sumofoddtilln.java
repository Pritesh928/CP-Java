import java.util.Scanner;
public class Sumofoddtilln {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = sc.nextInt();
        oddtilnsum(num);
    }
    public static void oddtilnsum(int num){
        int i = 1;
        int sum = 0;
        while(i <= num){
            if(i % 2 != 0){
                sum += i;
            }
            
            i++;
        }
        System.out.println(sum);
    }
}
