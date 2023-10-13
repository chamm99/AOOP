package observer.practice;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class AirPollutionServer1 implements Runnable, Subject {
    private int pollution = 50;
    private boolean stop = false;
    private int sleepDuration;
    private ArrayList<Observer> observers;
    public AirPollutionServer1(int duration) {
        sleepDuration = duration;
        observers = new ArrayList<Observer>();
    }


    @Override
    public void run() {
        while (!stop) {
            int plusMinus = RandIntInRange.nextInt(0, 1);
            int pollutionDiff = RandIntInRange.nextInt(1, 10);
            if (plusMinus == 1) {
                pollution += pollutionDiff;
            }
            else {
                pollution -= pollutionDiff;
                if (pollution < 0) {
                    pollution = 0;
                }
            }
            System.out.printf("Server: pollution = %d\n", pollution);
            try {
                Thread.sleep(sleepDuration); // sleepDuration밀리초 멈춤
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public int getPollution() {
        return pollution;
    }
    public void stopThread() {
        stop = true;
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void romoveObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObserver(Object o) {
        for (Observer obs : observers) {
            obs.update(o);
        }
    }
}