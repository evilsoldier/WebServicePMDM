
package com.kohls.schemas.cdm.producttypescdm.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * The purpose of this entity is to identify the maximum allowable purchase quantity of this product by a customer within a transaction.
 * 
 * <p>Java class for KohlsStyleMaximumPurchaseLimitType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KohlsStyleMaximumPurchaseLimitType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="EffectiveBeginDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="EffectiveStatus" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="KohlsStyleIdentifier" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="MaximumPurchaseQuantity" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="ModifiedDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="RecordStatusFlag" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KohlsStyleMaximumPurchaseLimitType")
public class KohlsStyleMaximumPurchaseLimitType {

    @XmlAttribute(name = "EffectiveBeginDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar effectiveBeginDate;
    @XmlAttribute(name = "EffectiveStatus")
    protected String effectiveStatus;
    @XmlAttribute(name = "KohlsStyleIdentifier")
    protected Long kohlsStyleIdentifier;
    @XmlAttribute(name = "MaximumPurchaseQuantity")
    protected Long maximumPurchaseQuantity;
    @XmlAttribute(name = "ModifiedDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifiedDateTime;
    @XmlAttribute(name = "RecordStatusFlag")
    protected String recordStatusFlag;

    /**
     * Gets the value of the effectiveBeginDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveBeginDate() {
        return effectiveBeginDate;
    }

    /**
     * Sets the value of the effectiveBeginDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveBeginDate(XMLGregorianCalendar value) {
        this.effectiveBeginDate = value;
    }

    /**
     * Gets the value of the effectiveStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffectiveStatus() {
        return effectiveStatus;
    }

    /**
     * Sets the value of the effectiveStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffectiveStatus(String value) {
        this.effectiveStatus = value;
    }

    /**
     * Gets the value of the kohlsStyleIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getKohlsStyleIdentifier() {
        return kohlsStyleIdentifier;
    }

    /**
     * Sets the value of the kohlsStyleIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setKohlsStyleIdentifier(Long value) {
        this.kohlsStyleIdentifier = value;
    }

    /**
     * Gets the value of the maximumPurchaseQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaximumPurchaseQuantity() {
        return maximumPurchaseQuantity;
    }

    /**
     * Sets the value of the maximumPurchaseQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaximumPurchaseQuantity(Long value) {
        this.maximumPurchaseQuantity = value;
    }

    /**
     * Gets the value of the modifiedDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getModifiedDateTime() {
        return modifiedDateTime;
    }

    /**
     * Sets the value of the modifiedDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setModifiedDateTime(XMLGregorianCalendar value) {
        this.modifiedDateTime = value;
    }

    /**
     * Gets the value of the recordStatusFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordStatusFlag() {
        return recordStatusFlag;
    }

    /**
     * Sets the value of the recordStatusFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordStatusFlag(String value) {
        this.recordStatusFlag = value;
    }

}
