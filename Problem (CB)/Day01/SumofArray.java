import java.util.Scanner;
public class SumofArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter no of elements");
        int size = sc.nextInt();
        int [] myarr = new int[size];
        int i = 0;
        int sum = 0;
        while(i < size){
            System.out.println("Please enter element no " + (i + 1));
            myarr[i] = sc.nextInt();
            sum += myarr[i];
            i++;
        }
        System.out.println("The sum of array elements are " + sum);
    }
}
