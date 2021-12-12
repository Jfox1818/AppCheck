
package com.Aviolinx.stub;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCrewComplementDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCrewComplementDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CrewComplementDetail" type="{http://raido.aviolinx.com/api/}CrewComplementDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCrewComplementDetail", propOrder = {
    "crewComplementDetail"
})
public class ArrayOfCrewComplementDetail {

    @XmlElement(name = "CrewComplementDetail", nillable = true)
    protected List<CrewComplementDetail> crewComplementDetail;

    /**
     * Gets the value of the crewComplementDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the crewComplementDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCrewComplementDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CrewComplementDetail }
     * 
     * 
     */
    public List<CrewComplementDetail> getCrewComplementDetail() {
        if (crewComplementDetail == null) {
            crewComplementDetail = new ArrayList<CrewComplementDetail>();
        }
        return this.crewComplementDetail;
    }

}
