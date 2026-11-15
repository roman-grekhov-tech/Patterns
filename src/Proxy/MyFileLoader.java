package Proxy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class MyFileLoader implements FileLoader {
    @Override
    public List<String> getFileContents() {
        Path path = Paths.get("contents.txt");
        try {
            return Files.readAllLines(path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void printFileContents() {
        List<String> fileContents = getFileContents();
        for (String line : fileContents) {
            System.out.println(line);
        }
    }
}
