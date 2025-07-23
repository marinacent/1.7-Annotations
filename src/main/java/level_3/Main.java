package level_3;

import level_2.Person;

public class Main {

    public static void main(String[] args) {
        Person sophia = new Person("Sophia", "Garcia", 45);
        String sophiaName = "Sophia";

        AnnotationReader.readAnnotation(sophia);
        AnnotationReader.readAnnotation(sophiaName);
    }
}
