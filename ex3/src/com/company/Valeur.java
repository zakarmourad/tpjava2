package com.company;

public class Valeur {
    int vleur ;

    public Valeur(int vleur) {
        this.vleur=vleur;
    }
   public synchronized void  add(int i){
this.vleur=this.vleur+i;
    }
   public int getVal(){
return vleur;
    }

    public String toString()
    {
        return ""+this.vleur;
    }
}
