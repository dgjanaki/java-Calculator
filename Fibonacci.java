import java.util.Scanner;

class Fibonacci{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    if (n == 0) {
            System.out.println(0);
            return;
        }
        if (n == 1) {
            System.out.println(1);
            return;
        }
        
        int i=1;
        int p=0;
       int  count=1;

        while(count<=n){
            int temp=i;
            i=i+p;
            p=temp;
           count++;


        }
        System.out.println(i);
        input.close();
    }
}