package com.ktine.pattern.proxy;

import java.util.Random;

public class Bird implements Flyable
{
    public void fly() {
        System.out.println("flying ....");
        try {
            Thread.sleep(new Random().nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
