package Executioner;
import bank.CurrentAccount;
import bank.SavingsAccount;
import bank.Transactions;
import person.Customer;
import bank.BankAccount;
import person.Employee;

import javax.xml.crypto.dsig.TransformService;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class ExecutionerClass {

    private ArrayList<Customer> customers = new ArrayList<>();
    private ArrayList<BankAccount> bankAccounts = new ArrayList<>();
    private ArrayList<CurrentAccount> currentAccounts = new ArrayList<>();
    private ArrayList<SavingsAccount> savingsAccounts = new ArrayList<>();
    private ArrayList<Transactions> transactions = new ArrayList<>();
    private ArrayList<Employee> employees = new ArrayList<>();
    private CurrentAccount currentAccount = new CurrentAccount();
    private SavingsAccount savingsAccount = new SavingsAccount();
    Transactions transaction = new Transactions();

    private Customer customer;
    private BankAccount bankAccount;

    public static void main(String[] args) {

        ExecutionerClass executionerClass = new ExecutionerClass();
        executionerClass.onCreate();
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        int choice = 0;
        do {
            System.out.println("How can we help you?");
            System.out.println("Please select any of the following option.");
            System.out.println("1. Create Bank Account");
            System.out.println("2. View Account Details");
            System.out.println("3. Withdrawl");
            System.out.println("4. Deposit");
            System.out.println("5. Delete Bank Account");
            System.out.println("6. Add Employee");
            System.out.println("7. View Employee Details");
            System.out.println("8. Transactions");
            Scanner scanner = new Scanner(System.in);
            int id = scanner.nextInt();
            scanner.nextLine();
            switch (id) {
                case 1:
                    executionerClass.createBankAccount();
                    System.out.println("Do you want to exit(1/0)? : ");
                    choice = scanner.nextInt();
                    scanner.nextLine();
                    break;
                case 2:
                    System.out.println("Enter Account Number : ");
                    String accountNumber = scanner.nextLine();
                    executionerClass.displayAccountDetails(accountNumber);
                    System.out.println("Do you want to exit(1/0)? : ");
                    choice = scanner.nextInt();
                    scanner.nextLine();
                    break;
                case 3:
                    System.out.println("Enter Account Number : ");
                    accountNumber = scanner.nextLine();
                    System.out.println("Enter Amount to withdraw : ");
                    float amountToWithdraw = scanner.nextFloat();
                    scanner.nextLine();
                    executionerClass.withdrawl(accountNumber, amountToWithdraw);
                    System.out.println("Do you want to exit(1/0)? : ");
                    choice = scanner.nextInt();
                    scanner.nextLine();
                    break;
                case 4 :
                    System.out.println("Enter Account Number : ");
                    accountNumber = scanner.nextLine();
                    System.out.println("Enter Amount to Deposit : ");
                    float amountTDeposit = scanner.nextFloat();
                    scanner.nextLine();
                    executionerClass.deposit(accountNumber, amountTDeposit);
                    System.out.println("Do you want to exit(1/0)? : ");
                    choice = scanner.nextInt();
                    scanner.nextLine();
                    break;
                case 5 :
                    System.out.println("Enter Account Number : ");
                    accountNumber = scanner.nextLine();
                    executionerClass.deleteBankAccount(accountNumber);
                    System.out.println("Do you want to exit(1/0)? : ");
                    choice = scanner.nextInt();
                    scanner.nextLine();
                    break;
                case 6 :
                    executionerClass.addEmployees();
                    System.out.println("Do you want to exit(1/0)? : ");
                    choice = scanner.nextInt();
                    scanner.nextLine();
                    break;
                case 7:
                    System.out.println("Enter Employee ID : ");
                    String employeeId = scanner.nextLine();
                    executionerClass.viewEmployees(employeeId);
                    System.out.println("Do you want to exit(1/0)? : ");
                    choice = scanner.nextInt();
                    scanner.nextLine();
                    break;
                case 8 :
                    System.out.println("Enter Account Number : ");
                    accountNumber = scanner.nextLine();
                    executionerClass.displayTransactions(accountNumber);System.out.println("Do you want to exit(1/0)? : ");
                    choice = scanner.nextInt();
                    scanner.nextLine();
                    default:
                    System.out.println("You have entered an Invalid option. Please try again.");
            }
        } while (choice == 0);


    }
    private void displayTransactions(String accountNumber){
        for(int i = 0;i<transactions.size();i++){
            if(transactions.get(i).getBeneficiaryAccountNumber().equals(accountNumber)){
                System.out.println("Credited "+transactions.get(i).getAmount()+ " on " + transactions.get(i).getDate());
            }
            if(transactions.get(i).getPayerAccountNumber().equals(accountNumber)){
                System.out.println("Debited "+transactions.get(i).getAmount()+ " on " + transactions.get(i).getDate());
            }

        }

    }
    private void onCreate(){
        customer = new Customer("1", "Abhishek", "Brampton", "03/08/1995", "+14372391989", "richupulimoottil@gmail.com", "12/1995/2018");
        customers.add(customer);
        customer = new Customer("2", "Ashish", "Markham Road", "03/08/1995", "+14372391989", "richupulimoottil@gmail.com", "12/1995/2018");
        customers.add(customer);
        savingsAccount = new SavingsAccount ("12345","Savings","North York", 1500.00f,"1",5000.00f,0.00f,5.50f,1.00f,100.00f);
        savingsAccounts.add(savingsAccount);
        savingsAccount = new SavingsAccount ("98745","Savings","North York", 1300.00f,"2",5000.00f,0.00f,5.50f,1.00f,100.00f);
        savingsAccounts.add(savingsAccount);

        //------------------------------------

        customer = new Customer("3", "Richu Jain", "84 John Tabor", "03/08/1995", "+14372391989", "richupulimoottil@gmail.com", "12/1995/2018");
        customers.add(customer);
        currentAccount = new CurrentAccount("67267809033", "Current", "North York", 1500.00f,"3",5000.0f,0.00f,5.50f,0.0f,100.00f);
        currentAccounts.add(currentAccount);

        //-----------------------------------
        Employee employee = new Employee("4","Richu Jain","Morning side","03/08/1995","4372391989","richujain1995@gmail.com","Manager",5000.00f,"admin","admin","North York");
        employees.add(employee);
        addTransactions("12345","67267809033",2000);
        addTransactions("67267809033","12345",2000);
        addTransactions("CASH","67267809033",2000);
        addTransactions("67267809033","CASH",2000);
    }

    private void createBankAccount() {
        Scanner scanner = new Scanner(System.in);
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
        customer = new Customer(personId,name,address,birthDate,contactNumber,emailId,photoAddressId);
        customers.add(customer);
        System.out.println("1. Savings Account");
        System.out.println("2. Current Account");
        scanner = new Scanner(System.in);
        int bankTypeChoice = scanner.nextInt();
        scanner.nextLine();
        switch(bankTypeChoice){
            case 1 :
                System.out.println("Enter Account Number : ");
                String accountNumber = scanner.nextLine();
                System.out.println("Enter Bank Branch : ");
                String bankBranch = scanner.nextLine();
                System.out.println("Enter Account Balance : ");
                float accountBalance = scanner.nextFloat();
                scanner.nextLine();
                savingsAccount = new SavingsAccount(accountNumber, "Savings", bankBranch, accountBalance,personId,5000.00f,0.00f,5.50f,1.00f,100.00f);
                savingsAccounts.add(savingsAccount);
                break;
            case 2 :
                System.out.println("Enter Account Number : ");
                accountNumber = scanner.nextLine();
                System.out.println("Enter Bank Branch : ");
                bankBranch = scanner.nextLine();
                System.out.println("Enter Account Balance : ");
                accountBalance = scanner.nextFloat();
                scanner.nextLine();
                currentAccount = new CurrentAccount(accountNumber, "Current", bankBranch, accountBalance,personId,5000.00f,0.00f,5.50f,1.00f,100.0f);
                currentAccounts.add(currentAccount);
                break;
                default:System.out.println("Please select a proper option. ");

        }
        System.out.println("Account Created");

    }

    private void displayAccountDetails(String accountNumber) {
        String accountType= getAccountType(accountNumber);
        if(accountType.equals("Savings")){
            for (int i = 0; i < savingsAccounts.size(); i++) {
                if (savingsAccounts.get(i).getAccountNumber().equals(accountNumber)) {
                    String personId = savingsAccounts.get(i).getPersonId();
                    int customerIndex = getCustomerIndex(personId);
                    System.out.println("Savings Account");
                    System.out.println("Account Number : " + savingsAccounts.get(i).getAccountNumber());
                    System.out.println("Customer ID : " + customers.get(customerIndex).getPersonId());
                    System.out.println("Customer Name : " + customers.get(customerIndex).getPersonName());
                    System.out.println("Customer Address : " + customers.get(customerIndex).getAddress());
                    System.out.println("Customer Date of Birth : " + customers.get(customerIndex).getBirthDate());
                    System.out.println("Customer Contact Number : " + customers.get(customerIndex).getContactNumber());
                    System.out.println("Customer Email ID : " + customers.get(customerIndex).getEmailId());
                    System.out.println("Customer ID Proof Number : " + customers.get(customerIndex).getPhotoAddressProofId());
                    System.out.println("Account Type : " + savingsAccounts.get(i).getAccountType());
                    System.out.println("Account Main Branch : " + savingsAccounts.get(i).getBankBranch());
                    System.out.println("Account Balance : " + savingsAccounts.get(i).getAccountBalance());
                    System.out.println("Withdrawl Limit : " + savingsAccounts.get(i).getWithdrawalLimit());
                    System.out.println("Transaction Charges : " + savingsAccounts.get(i).getTransactionCharges());
                    System.out.println("Interest Rate : " + savingsAccounts.get(i).getInterestRate());
                    System.out.println("Insufficient Balance Charges : " + savingsAccounts.get(i).getInsufficientFundCharges());
                }
            }
        }
        else if(accountType.equals("Current")){
            for (int i = 0; i < currentAccounts.size(); i++) {
                if (currentAccounts.get(i).getAccountNumber().equals(accountNumber)) {
                    String personId = currentAccounts.get(i).getPersonId();
                    int customerIndex = getCustomerIndex(personId);
                    System.out.println("Current Account");
                    System.out.println("Account Number : " + currentAccounts.get(i).getAccountNumber());
                    System.out.println("Customer ID : " + customers.get(customerIndex).getPersonId());
                    System.out.println("Customer Name : " + customers.get(customerIndex).getPersonName());
                    System.out.println("Customer Address : " + customers.get(customerIndex).getAddress());
                    System.out.println("Customer Date of Birth : " + customers.get(customerIndex).getBirthDate());
                    System.out.println("Customer Contact Number : " + customers.get(customerIndex).getContactNumber());
                    System.out.println("Customer Email ID : " + customers.get(customerIndex).getEmailId());
                    System.out.println("Customer ID Proof Number : " + customers.get(customerIndex).getPhotoAddressProofId());
                    System.out.println("Account Type : " + currentAccounts.get(i).getAccountType());
                    System.out.println("Account Main Branch : " + currentAccounts.get(i).getBankBranch());
                    System.out.println("Account Balance : " + currentAccounts.get(i).getAccountBalance());
                    System.out.println("Withdrawl Limit : " + currentAccounts.get(i).getWithdrawalLimit());
                    System.out.println("Transaction Charges : " + currentAccounts.get(i).getTransactionCharges());
                    System.out.println("Interest Rate : " + currentAccounts.get(i).getInterestRate());
                    System.out.println("Insufficient Balance Charges : " + currentAccounts.get(i).getInsufficientFundCharges());
                }
            }
        }


    }

    private int getCustomerIndex(String personId){
        System.out.println("person "+personId);
        int flag=0;
        for(int i = 0;i<customers.size();i++){
            if(customers.get(i).getPersonId().equals(personId))
                flag=i;
        }
        return flag;
    }

    private void withdrawl(String accountNumber, float amount) {

        String accountType = getAccountType(accountNumber);
        if(accountType.equals("Savings")){
            for (int i = 0; i < savingsAccounts.size(); i++) {
                if (savingsAccounts.get(i).getAccountNumber().equals(accountNumber)) {
                    addTransactions("cash",accountNumber,amount);
                    float temp = savingsAccounts.get(i).getAccountBalance();
                    temp = temp-amount;
                    savingsAccounts.get(i).setAccountBalance(temp);
                    System.out.println("Updated Balance of Account Number : " + accountNumber + " is "+temp );
                }
            }
        }
        else if(accountType.equals("Current")){
            for (int i = 0; i < currentAccounts.size(); i++) {
                if (currentAccounts.get(i).getAccountNumber().equals(accountNumber)) {
                    addTransactions("cash",accountNumber,amount);
                    float temp = currentAccounts.get(i).getAccountBalance();
                    temp = temp-amount;
                    currentAccounts.get(i).setAccountBalance(temp);
                    System.out.println("Updated Balance of Account Number : " + accountNumber + " is "+temp );
                }
            }
        }

    }
    private void deposit(String accountNumber, float amount) {
        String accountType = getAccountType(accountNumber);
        if(accountType.equals("Savings")){
            for (int i = 0; i < savingsAccounts.size(); i++) {
                if (savingsAccounts.get(i).getAccountNumber().equals(accountNumber)) {
                    addTransactions(accountNumber,"cash",amount);
                    float temp = savingsAccounts.get(i).getAccountBalance();
                    temp = temp+amount;
                    savingsAccounts.get(i).setAccountBalance(temp);
                    System.out.println("Updated Balance of Account Number : " + accountNumber + " is "+temp );
                }
            }
        }
        else if(accountType.equals("Current")){
            for (int i = 0; i < currentAccounts.size(); i++) {
                if (currentAccounts.get(i).getAccountNumber().equals(accountNumber)) {
                    addTransactions(accountNumber,"cash",amount);
                    float temp = currentAccounts.get(i).getAccountBalance();
                    temp = temp+amount;
                    currentAccounts.get(i).setAccountBalance(temp);
                    System.out.println("Updated Balance of Account Number : " + accountNumber + " is "+temp );
                }
            }
        }
    }
    private void deleteBankAccount(String accountNumber){
        String accountType = getAccountType(accountNumber);
        if(accountType.equals("Savings")){
            for (int i = 0; i < savingsAccounts.size(); i++) {
                if (savingsAccounts.get(i).getAccountNumber().equals(accountNumber)) {
                    savingsAccounts.remove(i);
                    System.out.println("Account("+accountNumber+") Deleted Successfully" );
                }
            }
        }
        else if(accountType.equals("Current")){
            for (int i = 0; i < currentAccounts.size(); i++) {
                if (currentAccounts.get(i).getAccountNumber().equals(accountNumber)) {
                    currentAccounts.remove(i);
                    System.out.println("Account("+accountNumber+") Deleted Successfully" );
                }
            }
        }
    }
    private String getAccountType(String accountNumber){
        String accountType = "";
        for(int i = 0;i<savingsAccounts.size();i++){
            if(savingsAccounts.get(i).getAccountNumber().equals(accountNumber))
                accountType = "Savings";
        }
        for(int i = 0;i<currentAccounts.size();i++){
            if(currentAccounts.get(i).getAccountNumber().equals(accountNumber))
                accountType = "Current";
        }
        if(accountType.equals("Current"))
            return accountType;
        else if(accountType.equals("Savings"))
            return accountType;
        else
            return "";
    }
    private void addEmployees(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Person ID : ");
        String personId = scanner.nextLine();
        System.out.println("Enter Person Name : ");
        String personName = scanner.nextLine();
        System.out.println("Enter Address");
        String address = scanner.nextLine();
        System.out.println("Enter Date of birth : ");
        String birthDate = scanner.nextLine();
        System.out.println("Enter Contact Number : ");
        String contactNunmber = scanner.nextLine();
        System.out.println("Enter E-mail ID : ");
        String email = scanner.nextLine();
        System.out.println("Enter Designation");
        String designation = scanner.nextLine();
        System.out.println("Enter Salary : ");
        float salary = scanner.nextFloat();
        scanner.nextLine();
        System.out.println("Enter Username : ");
        String userName = scanner.nextLine();
        System.out.println("Enter Password : ");
        String password = scanner.nextLine();
        System.out.println("Enter Bank Branch : ");
        String bankBranch = scanner.nextLine();
        Employee employee = new Employee(personId,personName,address,birthDate,contactNunmber,email,designation,salary,userName,password,bankBranch);
        employees.add(employee);

    }
    private void viewEmployees(String employeeId){
        int flag = -1;
        for(int i =0;i<employees.size();i++){
            if(employees.get(i).getPersonId().equals(employeeId))
                flag=i;
        }
        if(flag!=-1){
            System.out.println("Employee ID : "+employees.get(flag).getPersonId());
            System.out.println("Name : "+employees.get(flag).getPersonName());
            System.out.println("Address : "+employees.get(flag).getAddress());
            System.out.println("Date of Birth : "+employees.get(flag).getBirthDate());
            System.out.println("Contact Number : "+employees.get(flag).getContactNumber());
            System.out.println("Email ID : "+employees.get(flag).getEmailId());
            System.out.println("Designation : "+employees.get(flag).getDesignation());
            System.out.println("Salary : "+employees.get(flag).getSalary());
            System.out.println("Username : "+employees.get(flag).getUsername());
            System.out.println("Bank Branch : "+employees.get(flag).getBankBranch());
        }
    }

    private void addTransactions(String beneficiaryAccount,String payerAccount,float amount){
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        transaction= new Transactions(beneficiaryAccount,payerAccount,amount,date);
        transactions.add(transaction);
    }
}