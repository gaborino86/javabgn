package readandwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ReadAndWriteFile {

    public List<String> readFromFile(Path path) {
        try {
            List<String> namesFromFile = Files.readAllLines(path);
            return namesFromFile;
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

    public void writeToFile(Path path) {
        List<String> names = readFromFile(Path.of("src/main/resources/fridge.txt"));
        try {
            names.add("Kecskesajt");
            names.add("Dinnye");
            Files.write(path, names);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not write file", ioe);
        }
    }

    public static void main(String[] args) {
        ReadAndWriteFile r =new ReadAndWriteFile();
        Path path = Path.of("src/main/resources/fridge.txt");
        r.writeToFile(path);
    }
}
