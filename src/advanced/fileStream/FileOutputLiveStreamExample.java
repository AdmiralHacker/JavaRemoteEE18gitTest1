package advanced.fileStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputLiveStreamExample {
    public static void main(String[] args) throws IOException {

        String test ="Output test";

        FileOutputStream out = new FileOutputStream("Data\\Output.txt");


        for (char ch:test.toCharArray() ){

            out.write(ch);

        }



    }
}
