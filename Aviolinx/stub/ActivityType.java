
package com.Aviolinx.stub;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActivityType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActivityType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="FLIGHT"/>
 *     &lt;enumeration value="REFERENCEACTIVITY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActivityType")
@XmlEnum
public enum ActivityType {

    UNKNOWN,
    FLIGHT,
    REFERENCEACTIVITY;

    public String value() {
        return name();
    }

    public static ActivityType fromValue(String v) {
        return valueOf(v);
    }

}
