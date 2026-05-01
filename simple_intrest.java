import java.util.Scanner;

public class simple_intrest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the principl amt:");
        float p=input.nextFloat();
        System.out.println("enter time taken :");
        int t=input.nextInt();
        System.out.println("enter the rate");
        int r=input.nextInt();
        System.out.println("the simple intrest is : " +(p*t*r)/100);
    }
    
}
