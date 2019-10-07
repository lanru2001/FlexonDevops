package com.example.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import jdk.internal.jline.internal.TestAccessible;
//import src.main.java.com.example.test.HelloWorld;
import java.util.Arrays;
import java.util.List;

public class HelloWorldTest {


    @Test
    public void testImmutableCollections() {

        List<String> fruits = Arrays.asList(new String[]{"Mangosteen", "Durian fruit", "Longan"});

        assertThrows(UnsupportedOperationException.class, () -> {
            fruits.add("Mango");
            fruits.remove(1);
        });

        assertEquals(3, fruits.size());

    }

    @Test
    public void sum()
    {
        System.out.println("yoyo");
        int a1 = 15 , b1 = 15, result = 30;
        int expresult = HelloWorld.sum(a1,b1);
        assertEquals(expresult, result);
        assertEquals(10, HelloWorld.sum(5, 5));
        assertEquals(0, HelloWorld.sum(0, 15));
        assertEquals(30, HelloWorld.sum(15, 15));
    }
}
