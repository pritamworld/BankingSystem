package Executioner;
import person.Customer;
import bank.BankAccount;

import java.util.ArrayList;
import java.util.Scanner;

public class ExecutionerClass {

    ArrayList <Customer> customers = new ArrayList <>();
    ArrayList <BankAccount> bankAccounts = new ArrayList <>();

    public static void main(String[] args){

        ExecutionerClass executionerClass = new ExecutionerClass();
        int choice = 0;
        do{
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
                    executionerClass.createBankAccount();
                    return;
                case 2 :
            }
        }while (choice==0);




    }

    private void createBankAccount(){
        /*Scanner scanner = new Scanner(System.in);
        String personId,name,address,birthDate,contactNumber,emailId,photoAddressId;
        System.out.println("Enter Person ID : ");
        personId = scanner.nextLine();
        System.out.println("Enter Name : ");
        name = scanner.nextLine();
        System.out.println("Enter Address : ");
        address = scanner.nextLine();
        System.out.println("Enter Date of birth : ");
        birthDate = scanner.nextLine();
        System.out.println("Enter Contact Number : ");
        contactNumber = scanner.nextLine();
        System.out.println("Enter E-mail ID : ");
        emailId = scanner.nextLine();
        System.out.println("Enter ID Number : ");
        photoAddressId = scanner.nextLine();
        Customer customer = new Customer(personId,name,address,birthDate,contactNumber,emailId,photoAddressId);*/
        Customer customer = new Customer("asdas","adas","4twt","fghg","asdasd","ertret","asdasd");

        customers.add(customer);
        BankAccount bankAccount = new BankAccount("67267809033","Savings","North York",1200);
        bankAccounts.add(bankAccount);




        System.out.println("Account Created");

    }


}
