//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.04 at 06:55:47 PM IST 
//


package com.webmail.calendar;

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
 *         &lt;element name="fromfilecontent" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="tofilecontent" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
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
    "fromfilecontent",
    "tofilecontent"
})
@XmlRootElement(name = "importCalendarRequest")
public class ImportCalendarRequest {

    @XmlElement(required = true)
    protected byte[] fromfilecontent;
    @XmlElement(required = true)
    protected byte[] tofilecontent;

    /**
     * Gets the value of the fromfilecontent property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getFromfilecontent() {
        return fromfilecontent;
    }

    /**
     * Sets the value of the fromfilecontent property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setFromfilecontent(byte[] value) {
        this.fromfilecontent = value;
    }

    /**
     * Gets the value of the tofilecontent property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getTofilecontent() {
        return tofilecontent;
    }

    /**
     * Sets the value of the tofilecontent property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setTofilecontent(byte[] value) {
        this.tofilecontent = value;
    }

}
