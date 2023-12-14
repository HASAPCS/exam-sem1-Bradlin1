package com.example;

//write your class implementation here
public class StepTracker {
    public int minsteps;
    public int days;
    public int dailysteps;
    public int activeDays;
    public int total;

    public StepTracker(int minsteps) {
        this.minsteps = minsteps;
        this.days = 0;
        this.activeDays = 0;
        this.total = 0;
    }

    public int activeDays() {
        return this.activeDays;
    }

    public double averageSteps() {
        if (total == 0 || days == 0) {
            return 0;
        } else
            ;
        double avg = (double) total / days;
        return avg;
    }

    public void addDailySteps(int todaysSteps) {

        if (todaysSteps > this.minsteps) {
            activeDays++;
        }
        total += todaysSteps;
        days++;


    }

}
