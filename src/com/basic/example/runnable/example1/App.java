package com.basic.example.runnable.example1;

public class App {

    //main thread of Java application
    //each thread executes the job(task) in sequence(meaning step by step)
    public static void main(String[] args) {
        System.out.println("First line start from here...");
        //job-1 processing
        for(int i=1;i<11;i++){
            System.out.println("Printer-1 is printing document with document id ::"+i);
        }
        Printer printer=new Printer();
        printer.printingApp();
        //Only when Job-1 execution is finished then Job-2 will executes
        System.out.println("Last line start from here...");
    }



    }
