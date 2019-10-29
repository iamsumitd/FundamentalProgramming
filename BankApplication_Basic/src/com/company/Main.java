package com.company;
import java.util.Scanner;

public class Main {

    public static final Scanner input = new Scanner(System.in);
    public static final Scanner stringInput = new Scanner(System.in);
    public String name;
    public int age;
    public long personummer;
    public String address;
    public long phoneNumber;
    public long amount;
    public boolean created = false;

    public static void main(String[] args) {

        Main BankID = new Main();
        int option;

        do {
            System.out.println("- - - - Welcome to the Bank of Hkr - - - -");
            System.out.println();
            System.out.println("1) New account");
            System.out.println("2) View account");
            System.out.println("3) Deposit");
            System.out.println("4) Withdraw");
            System.out.println("5) Exit");
            System.out.println();
            System.out.println("- - - - - - - - - - - - - - - - - - - - - ");
            System.out.println();
            System.out.println(">> Please choose an option...");
            option = input.nextInt();

            switch (option) {
                case 1:
                    BankID.newAccount();
                    break;
                case 2:
                    BankID.viewAccount();
                    break;
                case 3:
                    BankID.deposit();
                    break;
                case 4:
                    BankID.withdraw();
                    break;
                case 5:
                    break;
                default:
                    System.out.println(">> Not A Valid Option ");
            }
        } while (option != 5);
    }

    public void newAccount() {
        System.out.println("New Account Wizard");
        System.out.println("------------------");
        System.out.println("Enter the following details: ");
        System.out.println();
        System.out.println("Full Name: ");
        name = stringInput.nextLine();
        System.out.println("Address: ");
        address = stringInput.nextLine();
        System.out.println("Age: ");
        age = input.nextInt();
        System.out.print("Personummer: ");
        personummer = input.nextLong();
        System.out.print("Phone Number: ");
        phoneNumber = input.nextLong();
        created = true;
        System.out.println("Thanks. Your details have been saved.");
    }

    public void viewAccount() {
        if (created) {
            System.out.println("View Account");
            System.out.println("Full Name: " + name);
            System.out.println("Address: " + address);
            System.out.println("Age: " + age);
            System.out.println("Personummer: " + personummer);
            System.out.println("Phone Number: " + phoneNumber);
            System.out.println("Amount: " + amount);
        } else System.out.println("First create an account");
    }

    public void deposit() {
        if (created) {
            System.out.println("Deposit");
            System.out.print("Enter the deposit amount: ");
            amount += input.nextLong();
        } else System.out.println("First create an account");
    }

    public void withdraw() {
        if (created) {
            System.out.println("Withdraw");
            System.out.print("Enter the withdrawal amount: ");
            amount -= input.nextLong();
        } else System.out.println("First create an account");
    }
}