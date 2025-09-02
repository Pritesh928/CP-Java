import java.util.Scanner;
public class Tablesofn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = sc.nextInt();
        System.out.println("The table of " + num + " is:");
        tableofn(num);
        
    }
    public static void tableofn(int num){
        int i = 1;
        while(i <= 10){
            System.out.println(num + " X " + i + " = " + (i * num));
            i++;
        }

    }
}
