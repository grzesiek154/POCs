package com.company;

public class Main {

    public void greet(Greeting greeting) {greeting.perform();}

    public static void main(String[] args) {
	// write your code here
    Main mainClass = new Main();
    Greeting helloWorldGreeting = new HelloWorldGreeting();
    Greeting myLambdaGreeting = () -> System.out.println("Lambda Greeting!");

    MyLambda myLambdaFunction = () -> System.out.println("Hello Lambda Expresion");

    helloWorldGreeting.perform();
    myLambdaGreeting.perform();
    }


    interface MyLambda {
        void foo();
    }


}
