package Locale;

import Base.M2Base;
import Base.M2LegacyName;
import ErrorHandling.Exceptions.InvalidM2ObjectException;
import Prototype.IM2Prototype;

@M2LegacyName (ids = {"Instrument_Locale"})
public class M2Locale extends M2Base {

    @M2LegacyName(ids = {"Instrument_Locale.UILanguage"})
    String language;
    @M2LegacyName(ids = {"Instrument_Locale.DisplayText"})
    String text;

    @Override
    public M2Base getInstance() throws InvalidM2ObjectException {
        return null;
    }

    @Override
    public IM2Prototype clone() {
        return null;
    }
}