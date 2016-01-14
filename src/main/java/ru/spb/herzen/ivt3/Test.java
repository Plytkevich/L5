package ru.spb.herzen.ivt3;

import junit.framework.Assert;

import static junit.framework.Assert.assertEquals;


public class Test {

    public void testAdd() {
        assertEquals(7, A.add(2, 5));
        assertEquals(12, A.add(9, 3));
    }

    public void testFact() throws Exception {
        assertEquals(1, A.fact(1));
        assertEquals(1 * 2, A.fact(2));
        assertEquals(1 * 2 * 3, A.fact(3));
        assertEquals(1 * 2 * 3 * 4, A.fact(4));
        assertEquals(1 * 2 * 3 * 4 * 5, A.fact(5));
        assertEquals(1 * 2 * 3 * 4 * 5 * 6, A.fact(6));
        assertEquals(1 * 2 * 3 * 4 * 5 * 6 * 7, A.fact(7));
        assertEquals(1, A.fact(0));
        try {
            A.fact(-1);
            Assert.fail("Не должно работать!");
        } catch (Exception ex) {
            assertEquals("Факториал от отрицательного числа не существует!",
                    ex.getMessage());
        }
    }

    public void testFunc() {
        assertEquals(2.4999688f, A.func(-2.00005f), 0.000001);
        assertEquals(-2.7277687f, A.func(5.666f), 0.000001);
        assertEquals(2.5f, A.func(0), 0.0001);
        assertEquals(Double.POSITIVE_INFINITY, A.func(2), 0.000001);
    }
}
