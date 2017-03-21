
package com.kohls.schemas.cdm.producttypescdm.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GemstoneCalendarType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GemstoneCalendarType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="CalendarMonthName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="CalendarMonthNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GemstoneCalendarType")
public class GemstoneCalendarType {

    @XmlAttribute(name = "CalendarMonthName")
    protected String calendarMonthName;
    @XmlAttribute(name = "CalendarMonthNumber")
    protected String calendarMonthNumber;

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

}
