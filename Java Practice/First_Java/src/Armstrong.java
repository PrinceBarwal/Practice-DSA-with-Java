//To find Armstrong Number between two given number.
import java.util.*;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 , num2 ;
        System.out.println("Enter first number : ");
        num1 = sc.nextInt();
        System.out.println("Enter second number : ");
        num2 = sc.nextInt();

        for (int i = num1; i<num2; i++){
            int check, rem, sum = 0;
            check = i;
            while(check != 0) {
                rem = check % 10;
                sum = sum + (rem * rem * rem);
                check = check / 10;
            }
            if(sum == i){
                System.out.println(i+" is an Armstrong number.");
            }
        }
    }

}
