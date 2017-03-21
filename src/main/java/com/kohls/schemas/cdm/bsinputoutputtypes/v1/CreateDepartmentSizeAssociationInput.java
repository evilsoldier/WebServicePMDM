
package com.kohls.schemas.cdm.bsinputoutputtypes.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.kohls.schemas.cdm.producttypescdm.v1.DepartmentSizeAssociationListType;
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
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}DepartmentSizeAssociationList" minOccurs="0"/&gt;
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
    "departmentSizeAssociationList",
    "mdmUser"
})
@XmlRootElement(name = "CreateDepartmentSizeAssociationInput")
public class CreateDepartmentSizeAssociationInput {

    @XmlElement(name = "DepartmentSizeAssociationList", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1")
    protected DepartmentSizeAssociationListType departmentSizeAssociationList;
    @XmlElement(name = "MDMUser", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1")
    protected MDMUserType mdmUser;

    /**
     * Gets the value of the departmentSizeAssociationList property.
     * 
     * @return
     *     possible object is
     *     {@link DepartmentSizeAssociationListType }
     *     
     */
    public DepartmentSizeAssociationListType getDepartmentSizeAssociationList() {
        return departmentSizeAssociationList;
    }

    /**
     * Sets the value of the departmentSizeAssociationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepartmentSizeAssociationListType }
     *     
     */
    public void setDepartmentSizeAssociationList(DepartmentSizeAssociationListType value) {
        this.departmentSizeAssociationList = value;
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