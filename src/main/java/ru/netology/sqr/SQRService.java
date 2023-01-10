package ru.netology.sqr;

public class SQRService {

    public int calcSqrt(int x, int y) {
        int q = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= x && i * i <= y) {
                q = q + 1;
            }
        }
        return q;
    }
}

