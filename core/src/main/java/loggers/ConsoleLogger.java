package loggers;

import java.util.logging.Logger;

public class ConsoleLogger extends InputLogger{

    private static final Logger logger = Logger.getLogger(ConsoleLogger.class.getName()); // perhaps log4j is more recommended

    @Override
    public void log(String input){
        logger.info(generateLogMessage(input));
        incrementId();
    }

}
