
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
 *         &lt;element name="Username" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ScheduleRequestFilter" type="{http://raido.aviolinx.com/api/}ScheduleRequestFilter"/>
 *         &lt;element name="ScheduleRequestData" type="{http://raido.aviolinx.com/api/}ScheduleRequestData"/>
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
    "username",
    "password",
    "scheduleRequestFilter",
    "scheduleRequestData"
})
@XmlRootElement(name = "GetSchedules")
public class GetSchedules {

    @XmlElement(name = "Username", required = true, nillable = true)
    protected String username;
    @XmlElement(name = "Password", required = true, nillable = true)
    protected String password;
    @XmlElement(name = "ScheduleRequestFilter", required = true, nillable = true)
    protected ScheduleRequestFilter scheduleRequestFilter;
    @XmlElement(name = "ScheduleRequestData", required = true, nillable = true)
    protected ScheduleRequestData scheduleRequestData;

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the scheduleRequestFilter property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleRequestFilter }
     *     
     */
    public ScheduleRequestFilter getScheduleRequestFilter() {
        return scheduleRequestFilter;
    }

    /**
     * Sets the value of the scheduleRequestFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleRequestFilter }
     *     
     */
    public void setScheduleRequestFilter(ScheduleRequestFilter value) {
        this.scheduleRequestFilter = value;
    }

    /**
     * Gets the value of the scheduleRequestData property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleRequestData }
     *     
     */
    public ScheduleRequestData getScheduleRequestData() {
        return scheduleRequestData;
    }

    /**
     * Sets the value of the scheduleRequestData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleRequestData }
     *     
     */
    public void setScheduleRequestData(ScheduleRequestData value) {
        this.scheduleRequestData = value;
    }

}
