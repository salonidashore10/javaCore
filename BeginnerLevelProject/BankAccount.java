package BeginnerLevelProject;

import java.util.ArrayList;
import java.util.Scanner;

class Bank{

    static ArrayList<String> transactionHistory=new ArrayList<>();

    String name;
    int acc;
    double balance;
    int pin;

    public void createAccount(Scanner sc){
        System.out.println();
        System.out.println("For creating new account enter your details :-");
        System.out.println();
        sc.nextLine();
        System.out.print("Enter your Fullname: ");
        name=sc.nextLine();
        System.out.print("Enter your Account number: ");
        acc=sc.nextInt();
        System.out.print("Enter your initial balance: ");
        balance=sc.nextDouble();
        transactionHistory.add("Account created with balance: "+balance);
        System.out.print("Enter your PIN: ");
        pin=sc.nextInt();
        System.out.println();
        System.out.println("~~~~~~~Account created successfully !!~~~~~~~~");
        displayDetails();
    }


    public void displayDetails(){
        System.out.println();
        System.out.println("Your Details are:");
        System.out.println();
        System.out.println("Your Fullname: "+name);
        System.out.println("Your Account number: "+acc);
        System.out.println("Your initial balance: "+balance);
        System.out.println("Your PIN: "+pin);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    public static void deleteAccount(ArrayList<Bank> accounts,int accnum){
        for(int i=0;i<accounts.size();i++){
            if(accounts.get(i).acc==accnum){
                accounts.remove(i);
                System.out.println("~~~~~~~Account deleted successfully!!~~~~~~~");
                return;
            }
        }
        System.out.println("Account not found!");
    }

    public static void searchAccount(ArrayList<Bank> accounts,int accnum){
        for(int i=0;i<accounts.size();i++){
            if(accounts.get(i).acc==accnum){
                System.out.println("Account Found! ");
                accounts.get(i).displayDetails();
                return;
            }
        }
        System.out.println("Sorry! , Account not found.");
    }

    public static void deposit(ArrayList<Bank> accounts,int accnum,Scanner sc){
        for(int i=0;i<accounts.size();i++){
            if(accounts.get(i).acc==accnum){
                System.out.println("Enter your amount: ");
                double amount=sc.nextDouble();
                double totalBalance=accounts.get(i).balance += amount;
                transactionHistory.add("Deposited: "+amount);
                System.out.println("Total Balance: "+totalBalance);
                return;
            }
        }
        System.out.println("Account not found!");
    }

    public static void withdraw(ArrayList<Bank> accounts,int accnum,Scanner sc){
        for(int i=0;i<accounts.size();i++){
            if(accounts.get(i).acc==accnum){
                System.out.println("Enter your amount: ");
                double amount=sc.nextDouble();
                if(accounts.get(i).balance >= amount){
                    double totalBalance=accounts.get(i).balance -= amount;
                    transactionHistory.add("Withdrawn: "+amount);
                    System.out.println("Total Balance: "+totalBalance);
                    return;
                }
                else{
                    System.out.println("Insufficient Balance!!");
                    return;
                }
            }
        }
        System.out.println("Account not found!");
    }

    public void transactionHistory(){
        for (String transaction : transactionHistory) {
            if(transaction.isEmpty()){
                System.out.println("No transaction found!");
            }
            else{
                System.out.println("Transaction History of your account :-");
                System.out.println(transaction);
            }
        }
    }

    public static void displayAllAccounts(ArrayList<Bank> accounts){
        System.out.println("All Accounts :-");
        for (Bank acBank : accounts) {
            acBank.displayDetails();
        }
    }
    
}

public class BankAccount {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        ArrayList<Bank> accounts=new ArrayList<>();

        // Structure
        while (true) {
            
            System.out.println();
            System.out.println("..........................");
            System.out.println("      Banking System");
            System.out.println("..........................");
            System.out.println();
            System.out.println("[1]. Create Account");
            System.out.println("[2]. Delete Account");
            System.out.println("[3]. Search Account");
            System.out.println("[4]. Deposit");
            System.out.println("[5]. Withdrawn");
            System.out.println("[6]. Transaction History");
            System.out.println("[7]. displayAllAccounts");
            System.out.println();

            System.out.print("Select your choice: ");
            int choice=sc.nextInt();
        
            switch (choice) {
                case 1:{
                    Bank newAcc=new Bank();
                    accounts.add(newAcc);
                    newAcc.createAccount(sc);
                    break;
                }
                case 2:{
                    System.out.println("Enter your account number: ");
                    int accNum=sc.nextInt();
                    Bank.deleteAccount(accounts,accNum);
                    break;
                }
                case 3:{
                    System.out.println("Enter your account number: ");
                    int accNum=sc.nextInt();
                    Bank.searchAccount(accounts,accNum);
                    break;
                }
                case 4:{
                    System.out.println("Enter your account number: ");
                    int accNum=sc.nextInt();
                    Bank.deposit(accounts,accNum,sc);
                    break;
                }
                case 5:{
                    System.out.println("Enter your account number: ");
                    int accNum=sc.nextInt();
                    Bank.withdraw(accounts,accNum,sc);
                    break;
                }
                case 6:{
                    System.out.println("Enter your account number: ");
                    int accNum=sc.nextInt();
                    for (Bank account : accounts) {
                        if(account.acc==accNum){
                            account.transactionHistory();
                            break;
                        }
                        else{
                            System.out.println("Account not found!");
                        }
                    }
                    break;
                }
                case 7:{
                    Bank.displayAllAccounts(accounts);
                    break;
                }
                default:{
                    break;
                }
            }
        }
    }
}
