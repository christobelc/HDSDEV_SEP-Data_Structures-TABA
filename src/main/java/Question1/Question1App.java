package Question1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Question1App {

    public static void main(String[] args) throws IOException {

        ValidateBrackets validateBrackets = new ValidateBrackets();

        String [] tempString = fileReaderConsoleOutput();
        System.out.println("This is a valid java file?: " + validateBrackets.validBrackets1(tempString));
    }

    // reads in a text file returns a array of strings

    public static String[] fileReaderConsoleOutput() throws IOException {
        BufferedReader inputStream = null;
        String dir = System.getProperty("user.dir");
        System.out.println(dir);

        ArrayList<String> list = new ArrayList<>();
        try {
            // change the .java file to test other file. I just have one test case here: test.java
            inputStream = new BufferedReader(new FileReader(dir + "/test.java"));
            String l;
            // read and print each line
            while ((l = inputStream.readLine()) != null) {
                list.add(l);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
        }
        return list.toArray(new String[0]);
    }
}
