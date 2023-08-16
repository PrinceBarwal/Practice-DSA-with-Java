//To calculate Fibonacci Series up to n numbers.


import java.util.*;

public class Fibonacci_Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number ;
        System.out.println("Enter a number : ");
        number = sc.nextInt();
        int a = 0 , b=1;

        System.out.print(a + " " + b+ " " );
        while(number-2 > 0){
            int temp;
            temp = a+b;
            System.out.print( temp + " ");
            a = b;
            b = temp;

            number --;

        }

    }
}
