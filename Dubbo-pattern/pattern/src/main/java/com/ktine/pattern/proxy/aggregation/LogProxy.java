package com.ktine.pattern.proxy.aggregation;

import com.ktine.pattern.proxy.Flyable;

public class LogProxy implements Flyable
{
    Flyable flyable ;

    public LogProxy(Flyable flyable) {
        this.flyable = flyable;
    }

    public void fly() {
        System.out.println("start fly...");
        flyable.fly();
        System.out.println("stop fly ...");
    }
}
