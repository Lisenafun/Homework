package lesson18.alarmObserver;

import lesson19.task1.Exclude;

import java.util.Arrays;

public class Sensor {//класс со слушателями
    private Alarm[] alarms = {new GreenAlarm (),new YellowAlarm (),new RedAlarm ()};
    private int temperature = 0;
    @Exclude
    private String name;

    public int getTemperature() {
        return temperature;
    }

    public void riseTemp(int temp){
        this.temperature = temperature+temp;
        System.out.println ("Температура повышена до " + temperature);
        notifyAlarms (getTemperature ());
    }
    public void dropTemp(int temp){
        this.temperature = temperature-temp;
        System.out.println ("Температура понижена до " + temperature);
        notifyAlarms (getTemperature ());
    }

    private void notifyAlarms(int temp){
        for(Alarm alarm: alarms){
            alarm.tempChanged (temp);
        }
    }

    @Override
    public String toString() {
        return "Sensor{" + "alarms=" + Arrays.toString (alarms) + ", temperature=" + temperature + '}';
    }
}
