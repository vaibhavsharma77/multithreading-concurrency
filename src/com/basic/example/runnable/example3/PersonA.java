package com.basic.example.runnable.example3;

public class PersonA extends Thread{
    private Printer printer;

    public PersonA(Printer printer){
        this.printer=printer;
    }

    @Override
    public void run() {
        try {
            printer.print(44,"personA.pdf");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
