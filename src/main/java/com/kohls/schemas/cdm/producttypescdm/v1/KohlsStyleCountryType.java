
package com.kohls.schemas.cdm.producttypescdm.v1;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for KohlsStyleCountryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KohlsStyleCountryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="KohlsStyleIdentifier" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="MinimumAdvertisedPriceUnitRetailAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
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
@XmlType(name = "KohlsStyleCountryType")
public class KohlsStyleCountryType {

    @XmlAttribute(name = "CountryCode")
    protected String countryCode;
    @XmlAttribute(name = "KohlsStyleIdentifier")
    protected Long kohlsStyleIdentifier;
    @XmlAttribute(name = "MinimumAdvertisedPriceUnitRetailAmount")
    protected BigDecimal minimumAdvertisedPriceUnitRetailAmount;
    @XmlAttribute(name = "ModifiedDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifiedDateTime;
    @XmlAttribute(name = "RecordStatusFlag")
    protected String recordStatusFlag;

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
     * Gets the value of the kohlsStyleIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getKohlsStyleIdentifier() {
        return kohlsStyleIdentifier;
    }

    /**
     * Sets the value of the kohlsStyleIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setKohlsStyleIdentifier(Long value) {
        this.kohlsStyleIdentifier = value;
    }

    /**
     * Gets the value of the minimumAdvertisedPriceUnitRetailAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinimumAdvertisedPriceUnitRetailAmount() {
        return minimumAdvertisedPriceUnitRetailAmount;
    }

    /**
     * Sets the value of the minimumAdvertisedPriceUnitRetailAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinimumAdvertisedPriceUnitRetailAmount(BigDecimal value) {
        this.minimumAdvertisedPriceUnitRetailAmount = value;
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
