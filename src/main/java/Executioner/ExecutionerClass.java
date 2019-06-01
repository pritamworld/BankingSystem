package Executioner;
import com.sun.tools.jdeprscan.scan.Scan;
import person.Customer;
import person.Person;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Scanner;

public class ExecutionerClass {
    public static void main(String[] args){
       System.out.println("How can we help you?");
       System.out.println("Please select any of the following option.");
       System.out.println("1.Create Bank Account");
       System.out.println("2.View Account Details");
       System.out.println("3.View Account Balance");
       System.out.println("4.Show All Bank Branches");
       System.out.println("5. Delete Bank Account");
       System.out.println("6. Withdrawl");
       System.out.println("7. Deposit");
       Scanner scanner = new Scanner(System.in);
       int id = scanner.nextInt();
       switch (id){
           case 1 :
               System.out.println("Enter Customer ID : ");
               String temp = scanner.nextLine();
       }
    }
}
