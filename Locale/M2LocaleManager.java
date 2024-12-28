package Locale;

import Base.M2Base;

import java.util.List;
import java.util.Map;

public class M2LocaleManager {
    private static M2LocaleManager instance;
    private static Map<M2Base, List<M2Locale>> m2BaseLocalesMap;

    private M2LocaleManager() {
    }

    public static M2LocaleManager getInstance() {
        if (instance == null) {
            instance = new M2LocaleManager();
        }
        return instance;
    }

    public List<M2Locale> getLocales(M2Base base) {
        if (m2BaseLocalesMap != null)
            if (m2BaseLocalesMap.containsKey(base)) {
                return m2BaseLocalesMap.get(base);
            }
        return null;
    }
}