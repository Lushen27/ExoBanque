package org.example;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        BankAccount banque = new BankAccount("MonCompte",200);
        List<BankAccount> listeBanques = new ArrayList<>();
        listeBanques.add(banque);
        Client unClient = new Client("Parchap","Lucas",listeBanques);
        try{
            float res = banque.credit(1000);
            System.out.println(res);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }


    }
}