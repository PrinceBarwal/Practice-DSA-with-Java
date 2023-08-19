//Write a function that returns the sum of first n natural numbers.
import java.util.*;
public class Sum_of_n_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter a number : ");
        num = sc.nextInt();

        int ans = sum(num);
        System.out.println("Sum of all number is : " + ans);
    }

    static int sum(int num){
        int sum = 0;
        for(int i=1 ; i<=num ; i++){
            sum += i;
        }


        return sum;
    }
}
