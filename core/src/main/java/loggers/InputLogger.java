package loggers;

public abstract class InputLogger {

    private static Long id = 0L;
    private static String tag;

    public static void setTag(String tag){
        InputLogger.tag = tag;
    }

    protected static void incrementId(){
        id++;
    }

    public abstract void log(String input);

    public String generateLogMessage(String input){
        return String.format("id=%d => <%s>%s</%s>", id, tag, input, tag);
    }

}
