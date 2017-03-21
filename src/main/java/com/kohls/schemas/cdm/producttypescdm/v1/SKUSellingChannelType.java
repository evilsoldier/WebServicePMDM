
package com.kohls.schemas.cdm.producttypescdm.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * The purpose of this entity is to identify the channels (i.e. Brick & Mortar Store, Ecommerce, etc.) in which product may be sold.
 * 
 * <p>Java class for SKUSellingChannelType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SKUSellingChannelType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SellingChannelM" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueListType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="EffectiveBeginDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="EffectiveStatus" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ModifiedDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="RecordStatusFlag" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SKUNumber" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="SellingChannelCodeM" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SKUSellingChannelType", propOrder = {
    "sellingChannelM"
})
public class SKUSellingChannelType {

    @XmlElement(name = "SellingChannelM")
    protected ReferenceValueListType sellingChannelM;
    @XmlAttribute(name = "EffectiveBeginDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar effectiveBeginDate;
    @XmlAttribute(name = "EffectiveStatus")
    protected String effectiveStatus;
    @XmlAttribute(name = "ModifiedDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifiedDateTime;
    @XmlAttribute(name = "RecordStatusFlag")
    protected String recordStatusFlag;
    @XmlAttribute(name = "SKUNumber")
    protected Long skuNumber;
    @XmlAttribute(name = "SellingChannelCodeM")
    protected String sellingChannelCodeM;

    /**
     * Gets the value of the sellingChannelM property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceValueListType }
     *     
     */
    public ReferenceValueListType getSellingChannelM() {
        return sellingChannelM;
    }

    /**
     * Sets the value of the sellingChannelM property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceValueListType }
     *     
     */
    public void setSellingChannelM(ReferenceValueListType value) {
        this.sellingChannelM = value;
    }

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

    /**
     * Gets the value of the skuNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSKUNumber() {
        return skuNumber;
    }

    /**
     * Sets the value of the skuNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSKUNumber(Long value) {
        this.skuNumber = value;
    }

    /**
     * Gets the value of the sellingChannelCodeM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellingChannelCodeM() {
        return sellingChannelCodeM;
    }

    /**
     * Sets the value of the sellingChannelCodeM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellingChannelCodeM(String value) {
        this.sellingChannelCodeM = value;
    }

}
