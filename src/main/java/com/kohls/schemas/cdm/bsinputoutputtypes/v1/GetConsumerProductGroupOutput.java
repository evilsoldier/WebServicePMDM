
package com.kohls.schemas.cdm.bsinputoutputtypes.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.kohls.schemas.cdm.producttypescdm.v1.ConsumerProductGroupListType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
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
@XmlType(name = "", propOrder = {
    "consumerProductGroupList"
})
@XmlRootElement(name = "GetConsumerProductGroupOutput")
public class GetConsumerProductGroupOutput {

    @XmlElement(name = "ConsumerProductGroupList", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1")
    protected ConsumerProductGroupListType consumerProductGroupList;

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
