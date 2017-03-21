
package com.kohls.schemas.cdm.producttypescdm.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GemstoneType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GemstoneType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GemstoneCode" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}GemstoneCalendarList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GemstoneType", propOrder = {
    "gemstoneCode",
    "gemstoneCalendarList"
})
public class GemstoneType {

    @XmlElement(name = "GemstoneCode")
    protected ReferenceValueType gemstoneCode;
    @XmlElement(name = "GemstoneCalendarList")
    protected GemstoneCalendarListType gemstoneCalendarList;

    /**
     * Gets the value of the gemstoneCode property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceValueType }
     *     
     */
    public ReferenceValueType getGemstoneCode() {
        return gemstoneCode;
    }

    /**
     * Sets the value of the gemstoneCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceValueType }
     *     
     */
    public void setGemstoneCode(ReferenceValueType value) {
        this.gemstoneCode = value;
    }

    /**
     * Gets the value of the gemstoneCalendarList property.
     * 
     * @return
     *     possible object is
     *     {@link GemstoneCalendarListType }
     *     
     */
    public GemstoneCalendarListType getGemstoneCalendarList() {
        return gemstoneCalendarList;
    }

    /**
     * Sets the value of the gemstoneCalendarList property.
     * 
     * @param value
     *     allowed object is
     *     {@link GemstoneCalendarListType }
     *     
     */
    public void setGemstoneCalendarList(GemstoneCalendarListType value) {
        this.gemstoneCalendarList = value;
    }

}
