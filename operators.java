import java.util.Scanner;

public class operators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter value of a :");
        int a=input.nextInt();
        System.out.println("enter the value of b :");
        int b=input.nextInt();
        System.out.println("enter the opertaors(+,-,*,/)");
        char op=input.next().charAt(0);
        
        
        if(op=='+')
            System.out.println(a+b);
         if(op=='-')
            System.out.println(a-b);
         if(op=='*')
            System.out.println(a*b);
         if(op=='/')
            System.out.println(a/b);
        
        
            }
    
}
