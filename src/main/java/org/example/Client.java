package org.example;

import java.util.List;

public class Client {
    List <BankAccount> banksAccounts;


    public Client(List<BankAccount> banksAccount) {
        this.banksAccounts = banksAccount;
    }

    public boolean maxBankAccounts(){
        if(banksAccounts.size() > 5){
            return false;
        }
        return true;
    }
}
