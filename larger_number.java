import java.util.Scanner;

public class larger_number {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the value of first number");
        int a= input.nextInt();
        System.out.println("enter the value for second number");
        int b= input.nextInt();
        if(a>b)
            System.out.println("the larger number is " +a);
        else
            System.out.println("the larger number is" +b);
    }
    
}
