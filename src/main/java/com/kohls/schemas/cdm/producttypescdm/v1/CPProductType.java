
package com.kohls.schemas.cdm.producttypescdm.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CPProductType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CPProductType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}CPSKUList" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ConsumerProductAttributes" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CPProductType", propOrder = {
    "cpskuList",
    "consumerProductAttributes"
})
public class CPProductType {

    @XmlElement(name = "CPSKUList")
    protected CPSKUListType cpskuList;
    @XmlElement(name = "ConsumerProductAttributes")
    protected ConsumerProductAttributesType consumerProductAttributes;

    /**
     * Gets the value of the cpskuList property.
     * 
     * @return
     *     possible object is
     *     {@link CPSKUListType }
     *     
     */
    public CPSKUListType getCPSKUList() {
        return cpskuList;
    }

    /**
     * Sets the value of the cpskuList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPSKUListType }
     *     
     */
    public void setCPSKUList(CPSKUListType value) {
        this.cpskuList = value;
    }

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

}
