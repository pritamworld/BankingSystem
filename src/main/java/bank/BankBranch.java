
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








}
