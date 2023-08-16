//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
import java.util.*;


public class Simple_Interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float principle , time , rate;
        System.out.println("Enter principle amount : ");;
        principle = sc.nextFloat();


        System.out.println("Enter time amount : ");;
        time = sc.nextFloat();


        System.out.println("Enter rate amount : ");;
        rate = sc.nextFloat();

        double SI;
        SI = (principle * time * rate)/100;

        System.out.println("Simple Interest : " + SI);
    }
}
