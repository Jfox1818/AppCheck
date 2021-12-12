
package com.Aviolinx.stub;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccumulatedValuesRequestDataType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AccumulatedValuesRequestDataType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="HumanResource"/>
 *     &lt;enumeration value="Vehicle"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AccumulatedValuesRequestDataType")
@XmlEnum
public enum AccumulatedValuesRequestDataType {

    @XmlEnumValue("HumanResource")
    HUMAN_RESOURCE("HumanResource"),
    @XmlEnumValue("Vehicle")
    VEHICLE("Vehicle");
    private final String value;

    AccumulatedValuesRequestDataType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccumulatedValuesRequestDataType fromValue(String v) {
        for (AccumulatedValuesRequestDataType c: AccumulatedValuesRequestDataType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
