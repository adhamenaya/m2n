package Attributes;

import Base.M2Base;
import ErrorHandling.Exceptions.InvalidM2ObjectException;
import Prototype.IM2Prototype;

public class M2Attributes extends M2Base {
    private String key;
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public M2Base getInstance() throws InvalidM2ObjectException {
        return null;
    }

    @Override
    public IM2Prototype clone() {
        return null;
    }
}
