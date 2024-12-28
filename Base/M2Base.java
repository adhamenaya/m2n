package Base;

import ErrorHandling.Exceptions.InvalidM2ObjectException;
import ErrorHandling.IM2ErrorHandler;
import Lifecycle.M2Phase;
import Locale.M2Locale;
import Prototype.IM2Prototype;
import Versioning.M2Version;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 * Abstract base class for managing common attributes and behaviors in the application.
 * <p>
 * The {@code M2Base} class provides a foundation for entities in the application that include
 * attributes like versioning, localization, and lifecycle phase. It also enforces validity
 * rules and incorporates cloneable behavior as well as error handling capability.
 * </p>
 */
public abstract class M2Base implements IM2Prototype, IM2ErrorHandler {

    /**
     * The versioning information associated with the object.
     */
    M2Version version;

    /**
     * The locale settings for the object.
     */
    M2Locale locale;

    /**
     * The current lifecycle phase of the object.
     */
    M2Phase phase;

    /**
     * The datetime from which the object is valid. Defaults to null.
     */
    private LocalDateTime validFrom = null;

    /**
     * The datetime until which the object is valid. Defaults to null.
     */
    private LocalDateTime validTo = null;

    /**
     * Default constructor for the {@code M2Base} class.
     */
    public M2Base() {
    }

    /**
     * Handles errors by implementing the {@link IM2ErrorHandler} interface.
     * Override this method in subclasses to define custom error-handling behavior.
     *
     * @param error The error message to be handled.
     */
    @Override
    public void handleError(String error) {
        // Default implementation, to be overridden in subclasses.
    }

    /**
     * Sets the validity period of the object.
     * <p>
     * The object is considered valid between the provided {@code validFrom} and {@code validTo} datetimes.
     * A validation exception is thrown if {@code validFrom} is after {@code validTo}.
     * </p>
     *
     * @param validFrom The start of the validity period.
     * @param validTo   The end of the validity period.
     * @throws IllegalArgumentException if {@code validFrom} is after {@code validTo}.
     */
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

    /**
     * Determines if the object is currently valid based on its validity period.
     *
     * @return {@code true} if the object is valid; otherwise {@code false}.
     * If no restrictions exist (i.e., {@code validFrom} and {@code validTo} are null), returns {@code true}.
     */
    public boolean isValid() {
        if (validFrom == null && validTo == null) return true; // open: no restrictions

        if (validFrom != null) {
            if (validFrom.isAfter(LocalDateTime.now())) return false;
        } else if (validTo != null) {
            if (validTo.isBefore(LocalDateTime.now())) return false;
        }
        return true;
    }

    /**
     * Gets the locale of the object.
     *
     * @return The {@link M2Locale} of the object.
     */
    public M2Locale getLocale() {
        return locale;
    }

    /**
     * Sets the locale for the object.
     *
     * @param locale The {@link M2Locale} instance to be set.
     */
    public void setLocale(M2Locale locale) {
        this.locale = locale;
    }

    /**
     * Gets the current version of the object.
     *
     * @return The {@link M2Version} of the object.
     */
    public M2Version getVersion() {
        return version;
    }

    /**
     * Sets the version of the object.
     *
     * @param version The {@link M2Version} instance to be set.
     */
    public void setVersion(M2Version version) {
        this.version = version;
    }

    /**
     * Gets the current lifecycle phase of the object.
     *
     * @return The {@link M2Phase} of the object.
     */
    public M2Phase getPhase() {
        return phase;
    }

    /**
     * Sets the lifecycle phase of the object.
     *
     * @param phase The {@link M2Phase} to be set.
     */
    public void setPhase(M2Phase phase) {
        this.phase = phase;
    }

    /**
     * Gets the start of the validity period.
     *
     * @return The {@link LocalDateTime} representing the start of validity.
     */
    public LocalDateTime getValidFrom() {
        return validFrom;
    }

    /**
     * Sets the start of the validity period.
     *
     * @param validFrom The datetime from which the object becomes valid.
     */
    public void setValidFrom(LocalDateTime validFrom) {
        this.validFrom = validFrom;
    }

    /**
     * Gets the end of the validity period.
     *
     * @return The {@link LocalDateTime} representing the end of validity.
     */
    public LocalDateTime getValidTo() {
        return validTo;
    }

    /**
     * Sets the end of the validity period.
     *
     * @param validTo The datetime until which the object is valid.
     */
    public void setValidTo(LocalDateTime validTo) {
        this.validTo = validTo;
    }

    /**
     * Abstract method to provide the instance of the current object.
     *
     * @return A new instance of {@link M2Base}.
     * @throws InvalidM2ObjectException if the object is invalid or cannot be instantiated.
     */
    public abstract M2Base getInstance() throws InvalidM2ObjectException;

    /**
     * Abstract method to return a clone of the current object.
     *
     * @return A clone of the current object implementing {@link IM2Prototype}.
     */
    @Override
    public abstract IM2Prototype clone();

    /**
     * Gets the unique identifier for the object.
     * <p>
     * By default, returns the class name. Subclasses should override.
     * </p>
     *
     * @return A unique identifier (default is the class name).
     */
    protected String getId() {
        return getClass().getName(); // To be overridden in subclasses
    }

    /**
     * Converts the object to a string representation.
     *
     * @return A string representation of the object.
     */
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

    /**
     * Compares this object with another {@link M2Base} for equality.
     *
     * @param o The object to compare with.
     * @return {@code true} if the objects are equal; otherwise {@code false}.
     */
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

    /**
     * Computes the hash code of the object based on its attributes.
     *
     * @return The hash code of the object.
     */
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