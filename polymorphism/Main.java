package com.erkanerturk.polymorphism;

public class Main {

    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
        customerManager.add();
    }
}
