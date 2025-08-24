import java.util.Scanner;

public class SumofArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter no of elements Array1");
        int num1 = sc.nextInt();
        System.out.println("Please enter no of elements Array2");
        int num2 = sc.nextInt();
        int [] myarr = new int[num1];
        int [] myarr1 = new int[num2];
        int i = 0;
        int j = 0;
        int sum = 0;
        System.out.println("Array1");
        while(i < num1){
            System.out.println("Element no " + (i + 1));
            myarr[i] = sc.nextInt();
            sum += myarr[i];
            i++;
        }
        System.out.println("Array2");
        while(j < num2){
            System.out.println("Element no " + (j + 1));
            myarr1[j] = sc.nextInt();
            sum += myarr1[j];
                j++;
            }
        System.out.println("The sum " + sum);
    }
}
