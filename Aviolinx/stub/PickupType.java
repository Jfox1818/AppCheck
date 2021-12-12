
package com.Aviolinx.stub;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PickupType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PickupType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Pickup"/>
 *     &lt;enumeration value="NoPickup"/>
 *     &lt;enumeration value="Shuttle"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PickupType")
@XmlEnum
public enum PickupType {

    @XmlEnumValue("Pickup")
    PICKUP("Pickup"),
    @XmlEnumValue("NoPickup")
    NO_PICKUP("NoPickup"),
    @XmlEnumValue("Shuttle")
    SHUTTLE("Shuttle");
    private final String value;

    PickupType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PickupType fromValue(String v) {
        for (PickupType c: PickupType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
