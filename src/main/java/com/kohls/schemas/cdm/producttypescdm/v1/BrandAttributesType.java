
package com.kohls.schemas.cdm.producttypescdm.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * The consumer-recognized name associated with a group of similar, like or complimentaty items, that are marketed as a group. Examples would include Little Tikes, Levi's, Sonoma, Matel.  Brands are categorized as 'private', 'exclusive', 'regular'. We really have levels of Brand.  Mattel --> Disney --> Snow White This is now called Persona Category, Persona Theme and Persona Subject.. (These are all enforced using a classification scheme in MDM)
 * 
 * <p>Java class for BrandAttributesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BrandAttributesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BrandType" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *         &lt;element name="PriceTier" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *         &lt;element name="Lifestyle" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="BrandAbbreviationDescription" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="BrandDescription" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="BrandIdentifier" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="BrandShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="BrandTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="LifestyleCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ModifiedDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="PriceTierCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RecordStatusFlag" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BrandAttributesType", propOrder = {
    "brandType",
    "priceTier",
    "lifestyle"
})
public class BrandAttributesType {

    @XmlElement(name = "BrandType")
    protected ReferenceValueType brandType;
    @XmlElement(name = "PriceTier")
    protected ReferenceValueType priceTier;
    @XmlElement(name = "Lifestyle")
    protected ReferenceValueType lifestyle;
    @XmlAttribute(name = "BrandAbbreviationDescription")
    protected String brandAbbreviationDescription;
    @XmlAttribute(name = "BrandDescription")
    protected String brandDescription;
    @XmlAttribute(name = "BrandIdentifier")
    protected Long brandIdentifier;
    @XmlAttribute(name = "BrandShortDescription")
    protected String brandShortDescription;
    @XmlAttribute(name = "BrandTypeCode")
    protected String brandTypeCode;
    @XmlAttribute(name = "LifestyleCode")
    protected String lifestyleCode;
    @XmlAttribute(name = "ModifiedDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifiedDateTime;
    @XmlAttribute(name = "PriceTierCode")
    protected String priceTierCode;
    @XmlAttribute(name = "RecordStatusFlag")
    protected String recordStatusFlag;

    /**
     * Gets the value of the brandType property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceValueType }
     *     
     */
    public ReferenceValueType getBrandType() {
        return brandType;
    }

    /**
     * Sets the value of the brandType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceValueType }
     *     
     */
    public void setBrandType(ReferenceValueType value) {
        this.brandType = value;
    }

    /**
     * Gets the value of the priceTier property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceValueType }
     *     
     */
    public ReferenceValueType getPriceTier() {
        return priceTier;
    }

    /**
     * Sets the value of the priceTier property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceValueType }
     *     
     */
    public void setPriceTier(ReferenceValueType value) {
        this.priceTier = value;
    }

    /**
     * Gets the value of the lifestyle property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceValueType }
     *     
     */
    public ReferenceValueType getLifestyle() {
        return lifestyle;
    }

    /**
     * Sets the value of the lifestyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceValueType }
     *     
     */
    public void setLifestyle(ReferenceValueType value) {
        this.lifestyle = value;
    }

    /**
     * Gets the value of the brandAbbreviationDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandAbbreviationDescription() {
        return brandAbbreviationDescription;
    }

    /**
     * Sets the value of the brandAbbreviationDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandAbbreviationDescription(String value) {
        this.brandAbbreviationDescription = value;
    }

    /**
     * Gets the value of the brandDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandDescription() {
        return brandDescription;
    }

    /**
     * Sets the value of the brandDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandDescription(String value) {
        this.brandDescription = value;
    }

    /**
     * Gets the value of the brandIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBrandIdentifier() {
        return brandIdentifier;
    }

    /**
     * Sets the value of the brandIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBrandIdentifier(Long value) {
        this.brandIdentifier = value;
    }

    /**
     * Gets the value of the brandShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandShortDescription() {
        return brandShortDescription;
    }

    /**
     * Sets the value of the brandShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandShortDescription(String value) {
        this.brandShortDescription = value;
    }

    /**
     * Gets the value of the brandTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandTypeCode() {
        return brandTypeCode;
    }

    /**
     * Sets the value of the brandTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandTypeCode(String value) {
        this.brandTypeCode = value;
    }

    /**
     * Gets the value of the lifestyleCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLifestyleCode() {
        return lifestyleCode;
    }

    /**
     * Sets the value of the lifestyleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLifestyleCode(String value) {
        this.lifestyleCode = value;
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
     * Gets the value of the priceTierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceTierCode() {
        return priceTierCode;
    }

    /**
     * Sets the value of the priceTierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceTierCode(String value) {
        this.priceTierCode = value;
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
