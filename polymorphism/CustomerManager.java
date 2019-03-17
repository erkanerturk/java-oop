package com.erkanerturk.polymorphism;

public class CustomerManager {
    private BaseLogger logger;

    public CustomerManager(BaseLogger logger) {
        this.logger = logger;
    }

    public void add(){
        System.out.println("Added customer");
        this.logger.log("Loglandi");
    }
}
