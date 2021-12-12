
package com.Aviolinx.stub;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSlotLevel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSlotLevel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SlotLevel" type="{http://raido.aviolinx.com/api/}SlotLevel" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSlotLevel", propOrder = {
    "slotLevel"
})
public class ArrayOfSlotLevel {

    @XmlElement(name = "SlotLevel", nillable = true)
    protected List<SlotLevel> slotLevel;

    /**
     * Gets the value of the slotLevel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the slotLevel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSlotLevel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SlotLevel }
     * 
     * 
     */
    public List<SlotLevel> getSlotLevel() {
        if (slotLevel == null) {
            slotLevel = new ArrayList<SlotLevel>();
        }
        return this.slotLevel;
    }

}
