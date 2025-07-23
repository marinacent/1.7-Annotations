package level_2;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class JsonSerializer {
    private static final ObjectMapper mapper = new ObjectMapper();

    public static String getOutDir(Object object) {
        Class<?> objectClass = object.getClass();
        if (objectClass.isAnnotationPresent(JsonSerializable.class)) {
            JsonSerializable annotation = objectClass.getAnnotation(JsonSerializable.class);
            return annotation.directory();
        } else {
            throw new JsonSerializableAnnotationMissing();
        }
    }

    public static void serialize(Object object) {
        String dir = getOutDir(object);
        File out = new File(dir, "kdfhjdhfjhf");
        try {
            mapper.writeValue(out, object);
            // improve exception handling??
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
