package ru.netology.sqr.NumberOfSquaresHM.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.sqr.NumberOfSquaresHM.services.SQRService;

public class SQRSTest{

        @Test
    public int calcSQRService(int min, int max) {
        SQRService service = new SQRService();


        int expected = 2;
        int actual = service.calcSQRService( max = 300, min = 200);

     Assertions.assertEquals(expected, actual);
        return expected;
    }


}
