package loggers;

public class ConsoleLogger extends InputLogger{

    @Override
    public void log(String input){
        setLogger("console");
        super.log(input);
    }

}
