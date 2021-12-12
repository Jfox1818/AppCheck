
package com.Aviolinx.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DeleteRostersResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "deleteRostersResult"
})
@XmlRootElement(name = "DeleteRostersResponse")
public class DeleteRostersResponse {

    @XmlElement(name = "DeleteRostersResult")
    protected boolean deleteRostersResult;

    /**
     * Gets the value of the deleteRostersResult property.
     * 
     */
    public boolean isDeleteRostersResult() {
        return deleteRostersResult;
    }

    /**
     * Sets the value of the deleteRostersResult property.
     * 
     */
    public void setDeleteRostersResult(boolean value) {
        this.deleteRostersResult = value;
    }

}
