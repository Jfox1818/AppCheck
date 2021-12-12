
package com.Aviolinx.stub;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCrewComplement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCrewComplement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CrewComplement" type="{http://raido.aviolinx.com/api/}CrewComplement" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCrewComplement", propOrder = {
    "crewComplement"
})
public class ArrayOfCrewComplement {

    @XmlElement(name = "CrewComplement", nillable = true)
    protected List<CrewComplement> crewComplement;

    /**
     * Gets the value of the crewComplement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the crewComplement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCrewComplement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CrewComplement }
     * 
     * 
     */
    public List<CrewComplement> getCrewComplement() {
        if (crewComplement == null) {
            crewComplement = new ArrayList<CrewComplement>();
        }
        return this.crewComplement;
    }

}
