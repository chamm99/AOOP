package observer.practice;

public class AirPollutionServer1 implements Runnable {
    private int pollution = 50;
    private boolean stop = false;
    private int sleepDuration;
    public AirPollutionServer1(int duration) {
        sleepDuration = duration;
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

    public int getPollution() { return pollution; }
    public void stopThread() { stop = true; }
}