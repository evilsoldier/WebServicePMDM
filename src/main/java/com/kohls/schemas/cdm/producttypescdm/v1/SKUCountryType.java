
package com.kohls.schemas.cdm.producttypescdm.v1;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SKUCountryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SKUCountryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Liquidity" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *         &lt;element name="TestProductType" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="CountryDescription" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="InitialUnitRetailAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="LiquidityCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ModifiedDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="RecordStatusFlag" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SKUNumber" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="ShippingSurchargeAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="TestProductTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="WarehouseReplenishmentIndicator" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SKUCountryType", propOrder = {
    "liquidity",
    "testProductType"
})
public class SKUCountryType {

    @XmlElement(name = "Liquidity")
    protected ReferenceValueType liquidity;
    @XmlElement(name = "TestProductType")
    protected ReferenceValueType testProductType;
    @XmlAttribute(name = "CountryCode")
    protected String countryCode;
    @XmlAttribute(name = "CountryDescription")
    protected String countryDescription;
    @XmlAttribute(name = "InitialUnitRetailAmount")
    protected BigDecimal initialUnitRetailAmount;
    @XmlAttribute(name = "LiquidityCode")
    protected String liquidityCode;
    @XmlAttribute(name = "ModifiedDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifiedDateTime;
    @XmlAttribute(name = "RecordStatusFlag")
    protected String recordStatusFlag;
    @XmlAttribute(name = "SKUNumber")
    protected Long skuNumber;
    @XmlAttribute(name = "ShippingSurchargeAmount")
    protected BigDecimal shippingSurchargeAmount;
    @XmlAttribute(name = "TestProductTypeCode")
    protected String testProductTypeCode;
    @XmlAttribute(name = "WarehouseReplenishmentIndicator")
    protected String warehouseReplenishmentIndicator;

    /**
     * Gets the value of the liquidity property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceValueType }
     *     
     */
    public ReferenceValueType getLiquidity() {
        return liquidity;
    }

    /**
     * Sets the value of the liquidity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceValueType }
     *     
     */
    public void setLiquidity(ReferenceValueType value) {
        this.liquidity = value;
    }

    /**
     * Gets the value of the testProductType property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceValueType }
     *     
     */
    public ReferenceValueType getTestProductType() {
        return testProductType;
    }

    /**
     * Sets the value of the testProductType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceValueType }
     *     
     */
    public void setTestProductType(ReferenceValueType value) {
        this.testProductType = value;
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
     * Gets the value of the countryDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryDescription() {
        return countryDescription;
    }

    /**
     * Sets the value of the countryDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryDescription(String value) {
        this.countryDescription = value;
    }

    /**
     * Gets the value of the initialUnitRetailAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInitialUnitRetailAmount() {
        return initialUnitRetailAmount;
    }

    /**
     * Sets the value of the initialUnitRetailAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInitialUnitRetailAmount(BigDecimal value) {
        this.initialUnitRetailAmount = value;
    }

    /**
     * Gets the value of the liquidityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLiquidityCode() {
        return liquidityCode;
    }

    /**
     * Sets the value of the liquidityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLiquidityCode(String value) {
        this.liquidityCode = value;
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

    /**
     * Gets the value of the skuNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSKUNumber() {
        return skuNumber;
    }

    /**
     * Sets the value of the skuNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSKUNumber(Long value) {
        this.skuNumber = value;
    }

    /**
     * Gets the value of the shippingSurchargeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getShippingSurchargeAmount() {
        return shippingSurchargeAmount;
    }

    /**
     * Sets the value of the shippingSurchargeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setShippingSurchargeAmount(BigDecimal value) {
        this.shippingSurchargeAmount = value;
    }

    /**
     * Gets the value of the testProductTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestProductTypeCode() {
        return testProductTypeCode;
    }

    /**
     * Sets the value of the testProductTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestProductTypeCode(String value) {
        this.testProductTypeCode = value;
    }

    /**
     * Gets the value of the warehouseReplenishmentIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarehouseReplenishmentIndicator() {
        return warehouseReplenishmentIndicator;
    }

    /**
     * Sets the value of the warehouseReplenishmentIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarehouseReplenishmentIndicator(String value) {
        this.warehouseReplenishmentIndicator = value;
    }

}
