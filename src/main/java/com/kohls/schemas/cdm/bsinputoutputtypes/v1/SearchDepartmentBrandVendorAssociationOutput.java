
package com.kohls.schemas.cdm.bsinputoutputtypes.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.kohls.schemas.cdm.producttypescdm.v1.DepartmentBrandVendorAssociationListType;


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
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}DepartmentBrandVendorAssociationList" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}Count" minOccurs="0"/&gt;
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
    "departmentBrandVendorAssociationList",
    "count"
})
@XmlRootElement(name = "SearchDepartmentBrandVendorAssociationOutput")
public class SearchDepartmentBrandVendorAssociationOutput {

    @XmlElement(name = "DepartmentBrandVendorAssociationList", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1")
    protected DepartmentBrandVendorAssociationListType departmentBrandVendorAssociationList;
    @XmlElement(name = "Count", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1")
    protected Long count;

    /**
     * Gets the value of the departmentBrandVendorAssociationList property.
     * 
     * @return
     *     possible object is
     *     {@link DepartmentBrandVendorAssociationListType }
     *     
     */
    public DepartmentBrandVendorAssociationListType getDepartmentBrandVendorAssociationList() {
        return departmentBrandVendorAssociationList;
    }

    /**
     * Sets the value of the departmentBrandVendorAssociationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepartmentBrandVendorAssociationListType }
     *     
     */
    public void setDepartmentBrandVendorAssociationList(DepartmentBrandVendorAssociationListType value) {
        this.departmentBrandVendorAssociationList = value;
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

}
