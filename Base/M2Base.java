package Base;

import ErrorHandling.IM2ErrorHandler;
import Lifecycle.M2Phase;
import Locale.M2Locale;
import Prototype.IM2Prototype;
import Security.M2PermissionOptions;
import Versioning.M2Version;

import java.time.LocalDateTime;

public class M2Base implements IM2Prototype, IM2ErrorHandler {

    M2Version version;
    M2Locale locale;
    M2PermissionOptions permission;
    M2Phase phase;

    private LocalDateTime validFrom = null;  // Corrected to LocalDateTime
    private LocalDateTime validTo = null;    // Fixed spelling of variable name

    public M2Base() {}

    @Override
    public IM2Prototype clone() {
        M2Base clone = new M2Base();
        // complete the logic and return
        return clone;
    }

    @Override
    public void handleError(String error) {

    }

    public void setValidityDateTime(LocalDateTime validFrom, LocalDateTime validTo) {
        if (validFrom != null && validTo != null) {
            if (validFrom.isBefore(validTo)) {
                this.validFrom = validFrom;
                this.validTo = validTo;
            }else{
                throw new IllegalArgumentException("End date can't be before start date!");
            }
        }
    }

    public boolean isActive() {
        if (validFrom == null && validTo == null) return true; // open: no restrictions

        if (validFrom != null) {
            if (validFrom.isAfter(LocalDateTime.now())) return false;
        }
        else if (validTo != null) {
                if (validTo.isBefore(LocalDateTime.now())) return false;
        }
        return true;
    }
}
