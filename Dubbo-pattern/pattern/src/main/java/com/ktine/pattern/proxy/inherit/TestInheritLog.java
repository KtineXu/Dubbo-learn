package com.ktine.pattern.proxy.inherit;

import com.ktine.pattern.proxy.Bird;

public class TestInheritLog extends Bird
{
    @Override
    public void fly() {
        System.out.println("start fly...");
        super.fly();
        System.out.println("stop fly ...");
    }
}
