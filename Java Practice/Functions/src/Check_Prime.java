//Define a method to find out if a number is prime or not.
import java.util.*;
public class Check_Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter a number : ");
        num = sc.nextInt();
        if(check(num)){
            System.out.println("Enter number is not prime.");
        }
        else{
            System.out.println("Enter number is prime.");
        }
    }
    static boolean check(int num){
        int mid = num/2;
        for(int i=2 ; i<=mid ; i++){
            if(num%i==0){
                return true;
            }
        }
        return false;
    }
}
