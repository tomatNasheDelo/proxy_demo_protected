package com.ex.protection_proxy.realsubject_class;

import com.ex.protection_proxy.subject_interface.BankAccount;

public class RealBankAccount implements BankAccount {

    private double balance;

    public void deposit(double amount){
        
        balance += amount;
        System.out.println("Deposited "+amount+ " into account ");
    }

    public void withdraw(double amount){

        if(balance >= amount){

            balance -= amount;
            System.out.println("Withdrow "+amount+ " from account ");

        } else {

            System.out.println("Insufficient funds to withdraw "+amount);
        }
    }


    
}
