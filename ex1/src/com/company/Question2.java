package com.company;

public class Question2 extends  Thread {
    int valeur;
    Question2(int v){
        valeur = v;
    }
    @Override
    public void run() {
        try {
            if (valeur == 1) {
                for (int i = 1; i <= 1000; i++)  {

                    System.out.println(i);

                Thread.sleep(1000);}

            }if (valeur == 3)  {
                for (int i =1000 ; i >=1 ; i--) {

                    System.out.println(i);
                    Thread.sleep(1000);
                }
            }

        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}


