
package com.kohls.schemas.cdm.producttypescdm.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.kohls.schemas.cdm.productgrouptypes.v1.CustomerChoiceBCType;


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
 * <p>Java class for SKUType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SKUType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}SKUAttributes" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}SKUCountryList" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ConsumerProductSKUAssociationList" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}UPCList" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductGroupTypes/V1}CustomerChoiceBC" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}SKUDimensionList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SKUType", propOrder = {
    "skuAttributes",
    "skuCountryList",
    "consumerProductSKUAssociationList",
    "upcList",
    "customerChoiceBC",
    "skuDimensionList"
})
public class SKUType {

    @XmlElement(name = "SKUAttributes")
    protected SKUAttributesType skuAttributes;
    @XmlElement(name = "SKUCountryList")
    protected SKUCountryListType skuCountryList;
    @XmlElement(name = "ConsumerProductSKUAssociationList")
    protected ConsumerProductSKUAssociationListType consumerProductSKUAssociationList;
    @XmlElement(name = "UPCList")
    protected UPCListType upcList;
    @XmlElement(name = "CustomerChoiceBC", namespace = "http://www.kohls.com/schemas/cdm/ProductGroupTypes/V1")
    protected CustomerChoiceBCType customerChoiceBC;
    @XmlElement(name = "SKUDimensionList")
    protected SKUDimensionListType skuDimensionList;

    /**
     * Gets the value of the skuAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link SKUAttributesType }
     *     
     */
    public SKUAttributesType getSKUAttributes() {
        return skuAttributes;
    }

    /**
     * Sets the value of the skuAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link SKUAttributesType }
     *     
     */
    public void setSKUAttributes(SKUAttributesType value) {
        this.skuAttributes = value;
    }

    /**
     * Gets the value of the skuCountryList property.
     * 
     * @return
     *     possible object is
     *     {@link SKUCountryListType }
     *     
     */
    public SKUCountryListType getSKUCountryList() {
        return skuCountryList;
    }

    /**
     * Sets the value of the skuCountryList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SKUCountryListType }
     *     
     */
    public void setSKUCountryList(SKUCountryListType value) {
        this.skuCountryList = value;
    }

    /**
     * Gets the value of the consumerProductSKUAssociationList property.
     * 
     * @return
     *     possible object is
     *     {@link ConsumerProductSKUAssociationListType }
     *     
     */
    public ConsumerProductSKUAssociationListType getConsumerProductSKUAssociationList() {
        return consumerProductSKUAssociationList;
    }

    /**
     * Sets the value of the consumerProductSKUAssociationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsumerProductSKUAssociationListType }
     *     
     */
    public void setConsumerProductSKUAssociationList(ConsumerProductSKUAssociationListType value) {
        this.consumerProductSKUAssociationList = value;
    }

    /**
     * Gets the value of the upcList property.
     * 
     * @return
     *     possible object is
     *     {@link UPCListType }
     *     
     */
    public UPCListType getUPCList() {
        return upcList;
    }

    /**
     * Sets the value of the upcList property.
     * 
     * @param value
     *     allowed object is
     *     {@link UPCListType }
     *     
     */
    public void setUPCList(UPCListType value) {
        this.upcList = value;
    }

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
     * Gets the value of the skuDimensionList property.
     * 
     * @return
     *     possible object is
     *     {@link SKUDimensionListType }
     *     
     */
    public SKUDimensionListType getSKUDimensionList() {
        return skuDimensionList;
    }

    /**
     * Sets the value of the skuDimensionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SKUDimensionListType }
     *     
     */
    public void setSKUDimensionList(SKUDimensionListType value) {
        this.skuDimensionList = value;
    }

}
