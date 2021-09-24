package com.basic.example.runnable.example3;

public class SyncApp {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Sync APP starts here....");
        Printer printer=new Printer();
        PersonA personA=new PersonA(printer);
        personA.start();
        PersonB personB=new PersonB(printer);
        personB.start();
        System.out.println("Sync APP ends here....");
    }
}
