package lesson18.strategyLogger;

public class Main {
    public static void main(String[] args) {
        User user = new User (new ConsoleLogger ());
        user.write ("Hello");
        User user1 = new User (new FileLogger ());
        user1.write ("Привет");
        User user2 = new User (new TimeFileLogger ());
        user2.write ("Hello");
    }
}
