package com.ktine.pattern.proxy.aggregation;

import com.ktine.pattern.proxy.Flyable;

public class TimeProxy implements Flyable
{
    Flyable flyable ;

    public TimeProxy(Flyable flyable) {
        this.flyable = flyable;
    }
    public void fly() {
        long startTime = System.currentTimeMillis();
        flyable.fly();
        System.out.println("cost " + (System.currentTimeMillis()-startTime) +"'ms ");
    }
}
