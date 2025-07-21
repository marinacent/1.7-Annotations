package level_2;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class JsonSerializer {
    private static final ObjectMapper mapper = new ObjectMapper();

    public static String serialize(Object object) {

        try {
            return mapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            // FIX THIS
            return null;
        }

    }

    public static String getJsonPath(Object object) {
        Class<?> objectClass = object.getClass();
        if (objectClass.isAnnotationPresent(JsonSerializable.class)) {
            JsonSerializable annotation = objectClass.getAnnotation(JsonSerializable.class);
            return annotation.directory();
        }
        // FIX THIS!
        return " ";
    }

    public static void saveInFile(Object object, String dir) {
        File out = new File(dir, "kdfhjdhfjhf");
        try {
            mapper.writeValue(out, object);
            // improve exception handling??
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
