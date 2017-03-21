
package com.kohls.schemas.cdm.producttypescdm.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Kohl's Business Group Table - this table defines groupings of departments.
 * 
 * <p>Java class for BusinessGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BusinessGroupType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}BusinessArea" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="BusinessAreaNumber" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="BusinessGroupDescription" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="BusinessGroupNumber" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="BusinessGroupShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
@XmlType(name = "BusinessGroupType", propOrder = {
    "businessArea"
})
public class BusinessGroupType {

    @XmlElement(name = "BusinessArea")
    protected BusinessAreaType businessArea;
    @XmlAttribute(name = "BusinessAreaNumber")
    protected Long businessAreaNumber;
    @XmlAttribute(name = "BusinessGroupDescription")
    protected String businessGroupDescription;
    @XmlAttribute(name = "BusinessGroupNumber")
    protected Long businessGroupNumber;
    @XmlAttribute(name = "BusinessGroupShortDescription")
    protected String businessGroupShortDescription;
    @XmlAttribute(name = "ModifiedDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifiedDateTime;
    @XmlAttribute(name = "RecordStatusFlag")
    protected String recordStatusFlag;

    /**
     * Gets the value of the businessArea property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessAreaType }
     *     
     */
    public BusinessAreaType getBusinessArea() {
        return businessArea;
    }

    /**
     * Sets the value of the businessArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessAreaType }
     *     
     */
    public void setBusinessArea(BusinessAreaType value) {
        this.businessArea = value;
    }

    /**
     * Gets the value of the businessAreaNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBusinessAreaNumber() {
        return businessAreaNumber;
    }

    /**
     * Sets the value of the businessAreaNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBusinessAreaNumber(Long value) {
        this.businessAreaNumber = value;
    }

    /**
     * Gets the value of the businessGroupDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessGroupDescription() {
        return businessGroupDescription;
    }

    /**
     * Sets the value of the businessGroupDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessGroupDescription(String value) {
        this.businessGroupDescription = value;
    }

    /**
     * Gets the value of the businessGroupNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBusinessGroupNumber() {
        return businessGroupNumber;
    }

    /**
     * Sets the value of the businessGroupNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBusinessGroupNumber(Long value) {
        this.businessGroupNumber = value;
    }

    /**
     * Gets the value of the businessGroupShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessGroupShortDescription() {
        return businessGroupShortDescription;
    }

    /**
     * Sets the value of the businessGroupShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessGroupShortDescription(String value) {
        this.businessGroupShortDescription = value;
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
