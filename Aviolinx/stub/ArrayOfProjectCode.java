
package com.Aviolinx.stub;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfProjectCode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfProjectCode">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProjectCode" type="{http://raido.aviolinx.com/api/}ProjectCode" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfProjectCode", propOrder = {
    "projectCode"
})
public class ArrayOfProjectCode {

    @XmlElement(name = "ProjectCode", nillable = true)
    protected List<ProjectCode> projectCode;

    /**
     * Gets the value of the projectCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the projectCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProjectCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProjectCode }
     * 
     * 
     */
    public List<ProjectCode> getProjectCode() {
        if (projectCode == null) {
            projectCode = new ArrayList<ProjectCode>();
        }
        return this.projectCode;
    }

}
