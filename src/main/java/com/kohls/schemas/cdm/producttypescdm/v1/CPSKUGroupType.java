
package com.kohls.schemas.cdm.producttypescdm.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CPSKUGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CPSKUGroupType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ConsumerProductGroupAttributes" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}CPProductList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CPSKUGroupType", propOrder = {
    "consumerProductGroupAttributes",
    "cpProductList"
})
public class CPSKUGroupType {

    @XmlElement(name = "ConsumerProductGroupAttributes")
    protected ConsumerProductGroupAttributesType consumerProductGroupAttributes;
    @XmlElement(name = "CPProductList")
    protected CPProductListType cpProductList;

    /**
     * Gets the value of the consumerProductGroupAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link ConsumerProductGroupAttributesType }
     *     
     */
    public ConsumerProductGroupAttributesType getConsumerProductGroupAttributes() {
        return consumerProductGroupAttributes;
    }

    /**
     * Sets the value of the consumerProductGroupAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsumerProductGroupAttributesType }
     *     
     */
    public void setConsumerProductGroupAttributes(ConsumerProductGroupAttributesType value) {
        this.consumerProductGroupAttributes = value;
    }

    /**
     * Gets the value of the cpProductList property.
     * 
     * @return
     *     possible object is
     *     {@link CPProductListType }
     *     
     */
    public CPProductListType getCPProductList() {
        return cpProductList;
    }

    /**
     * Sets the value of the cpProductList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPProductListType }
     *     
     */
    public void setCPProductList(CPProductListType value) {
        this.cpProductList = value;
    }

}
