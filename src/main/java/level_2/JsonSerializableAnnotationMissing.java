package level_2;

public class JsonSerializableAnnotationMissing extends RuntimeException {
    public JsonSerializableAnnotationMissing() {
        super("Annotation @JsonSerializable not present in class");
    }
}
