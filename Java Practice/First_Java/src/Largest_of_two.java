//Take 2 numbers as input and print the largest number.

import java.util.*;
public class Largest_of_two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 , num2;
        System.out.println("Enter first number : ");
        num1  = sc.nextInt();
        System.out.println("Enter second number : ");
        num2 = sc.nextInt();
        if(num1>num2){
            System.out.println("Greatest number is : " + num1);
        }
        else{
            System.out.println("Greatest number is : "+ num2);
        }
    }
}
