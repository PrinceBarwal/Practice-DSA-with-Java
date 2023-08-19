//A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.
import java.util.*;
public class Eligible_To_Vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.println("Enter your age : ");
        age = sc.nextInt();
        if(isEligible(age)){
            System.out.println("You are eligible for vote.");
        }
        else{
            System.out.println("You are not eligible for vote.");
        }
    }

    static boolean isEligible(int age){
        if(age>=18){
            return true;
        }
        return false;
    }
}
