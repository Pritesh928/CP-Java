import java.util.Scanner;
public class Arithmeticprogression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the first number");
        int firstnum = sc.nextInt();
        System.out.println("Please enter the difference");
        int difference = sc.nextInt();
        System.out.println("Please enter the total number");
        int totalnum = sc.nextInt();
        int i = 1;
        int sum = 0;
        int ap = 1;
        while(i <= totalnum){
            ap = firstnum + difference;
            sum += ap;
            firstnum += difference;
            i++;
        }
        System.out.println("The sum of the ap is " + sum);
    }
}
