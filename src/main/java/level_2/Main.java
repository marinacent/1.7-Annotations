package level_2;

public class Main {
    public static void main(String[] args) {
        Person sophia = new Person("Sophia", "Garcia", 45);
        Person joan = new Person("Joan", "Pastor", 55);

        String json = JsonSerializer.serialize(sophia);
        // CHANGE HOW I DECLARE PATH!!!!!
        JsonSerializer.saveInFile(json, "src/main/out.json");
    }
}
