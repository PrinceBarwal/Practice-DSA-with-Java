//Define a program to find out whether a given number is even or odd.


import java.util.*;
public class Even_Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter a number : ");
        num = sc.nextInt();
        if(check(num)){
            System.out.println("Enter number is even.");
        }
        else{
            System.out.println("Entered number is odd.");
        }
    }
    public static boolean check(int num){
        if (num % 2 == 0) {
            return true;
        }
        return false;
    }
}
