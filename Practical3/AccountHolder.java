package Practical3;
import java.util.ArrayList;
import java.util.*;
public class AccountHolder {
    Scanner sc = new Scanner(System.in);
    String name;
    int age;
    int WorkExperience;
    double income;
    Boolean Citizenship;
    void info() {
        System.out.println("Enter Your Name : ");
        name = sc.next();
        System.out.println("Enter Your Age : ");
        age = sc.nextInt();
        System.out.println("Enter Your Net Monthly income: ");
        income = sc.nextDouble();
        System.out.println("Enter Your Total Work Experincome (In Year Format) : ");
        WorkExperience = sc.nextInt();
        System.out.println("What is Your CitizenShip? (For Indian true otherwisw false) :- ");
        Citizenship = sc.nextBoolean();
    }
}
