package com.basic.example.runnable.example2;

public class PrinterA extends Thread {
    @Override
    public void run() {
        for(int i=1;i<10;i++){
            System.out.println("Printer-A is printing document with document id :"+i);
        }
    }
}
