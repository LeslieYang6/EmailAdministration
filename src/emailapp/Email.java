package emailapp;

import java.util.Locale;
import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;



    private int mailboxCapacity=500;


    private String alternativeEmail;
    private int defaultPasswordLength=8;

    private String companySuffix="haihuacompany.com";


    public Email(String firstname, String lastName)
    {
        this.firstName=firstname;
        this.lastName=lastName;
        System.out.println("EMAIL CREATED: "+this.firstName+" "+lastName);
        this.department=setDepartment();
        this.password=randomPassword(this.defaultPasswordLength);
        email=this.firstName.toLowerCase()+"."+this.lastName.toLowerCase()+"@"+this.department+"."+companySuffix;
        System.out.print(email);
    }

    private String setDepartment() {
        System.out.print("DEPARTMENT CODES\n1 for Sales\n2 for Developers\n3 for Accounting\n0 for none\nEnter the department\n");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice==1){return "sales";}
        if(depChoice==2){return "developers";}
        if(depChoice==3){return "accounting";}
        else { return "" ;}
    }

    private String randomPassword(int length)
    {
        String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*()";
        char[] password=new char[length];
        for (int i=0; i<length; i++)
        {
            int rand=(int)(Math.random()*passwordSet.length());
            password[i]=passwordSet.charAt(rand);
        }
        return new String(password);
    }

    public void setMailboxCapacity(int capacity)
    {
        this.mailboxCapacity=capacity;
    }
    public void setAlternativeEmail(String altEmail)
    {
        this.alternativeEmail=altEmail;
    }
    public void changePassword(String password)
    {
        this.password=password;
    }


    public String getAlternativeEmail() {
        return alternativeEmail;
    }


    public int getMailboxCapacity() {
        return mailboxCapacity;
    }



}
