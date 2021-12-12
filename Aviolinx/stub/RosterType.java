
package com.Aviolinx.stub;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RosterType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RosterType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="PUBLISHED"/>
 *     &lt;enumeration value="NOT_PUBLISHED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RosterType")
@XmlEnum
public enum RosterType {

    UNKNOWN,
    PUBLISHED,
    NOT_PUBLISHED;

    public String value() {
        return name();
    }

    public static RosterType fromValue(String v) {
        return valueOf(v);
    }

}
