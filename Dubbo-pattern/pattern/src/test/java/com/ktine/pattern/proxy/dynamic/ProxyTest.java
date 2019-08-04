package com.ktine.pattern.proxy.dynamic;

import com.ktine.pattern.proxy.Bird;
import com.ktine.pattern.proxy.Flyable;
import org.junit.Test;

public class ProxyTest {

    @Test
    public void testPath ()
    {
        String sourcePath = "C:/Users/ktine/Desktop";
        System.out.println("file:///" + sourcePath);
    }

    @Test
    public void createDeployment() {
        MyInvocationHandler handler = new MyInvocationHandler(new Bird());
        String sourcePath = "D:/pattern/target/classes";
        Flyable proxy = null;
        try {
            proxy = (Flyable) Proxy.newProxyInstance(Flyable.class, handler,sourcePath);
        } catch (Exception e) {
            e.printStackTrace();
        }
        proxy.fly();
    }

}
