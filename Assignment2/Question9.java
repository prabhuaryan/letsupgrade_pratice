import java.util.*;
public class Question9 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 1st Number");
        int a=sc.nextInt();
        System.out.println("Enter 2nd Number");
        int b=sc.nextInt();
        System.out.println("Enter 3rd Number");
        int c=sc.nextInt();
        
        if(a==0 && b==0 && c==0){
            System.out.println("Invalid Triangle");
        }
        if(a==b && b==c && c==a){
            System.out.println("equilateral");
        }
        else if(a==b && b==a || c==a){
            System.out.println("isosceles");
        }
        else {
            System.out.println("scalene");
        }

    }
}
