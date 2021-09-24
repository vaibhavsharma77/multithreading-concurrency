package com.basic.example.runnable.example2;

public class ParallelApp {
    //This code has main thread which is running along with Printer threads(A,B) which is running in parallel (concurrently)
    //JVM decides the time slicing here to run main thread or user thread(printer thread)
    //since three threads are running in parallel(printerA,PrinterB and Main) hence output is unpredictable
    public static void main(String[] args) {
        System.out.println("App execution starts here");

        PrinterA printerA =new PrinterA();
        printerA.start();

        for(int doc=1;doc<10;doc++){
            System.out.println("Printer-1 is printing document with document no:"+ doc);
        }

        PrinterB printerB=new PrinterB();
        printerB.start();

        System.out.println("App execution ends here");
    }
}
