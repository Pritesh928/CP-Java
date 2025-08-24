import java.util.Scanner;

public class FartoCel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double far = sc.nextDouble();
        double cel = (far - 32) * 5/9;
        System.out.println("The temp in Celcius is " + Math.round(cel) + "°C");

    }
}
