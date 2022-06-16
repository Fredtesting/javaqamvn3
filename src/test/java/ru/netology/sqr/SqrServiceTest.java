
package ru.netology.sqr;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SqrServiceTest {
    @Test
    public void calculate200_300() {
        SqrService service = new SqrService();
        int actual = service.calcSqr(200, 300);
        int expected = 3;
        assertEquals(expected, actual);
    }
    @Test
    public void calculateMinMax() {
        SqrService service = new SqrService();
        int actual = service.calcSqr(100, 9_801);
        int expected = 90;
        assertEquals(expected, actual);
    }
    @Test
    public void calculateBorderCondition() {
        SqrService service = new SqrService();
        int actual = service.calcSqr(101, 9_800);
        int expected = 88;
        assertEquals(expected, actual);
    }
    @Test
    public void calculateSameCount() {
        SqrService service = new SqrService();
        int actual = service.calcSqr(100, 100);
        int expected = 1;
        assertEquals(expected, actual);
    }

}
