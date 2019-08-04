package com.ktine.pattern.proxy.aggregation;

import com.ktine.pattern.proxy.Bird;
import org.junit.Test;

import static org.junit.Assert.*;

public class TimeProxyTest {

    @Test
    public void testProxy()
    {
        Bird bird = new Bird();

        LogProxy logProxy = new LogProxy(bird) ;

        TimeProxy timeProxy = new TimeProxy(logProxy) ;

        timeProxy.fly();
    }
}
