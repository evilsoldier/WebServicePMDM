
package com.kohls.schemas.cdm.producttypescdm.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * This is a code enttity which defines all of the valid colors that apply to Kohl's merchandise items.  This is the standard National Retail Federation (NRF) color pallette.
 * 
 * <p>Java class for ColorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ColorType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="ModifiedDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="NRFColorCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="NRFColorDescription" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="NRFColorFamilyCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="NRFColorSubFamilyCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RecordStatusFlag" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ShortColorDescription" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ColorType")
public class ColorType {

    @XmlAttribute(name = "ModifiedDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifiedDateTime;
    @XmlAttribute(name = "NRFColorCode")
    protected String nrfColorCode;
    @XmlAttribute(name = "NRFColorDescription")
    protected String nrfColorDescription;
    @XmlAttribute(name = "NRFColorFamilyCode")
    protected String nrfColorFamilyCode;
    @XmlAttribute(name = "NRFColorSubFamilyCode")
    protected String nrfColorSubFamilyCode;
    @XmlAttribute(name = "RecordStatusFlag")
    protected String recordStatusFlag;
    @XmlAttribute(name = "ShortColorDescription")
    protected String shortColorDescription;

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
     * Gets the value of the nrfColorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNRFColorCode() {
        return nrfColorCode;
    }

    /**
     * Sets the value of the nrfColorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNRFColorCode(String value) {
        this.nrfColorCode = value;
    }

    /**
     * Gets the value of the nrfColorDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNRFColorDescription() {
        return nrfColorDescription;
    }

    /**
     * Sets the value of the nrfColorDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNRFColorDescription(String value) {
        this.nrfColorDescription = value;
    }

    /**
     * Gets the value of the nrfColorFamilyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNRFColorFamilyCode() {
        return nrfColorFamilyCode;
    }

    /**
     * Sets the value of the nrfColorFamilyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNRFColorFamilyCode(String value) {
        this.nrfColorFamilyCode = value;
    }

    /**
     * Gets the value of the nrfColorSubFamilyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNRFColorSubFamilyCode() {
        return nrfColorSubFamilyCode;
    }

    /**
     * Sets the value of the nrfColorSubFamilyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNRFColorSubFamilyCode(String value) {
        this.nrfColorSubFamilyCode = value;
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
     * Gets the value of the shortColorDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortColorDescription() {
        return shortColorDescription;
    }

    /**
     * Sets the value of the shortColorDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortColorDescription(String value) {
        this.shortColorDescription = value;
    }

}
