package com.ktine.pattern.proxy.dynamic;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class JavaCompilerTest {
    @Test
    public void testProxy() throws IOException {
        JavaCompiler.compile(new File("C:\\Users\\ktine\\Desktop\\com\\ktine\\pattern\\proxy\\dynamic\\TimeProxy.java"));
    }

}
