package lesson18.alarmObserver;

public class YellowAlarm implements Alarm {
    private int count=0;

    @Override
    public void tempChanged(int temp) {
        if(count==0) {
            if (temp >= 300) {
                System.out.println ("Yellow Alarm - Уровень температуры преодолел отметку 300");
                count++;
            }
        }else if(temp < 300){
            count--;
        }
    }
}
