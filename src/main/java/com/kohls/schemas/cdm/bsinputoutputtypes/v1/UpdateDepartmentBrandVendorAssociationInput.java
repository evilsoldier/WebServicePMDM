
package com.kohls.schemas.cdm.bsinputoutputtypes.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.kohls.schemas.cdm.producttypescdm.v1.DepartmentBrandVendorAssociationListType;
import com.kohls.schemas.cdm.producttypescdm.v1.MDMUserType;


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
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}MDMUser" minOccurs="0"/&gt;
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
    "mdmUser"
})
@XmlRootElement(name = "UpdateDepartmentBrandVendorAssociationInput")
public class UpdateDepartmentBrandVendorAssociationInput {

    @XmlElement(name = "DepartmentBrandVendorAssociationList", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1")
    protected DepartmentBrandVendorAssociationListType departmentBrandVendorAssociationList;
    @XmlElement(name = "MDMUser", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1")
    protected MDMUserType mdmUser;

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
     * Gets the value of the mdmUser property.
     * 
     * @return
     *     possible object is
     *     {@link MDMUserType }
     *     
     */
    public MDMUserType getMDMUser() {
        return mdmUser;
    }

    /**
     * Sets the value of the mdmUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link MDMUserType }
     *     
     */
    public void setMDMUser(MDMUserType value) {
        this.mdmUser = value;
    }

}
