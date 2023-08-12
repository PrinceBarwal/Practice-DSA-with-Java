// Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
import java.util.*;


public class Sum_of_n_number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num ;
        int sum = 0;
        System.out.print("Enter how any number of sum fo you want : ");
        num = sc.nextInt();

        for(int i=0 ; i<num ; i++){
            int add;
            System.out.println("Enter " + (i+1) +" number : ");
            add = sc.nextInt();
            sum += add;

        }
        System.out.println("The sum of all number is " + sum);

    }
}


