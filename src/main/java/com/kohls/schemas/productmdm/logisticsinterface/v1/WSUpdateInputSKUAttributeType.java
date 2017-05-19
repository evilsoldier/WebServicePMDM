
package com.kohls.schemas.productmdm.logisticsinterface.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSUpdateInputSKUAttributeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSUpdateInputSKUAttributeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="OmniChannelFulfillmentCharacteristicCodeM" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SKUNumber" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSUpdateInputSKUAttributeType")
public class WSUpdateInputSKUAttributeType {

    @XmlAttribute(name = "OmniChannelFulfillmentCharacteristicCodeM")
    protected String omniChannelFulfillmentCharacteristicCodeM;
    @XmlAttribute(name = "SKUNumber")
    protected Long skuNumber;

    /**
     * Gets the value of the omniChannelFulfillmentCharacteristicCodeM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOmniChannelFulfillmentCharacteristicCodeM() {
        return omniChannelFulfillmentCharacteristicCodeM;
    }

    /**
     * Sets the value of the omniChannelFulfillmentCharacteristicCodeM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOmniChannelFulfillmentCharacteristicCodeM(String value) {
        this.omniChannelFulfillmentCharacteristicCodeM = value;
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
