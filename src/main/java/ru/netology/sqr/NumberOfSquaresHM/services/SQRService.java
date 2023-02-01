package ru.netology.sqr.NumberOfSquaresHM.services;

public class SQRService {
    public int calcSQRService(int i, int x) {

        int numberOfSquareRoots = 0;
        for (i = 10; i <= 99; i++) {
            i = 10;
            x = 99;
            if (i * i >= i && i * i <= x) {
                numberOfSquareRoots++;
                return numberOfSquareRoots;

            }
        }
        return -1;


    }


}

