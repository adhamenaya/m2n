package Base;

import ErrorHandling.Exceptions.InvalidM2ObjectException;
import ErrorHandling.IM2ErrorHandler;
import Lifecycle.M2Phase;
import Locale.M2Locale;
import Logging.M2Log;
import Prototype.IM2Prototype;
import Security.M2User;
import Versioning.M2Version;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

public abstract class M2Base implements IM2Prototype, IM2ErrorHandler {


    M2Version version;
    M2Locale locale;

    private List<M2Log> changes;

    @M2LegacyName(ids = {"Instrument.InstrumentStatusID"})
    M2Phase phase;

    @M2LegacyName(ids = {"Instrument.ValidFromDate"})
    private LocalDateTime validFrom = null;

    @M2LegacyName(ids = {"Instrument.ValidToDate"})
    private LocalDateTime validTo = null;

    @M2LegacyName(ids = {"Instrument.InstrumentID", ""})
    private long id;

    @M2LegacyName(ids = {"Instrument.ExternalID"})
    private String externalId;

    @M2LegacyName(ids = {"Instrument.Description"})
    private String description;

    @M2LegacyName(ids = {"Instrument.Notes"})
    private String notes;

    @M2LegacyName(ids = {"Instrument.OwnerClientID"})
    private M2User phaseOwner;

    @M2LegacyName(ids = {"Instrument.CreatedByUserID"})
    private M2User createdBy;
    @M2LegacyName(ids = {"Instrument.DateCreated"})
    private LocalDateTime creationDate;
    @M2LegacyName(ids = {"Instrument.DateLastUpdated"})
    private LocalDateTime updateDate;

    public M2Base() {
    }

    @Override
    public void handleError(String error) {
        // Default implementation, to be overridden in subclasses.
    }

    public void setValidityDateTime(LocalDateTime validFrom, LocalDateTime validTo) {
        if (validFrom != null && validTo != null) {
            if (validFrom.isBefore(validTo)) {
                this.validFrom = validFrom;
                this.validTo = validTo;
            } else {
                throw new IllegalArgumentException("End date can't be before start date!");
            }
        }
    }

    @M2LegacyName(ids = {"Instrument.IsValid"})
    public boolean isValid() {
        if (validFrom == null && validTo == null) return true; // open: no restrictions

        if (validFrom != null) {
            if (validFrom.isAfter(LocalDateTime.now())) return false;
        } else if (validTo != null) {
            if (validTo.isBefore(LocalDateTime.now())) return false;
        }
        return true;
    }

    public M2Locale getLocale() {
        return locale;
    }

    public void setLocale(M2Locale locale) {
        this.locale = locale;
    }

    public M2Version getVersion() {
        return version;
    }

    public void setVersion(M2Version version) {
        this.version = version;
    }

    public M2Phase getPhase() {
        return phase;
    }

    public void setPhase(M2Phase phase) {
        this.phase = phase;
    }

    public LocalDateTime getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(LocalDateTime validFrom) {
        this.validFrom = validFrom;
    }

    public LocalDateTime getValidTo() {
        return validTo;
    }

    public void setValidTo(LocalDateTime validTo) {
        this.validTo = validTo;
    }

    public abstract M2Base getInstance() throws InvalidM2ObjectException;

    @Override
    public abstract IM2Prototype clone();

    protected String getId() {
        return getClass().getName(); // To be overridden in subclasses
    }

    @Override
    public String toString() {
        return "M2Base{" +
                "class=" + this.getClass().getName() +
                ", version=" + version +
                ", locale=" + locale +
                ", phase=" + phase +
                ", validFrom=" + validFrom +
                ", validTo=" + validTo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        M2Base m2Base = (M2Base) o;
        return Objects.equals(getId(), m2Base.getId())
                && Objects.equals(getVersion(), m2Base.getVersion())
                && Objects.equals(getLocale(), m2Base.getLocale())
                && Objects.equals(getPhase(), m2Base.getPhase())
                && Objects.equals(getValidFrom(), m2Base.getValidFrom())
                && Objects.equals(getValidTo(), m2Base.getValidTo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(),
                getVersion(),
                getLocale(),
                getPhase(),
                getValidFrom(),
                getValidTo());
    }
}