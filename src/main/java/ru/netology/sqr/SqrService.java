package ru.netology.sqr;

public class SqrService {
    public int calcSqr(int lowerLimit, int UpperLimit) {

        int sum = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= lowerLimit && i * i <= UpperLimit) {
                sum++;
            }
        }
        return sum;
    }

}
