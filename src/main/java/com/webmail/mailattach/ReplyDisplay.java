//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.04 at 06:55:47 PM IST 
//


package com.webmail.mailattach;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReplyDisplay complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReplyDisplay">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ToId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ReplyToId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FromId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CCId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BCCId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Subject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SendDtae" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SendDtaeTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MailContent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AttachStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inlineimgsize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="messageID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="references" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AttachmentNameList" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AttachmentNewNameList" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AttachmentSizeList" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReplyDisplay", propOrder = {
    "toId",
    "replyToId",
    "fromId",
    "ccId",
    "bccId",
    "subject",
    "sendDtae",
    "sendDtaeTitle",
    "mailContent",
    "attachStatus",
    "inlineimgsize",
    "messageID",
    "references",
    "attachmentNameList",
    "attachmentNewNameList",
    "attachmentSizeList"
})
public class ReplyDisplay {

    @XmlElement(name = "ToId")
    protected List<String> toId;
    @XmlElement(name = "ReplyToId")
    protected String replyToId;
    @XmlElement(name = "FromId")
    protected String fromId;
    @XmlElement(name = "CCId")
    protected List<String> ccId;
    @XmlElement(name = "BCCId")
    protected List<String> bccId;
    @XmlElement(name = "Subject")
    protected String subject;
    @XmlElement(name = "SendDtae")
    protected String sendDtae;
    @XmlElement(name = "SendDtaeTitle")
    protected String sendDtaeTitle;
    @XmlElement(name = "MailContent")
    protected String mailContent;
    @XmlElement(name = "AttachStatus")
    protected String attachStatus;
    protected String inlineimgsize;
    protected String messageID;
    protected String references;
    @XmlElement(name = "AttachmentNameList")
    protected List<String> attachmentNameList;
    @XmlElement(name = "AttachmentNewNameList")
    protected List<String> attachmentNewNameList;
    @XmlElement(name = "AttachmentSizeList")
    protected List<String> attachmentSizeList;

    /**
     * Gets the value of the toId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the toId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getToId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getToId() {
        if (toId == null) {
            toId = new ArrayList<String>();
        }
        return this.toId;
    }

    /**
     * Gets the value of the replyToId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplyToId() {
        return replyToId;
    }

    /**
     * Sets the value of the replyToId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplyToId(String value) {
        this.replyToId = value;
    }

    /**
     * Gets the value of the fromId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromId() {
        return fromId;
    }

    /**
     * Sets the value of the fromId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromId(String value) {
        this.fromId = value;
    }

    /**
     * Gets the value of the ccId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ccId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCCId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCCId() {
        if (ccId == null) {
            ccId = new ArrayList<String>();
        }
        return this.ccId;
    }

    /**
     * Gets the value of the bccId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bccId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBCCId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBCCId() {
        if (bccId == null) {
            bccId = new ArrayList<String>();
        }
        return this.bccId;
    }

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubject(String value) {
        this.subject = value;
    }

    /**
     * Gets the value of the sendDtae property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendDtae() {
        return sendDtae;
    }

    /**
     * Sets the value of the sendDtae property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendDtae(String value) {
        this.sendDtae = value;
    }

    /**
     * Gets the value of the sendDtaeTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendDtaeTitle() {
        return sendDtaeTitle;
    }

    /**
     * Sets the value of the sendDtaeTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendDtaeTitle(String value) {
        this.sendDtaeTitle = value;
    }

    /**
     * Gets the value of the mailContent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailContent() {
        return mailContent;
    }

    /**
     * Sets the value of the mailContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailContent(String value) {
        this.mailContent = value;
    }

    /**
     * Gets the value of the attachStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttachStatus() {
        return attachStatus;
    }

    /**
     * Sets the value of the attachStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttachStatus(String value) {
        this.attachStatus = value;
    }

    /**
     * Gets the value of the inlineimgsize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInlineimgsize() {
        return inlineimgsize;
    }

    /**
     * Sets the value of the inlineimgsize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInlineimgsize(String value) {
        this.inlineimgsize = value;
    }

    /**
     * Gets the value of the messageID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageID() {
        return messageID;
    }

    /**
     * Sets the value of the messageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageID(String value) {
        this.messageID = value;
    }

    /**
     * Gets the value of the references property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferences() {
        return references;
    }

    /**
     * Sets the value of the references property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferences(String value) {
        this.references = value;
    }

    /**
     * Gets the value of the attachmentNameList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachmentNameList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttachmentNameList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAttachmentNameList() {
        if (attachmentNameList == null) {
            attachmentNameList = new ArrayList<String>();
        }
        return this.attachmentNameList;
    }

    /**
     * Gets the value of the attachmentNewNameList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachmentNewNameList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttachmentNewNameList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAttachmentNewNameList() {
        if (attachmentNewNameList == null) {
            attachmentNewNameList = new ArrayList<String>();
        }
        return this.attachmentNewNameList;
    }

    /**
     * Gets the value of the attachmentSizeList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachmentSizeList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttachmentSizeList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAttachmentSizeList() {
        if (attachmentSizeList == null) {
            attachmentSizeList = new ArrayList<String>();
        }
        return this.attachmentSizeList;
    }

}