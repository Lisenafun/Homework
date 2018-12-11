package lesson18.strategyLogger;

public class User {
    private ILogger logger;

    public User(ILogger logger) {
        this.logger = logger;
    }

    public void write(String message){
        logger.write (message);
    }
}
