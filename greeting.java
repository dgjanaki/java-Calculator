import java.util.Scanner;

public class greeting {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter your name");
          String name=in.nextLine();
        System.out.println("hello " +name +" welcome to vs code.");
        in.close(); //closing the Scanner in
    }
    
}
