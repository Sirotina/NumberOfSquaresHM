package ru.netology.sqr;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
 class SQRServiceTest {

     @Test
     public void testCalc () {
         SQRService Service = new SQRService();
         int actual;
         int max;
         actual = Service.calcSquares (200, max = 300);
         int expected = 3;
         Assertions.assertEquals(expected, actual);
     }
}
