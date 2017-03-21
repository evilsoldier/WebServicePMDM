
package com.kohls.schemas.cdm.bsinputoutputtypes.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.kohls.schemas.cdm.producttypescdm.v1.CustomerChoiceListType;


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
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}CustomerChoiceList" minOccurs="0"/&gt;
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
    "customerChoiceList"
})
@XmlRootElement(name = "GetCCOutput")
public class GetCCOutput {

    @XmlElement(name = "CustomerChoiceList", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1")
    protected CustomerChoiceListType customerChoiceList;

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

}
