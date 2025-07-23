package level_2;

public class JsonSerializableAnnotationMissing extends RuntimeException {
    public JsonSerializableAnnotationMissing(Class<?> javaClass) {
        super("Annotation @JsonSerializable not present in class " + javaClass.getName());
    }
}
