package lesson18.alarmObserver;

public class GreenAlarm implements Alarm {
    private int count=0;

    @Override
    public void tempChanged(int temp) {
        if(count ==0) {
            if (temp >= 100) {
                System.out.println ("Green Alarm - Уровень температуры преодолел отметку 100");
                count++;
            }
        }else if(temp < 100){
            count--;
        }
    }
}
