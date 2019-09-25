package com.company;

public class RunnableExample {

    public static void main(String[] args) {
        Thread myThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable");
            }
        });

        myThread.run();

        Thread myLambdaThread = new Thread(() -> System.out.println("inside Lambda"));
        // powyzsza instrukcja zadziala poniewaz clasa tread wymaga parametru runnable, ktory posiada jedna metode z tym samym podpisem
        // co wyrazenie lambda ktore przekazujemy w parametrze

        myLambdaThread.run();
    }


}
