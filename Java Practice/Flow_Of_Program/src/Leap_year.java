// Input a year and find whether it is a leap year or not.

import java.util.*;

public class Leap_year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year");
        int year = sc.nextInt();

        if(year % 4 == 0){
            System.out.println(year + " is a leap year.");
        }
        else{
            System.out.println(year + "is not a leap year");
        }


    }
}
