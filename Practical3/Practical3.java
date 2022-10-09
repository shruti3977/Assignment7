//This Program is prepared by 21CE118 Shruti Sangani
//Part-7 Practical13
/*Aim ::  Personal Loan Eligibility Criteria for Salaried Applicant is as follows:
Page 11 of 11
Eligible Age Group - 21 years to 60 years
Minimum Net Monthly Income - Rs. 15,000
Minimum Total Work Experience - 1 year
Citizenship – Indian
Create a class AccountHolder to store above given information entered by a user. Create 5
objects of AccountHolder class and store them in an ArrayList. Display names of account
holders , who are eligible to get a loan based on given criteria.
 */
package Practical3;

import java.util.ArrayList;

public class Practical3 {
    public static void main(String[] args)
    {
        int count=0,i;
        ArrayList<String> a = new ArrayList<>();
        ArrayList<AccountHolder> personHolder = new
                ArrayList<AccountHolder>();
        for (i=1;i<=5;i++)
        {
            personHolder.add(new AccountHolder());
        }
        for (AccountHolder p : personHolder )
        {
            p.info();
            if (p.age >= 21 && p.age <= 60 && p.income >= 15000 && p.WorkExperience >= 1 && p.Citizenship==true)
            {
                System.out.println("You are Elligeble for loan ");
                count++;
                a.add(p.name);
            }
            else
            {
                System.out.println("You Are Not Elligeble for Loan !!!");
            }
        }
        System.out.println("The Number of Elligeble Candidates : " + count);
        System.out.println("The Number of Not Elligeble Candidates : " + (5 - count));
        System.out.println("All Eligible Candidates Are : " + a);
    }
}
