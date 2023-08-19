//Write a function to find if a number is a palindrome or not. Take number as parameter.
import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter a number : ");
        num = sc.nextInt();

        if(check(num)){
            System.out.println("Number is Palindrome.");
        }
        else{
            System.out.println("Number is not Palindrome.");
        }
    }

    static boolean check(int num){

        int rem;
        int temp = num;
        int sum=0;
        while(num>0){
            rem = num%10;
            sum = (sum*10) + rem;
            num = num/10;
        }

        if(temp == sum){
            return true;
        }

        return false;
    }
}
