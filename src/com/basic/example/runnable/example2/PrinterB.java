package com.basic.example.runnable.example2;

public class PrinterB extends Thread {

    @Override
    public void run() {
        for(int i=0;i<11;i++){
            System.out.println("PrinterB is printing document with id:"+i);
        }
    }
}
