/*
 * Copyright (c) 2024. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package M2Inquiry;

import Base.M2Base;
import Base.M2LegacyName;
import ErrorHandling.Exceptions.InvalidM2ObjectException;
import Lifecycle.M2Phase;
import Prototype.IM2Prototype;
import Security.M2User;
import Versioning.M2Version;

import java.time.LocalDateTime;

@M2LegacyName(ids = {"InstrumentInquiry"})
public class M2Inquiry extends M2Base {

    @M2LegacyName(ids = {"InstrumentInquiry.QuestionDate"})
    protected LocalDateTime creationDate;
    @M2LegacyName(ids = {"InstrumentInquiry.Question"})
    private String question;
    @M2LegacyName(ids = {"InstrumentInquiry.QuestionUserID"})
    protected M2User ownerUser;
    @M2LegacyName(ids = {"InstrumentInquiry.InquiryStatusID"})
    protected M2Phase phase;
    @M2LegacyName(ids = {"InstrumentInquiry.SequenceNumber"})
    protected M2Version version;
    @M2LegacyName(ids = {"InstrumentInquiry.IsUrgent"})
    private boolean isUrgent;
    @M2LegacyName(ids = {"InstrumentInquiry.DateClosedOrCancelled"})
    private LocalDateTime closedDate;
    @M2LegacyName(ids = {"InstrumentInquiry.SendEmail"})
    private boolean sendEmail;

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
