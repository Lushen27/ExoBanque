package org.example;

public class BankAccount {
    String libelle;


    float solde;

    public BankAccount(String libelle, float solde){
        this.libelle = libelle;
        this.solde = solde;
    }

    public float getSolde() {
        return solde;
    }

    public boolean bankAccount(float solde){
        if(solde >= 0 && solde <= 1000){
            return true;
        }
        return false;
    }


}
