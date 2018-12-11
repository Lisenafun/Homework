package lesson18.alarmObserver;

public class RedAlarm implements Alarm {
    private int count=0;

    @Override
    public void tempChanged(int temp) {
        if(count == 0) {
            if (temp >= 600) {
                System.out.println ("Red Alarm - Уровень температуры преодолел отметку 600");
                count++;
            }
        }else if(temp < 600){
            count--;
        }
    }
}
