package level_2;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Person sophia = new Person("Sophia", "Garcia", 45);
        Person joan = new Person("Joan", "Pastor", 55);

        JsonSerializer.serialize(sophia, sophia.getName());
        JsonSerializer.serialize(joan, joan.getName());
    }
}
