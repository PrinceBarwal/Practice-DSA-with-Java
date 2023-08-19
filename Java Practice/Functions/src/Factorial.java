//Write a program to print the factorial of a number by defining a method named 'Factorial'.
import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num ;
        System.out.println("Enter a number : ");
        num = sc.nextInt();

        int ans = fact(num);
        System.out.println("Factorial of " + num + " is : " +ans);

    }
    static int fact(int num){
        int ans =1;
        if(num<=1){
            return 1;
        }
        else{
            for(int i=num ; i>0 ; i--){
                ans = ans * i;
            }
            return ans;
        }
    }
}
