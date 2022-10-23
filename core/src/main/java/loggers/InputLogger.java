package loggers;

import org.apache.log4j.Logger;

public abstract class InputLogger {

    private static Long id = 0L;
    private static String tag;
    private Logger logger;

    public static void setTag(String tag){
        InputLogger.tag = tag;
    }

    public void setLogger(String loggerName){
        logger = Logger.getLogger(loggerName);
    }

    private void incrementId(){
        id++;
    }

    public void log(String input){
        logger.info(generateLogMessage(input));
        incrementId();
    }

    private String generateLogMessage(String input){
        return String.format("id=%d => <%s>%s</%s>", id, tag, input, tag);
    }

}
