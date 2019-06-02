
package bank;

import java.util.Scanner;

public class BankBranch {
    private String accountnumber;
    private String name;
    private long balance;
    Scanner sc=new Scanner(System.in);
    void openaccount(){
        System.out.print("Enter Account No: ");
        accountnumber=sc.next();
        System.out.print("Enter Name: ");
        name=sc.next();
        System.out.print("Enter Balance: ");
        balance=sc.nextLong();

    }
    void showAccount()
    {
        System.out.println(accountnumber+","+name+","+balance);
    }
    void deposit()
    {
        long amt;
        System.out.println("Enter Amount U Want to Deposit : ");
        amt=sc.nextLong();
        balance=balance+amt;
    }
    void withdrawal()
    {
        long amt;
        System.out.println("Enter Amount U Want to withdraw : ");
        amt=sc.nextLong();
        if(balance>=amt)
        {
            balance=balance-amt;
        }
        else
        {
            System.out.println("Less Balance..Transaction Failed..");
        }
    }
    boolean search(String acn)
    {
        if(accountnumber.equals(acn))
        {
            showAccount();
            return(true);
        }
        return(false);
    }








}
