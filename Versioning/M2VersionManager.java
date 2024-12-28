package Versioning;

import Base.M2Base;

import java.util.List;
import java.util.Map;

public class M2VersionManager {
    private static M2VersionManager instance;
    public Map<M2Base, List<M2Version>> m2BaseVersionsMap;

    private M2VersionManager() {
    }

    public static M2VersionManager getInstance() {
        if (instance == null) {
            instance = new M2VersionManager();
        }
        return instance;
    }

    public List<M2Version> getVersions(M2Base base) {
        if (m2BaseVersionsMap != null) {
            if (m2BaseVersionsMap.containsKey(base)) {
                return m2BaseVersionsMap.get(base);
            }
        }
        return null;
    }

    public M2Version getVersion(M2Base base) {
        if (m2BaseVersionsMap != null) {
            if (m2BaseVersionsMap.containsKey(base)) {
                return m2BaseVersionsMap.get(base).get(0);
            }
        }
        return null;
    }
}
