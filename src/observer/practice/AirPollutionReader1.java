package observer.practice;

public class AirPollutionReader1 implements Runnable, Observer {
    private AirPollutionServer1 server;
    private int sleepDuration;
    private boolean stop = false;
    private int num;
    private int pollution;
    
    public AirPollutionReader1(AirPollutionServer1 server, int num, int duration) {
        this.server = server;
        this.sleepDuration = duration;
        this.num = num;
    }

    @Override
    public void run() {
        while (!stop) {        
            try {
                System.out.printf("readerNumber = %d, pollution = %d\n", num, server.getPollution());
                Thread.sleep(sleepDuration); // sleepDuration밀리초 멈춤
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    public void stopThread() { stop = true; }

    @Override
    public void update(Object o) {
        pollution = (Integer) o;
    }
}