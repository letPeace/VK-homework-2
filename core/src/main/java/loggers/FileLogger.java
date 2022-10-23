package loggers;

public class FileLogger extends InputLogger{

    @Override
    public void log(String input){
        setLogger("file");
        super.log(input);
        System.out.println("Input was successfully logged to the file!");
    }

}
