import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double rate = 83;

        // INR→USD
        System.out.print("Enter amount in rupees: ");
        double currency = input.nextDouble();
        double usd = currency / rate;

        System.out.println("Rupees: " + currency);
        System.out.printf("USD: %.3f\n", usd);

        // USD → INR
        System.out.print("Enter amount in USD: ");
        double usdInput = input.nextDouble();
        double rupees = usdInput * rate;

        System.out.println("USD: " + usdInput);
        System.out.println("Rupees: " + rupees);

        input.close();
    }
}