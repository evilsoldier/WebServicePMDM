
package com.kohls.schemas.cdm.bsinputoutputtypes.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.kohls.schemas.cdm.producttypescdm.v1.BusinessAreaListType;


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
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}BusinessAreaList" minOccurs="0"/&gt;
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
    "businessAreaList"
})
@XmlRootElement(name = "UpdateBusinessAreaOutput")
public class UpdateBusinessAreaOutput {

    @XmlElement(name = "BusinessAreaList", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1")
    protected BusinessAreaListType businessAreaList;

    /**
     * Gets the value of the businessAreaList property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessAreaListType }
     *     
     */
    public BusinessAreaListType getBusinessAreaList() {
        return businessAreaList;
    }

    /**
     * Sets the value of the businessAreaList property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessAreaListType }
     *     
     */
    public void setBusinessAreaList(BusinessAreaListType value) {
        this.businessAreaList = value;
    }

}
