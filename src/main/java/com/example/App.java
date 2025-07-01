package com.example;

public class App {
    public String getGreeting() {
        return "Hello World this is 2nd version";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}
