package org.example;
import java.lang.Exception.*;

import java.time.LocalDate;
import java.time.LocalTime;

public class BankAccount {
    String libelle;
    float solde;

    public void setSolde(float solde) {
        this.solde = solde;
    }

    public BankAccount(String libelle, float solde){
        this.libelle = libelle;
        this.solde = solde;
    }

    public float getSolde() {
        return solde;
    }

    public boolean bankAccountSolde(float solde){
        if(solde >= 0 && solde <= 1000){
            return true;
        }
        return false;
    }

    public float commission(float operation) throws Exception {

        int heure = LocalTime.now().getHour();
        float res = 0;

        res = this.solde += operation;

        if(22 <= heure && heure <= 6){
            res *= 0.99;
        }else{
            res *= 0.98;
        }
        if(res < 0){
            throw new Exception("Opération echoue, il n'est pas possible de prendre le montant !");
        }
        return res;
    }

    public float credit(float solde) throws Exception {

        float res = this.solde + solde;

        if(res > 1000){
            throw new Exception("Le montant n'a pas pu être ajouté !");
        }
        return res;

    }
    public float debiter(float solde) throws Exception {

        float res = this.solde - solde;

        if(res < 0){
            throw new Exception("Le montant n'a pas pu être prélevé !");
        }
        return res;

    }


}
