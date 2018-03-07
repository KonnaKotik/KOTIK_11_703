package ru.itis;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class PolinomTest {

    private Polinom polinom;
    private Polinom polinomTwo;

    @Before
    public void setUp(){
        try {
            polinom = new Polinom("polinom.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testStringToString(){
        String expected = "2x^5 + 4x^3 + 45x^3 + 7x^2 + 77x + 32 ";
        String actual = polinom.toString();
        assertEquals(expected, actual);
    }

    @Test
    public void testInsert(){
        String expected = "2x^5 + 49x^3 + 29x^2 + 76x + 32 ";
        polinom.insert(22, 2);
        String actual = polinom.toString();
        assertEquals(expected, actual);
    }

    @Test
    public void  testCombine(){
        String expected = "2x^5 + 49x^3 + 7x^2 + 77x + 32 ";
        polinom.combine();
        String actual = polinom.toString();
        assertEquals(expected, actual);
    }

    @Test

    public void testSum(){
        String expected = "4x^7 + 4x^5 + 101x^3 + 11x^2 + 153x + 64 ";
        try {
            polinomTwo = new Polinom("polinomTwo.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

        polinom.sum(polinomTwo);
        String actual = polinom.toString();
        assertEquals(expected, actual);
    }

    @Test
    public void testDelete(){
        String expected = "2x^5 + 49x^3 + 76x + 32 ";
        polinom.delete(2);
        String actual = polinom.toString();
        assertEquals(expected, actual);
    }

    @Test
    public void testDerivate(){
        String expected = "10x^4 + 147x^2 + 14x + 77 ";
        polinom.combine();
        polinom.derivate();
        String actual = polinom.toString();
        assertEquals(expected, actual);
    }

    @Test
    public void testValue(){
        int expected = 167;
        int actual = polinom.value(1);
        assertEquals(expected, actual);
    }

    @Test
    public void testDeleteOdd(){
        String expected = "2x^5 + 32 ";
        polinom.combine();
        polinom.deleteOdd();
        String actual = polinom.toString();
        assertEquals(expected, actual);
    }

}
