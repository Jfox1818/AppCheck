
package com.Aviolinx.stub;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfStationFacility complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfStationFacility">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StationFacility" type="{http://raido.aviolinx.com/api/}StationFacility" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfStationFacility", propOrder = {
    "stationFacility"
})
public class ArrayOfStationFacility {

    @XmlElement(name = "StationFacility", nillable = true)
    protected List<StationFacility> stationFacility;

    /**
     * Gets the value of the stationFacility property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stationFacility property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStationFacility().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StationFacility }
     * 
     * 
     */
    public List<StationFacility> getStationFacility() {
        if (stationFacility == null) {
            stationFacility = new ArrayList<StationFacility>();
        }
        return this.stationFacility;
    }

}
