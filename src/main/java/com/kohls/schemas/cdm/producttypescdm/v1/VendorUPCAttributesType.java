
package com.kohls.schemas.cdm.producttypescdm.v1;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for VendorUPCAttributesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VendorUPCAttributesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="EDIOrderIndicator" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="EnterpriseIdentifier" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="FirstUnitCostAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="ModifiedDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="NRFColorCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="NRFSizeCode" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="RecordStatusFlag" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="UPCNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="VendorColorDescription" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VendorUPCAttributesType")
public class VendorUPCAttributesType {

    @XmlAttribute(name = "EDIOrderIndicator")
    protected String ediOrderIndicator;
    @XmlAttribute(name = "EnterpriseIdentifier")
    protected Long enterpriseIdentifier;
    @XmlAttribute(name = "FirstUnitCostAmount")
    protected BigDecimal firstUnitCostAmount;
    @XmlAttribute(name = "ModifiedDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifiedDateTime;
    @XmlAttribute(name = "NRFColorCode")
    protected String nrfColorCode;
    @XmlAttribute(name = "NRFSizeCode")
    protected Long nrfSizeCode;
    @XmlAttribute(name = "RecordStatusFlag")
    protected String recordStatusFlag;
    @XmlAttribute(name = "UPCNumber")
    protected String upcNumber;
    @XmlAttribute(name = "VendorColorDescription")
    protected String vendorColorDescription;

    /**
     * Gets the value of the ediOrderIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEDIOrderIndicator() {
        return ediOrderIndicator;
    }

    /**
     * Sets the value of the ediOrderIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEDIOrderIndicator(String value) {
        this.ediOrderIndicator = value;
    }

    /**
     * Gets the value of the enterpriseIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEnterpriseIdentifier() {
        return enterpriseIdentifier;
    }

    /**
     * Sets the value of the enterpriseIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEnterpriseIdentifier(Long value) {
        this.enterpriseIdentifier = value;
    }

    /**
     * Gets the value of the firstUnitCostAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFirstUnitCostAmount() {
        return firstUnitCostAmount;
    }

    /**
     * Sets the value of the firstUnitCostAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFirstUnitCostAmount(BigDecimal value) {
        this.firstUnitCostAmount = value;
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
     * Gets the value of the nrfSizeCode property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNRFSizeCode() {
        return nrfSizeCode;
    }

    /**
     * Sets the value of the nrfSizeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNRFSizeCode(Long value) {
        this.nrfSizeCode = value;
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
     * Gets the value of the upcNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUPCNumber() {
        return upcNumber;
    }

    /**
     * Sets the value of the upcNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUPCNumber(String value) {
        this.upcNumber = value;
    }

    /**
     * Gets the value of the vendorColorDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorColorDescription() {
        return vendorColorDescription;
    }

    /**
     * Sets the value of the vendorColorDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorColorDescription(String value) {
        this.vendorColorDescription = value;
    }

}
