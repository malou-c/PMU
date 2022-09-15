package com.example.app_lab1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void min_tests() {
        assertEquals(1, MyMath.Min(new int[]{10, 5, 6, 8, 1}));
        assertEquals(-5, MyMath.Min(new int[]{10, -5, 6, 8, 10}));
        assertEquals(5, MyMath.Min(5, 10));
        assertEquals(-10, MyMath.Min(5, -10));
    }
    @Test
    public void max_tests() {
        assertEquals(10, MyMath.Max(new int[]{10, 5, 6, 8, 1}));
        assertEquals(600, MyMath.Max(new int[]{10, -5, 600, 8, 10}));
        assertEquals(10, MyMath.Max(5, 10));
        assertEquals(5, MyMath.Max(5, -10));
    }
}