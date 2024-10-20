package com.ex.protection_proxy.protection_p_class;

import com.ex.protection_proxy.realsubject_class.RealBankAccount;
import com.ex.protection_proxy.subject_interface.BankAccount;

public class BankAccountProxy implements BankAccount{


    private RealBankAccount realAccount;
    private String username;
    private String password;

    public BankAccountProxy(String username, String password){
        
        this.username = username;
        this.password = password;
    }

    private boolean authenticate(){
        return username.equals("admin")&& password.equals("admin123");
    }
    
    public void deposit(double amount){

        if(authenticate()){

            if(realAccount == null){

                realAccount = new RealBankAccount();
            }
               realAccount.deposit(amount);
        } else {
            System.out.println("Unauthorized access to deposit operation");
        }
    }

       public void withdraw(double amount){

        if(authenticate()){

            if(realAccount == null){
                realAccount = new RealBankAccount();
            }
               realAccount.withdraw(amount);
        }  else {
             System.out.println("Unauthorized access to withdraw operation ");
        }
       }
}
