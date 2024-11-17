package ucu.edu.decorator;

import java.time.Duration;
import java.time.LocalTime;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TimeDocument implements Document{

    private Document document;

    @Override
    public String parse(){
        LocalTime startTime = LocalTime.now();
        
        String parsed = document.parse();

        LocalTime endTime = LocalTime.now();
        System.out.println("Time: "+Duration.between(startTime, endTime).getSeconds());

        return parsed;
    }

    @Override
    public String getGcsPath() {
        // TODO Auto-generated method stub
        return document.getGcsPath();
    }
}
