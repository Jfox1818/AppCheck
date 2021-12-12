
package com.Aviolinx.stub;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfExternalCrew complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfExternalCrew">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExternalCrew" type="{http://raido.aviolinx.com/api/}ExternalCrew" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfExternalCrew", propOrder = {
    "externalCrew"
})
public class ArrayOfExternalCrew {

    @XmlElement(name = "ExternalCrew", nillable = true)
    protected List<ExternalCrew> externalCrew;

    /**
     * Gets the value of the externalCrew property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the externalCrew property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExternalCrew().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExternalCrew }
     * 
     * 
     */
    public List<ExternalCrew> getExternalCrew() {
        if (externalCrew == null) {
            externalCrew = new ArrayList<ExternalCrew>();
        }
        return this.externalCrew;
    }

}
