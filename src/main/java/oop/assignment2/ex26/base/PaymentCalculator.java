package oop.assignment2.ex26.base;

import static java.lang.Math.log;

public class PaymentCalculator
{
    public double calculateMonthsUntilPaidOff(double balance, double APR, double monthlyPayment)
    {
        APR = APR / 100.0;
        double i = APR / 356.0;

        double monthsLeft = -(1.0/30.0) * Math.log(1.0 + balance/monthlyPayment * Math.pow(1.0 - (1.0 + i), 30.0)) / Math.log(1.0 + i);

        return monthsLeft;
    }
}
