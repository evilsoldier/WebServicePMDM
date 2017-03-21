
package com.kohls.schemas.cdm.producttypescdm.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * A barcode symbology (i.e., a specific type of barcode), that is widely used in North America, and in countries including the UK, Australia, and New Zealand for tracking trade items in stores.
 * 
 * <p>Java class for UPCAttributesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UPCAttributesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UPCType" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ModifiedDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="RecordStatusFlag" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SKUNumber" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="UPCIdentifier" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="UPCNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="UPCTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UPCAttributesType", propOrder = {
    "upcType"
})
public class UPCAttributesType {

    @XmlElement(name = "UPCType")
    protected ReferenceValueType upcType;
    @XmlAttribute(name = "ModifiedDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifiedDateTime;
    @XmlAttribute(name = "RecordStatusFlag")
    protected String recordStatusFlag;
    @XmlAttribute(name = "SKUNumber")
    protected Long skuNumber;
    @XmlAttribute(name = "UPCIdentifier")
    protected Long upcIdentifier;
    @XmlAttribute(name = "UPCNumber")
    protected String upcNumber;
    @XmlAttribute(name = "UPCTypeCode")
    protected String upcTypeCode;

    /**
     * Gets the value of the upcType property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceValueType }
     *     
     */
    public ReferenceValueType getUPCType() {
        return upcType;
    }

    /**
     * Sets the value of the upcType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceValueType }
     *     
     */
    public void setUPCType(ReferenceValueType value) {
        this.upcType = value;
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
     * Gets the value of the upcIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUPCIdentifier() {
        return upcIdentifier;
    }

    /**
     * Sets the value of the upcIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUPCIdentifier(Long value) {
        this.upcIdentifier = value;
    }

    /**
     * Gets the value of the upcNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUPCNumber() {
        return upcNumber;
    }

    /**
     * Sets the value of the upcNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUPCNumber(String value) {
        this.upcNumber = value;
    }

    /**
     * Gets the value of the upcTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUPCTypeCode() {
        return upcTypeCode;
    }

    /**
     * Sets the value of the upcTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUPCTypeCode(String value) {
        this.upcTypeCode = value;
    }

}
