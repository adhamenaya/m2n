package RulesEngine;

public class M2RulesEngine {
    private static M2RulesEngine instance;

    private M2RulesEngine(){
        // private constructor
    }

    public static M2RulesEngine getInstance(){
        if(instance == null){
            instance = new M2RulesEngine();
        }
        return instance;
    }

    // methods for managing rules
}
