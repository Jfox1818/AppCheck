
package com.Aviolinx.stub;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAccumulatedValueLabel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAccumulatedValueLabel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccumulatedValueLabel" type="{http://raido.aviolinx.com/api/}AccumulatedValueLabel" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAccumulatedValueLabel", propOrder = {
    "accumulatedValueLabel"
})
public class ArrayOfAccumulatedValueLabel {

    @XmlElement(name = "AccumulatedValueLabel", nillable = true)
    protected List<AccumulatedValueLabel> accumulatedValueLabel;

    /**
     * Gets the value of the accumulatedValueLabel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accumulatedValueLabel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccumulatedValueLabel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccumulatedValueLabel }
     * 
     * 
     */
    public List<AccumulatedValueLabel> getAccumulatedValueLabel() {
        if (accumulatedValueLabel == null) {
            accumulatedValueLabel = new ArrayList<AccumulatedValueLabel>();
        }
        return this.accumulatedValueLabel;
    }

}
