package org.example;

import java.util.List;

public class Client {
    List <BankAccount> banksAccounts;
    String nom;
    String prenom;


    public Client(String nom, String prenom,List<BankAccount> banksAccount) {
        this.banksAccounts = banksAccount;
        this.nom = nom;
        this.prenom = prenom;
    }

    public boolean maxBankAccounts(){

        if(banksAccounts.size() > 5){
            return false;
        }
        return true;
    }
}
