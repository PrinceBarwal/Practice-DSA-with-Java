//Define a method that returns the product of two numbers entered by user.
import java.util.*;

public class Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 , num2 , prod;
        System.out.println("Enter first number : ");
        num1 = sc.nextInt();
        System.out.println("Enter second number : ");
        num2 = sc.nextInt();

        prod = mul(num1 , num2);
        System.out.println("The product of two number is : " + prod);
    }
    static int mul(int num1 , int num2){
        return (num1*num2);
    }
}
