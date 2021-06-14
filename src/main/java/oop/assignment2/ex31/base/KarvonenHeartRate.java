package oop.assignment2.ex31.base;

public class KarvonenHeartRate
{
    public boolean checkIncrease(String age, String heartRate)
    {
        if(!age.matches("[0-9]+"))
        {
            System.out.println("Please enter numerical values only!");
            return false;
        }

        if(!heartRate.matches("[0-9]+"))
        {
            System.out.println("Please enter numerical values only!");
            return false;
        }
        double cAge = Double.parseDouble(age);
        double cHeartRate = Double.parseDouble(heartRate);

        System.out.println("Resting Pulse:" + cHeartRate + "\t\t\tAge:" + cAge + "\nIntensity\t\t\t| Rate");
        System.out.println("---------------------------------------------------");
        for(int i = 55; i <= 95; i += 5)
        {
            double perc = (double) i/100.00;
            double targetHeartRate = (((220.00 - cAge) - cHeartRate) * perc) + cHeartRate;
            System.out.printf("%.0f%%\t\t\t\t\t| %.0f bpm\n", (double)i, targetHeartRate);
        }

        return true;

    }
}
