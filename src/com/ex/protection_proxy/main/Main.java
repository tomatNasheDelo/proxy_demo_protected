package com.ex.protection_proxy.main;

import com.ex.protection_proxy.protection_p_class.BankAccountProxy;
import com.ex.protection_proxy.subject_interface.BankAccount;

public class Main {

    public static void main(String[] args) {
        
        System.out.println("PPpPPPpppp");

        BankAccount account = new BankAccountProxy("admin", "admin123");

        account.deposit(1000);
        account.withdraw(500);
        account.withdraw(600);

        BankAccount invalidAccount = new BankAccountProxy("user", "password");
        invalidAccount.deposit(500);
    }
    
}
