
package com.Aviolinx.stub;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfStationFacilityAttribute complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfStationFacilityAttribute">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StationFacilityAttribute" type="{http://raido.aviolinx.com/api/}StationFacilityAttribute" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfStationFacilityAttribute", propOrder = {
    "stationFacilityAttribute"
})
public class ArrayOfStationFacilityAttribute {

    @XmlElement(name = "StationFacilityAttribute", nillable = true)
    protected List<StationFacilityAttribute> stationFacilityAttribute;

    /**
     * Gets the value of the stationFacilityAttribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stationFacilityAttribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStationFacilityAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StationFacilityAttribute }
     * 
     * 
     */
    public List<StationFacilityAttribute> getStationFacilityAttribute() {
        if (stationFacilityAttribute == null) {
            stationFacilityAttribute = new ArrayList<StationFacilityAttribute>();
        }
        return this.stationFacilityAttribute;
    }

}
