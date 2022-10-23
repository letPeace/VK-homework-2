import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import loggers.InputLogger;
import org.apache.log4j.PropertyConfigurator;
import org.jetbrains.annotations.NotNull;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class LoggerApplication {

    static{
        PropertyConfigurator.configure(System.getProperty("user.dir")+"\\core\\src\\main\\resources\\logger.properties");
    }

    public static void main(@NotNull String[] args){
        final Injector injector = Guice.createInjector(new LoggerModule(args[0], args[1]));
        injector.getInstance(LoggerApplication.class).waitForInput();
    }

    @Inject
    InputLogger logger;

    public void waitForInput(){
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Enter an input to log: [key in Ctrl+D to exit]");
            while(true){
                String input = scanner.nextLine();
                logger.log(input);
            }
        } catch(IllegalStateException | NoSuchElementException e){
        }
    }

}
