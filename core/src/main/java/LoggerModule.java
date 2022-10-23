import com.google.inject.AbstractModule;
import com.google.inject.name.Names;
import loggers.ConsoleLogger;
import loggers.FileLogger;
import loggers.InputLogger;
import loggers.JointLogger;

public final class LoggerModule extends AbstractModule {

    private final String logType;

    public LoggerModule(String logType, String tag) {
        this.logType = logType;
        InputLogger.setTag(tag);
    }

    @Override
    protected void configure(){

        if(logType.equalsIgnoreCase("console")){
            bind(InputLogger.class).to(ConsoleLogger.class);
        } else if(logType.equalsIgnoreCase("file")){
            bind(InputLogger.class).to(FileLogger.class);
        } else if(logType.equalsIgnoreCase("joint")){
            bind(InputLogger.class).to(JointLogger.class);
        }

        bind(InputLogger.class).annotatedWith(Names.named("consoleLogger")).to(ConsoleLogger.class);
        bind(InputLogger.class).annotatedWith(Names.named("fileLogger")).to(FileLogger.class);

    }

}
