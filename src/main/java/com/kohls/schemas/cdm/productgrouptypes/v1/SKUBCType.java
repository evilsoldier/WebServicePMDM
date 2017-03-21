
package com.kohls.schemas.cdm.productgrouptypes.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A SKU is the lowest level for which inventory and sales records are currently retained within the Enterprise.  Most often it represents the unique size and color of a style. For the future we may consider UPC or RF ID as the level to track sales and inventory .
 * 
 * A unique identifier for a grouping of one or more products or services and the corresponding price plan, rate structure or unit charge that may be marketed by the organization for the purpose of generating revenue.  An item is what a customer purchases or subscribes to.
 * 
 * Examples: 
 * - Parker Elite fountain pen in silver, 
 * - Photo Printing Service 8x10 glossy,
 * - 14K white gold 1/3 carat snowflake pendant
 * - cashmere scarf, Burberry tan plaid
 * - Mock turtleneck sweater, women's medium, grey merino wool
 * 
 * 
 * 
 * <p>Java class for SKUBCType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SKUBCType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductGroupTypes/V1}CustomerChoiceBC" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="SKUDescription" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SKUNumber" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SKUBCType", propOrder = {
    "customerChoiceBC"
})
public class SKUBCType {

    @XmlElement(name = "CustomerChoiceBC")
    protected CustomerChoiceBCType customerChoiceBC;
    @XmlAttribute(name = "SKUDescription")
    protected String skuDescription;
    @XmlAttribute(name = "SKUNumber")
    protected Long skuNumber;

    /**
     * Gets the value of the customerChoiceBC property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerChoiceBCType }
     *     
     */
    public CustomerChoiceBCType getCustomerChoiceBC() {
        return customerChoiceBC;
    }

    /**
     * Sets the value of the customerChoiceBC property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerChoiceBCType }
     *     
     */
    public void setCustomerChoiceBC(CustomerChoiceBCType value) {
        this.customerChoiceBC = value;
    }

    /**
     * Gets the value of the skuDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSKUDescription() {
        return skuDescription;
    }

    /**
     * Sets the value of the skuDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSKUDescription(String value) {
        this.skuDescription = value;
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

}
