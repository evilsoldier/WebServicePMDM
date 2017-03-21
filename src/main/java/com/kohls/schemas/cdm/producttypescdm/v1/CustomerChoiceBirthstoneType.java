
package com.kohls.schemas.cdm.producttypescdm.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * This entity will contain the 12 Calendar Months.  One time load?
 * 
 * <p>Java class for CustomerChoiceBirthstoneType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerChoiceBirthstoneType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GemstoneCD" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="CalendarMonthName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="CalendarMonthNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="GemstoneCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ModifiedDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="NRFColorFamilyCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RecordStatusFlag" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerChoiceBirthstoneType", propOrder = {
    "gemstoneCD"
})
public class CustomerChoiceBirthstoneType {

    @XmlElement(name = "GemstoneCD")
    protected ReferenceValueType gemstoneCD;
    @XmlAttribute(name = "CalendarMonthName")
    protected String calendarMonthName;
    @XmlAttribute(name = "CalendarMonthNumber")
    protected String calendarMonthNumber;
    @XmlAttribute(name = "CountryCode")
    protected String countryCode;
    @XmlAttribute(name = "GemstoneCode")
    protected String gemstoneCode;
    @XmlAttribute(name = "ModifiedDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifiedDateTime;
    @XmlAttribute(name = "NRFColorFamilyCode")
    protected String nrfColorFamilyCode;
    @XmlAttribute(name = "RecordStatusFlag")
    protected String recordStatusFlag;

    /**
     * Gets the value of the gemstoneCD property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceValueType }
     *     
     */
    public ReferenceValueType getGemstoneCD() {
        return gemstoneCD;
    }

    /**
     * Sets the value of the gemstoneCD property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceValueType }
     *     
     */
    public void setGemstoneCD(ReferenceValueType value) {
        this.gemstoneCD = value;
    }

    /**
     * Gets the value of the calendarMonthName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalendarMonthName() {
        return calendarMonthName;
    }

    /**
     * Sets the value of the calendarMonthName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalendarMonthName(String value) {
        this.calendarMonthName = value;
    }

    /**
     * Gets the value of the calendarMonthNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalendarMonthNumber() {
        return calendarMonthNumber;
    }

    /**
     * Sets the value of the calendarMonthNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalendarMonthNumber(String value) {
        this.calendarMonthNumber = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the gemstoneCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGemstoneCode() {
        return gemstoneCode;
    }

    /**
     * Sets the value of the gemstoneCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGemstoneCode(String value) {
        this.gemstoneCode = value;
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
