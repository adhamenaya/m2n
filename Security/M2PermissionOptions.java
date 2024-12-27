package Security;

public enum M2PermissionOptions {
    READ("allows viewing data"),
    WRITE("allows adding new data"),
    UPDATE("allows updating existing data"),
    DELETE("allows deleting existing data");

    private final String description;

    M2PermissionOptions(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
