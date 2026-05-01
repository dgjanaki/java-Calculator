import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        float Result=0;
        while (true) {
            System.out.println("enter the two numbers");
            float num1=input.nextFloat();
            float num2=input.nextFloat();
 
            System.out.println("enter the operator(+,-,*,/,%) : ");
            char op=input.next().trim().charAt(0);
            if(op== '+' || op=='-' || op=='*' || op=='/' || op=='%'){
                if(op=='+'){
                    Result=num1+num2 ;
                }
                if(op=='-'){
                   Result=num1-num2 ;
                }
                if(op=='*'){
                    Result=num1*num2 ;
                }
                if(op=='/'){
                    if(num2!=0)
                       Result=num1/num2 ;
                    else
                        System.out.println("not valid");
                }
                if(op=='%'){
                    Result=num1%num2 ;
                }
            
            System.out.println("result  =" +Result);
            }
            else if(op=='x' || op=='X')
                  break;

            else{
                System.out.println("invalid input");
            }
        
            

        }
        
    }
    
}
