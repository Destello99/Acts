package utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class IoUtil {
    public static void mapEntry(String fileName) throws IOException {
        File newFile = new File("Map.txt");
        try (BufferedWriter br = new BufferedWriter(new FileWriter(fileName))) {

        }
    }
}
