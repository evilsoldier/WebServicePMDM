
package com.kohls.schemas.cdm.producttypescdm.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A grouping of Consumer Product Ids that may cross Departments or Buying responsibilities among other things.  This is a customer presentation decision.  Ex. Croft & Barrow® Island Collection Tropical Casual Button-Front Shirt (923054)  Aka:  Super Web Id
 * 
 * Open Topic:
 *  1.  Presentation template would need to be able to be chosen at this level.
 * 
 * <p>Java class for ConsumerProductGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsumerProductGroupType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ConsumerProductGroupAttributes"/&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ConsumerProductList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsumerProductGroupType", propOrder = {
    "consumerProductGroupAttributes",
    "consumerProductList"
})
public class ConsumerProductGroupType {

    @XmlElement(name = "ConsumerProductGroupAttributes", required = true)
    protected ConsumerProductGroupAttributesType consumerProductGroupAttributes;
    @XmlElement(name = "ConsumerProductList")
    protected ConsumerProductListType consumerProductList;

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

}
