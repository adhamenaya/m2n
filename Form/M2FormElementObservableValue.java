package Form;

import Base.M2Base;
import Base.M2LegacyName;
import ErrorHandling.Exceptions.InvalidM2ObjectException;
import Prototype.IM2Prototype;
import org.xml.sax.Locator;

import java.time.LocalDateTime;

@M2LegacyName(ids = {"InstrumentObservable"})
public class M2FormElementObservableValue extends M2FormElementValue  {

    @M2LegacyName(ids = {"MeasureValues"})
    private M2FormElementValue value;
    @M2LegacyName(ids = {"StartDateTime"})
    private LocalDateTime startDateTime;
    @M2LegacyName(ids = {"EndDateTime"})
    private LocalDateTime endDateTime;

    /**
     * @return
     * @throws InvalidM2ObjectException
     */
    @Override
    public M2Base getInstance() throws InvalidM2ObjectException {
        return null;
    }

    /**
     * @return
     */
    @Override
    public IM2Prototype clone() {
        return null;
    }
}