package com.java.features.lambdaExpressions;

public class RunnableLambda {

    public static void main(String[] args) throws InterruptedException {

        // Anonymous class example of Runnable

//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                for(int i = 0; i < 3; i++ ) {
//                    System.out.println("Hello World from Thread : [ "+
//                            Thread.currentThread().getName() + " ]");
//                }
//            }
//        };

        Runnable runnableThread = () -> {
                for(int i = 0; i < 3; i++ ) {
                    System.out.println("Hello World from Thread : [ " +
                            Thread.currentThread().getName() + " ]");
                }
        };

       // Thread t = new Thread(runnable);

        Thread t = new Thread(runnableThread);

        t.start();
        t.join();
    }
}
