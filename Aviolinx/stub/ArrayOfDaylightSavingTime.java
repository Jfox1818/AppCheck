
package com.Aviolinx.stub;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDaylightSavingTime complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDaylightSavingTime">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DaylightSavingTime" type="{http://raido.aviolinx.com/api/}DaylightSavingTime" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDaylightSavingTime", propOrder = {
    "daylightSavingTime"
})
public class ArrayOfDaylightSavingTime {

    @XmlElement(name = "DaylightSavingTime", nillable = true)
    protected List<DaylightSavingTime> daylightSavingTime;

    /**
     * Gets the value of the daylightSavingTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the daylightSavingTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDaylightSavingTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DaylightSavingTime }
     * 
     * 
     */
    public List<DaylightSavingTime> getDaylightSavingTime() {
        if (daylightSavingTime == null) {
            daylightSavingTime = new ArrayList<DaylightSavingTime>();
        }
        return this.daylightSavingTime;
    }

}
