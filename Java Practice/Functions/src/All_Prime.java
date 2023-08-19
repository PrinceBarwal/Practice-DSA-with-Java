//Write a function that returns all prime numbers between two given numbers.
import java.util.*;
public class All_Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 , num2;
        System.out.println("Enter first number : ");
        num1 = sc.nextInt();
        System.out.println("Enter second number : ");
        num2 = sc.nextInt();

        allPrime(num1 , num2);
    }

    static void allPrime(int num1 , int num2){
        if(num1<num2){
            for(int i = num1 ; i<=num2 ; i++){
                if(check(i)){
                    System.out.println(i + " ");
                }
            }
        }
        else{
            for(int i=num2 ; i<=num1 ; i++){
                if(check(i)){
                    System.out.println(i + " ");
                }
            }
        }
    }

    static boolean check(int num){
        int mid = num/2;
        for(int i=2 ; i<=mid ; i++){
            if(num%i==0){
                return false;
            }
        }

        return true;
    }
}
