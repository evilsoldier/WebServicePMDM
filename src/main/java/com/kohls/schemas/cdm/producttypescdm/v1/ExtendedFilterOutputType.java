
package com.kohls.schemas.cdm.producttypescdm.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExtendedFilterOutputType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExtendedFilterOutputType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}KohlsStyleList" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}CustomerChoiceList" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}SKUList" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}UPCList" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ConsumerProductList" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ConsumerProductGroupList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtendedFilterOutputType", propOrder = {
    "kohlsStyleList",
    "customerChoiceList",
    "skuList",
    "upcList",
    "consumerProductList",
    "consumerProductGroupList"
})
public class ExtendedFilterOutputType {

    @XmlElement(name = "KohlsStyleList")
    protected KohlsStyleListType kohlsStyleList;
    @XmlElement(name = "CustomerChoiceList")
    protected CustomerChoiceListType customerChoiceList;
    @XmlElement(name = "SKUList")
    protected SKUListType skuList;
    @XmlElement(name = "UPCList")
    protected UPCListType upcList;
    @XmlElement(name = "ConsumerProductList")
    protected ConsumerProductListType consumerProductList;
    @XmlElement(name = "ConsumerProductGroupList")
    protected ConsumerProductGroupListType consumerProductGroupList;

    /**
     * Gets the value of the kohlsStyleList property.
     * 
     * @return
     *     possible object is
     *     {@link KohlsStyleListType }
     *     
     */
    public KohlsStyleListType getKohlsStyleList() {
        return kohlsStyleList;
    }

    /**
     * Sets the value of the kohlsStyleList property.
     * 
     * @param value
     *     allowed object is
     *     {@link KohlsStyleListType }
     *     
     */
    public void setKohlsStyleList(KohlsStyleListType value) {
        this.kohlsStyleList = value;
    }

    /**
     * Gets the value of the customerChoiceList property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerChoiceListType }
     *     
     */
    public CustomerChoiceListType getCustomerChoiceList() {
        return customerChoiceList;
    }

    /**
     * Sets the value of the customerChoiceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerChoiceListType }
     *     
     */
    public void setCustomerChoiceList(CustomerChoiceListType value) {
        this.customerChoiceList = value;
    }

    /**
     * Gets the value of the skuList property.
     * 
     * @return
     *     possible object is
     *     {@link SKUListType }
     *     
     */
    public SKUListType getSKUList() {
        return skuList;
    }

    /**
     * Sets the value of the skuList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SKUListType }
     *     
     */
    public void setSKUList(SKUListType value) {
        this.skuList = value;
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
     * Gets the value of the consumerProductList property.
     * 
     * @return
     *     possible object is
     *     {@link ConsumerProductListType }
     *     
     */
    public ConsumerProductListType getConsumerProductList() {
        return consumerProductList;
    }

    /**
     * Sets the value of the consumerProductList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsumerProductListType }
     *     
     */
    public void setConsumerProductList(ConsumerProductListType value) {
        this.consumerProductList = value;
    }

    /**
     * Gets the value of the consumerProductGroupList property.
     * 
     * @return
     *     possible object is
     *     {@link ConsumerProductGroupListType }
     *     
     */
    public ConsumerProductGroupListType getConsumerProductGroupList() {
        return consumerProductGroupList;
    }

    /**
     * Sets the value of the consumerProductGroupList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsumerProductGroupListType }
     *     
     */
    public void setConsumerProductGroupList(ConsumerProductGroupListType value) {
        this.consumerProductGroupList = value;
    }

}
