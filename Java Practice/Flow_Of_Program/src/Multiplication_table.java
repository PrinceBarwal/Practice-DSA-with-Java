//Take a number as input and print the multiplication table for it.

import java.util.*;

public class Multiplication_table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        System.out.println("The multiplication table of " +num+ " is = "  );
        for(int i=1 ; i<=10 ; i++){
            System.out.println(num + " * "+ i + " = " + i*num);

        }

    }
}
