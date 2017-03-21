
package com.kohls.schemas.cdm.producttypescdm.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This is what the webstore considers a product.  This drives the ecommerce site.  Similar level to Kohl's Style (90% of time).  Defaults from Kohl's Style but can then vary manually.
 * 
 * <p>Java class for ConsumerProductType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsumerProductType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ConsumerProductAttributes" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ConsumerProductSKUAssociationList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsumerProductType", propOrder = {
    "consumerProductAttributes",
    "consumerProductSKUAssociationList"
})
public class ConsumerProductType {

    @XmlElement(name = "ConsumerProductAttributes")
    protected ConsumerProductAttributesType consumerProductAttributes;
    @XmlElement(name = "ConsumerProductSKUAssociationList")
    protected ConsumerProductSKUAssociationListType consumerProductSKUAssociationList;

    /**
     * Gets the value of the consumerProductAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link ConsumerProductAttributesType }
     *     
     */
    public ConsumerProductAttributesType getConsumerProductAttributes() {
        return consumerProductAttributes;
    }

    /**
     * Sets the value of the consumerProductAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsumerProductAttributesType }
     *     
     */
    public void setConsumerProductAttributes(ConsumerProductAttributesType value) {
        this.consumerProductAttributes = value;
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

}
