
package com.kohls.schemas.cdm.bsinputoutputtypes.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.kohls.schemas.cdm.producttypescdm.v1.MDMUserType;
import com.kohls.schemas.cdm.producttypescdm.v1.VendorDepartmentAssociationListType;


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
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}VendorDepartmentAssociationList" minOccurs="0"/&gt;
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
    "vendorDepartmentAssociationList",
    "mdmUser"
})
@XmlRootElement(name = "DeleteVendorDepartmentAssociationInput")
public class DeleteVendorDepartmentAssociationInput {

    @XmlElement(name = "VendorDepartmentAssociationList", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1")
    protected VendorDepartmentAssociationListType vendorDepartmentAssociationList;
    @XmlElement(name = "MDMUser", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1")
    protected MDMUserType mdmUser;

    /**
     * Gets the value of the vendorDepartmentAssociationList property.
     * 
     * @return
     *     possible object is
     *     {@link VendorDepartmentAssociationListType }
     *     
     */
    public VendorDepartmentAssociationListType getVendorDepartmentAssociationList() {
        return vendorDepartmentAssociationList;
    }

    /**
     * Sets the value of the vendorDepartmentAssociationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link VendorDepartmentAssociationListType }
     *     
     */
    public void setVendorDepartmentAssociationList(VendorDepartmentAssociationListType value) {
        this.vendorDepartmentAssociationList = value;
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
