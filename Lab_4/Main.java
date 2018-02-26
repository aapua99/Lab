package ua.lviv.iot.lab4;

import javax.imageio.IIOException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        StringProcessor stringProcessor=new StringProcessor();
        try {
            String text=stringProcessor.readInputText();
        stringProcessor.showResult(stringProcessor.processText(text));
        }catch (IOException e){

        }
    }
}
