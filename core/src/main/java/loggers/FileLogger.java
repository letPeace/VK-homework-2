package loggers;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileLogger extends InputLogger{

    @Override
    public void log(String input){
        try{
            String filePath = System.getProperty("user.dir")+"\\core\\src\\main\\resources\\logs.txt";
            FileWriter fileWriter = new FileWriter(filePath, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(generateLogMessage(input)+"\n"); // use logger here
            incrementId();
            bufferedWriter.close();
            fileWriter.close();
            System.out.println("Input was successfully logged to the file!"); // use logger here
        } catch(IOException e){
            e.printStackTrace();
        }
    }

}
