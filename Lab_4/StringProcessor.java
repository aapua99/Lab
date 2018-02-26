package ua.lviv.iot.lab4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringProcessor {

    public String readInputText() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter String");
        return br.readLine();

    }

    public String processText(String inputText) {
        String result = new String();
        inputText = " " + inputText;
        List<String> stringList = new LinkedList<>();
        String pattern = "\\s+[aeuioyAEUIOY]+[a-z]*";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(inputText);
        while (m.find()) {
            stringList.add(inputText.substring(m.start(), m.end()));
        }
        stringList.sort((String o1, String o2) -> o1.compareTo(o2));
        for (String string : stringList) {
            result += string;
        }


        // do all work here
        return result;
    }

    public void showResult(String resultText) {
        System.out.println(resultText);
    }

}
