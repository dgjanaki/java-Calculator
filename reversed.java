import java.util.Scanner;

public class reversed {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
       
        System.out.println("your n2umber is: ");
         int n = in.nextInt();
        int ans=0;
        while(n>0){
            int rem=n%10;
            n/=10;
            ans=ans*10+rem;
        }
        System.out.println("reversed order is :");
        
        System.out.println(ans);
    }
    
}
