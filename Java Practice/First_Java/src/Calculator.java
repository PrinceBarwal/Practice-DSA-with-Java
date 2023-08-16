//Take in two numbers and an operator (+, -, *, /) and calculate the value.(Use if conditions)

import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num1  ,num2;
        String op;
        System.out.println("Enter first number : ");
        num1 = sc.nextFloat();
        System.out.println("Enter Second number : ");
        num2 = sc.nextFloat();

        System.out.println("Enter opertion : + , - , * , /");
        op = sc.next();

        if(op.equals("+")){
            System.out.println("Sun to number is : " + (num1+num2));
        }
        else if(op.equals("-")){
            System.out.println("Sub to number is : " + (num1-num2));
        }
        else if(op.equals("*")){
            System.out.println("Mul to number is : " + (num1*num2));
        }
        else if(op.equals("/")){
            System.out.println("Div to number is : " + (num1/num2));
        }
        else{
            System.out.println("Enter right operator");
        }



    }
}
