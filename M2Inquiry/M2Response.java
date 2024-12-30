/*
 * Copyright (c) 2024. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package M2Inquiry;

import Base.M2LegacyName;
import Security.M2User;

import java.time.LocalDateTime;

public class M2Response extends M2Inquiry {
    @M2LegacyName(ids = {"InstrumentResponse.Response"})
    private String response;
    @M2LegacyName(ids = {"InstrumentResponse.ResponseUserID"})
    protected M2User ownerUSer;
    @M2LegacyName(ids = {"InstrumentResponse.ResponseDate"})
    protected LocalDateTime creationDate;

    public M2Response() {
    }
}
