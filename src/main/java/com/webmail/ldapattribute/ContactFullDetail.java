//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.04 at 06:55:47 PM IST 
//


package com.webmail.ldapattribute;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContactFullDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactFullDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContactEmail" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ContactPhoto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ContactName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ContactMobile" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ContactHomePhone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ContactTel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ContactAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ContactDept" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactFullDetail", propOrder = {
    "contactEmail",
    "contactPhoto",
    "contactName",
    "contactMobile",
    "contactHomePhone",
    "contactTel",
    "contactAddress",
    "contactDept"
})
public class ContactFullDetail {

    @XmlElement(name = "ContactEmail", required = true)
    protected String contactEmail;
    @XmlElement(name = "ContactPhoto", required = true)
    protected String contactPhoto;
    @XmlElement(name = "ContactName", required = true)
    protected String contactName;
    @XmlElement(name = "ContactMobile", required = true)
    protected String contactMobile;
    @XmlElement(name = "ContactHomePhone", required = true)
    protected String contactHomePhone;
    @XmlElement(name = "ContactTel", required = true)
    protected String contactTel;
    @XmlElement(name = "ContactAddress", required = true)
    protected String contactAddress;
    @XmlElement(name = "ContactDept", required = true)
    protected String contactDept;

    /**
     * Gets the value of the contactEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactEmail() {
        return contactEmail;
    }

    /**
     * Sets the value of the contactEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactEmail(String value) {
        this.contactEmail = value;
    }

    /**
     * Gets the value of the contactPhoto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactPhoto() {
        return contactPhoto;
    }

    /**
     * Sets the value of the contactPhoto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactPhoto(String value) {
        this.contactPhoto = value;
    }

    /**
     * Gets the value of the contactName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * Sets the value of the contactName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactName(String value) {
        this.contactName = value;
    }

    /**
     * Gets the value of the contactMobile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactMobile() {
        return contactMobile;
    }

    /**
     * Sets the value of the contactMobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactMobile(String value) {
        this.contactMobile = value;
    }

    /**
     * Gets the value of the contactHomePhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactHomePhone() {
        return contactHomePhone;
    }

    /**
     * Sets the value of the contactHomePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactHomePhone(String value) {
        this.contactHomePhone = value;
    }

    /**
     * Gets the value of the contactTel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactTel() {
        return contactTel;
    }

    /**
     * Sets the value of the contactTel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactTel(String value) {
        this.contactTel = value;
    }

    /**
     * Gets the value of the contactAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactAddress() {
        return contactAddress;
    }

    /**
     * Sets the value of the contactAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactAddress(String value) {
        this.contactAddress = value;
    }

    /**
     * Gets the value of the contactDept property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactDept() {
        return contactDept;
    }

    /**
     * Sets the value of the contactDept property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactDept(String value) {
        this.contactDept = value;
    }

}
