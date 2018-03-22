package ua.lviv.iot.andriy;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class FileFruitManagerTest {

    @Test
    public void writeFruitInFile() {
        Shop shop=new Shop();
        Date date = null;
        try {
            date = new Date(12, 12, 2018);
        } catch (DateException e) {
            e.printStackTrace();
        }
        Berry blackberrie = new Berry(date, FruitColor.BLUE, 25, FruitType.BLACKBERRIE, Season.SUMMER,
                BerryLocationType.FOREST);
        shop.addFruit(new Berry(date, FruitColor.RED, 25, FruitType.STRAWBERRIE, Season.SUMMER,
                BerryLocationType.BACKYARD));
        Citrus mandarin = new Citrus(date, FruitColor.ORANGE, 36, FruitType.MANDARIN, Season.WINTER);
        Citrus lemon = new Citrus(date, FruitColor.YELLOW, 12, FruitType.LEMON, Season.WINTER);
        Citrus orange = new Citrus(date, FruitColor.ORANGE, 69, FruitType.ORANGE, Season.SUMMER);
        Customer customer = new Customer("Andriy", 18);
        shop.addFruit(blackberrie);
        shop.addFruit(mandarin);
        shop.addFruit(lemon);
        shop.addFruit(orange);
        FileFruitManager fileFruitManager=new FileFruitManager();
        try {
            fileFruitManager.writeFruitInFile(shop.getFruitList());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testScanner(){
        FileFruitManager fileFruitManager=new FileFruitManager();
        try {
            try {
               assertThat(fileFruitManager.searchFruitInFile(FruitType.ORANGE).getWeight(), is(69.0));
               assertThat(fileFruitManager.searchFruitInFile(FruitType.ORANGE).getFruitColor(), is(FruitColor.ORANGE));
            } catch (DateException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}