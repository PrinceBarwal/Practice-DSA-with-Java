//Write a program to print the sum of two numbers entered by user by defining your own method.
import java.util.*;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 , num2;
        System.out.println("Enter first number : ");
        num1 = sc.nextInt();
        System.out.println("Enter second number : ");
        num2 = sc.nextInt();

        int sum = add(num1,num2);
        System.out.println("The sum is : " + sum);
    }

    static int add(int num1, int num2) {
        return (num1+num2);
    }
}
