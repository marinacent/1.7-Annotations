package level_2;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JsonSerializer {
    private static final ObjectMapper mapper = new ObjectMapper();

    private static String getOutDir(Object object) {
        Class<?> objectClass = object.getClass();
        if (objectClass.isAnnotationPresent(JsonSerializable.class)) {
            JsonSerializable annotation = objectClass.getAnnotation(JsonSerializable.class);
            return annotation.directory();
        } else {
            throw new JsonSerializableAnnotationMissing(objectClass);
        }
    }

    public static void serialize(Object object, String fileName) {
        if (object == null || fileName == null) {
            throw new IllegalArgumentException();
        }
        String dir = getOutDir(object);
        DirectoryValidator.checkDirectoryExists(dir);
        File out = new File(dir, fileName + ".json");
        try {
            mapper.writeValue(out, object);
            System.out.println("Object serialized at " + out.getPath());
        } catch (IOException e) {
            throw new RuntimeException("Failed to serialize object to JSON in " + out.getAbsolutePath(), e);
        }
    }
}
