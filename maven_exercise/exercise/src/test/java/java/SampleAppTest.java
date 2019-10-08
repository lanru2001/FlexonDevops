package com.exercise;

import jdk.jfr.Timestamp;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import jdk.internal.jline.internal.TestAccessible;

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

    @Test
    void getInteger()
    {
        int arr[] = { 1, 2, 4, 5};
        System.out.println("yoyo");
        assertEquals(2,Sample.getInteger(arr, 2));
    }

    @Test
    void getMin()
    {
        int arr[] = { 1, 2, 4, 5};
        System.out.println("yoyo");
        assertEquals(1,Sample.findMin(arr));
    }

    @Test
    void getMax()
    {
        int arr[] = { 1, 2, 4, 5};
        System.out.println("yoyo");
        assertEquals(5,Sample.findMin(arr));
    }

    @Test
    void getrev()
    {
        int arr[] = { 1, 2, 4, 5};
        int ror[] = { 5, 4, 2, 1};
        System.out.println("yoyo");
        int[] abv = Sample.reverseArray(arr);
        assertEquals(ror,abv);
    }
    @Test
    void getsort()
    {
        int arr[] = { 1, 2, 4, 5};
        int ror[] = { 5, 4, 2, 1};
        System.out.println("yoyo");
        int[] abv = Sample.sortIntegers(arr);
        assertEquals(ror,abv);
    }
    

    /**
     * Rigourous Test :-)
     */
    public void testApp() {
        assertTrue(true);
    }
}
