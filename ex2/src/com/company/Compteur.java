package com.company;


import static java.lang.Thread.sleep;

public class Compteur {
    String nom;
    int maxValue;
    Compteur(){

    }
    Compteur(String nom, int maxValue) {
        this.nom = nom;
        this.maxValue = maxValue;
        try {
            for (int i = 1; i <= maxValue; i++) {

                System.out.println(nom+" : "+i);

                sleep((int)Math.random()*202);
            }
        }catch (Exception e){
         e.printStackTrace();
        }
    }


}
