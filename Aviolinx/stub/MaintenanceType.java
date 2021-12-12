
package com.Aviolinx.stub;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MaintenanceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MaintenanceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="MAINTENANCE"/>
 *     &lt;enumeration value="VEHICLEREFERENCEACTIVITY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MaintenanceType")
@XmlEnum
public enum MaintenanceType {

    UNKNOWN,
    MAINTENANCE,
    VEHICLEREFERENCEACTIVITY;

    public String value() {
        return name();
    }

    public static MaintenanceType fromValue(String v) {
        return valueOf(v);
    }

}
