package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
      /*  Runnable q = new Question1(1);
        Runnable q2 = new Question1(3);
        new Thread(q).start();
        new Thread(q2).start();*/
      new Question2(1).start();
new Question2(3).start();
    }
}
