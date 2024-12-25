package RemoteFunctions;

public class M2RemoteFunctionsEngine {
    private static M2RemoteFunctionsEngine instance;

    private M2RemoteFunctionsEngine() {}

    public static M2RemoteFunctionsEngine getInstance() {
        if (instance == null) {
            instance = new M2RemoteFunctionsEngine();
        }
        return instance;
    }

    // methods for managing remote functions such as send emails!!
}
