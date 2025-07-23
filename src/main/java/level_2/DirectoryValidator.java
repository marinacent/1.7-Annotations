package level_2;

import java.nio.file.Files;
import java.nio.file.Paths;

public class DirectoryValidator {

    public static void checkDirectoryExists(String dirPath) {
        if (!(Files.isDirectory(Paths.get(dirPath)))) {
            throw new IllegalArgumentException(String.format("%s is not an existing directory", dirPath));
        }
    }
}
