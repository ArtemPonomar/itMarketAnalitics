package com.ponomar.itMarketAnalytics.sevice;

import org.springframework.stereotype.Service;

import java.io.FileWriter;
import java.io.IOException;

@Service
public class FileService {

    public void writeToFile(String string){
        try {
            FileWriter fileWriter = new FileWriter("RawData.txt",true);
            fileWriter.write(string);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
