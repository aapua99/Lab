package ua.lviv.iot.andriy;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileFruitManager {
    FileFruitManager() {

    }

    public final void writeFruitInFile(final Map<Integer,Fruit> list) throws IOException {
        try (FileWriter fileWriter = new FileWriter("fruit.csv")) {
            for (Map.Entry<Integer,Fruit> fruit : list.entrySet()) {
                fileWriter.write(fruit.getValue().getName().toString() + "\n");
                fileWriter.write(fruit.getValue().toString() + "\n");
            }
        } catch (IOException e) {
            throw e;
        }
    }

    public final Fruit searchFruitInFile(final FruitType fruitType) throws IOException, DateException {
        try (FileReader fileReader = new FileReader("fruit.csv");
                Scanner scanner=new Scanner(fileReader)){
            while (scanner.hasNextLine()) {
                if (scanner.nextLine().equals(fruitType.toString())) {
                    String fruitString = scanner.nextLine();
                    return processString(fruitString, fruitType);

                }
            }
        } catch(IOException e){
        }
        return null;
    }

    public final Fruit processString(final String fruitString, final FruitType fruitType) throws DateException {
        Pattern p = Pattern.compile("[a-zA-Z0-9]+");
        Matcher m = p.matcher(fruitString);
        List<String> list = new LinkedList<>();
        while (m.find()) {
            list.add(fruitString.substring(m.start(), m.end()));
        }
        Date date = new Date(Integer.valueOf(list.get(2)), Integer.valueOf(list.get(3)), Integer.valueOf(list.get(4)));
        Fruit fruit = new Fruit(fruitType, date, FruitColor.valueOf(list.get(7)), Double.valueOf(list.get(9) + "." + list.get(10)), Season.valueOf(list.get(12)));

        return fruit;
    }
}
