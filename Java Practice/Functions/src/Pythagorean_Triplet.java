//Write a function to check if a given triplet is a Pythagorean triplet or not.
import java.util.*;
public class Pythagorean_Triplet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 , num2 , num3;
        System.out.println("Enter first number : ");
        num1 = sc.nextInt();
        System.out.println("Enter second number : ");
        num2 = sc.nextInt();
        System.out.println("Enter third number : ");
        num3 = sc.nextInt();

        if(check(num1 , num2 , num3)){
            System.out.println("It is a pythagorean triplet.");
        }
        else{
            System.out.println("Not a pythagorean triplet.");
        }
    }

    static boolean check(int num1 , int num2 , int num3 ){

        if(( (num1*num1) + (num2*num2) == (num3*num3) )){
            return true;
        }
        else if(( (num1*num1) + (num3*num3) == (num2*num2) )){
            return true;
        }
        else if(( (num3*num3) + (num2*num2) == (num1*num1) )){
            return true;
        }

        return false;
    }
}
