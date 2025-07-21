package level_2;

public class Main {
    public static void main(String[] args) {
        Person sophia = new Person("Sophia", "Garcia", 45);
        Person joan = new Person("Joan", "Pastor", 55);

        JsonSerializer.serialize(sophia);
    }
}
