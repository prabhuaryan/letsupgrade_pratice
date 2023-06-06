import java.util.Scanner;

class Question10{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int a=sc.nextInt();
        if(a%5==0 && a%11==0){
            System.out.println(1);
        }else {
            System.out.println(0);
        }
    }
}