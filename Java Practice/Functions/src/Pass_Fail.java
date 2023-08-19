//Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below
import java.util.*;
public class Pass_Fail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks ;
        System.out.println("Enter marks : ");
        marks = sc.nextInt();

        grade(marks);
    }

    static void grade(int marks){
        if(marks>90 && marks<=100){
            System.out.println("AA");
        }
        else if(marks>80 && marks<=90){
            System.out.println("AB");
        }
        else if(marks>70 && marks<=80){
            System.out.println("BB");
        }
        else if(marks>60 && marks<=70){
            System.out.println("BC");
        }
        else if(marks>50 && marks<=60){
            System.out.println("CD");
        }
        else if(marks>40 && marks<50){
            System.out.println("DD");
        }
        else{
            System.out.println("Fail");
        }


    }
}
