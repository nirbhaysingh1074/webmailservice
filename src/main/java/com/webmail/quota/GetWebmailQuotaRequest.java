//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.04 at 06:55:47 PM IST 
//


package com.webmail.quota;

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
 *         &lt;element name="webamilId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="webamilPassword" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="webamilHost" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "webamilId",
    "webamilPassword",
    "webamilHost"
})
@XmlRootElement(name = "getWebmailQuotaRequest")
public class GetWebmailQuotaRequest {

    @XmlElement(required = true)
    protected String webamilId;
    @XmlElement(required = true)
    protected String webamilPassword;
    @XmlElement(required = true)
    protected String webamilHost;

    /**
     * Gets the value of the webamilId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebamilId() {
        return webamilId;
    }

    /**
     * Sets the value of the webamilId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebamilId(String value) {
        this.webamilId = value;
    }

    /**
     * Gets the value of the webamilPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebamilPassword() {
        return webamilPassword;
    }

    /**
     * Sets the value of the webamilPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebamilPassword(String value) {
        this.webamilPassword = value;
    }

    /**
     * Gets the value of the webamilHost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebamilHost() {
        return webamilHost;
    }

    /**
     * Sets the value of the webamilHost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebamilHost(String value) {
        this.webamilHost = value;
    }

}