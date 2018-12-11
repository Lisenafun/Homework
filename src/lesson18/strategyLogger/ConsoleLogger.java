package lesson18.strategyLogger;
//выводит сообщения в консоль
public class ConsoleLogger implements ILogger {

    @Override
    public void write(String message) {
        System.out.println (message);
    }
}
