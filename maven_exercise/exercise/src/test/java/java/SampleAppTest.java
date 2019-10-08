package com.exercise;

import jdk.jfr.Timestamp;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
//import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.Test;
import jdk.internal.jline.internal.TestAccessible;
import java.lang.*;
import org.junit.*;
/**
 * Unit test for SampleApp.
 */
public class SampleAppTest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
    */ 
    public SampleAppTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
    */
    public static Test suite() {
        return new TestSuite(SampleAppTest.class);
    }
    
    /**
     * Rigourous Test :-)
    */ 
    public void testApp() {
        int arr[] = { 1, 2, 4, 5};
        System.out.println("yoyo");
        assertEquals(2,Sample.getInteger(arr, 2));
        
        System.out.println("yoyo");
        assertEquals(1,Sample.findMin(arr));
        
        System.out.println("yoyo");
        assertEquals(5,Sample.findMax(arr));
  
        int ror[] = { 5, 4, 2, 1};
        System.out.println("yoyo");
        int[] abv = Sample.reverseArray(arr);
        Assert.assertArrayEquals( ror, abv );
        
        int ar[] = { 1, 2, 3, 5};
        int ro[] = { 5, 3, 2, 1};
        System.out.println("yoyo");
        abv = Sample.sortIntegers(ar);
        Assert.assertArrayEquals( ro, abv );
        
        assertTrue(true);
    }
}
