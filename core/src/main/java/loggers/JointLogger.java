package loggers;

import com.google.inject.Inject;
import com.google.inject.name.Named;

public class JointLogger extends InputLogger{

    private final InputLogger consoleLogger;
    private final InputLogger fileLogger;

    @Inject
    public JointLogger(@Named("consoleLogger") InputLogger consoleLogger, @Named("fileLogger") InputLogger fileLogger){
        this.consoleLogger = consoleLogger;
        this.fileLogger = fileLogger;
    }

    @Override
    public void log(String input){
        consoleLogger.log(input);
        fileLogger.log(input);
    }
}
