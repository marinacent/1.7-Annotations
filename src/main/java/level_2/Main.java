package level_2;

public class Main {
    public static void main(String[] args) {
        Person sophia = new Person("Sophia", "Garcia", 45);
        Person joan = new Person("Joan", "Pastor", 55);

        try {
            JsonSerializer.serialize(sophia, sophia.getName());
            JsonSerializer.serialize(joan, joan.getName());
        } catch (RuntimeException e) {
            System.err.println("Serialization failed: " + e.getMessage());
        }
    }
}
