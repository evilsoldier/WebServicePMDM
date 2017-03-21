
package com.kohls.schemas.cdm.bsinputoutputtypes.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.kohls.schemas.cdm.producttypescdm.v1.AdvanceFilterType;
import com.kohls.schemas.cdm.producttypescdm.v1.ConsumerProductGroupConsumerProductAssociationType;


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
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ConsumerProductGroupConsumerProductAssociation" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}AdvanceFilter" minOccurs="0"/&gt;
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
    "consumerProductGroupConsumerProductAssociation",
    "advanceFilter"
})
@XmlRootElement(name = "SearchCPGroupCPAssociationInput")
public class SearchCPGroupCPAssociationInput {

    @XmlElement(name = "ConsumerProductGroupConsumerProductAssociation", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1")
    protected ConsumerProductGroupConsumerProductAssociationType consumerProductGroupConsumerProductAssociation;
    @XmlElement(name = "AdvanceFilter", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1")
    protected AdvanceFilterType advanceFilter;

    /**
     * Gets the value of the consumerProductGroupConsumerProductAssociation property.
     * 
     * @return
     *     possible object is
     *     {@link ConsumerProductGroupConsumerProductAssociationType }
     *     
     */
    public ConsumerProductGroupConsumerProductAssociationType getConsumerProductGroupConsumerProductAssociation() {
        return consumerProductGroupConsumerProductAssociation;
    }

    /**
     * Sets the value of the consumerProductGroupConsumerProductAssociation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsumerProductGroupConsumerProductAssociationType }
     *     
     */
    public void setConsumerProductGroupConsumerProductAssociation(ConsumerProductGroupConsumerProductAssociationType value) {
        this.consumerProductGroupConsumerProductAssociation = value;
    }

    /**
     * Gets the value of the advanceFilter property.
     * 
     * @return
     *     possible object is
     *     {@link AdvanceFilterType }
     *     
     */
    public AdvanceFilterType getAdvanceFilter() {
        return advanceFilter;
    }

    /**
     * Sets the value of the advanceFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdvanceFilterType }
     *     
     */
    public void setAdvanceFilter(AdvanceFilterType value) {
        this.advanceFilter = value;
    }

}
