package org.exceptionHandling.FileHandling;

import javax.imageio.IIOException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class createFile {
    public static void main(String[] args) throws IOException {
        File file = new File("temp.txt");
        
        try {
            file.createNewFile();
            System.out.println("File created");

            file.delete();
            //file.renameTo(new File("test.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
