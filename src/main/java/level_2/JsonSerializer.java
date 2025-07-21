package level_2;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

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

    public static void saveInFile(String json, String outPath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outPath))) {
            writer.write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
