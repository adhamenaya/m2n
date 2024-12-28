package Logging;

public class M2LoggingManager{
    private static M2LoggingManager instance;
    private M2LoggingManager() {
        instance = new M2LoggingManager();
    }

    public static M2LoggingManager getInstance(){
        if(instance == null){
            instance = new M2LoggingManager();
        }
        return instance;
    }
}
