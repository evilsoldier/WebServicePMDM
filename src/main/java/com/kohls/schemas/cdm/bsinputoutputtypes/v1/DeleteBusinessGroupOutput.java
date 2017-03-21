
package com.kohls.schemas.cdm.bsinputoutputtypes.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.kohls.schemas.cdm.producttypescdm.v1.BusinessGroupListType;


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
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}BusinessGroupList" minOccurs="0"/&gt;
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
    "businessGroupList"
})
@XmlRootElement(name = "DeleteBusinessGroupOutput")
public class DeleteBusinessGroupOutput {

    @XmlElement(name = "BusinessGroupList", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1")
    protected BusinessGroupListType businessGroupList;

    /**
     * Gets the value of the businessGroupList property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessGroupListType }
     *     
     */
    public BusinessGroupListType getBusinessGroupList() {
        return businessGroupList;
    }

    /**
     * Sets the value of the businessGroupList property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessGroupListType }
     *     
     */
    public void setBusinessGroupList(BusinessGroupListType value) {
        this.businessGroupList = value;
    }

}
