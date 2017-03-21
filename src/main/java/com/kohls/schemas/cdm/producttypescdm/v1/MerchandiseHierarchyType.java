
package com.kohls.schemas.cdm.producttypescdm.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MerchandiseHierarchyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MerchandiseHierarchyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}OperatingCompanyList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MerchandiseHierarchyType", propOrder = {
    "operatingCompanyList"
})
public class MerchandiseHierarchyType {

    @XmlElement(name = "OperatingCompanyList")
    protected OperatingCompanyListType operatingCompanyList;

    /**
     * Gets the value of the operatingCompanyList property.
     * 
     * @return
     *     possible object is
     *     {@link OperatingCompanyListType }
     *     
     */
    public OperatingCompanyListType getOperatingCompanyList() {
        return operatingCompanyList;
    }

    /**
     * Sets the value of the operatingCompanyList property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatingCompanyListType }
     *     
     */
    public void setOperatingCompanyList(OperatingCompanyListType value) {
        this.operatingCompanyList = value;
    }

}
