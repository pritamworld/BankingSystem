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
            scanner.nextLine();
            switch (id){
                case 1 :
                    executionerClass.createBankAccount();
                    break;
                case 2 :
                    System.out.println("Enter Account Number : ");
                    String accountNumber = scanner.nextLine();
                    executionerClass.displayAccountDetails(accountNumber);
                    break;
                    default:
                        System.out.println("You have entered an Invalid option. Please try again.");
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
        Customer customer = new Customer("0","Richu Jain","84 John Tabor","03/08/1995","+14372391989","richupulimoottil@gmail.com","12/1995/2018");
        customers.add(customer);
        customer = new Customer("1","Abhishek","Brampton","03/08/1995","+14372391989","richupulimoottil@gmail.com","12/1995/2018");
        customers.add(customer);
        customer = new Customer("2","Ashish","Markham Road","03/08/1995","+14372391989","richupulimoottil@gmail.com","12/1995/2018");
        customers.add(customer);
        BankAccount bankAccount = new BankAccount("12345","Current","North York",1200);
        bankAccounts.add(bankAccount);
        bankAccount = new BankAccount("12345","Current","North York",2000);
        bankAccounts.add(bankAccount);
        bankAccount = new BankAccount("98745","Current","North York",2500);
        bankAccounts.add(bankAccount);
        System.out.println("Account Created");

    }

    private void displayAccountDetails(String accountNumber){
        for(int i = 0;i<bankAccounts.size();i++){
            if(bankAccounts.get(i).getAccountNumber().equals(accountNumber)){
                System.out.println("Customer ID : "+customers.get(i).getPersonId());
                System.out.println("Customer Name : "+customers.get(i).getPersonName());
                System.out.println("Customer Address : "+customers.get(i).getAddress());
                System.out.println("Customer Date of Birth : "+customers.get(i).getBirthDate());
                System.out.println("Customer Contact Number : "+customers.get(i).getContactNumber());
                System.out.println("Customer Email ID : "+customers.get(i).getEmailId());
                System.out.println("Customer ID Proof Number : "+customers.get(i).getPhotoAddressProofId());
            }
        }
    }


}
