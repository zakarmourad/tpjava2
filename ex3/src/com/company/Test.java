package com.company;

public class Test {

    public Test() {
        Valeur myVal = new Valeur(0);
         new Ajob(myVal,1).run();
         new Ajob(myVal,-1).run();
        System.out.println(myVal.toString());
    }
}
