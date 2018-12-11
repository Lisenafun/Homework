package lesson18.alarmObserver;

import java.util.ArrayList;
import java.util.List;

public class Sensor {//класс со слушателями
    private Alarm[] alarms = {new GreenAlarm (),new YellowAlarm (),new RedAlarm ()};
    private int temperature = 0;

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
}
