
package com.kohls.schemas.cdm.producttypescdm.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * This is what the webstore considers a product.  This drives the ecommerce site.  Similar level to Kohl's Style (90% of time).  Defaults from Kohl's Style but can then vary manually.
 * 
 * <p>Java class for ConsumerProductAttributesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsumerProductAttributesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Status" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="BaseKohlsStyleIdentifier" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="ConsumerProductIdentifier" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="ModifiedDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="RecordStatusFlag" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="StatusCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsumerProductAttributesType", propOrder = {
    "status"
})
public class ConsumerProductAttributesType {

    @XmlElement(name = "Status")
    protected ReferenceValueType status;
    @XmlAttribute(name = "BaseKohlsStyleIdentifier")
    protected Long baseKohlsStyleIdentifier;
    @XmlAttribute(name = "ConsumerProductIdentifier")
    protected Long consumerProductIdentifier;
    @XmlAttribute(name = "ModifiedDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifiedDateTime;
    @XmlAttribute(name = "RecordStatusFlag")
    protected String recordStatusFlag;
    @XmlAttribute(name = "StatusCode")
    protected String statusCode;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceValueType }
     *     
     */
    public ReferenceValueType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceValueType }
     *     
     */
    public void setStatus(ReferenceValueType value) {
        this.status = value;
    }

    /**
     * Gets the value of the baseKohlsStyleIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBaseKohlsStyleIdentifier() {
        return baseKohlsStyleIdentifier;
    }

    /**
     * Sets the value of the baseKohlsStyleIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBaseKohlsStyleIdentifier(Long value) {
        this.baseKohlsStyleIdentifier = value;
    }

    /**
     * Gets the value of the consumerProductIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getConsumerProductIdentifier() {
        return consumerProductIdentifier;
    }

    /**
     * Sets the value of the consumerProductIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setConsumerProductIdentifier(Long value) {
        this.consumerProductIdentifier = value;
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
     * Gets the value of the statusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusCode(String value) {
        this.statusCode = value;
    }

}
