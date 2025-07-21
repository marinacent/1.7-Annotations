package level_3;

import level_2.JsonSerializable;

public class AnnotationReader {

    public static void readAnnotation(Object object) {
        Class<?> objectClass = object.getClass();
        if (objectClass.isAnnotationPresent(JsonSerializable.class)) {
            JsonSerializable annotation = objectClass.getAnnotation(JsonSerializable.class);
            System.out.println("Annotation @JsonSerializable found");
            System.out.println("Directory specified in annotation: " + annotation.directory());
            System.out.println();
        } else {
            System.out.println("Class does not have annotation @JsonSerializable");
            System.out.println();
        }
    }
}
