package Form.ElementType;

public interface IM2FormElementManager {
    boolean save();
    boolean load();
    boolean delete();
    boolean update();
    boolean validate();
    void render();
    boolean isEmpty();
    boolean isValid();
}
