
package com.kohls.schemas.cdm.producttypescdm.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * General Merchandise Area is the highest level of categorization in the merchandise hierarchy.  (ex. Mens/Kids, Home/Shoes, Juniors/Accessories)
 * 
 * <p>Java class for GeneralMerchandiseAreaAttributesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeneralMerchandiseAreaAttributesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="GMADescription" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="GMANumber" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="ModifiedDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="OperatingCompanyNumber" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="RecordStatusFlag" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeneralMerchandiseAreaAttributesType")
public class GeneralMerchandiseAreaAttributesType {

    @XmlAttribute(name = "GMADescription")
    protected String gmaDescription;
    @XmlAttribute(name = "GMANumber")
    protected Long gmaNumber;
    @XmlAttribute(name = "ModifiedDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifiedDateTime;
    @XmlAttribute(name = "OperatingCompanyNumber")
    protected Long operatingCompanyNumber;
    @XmlAttribute(name = "RecordStatusFlag")
    protected String recordStatusFlag;

    /**
     * Gets the value of the gmaDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGMADescription() {
        return gmaDescription;
    }

    /**
     * Sets the value of the gmaDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGMADescription(String value) {
        this.gmaDescription = value;
    }

    /**
     * Gets the value of the gmaNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGMANumber() {
        return gmaNumber;
    }

    /**
     * Sets the value of the gmaNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGMANumber(Long value) {
        this.gmaNumber = value;
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
     * Gets the value of the operatingCompanyNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOperatingCompanyNumber() {
        return operatingCompanyNumber;
    }

    /**
     * Sets the value of the operatingCompanyNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOperatingCompanyNumber(Long value) {
        this.operatingCompanyNumber = value;
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
