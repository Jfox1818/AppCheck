
package com.Aviolinx.stub;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConfigurationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ConfigurationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="REASON"/>
 *     &lt;enumeration value="REASON_CATEGORY"/>
 *     &lt;enumeration value="HOTEL_INFO"/>
 *     &lt;enumeration value="CREW_COMPLEMENT"/>
 *     &lt;enumeration value="REFERENCE_ACTIVITY"/>
 *     &lt;enumeration value="AIRCRAFT_TYPE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ConfigurationType")
@XmlEnum
public enum ConfigurationType {

    UNKNOWN,
    REASON,
    REASON_CATEGORY,
    HOTEL_INFO,
    CREW_COMPLEMENT,
    REFERENCE_ACTIVITY,
    AIRCRAFT_TYPE;

    public String value() {
        return name();
    }

    public static ConfigurationType fromValue(String v) {
        return valueOf(v);
    }

}
