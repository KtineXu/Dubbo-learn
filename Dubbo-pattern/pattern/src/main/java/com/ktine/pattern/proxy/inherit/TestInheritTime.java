package com.ktine.pattern.proxy.inherit;

public class TestInheritTime extends TestInheritLog
{
    @Override
    public void fly() {
        long startTime = System.currentTimeMillis();
        super.fly();
        System.out.println("cost " + (System.currentTimeMillis()-startTime) +"'ms ");
    }
}
