
package com.kohls.schemas.cdm.bsinputoutputtypes.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.kohls.schemas.cdm.producttypescdm.v1.ConsumerProductGroupListType;
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
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ConsumerProductGroupList" minOccurs="0"/&gt;
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
    "consumerProductGroupList",
    "count",
    "extendedFilterOutput"
})
@XmlRootElement(name = "SearchConsumerProductGroupOutput")
public class SearchConsumerProductGroupOutput {

    @XmlElement(name = "ConsumerProductGroupList", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1")
    protected ConsumerProductGroupListType consumerProductGroupList;
    @XmlElement(name = "Count", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1")
    protected Long count;
    @XmlElement(name = "ExtendedFilterOutput", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1")
    protected ExtendedFilterOutputType extendedFilterOutput;

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
