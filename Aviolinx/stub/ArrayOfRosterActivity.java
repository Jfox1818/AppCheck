
package com.Aviolinx.stub;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfRosterActivity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRosterActivity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RosterActivity" type="{http://raido.aviolinx.com/api/}RosterActivity" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRosterActivity", propOrder = {
    "rosterActivity"
})
public class ArrayOfRosterActivity {

    @XmlElement(name = "RosterActivity", nillable = true)
    protected List<RosterActivity> rosterActivity;

    /**
     * Gets the value of the rosterActivity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rosterActivity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRosterActivity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RosterActivity }
     * 
     * 
     */
    public List<RosterActivity> getRosterActivity() {
        if (rosterActivity == null) {
            rosterActivity = new ArrayList<RosterActivity>();
        }
        return this.rosterActivity;
    }

}
