package ru.netology.sqr;

public class SQRService {

    public int calcSqrt(int bline, int tline) {
        int squares = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= bline && i * i <= tline) {
                squares = squares + 1;
            }
        }
        return squares;
    }
}

