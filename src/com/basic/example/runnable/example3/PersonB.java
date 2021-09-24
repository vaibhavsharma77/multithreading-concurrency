package com.basic.example.runnable.example3;

public class PersonB extends Thread{
    private Printer printer;
    public PersonB(Printer printer){
        this.printer=printer;
    }

    @Override
    public void run() {
        try {
            printer.print(36,"PersonB.pdf");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
