
package com.Aviolinx.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ContractsData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContractsData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EmploymentDate1" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="EmploymentDate2" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="EmploymentDate3" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Contracts" type="{http://raido.aviolinx.com/api/}ArrayOfContract" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractsData", propOrder = {
    "employmentDate1",
    "employmentDate2",
    "employmentDate3",
    "contracts"
})
public class ContractsData {

    @XmlElement(name = "EmploymentDate1", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar employmentDate1;
    @XmlElement(name = "EmploymentDate2", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar employmentDate2;
    @XmlElement(name = "EmploymentDate3", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar employmentDate3;
    @XmlElement(name = "Contracts")
    protected ArrayOfContract contracts;

    /**
     * Gets the value of the employmentDate1 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEmploymentDate1() {
        return employmentDate1;
    }

    /**
     * Sets the value of the employmentDate1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEmploymentDate1(XMLGregorianCalendar value) {
        this.employmentDate1 = value;
    }

    /**
     * Gets the value of the employmentDate2 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEmploymentDate2() {
        return employmentDate2;
    }

    /**
     * Sets the value of the employmentDate2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEmploymentDate2(XMLGregorianCalendar value) {
        this.employmentDate2 = value;
    }

    /**
     * Gets the value of the employmentDate3 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEmploymentDate3() {
        return employmentDate3;
    }

    /**
     * Sets the value of the employmentDate3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEmploymentDate3(XMLGregorianCalendar value) {
        this.employmentDate3 = value;
    }

    /**
     * Gets the value of the contracts property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfContract }
     *     
     */
    public ArrayOfContract getContracts() {
        return contracts;
    }

    /**
     * Sets the value of the contracts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfContract }
     *     
     */
    public void setContracts(ArrayOfContract value) {
        this.contracts = value;
    }

}
