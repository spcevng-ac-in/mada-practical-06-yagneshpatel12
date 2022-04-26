package com.techninja01.practical06;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }
    @Test
    public void additionNegative_isCorrect(){assertEquals(1,-1+2);}
    @Test
    public void additionFloat_isCorrect(){assertEquals(2.222d,1.111f+1.111d,1d);}
}