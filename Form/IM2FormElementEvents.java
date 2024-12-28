package Form;

public interface IM2FormElementEvents {
    boolean save();

    boolean load();

    boolean delete();

    boolean update(Object value);

    boolean validate();

    void render();

    boolean isEmpty();

    boolean isValid();
}
