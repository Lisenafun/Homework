package lesson18.alarmObserver;

public class Main {
    public static void main(String[] args) {
        Sensor sensor = new Sensor ();
        sensor.riseTemp (50);
        sensor.riseTemp (50);
        sensor.riseTemp (1);
        sensor.dropTemp (40);
        sensor.riseTemp (50);
        sensor.riseTemp (200);
        sensor.dropTemp (12);
        sensor.riseTemp (2);
        sensor.riseTemp (300);
    }
}
