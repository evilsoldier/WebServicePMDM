
package com.kohls.schemas.cdm.producttypescdm.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * This table will contain an entry for every day.  It can translate that day into the equivalent fiscal week, month,  year, etc.
 * 
 * <p>Java class for CalendarType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CalendarType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="CalendarMonthNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DayNameDisplay" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DayOfWeekNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="FiscalMonthBeginDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="FiscalMonthEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="FiscalMonthNameDisplay" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="FiscalMonthNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="FiscalQuarterNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="FiscalWeekBeginDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="FiscalWeekEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="FiscalWeekNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="FiscalYearBeginDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="FiscalYearEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="FiscalYearNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="JulianDate" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="KeyDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="LastYearThisDayKeyDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="ModifiedDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="NextFiscalMonthEndingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="PreviousFiscalMonthEndingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="PreviousFiscalWeekEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="PreviousSeasonEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="RecordStatusFlag" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SeasonBeginDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="SeasonDescription" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SeasonEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="WeekInMonthNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalendarType")
public class CalendarType {

    @XmlAttribute(name = "CalendarMonthNumber")
    protected String calendarMonthNumber;
    @XmlAttribute(name = "DayNameDisplay")
    protected String dayNameDisplay;
    @XmlAttribute(name = "DayOfWeekNumber")
    protected String dayOfWeekNumber;
    @XmlAttribute(name = "FiscalMonthBeginDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fiscalMonthBeginDate;
    @XmlAttribute(name = "FiscalMonthEndDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fiscalMonthEndDate;
    @XmlAttribute(name = "FiscalMonthNameDisplay")
    protected String fiscalMonthNameDisplay;
    @XmlAttribute(name = "FiscalMonthNumber")
    protected String fiscalMonthNumber;
    @XmlAttribute(name = "FiscalQuarterNumber")
    protected String fiscalQuarterNumber;
    @XmlAttribute(name = "FiscalWeekBeginDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fiscalWeekBeginDate;
    @XmlAttribute(name = "FiscalWeekEndDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fiscalWeekEndDate;
    @XmlAttribute(name = "FiscalWeekNumber")
    protected String fiscalWeekNumber;
    @XmlAttribute(name = "FiscalYearBeginDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fiscalYearBeginDate;
    @XmlAttribute(name = "FiscalYearEndDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fiscalYearEndDate;
    @XmlAttribute(name = "FiscalYearNumber")
    protected String fiscalYearNumber;
    @XmlAttribute(name = "JulianDate")
    protected Long julianDate;
    @XmlAttribute(name = "KeyDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar keyDate;
    @XmlAttribute(name = "LastYearThisDayKeyDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastYearThisDayKeyDate;
    @XmlAttribute(name = "ModifiedDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifiedDateTime;
    @XmlAttribute(name = "NextFiscalMonthEndingDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar nextFiscalMonthEndingDate;
    @XmlAttribute(name = "PreviousFiscalMonthEndingDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar previousFiscalMonthEndingDate;
    @XmlAttribute(name = "PreviousFiscalWeekEndDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar previousFiscalWeekEndDate;
    @XmlAttribute(name = "PreviousSeasonEndDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar previousSeasonEndDate;
    @XmlAttribute(name = "RecordStatusFlag")
    protected String recordStatusFlag;
    @XmlAttribute(name = "SeasonBeginDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar seasonBeginDate;
    @XmlAttribute(name = "SeasonDescription")
    protected String seasonDescription;
    @XmlAttribute(name = "SeasonEndDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar seasonEndDate;
    @XmlAttribute(name = "WeekInMonthNumber")
    protected String weekInMonthNumber;

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
     * Gets the value of the dayNameDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDayNameDisplay() {
        return dayNameDisplay;
    }

    /**
     * Sets the value of the dayNameDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDayNameDisplay(String value) {
        this.dayNameDisplay = value;
    }

    /**
     * Gets the value of the dayOfWeekNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDayOfWeekNumber() {
        return dayOfWeekNumber;
    }

    /**
     * Sets the value of the dayOfWeekNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDayOfWeekNumber(String value) {
        this.dayOfWeekNumber = value;
    }

    /**
     * Gets the value of the fiscalMonthBeginDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFiscalMonthBeginDate() {
        return fiscalMonthBeginDate;
    }

    /**
     * Sets the value of the fiscalMonthBeginDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFiscalMonthBeginDate(XMLGregorianCalendar value) {
        this.fiscalMonthBeginDate = value;
    }

    /**
     * Gets the value of the fiscalMonthEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFiscalMonthEndDate() {
        return fiscalMonthEndDate;
    }

    /**
     * Sets the value of the fiscalMonthEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFiscalMonthEndDate(XMLGregorianCalendar value) {
        this.fiscalMonthEndDate = value;
    }

    /**
     * Gets the value of the fiscalMonthNameDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiscalMonthNameDisplay() {
        return fiscalMonthNameDisplay;
    }

    /**
     * Sets the value of the fiscalMonthNameDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiscalMonthNameDisplay(String value) {
        this.fiscalMonthNameDisplay = value;
    }

    /**
     * Gets the value of the fiscalMonthNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiscalMonthNumber() {
        return fiscalMonthNumber;
    }

    /**
     * Sets the value of the fiscalMonthNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiscalMonthNumber(String value) {
        this.fiscalMonthNumber = value;
    }

    /**
     * Gets the value of the fiscalQuarterNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiscalQuarterNumber() {
        return fiscalQuarterNumber;
    }

    /**
     * Sets the value of the fiscalQuarterNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiscalQuarterNumber(String value) {
        this.fiscalQuarterNumber = value;
    }

    /**
     * Gets the value of the fiscalWeekBeginDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFiscalWeekBeginDate() {
        return fiscalWeekBeginDate;
    }

    /**
     * Sets the value of the fiscalWeekBeginDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFiscalWeekBeginDate(XMLGregorianCalendar value) {
        this.fiscalWeekBeginDate = value;
    }

    /**
     * Gets the value of the fiscalWeekEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFiscalWeekEndDate() {
        return fiscalWeekEndDate;
    }

    /**
     * Sets the value of the fiscalWeekEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFiscalWeekEndDate(XMLGregorianCalendar value) {
        this.fiscalWeekEndDate = value;
    }

    /**
     * Gets the value of the fiscalWeekNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiscalWeekNumber() {
        return fiscalWeekNumber;
    }

    /**
     * Sets the value of the fiscalWeekNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiscalWeekNumber(String value) {
        this.fiscalWeekNumber = value;
    }

    /**
     * Gets the value of the fiscalYearBeginDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFiscalYearBeginDate() {
        return fiscalYearBeginDate;
    }

    /**
     * Sets the value of the fiscalYearBeginDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFiscalYearBeginDate(XMLGregorianCalendar value) {
        this.fiscalYearBeginDate = value;
    }

    /**
     * Gets the value of the fiscalYearEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFiscalYearEndDate() {
        return fiscalYearEndDate;
    }

    /**
     * Sets the value of the fiscalYearEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFiscalYearEndDate(XMLGregorianCalendar value) {
        this.fiscalYearEndDate = value;
    }

    /**
     * Gets the value of the fiscalYearNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiscalYearNumber() {
        return fiscalYearNumber;
    }

    /**
     * Sets the value of the fiscalYearNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiscalYearNumber(String value) {
        this.fiscalYearNumber = value;
    }

    /**
     * Gets the value of the julianDate property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getJulianDate() {
        return julianDate;
    }

    /**
     * Sets the value of the julianDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setJulianDate(Long value) {
        this.julianDate = value;
    }

    /**
     * Gets the value of the keyDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getKeyDate() {
        return keyDate;
    }

    /**
     * Sets the value of the keyDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setKeyDate(XMLGregorianCalendar value) {
        this.keyDate = value;
    }

    /**
     * Gets the value of the lastYearThisDayKeyDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastYearThisDayKeyDate() {
        return lastYearThisDayKeyDate;
    }

    /**
     * Sets the value of the lastYearThisDayKeyDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastYearThisDayKeyDate(XMLGregorianCalendar value) {
        this.lastYearThisDayKeyDate = value;
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
     * Gets the value of the nextFiscalMonthEndingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNextFiscalMonthEndingDate() {
        return nextFiscalMonthEndingDate;
    }

    /**
     * Sets the value of the nextFiscalMonthEndingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNextFiscalMonthEndingDate(XMLGregorianCalendar value) {
        this.nextFiscalMonthEndingDate = value;
    }

    /**
     * Gets the value of the previousFiscalMonthEndingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPreviousFiscalMonthEndingDate() {
        return previousFiscalMonthEndingDate;
    }

    /**
     * Sets the value of the previousFiscalMonthEndingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPreviousFiscalMonthEndingDate(XMLGregorianCalendar value) {
        this.previousFiscalMonthEndingDate = value;
    }

    /**
     * Gets the value of the previousFiscalWeekEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPreviousFiscalWeekEndDate() {
        return previousFiscalWeekEndDate;
    }

    /**
     * Sets the value of the previousFiscalWeekEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPreviousFiscalWeekEndDate(XMLGregorianCalendar value) {
        this.previousFiscalWeekEndDate = value;
    }

    /**
     * Gets the value of the previousSeasonEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPreviousSeasonEndDate() {
        return previousSeasonEndDate;
    }

    /**
     * Sets the value of the previousSeasonEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPreviousSeasonEndDate(XMLGregorianCalendar value) {
        this.previousSeasonEndDate = value;
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
     * Gets the value of the seasonBeginDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSeasonBeginDate() {
        return seasonBeginDate;
    }

    /**
     * Sets the value of the seasonBeginDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSeasonBeginDate(XMLGregorianCalendar value) {
        this.seasonBeginDate = value;
    }

    /**
     * Gets the value of the seasonDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeasonDescription() {
        return seasonDescription;
    }

    /**
     * Sets the value of the seasonDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeasonDescription(String value) {
        this.seasonDescription = value;
    }

    /**
     * Gets the value of the seasonEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSeasonEndDate() {
        return seasonEndDate;
    }

    /**
     * Sets the value of the seasonEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSeasonEndDate(XMLGregorianCalendar value) {
        this.seasonEndDate = value;
    }

    /**
     * Gets the value of the weekInMonthNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeekInMonthNumber() {
        return weekInMonthNumber;
    }

    /**
     * Sets the value of the weekInMonthNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeekInMonthNumber(String value) {
        this.weekInMonthNumber = value;
    }

}
