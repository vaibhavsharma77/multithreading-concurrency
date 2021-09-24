package com.basic.example.runnable.example3;

public class Printer {

    synchronized void print(int copy,String documentName) throws InterruptedException {
        for(int i=1;i<copy;i++){
            Thread.sleep(1000);
            System.out.println("printer prints copy " +i+ " of document "+documentName);
        }
    }
}
