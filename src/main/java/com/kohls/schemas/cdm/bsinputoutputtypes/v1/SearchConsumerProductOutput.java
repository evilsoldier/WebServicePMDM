
package com.kohls.schemas.cdm.bsinputoutputtypes.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.kohls.schemas.cdm.producttypescdm.v1.ConsumerProductListType;
import com.kohls.schemas.cdm.producttypescdm.v1.ExtendedFilterOutputType;


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
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ConsumerProductList" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}Count" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ExtendedFilterOutput" minOccurs="0"/&gt;
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
    "consumerProductList",
    "count",
    "extendedFilterOutput"
})
@XmlRootElement(name = "SearchConsumerProductOutput")
public class SearchConsumerProductOutput {

    @XmlElement(name = "ConsumerProductList", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1")
    protected ConsumerProductListType consumerProductList;
    @XmlElement(name = "Count", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1")
    protected Long count;
    @XmlElement(name = "ExtendedFilterOutput", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1")
    protected ExtendedFilterOutputType extendedFilterOutput;

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
     * Gets the value of the count property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCount(Long value) {
        this.count = value;
    }

    /**
     * Gets the value of the extendedFilterOutput property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedFilterOutputType }
     *     
     */
    public ExtendedFilterOutputType getExtendedFilterOutput() {
        return extendedFilterOutput;
    }

    /**
     * Sets the value of the extendedFilterOutput property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedFilterOutputType }
     *     
     */
    public void setExtendedFilterOutput(ExtendedFilterOutputType value) {
        this.extendedFilterOutput = value;
    }

}
