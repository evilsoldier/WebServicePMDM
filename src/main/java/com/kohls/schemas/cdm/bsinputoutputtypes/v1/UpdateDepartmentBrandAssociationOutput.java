
package com.kohls.schemas.cdm.bsinputoutputtypes.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.kohls.schemas.cdm.producttypescdm.v1.DepartmentBrandAssociationListType;


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
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}DepartmentBrandAssociationList" minOccurs="0"/&gt;
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
    "departmentBrandAssociationList"
})
@XmlRootElement(name = "UpdateDepartmentBrandAssociationOutput")
public class UpdateDepartmentBrandAssociationOutput {

    @XmlElement(name = "DepartmentBrandAssociationList", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1")
    protected DepartmentBrandAssociationListType departmentBrandAssociationList;

    /**
     * Gets the value of the departmentBrandAssociationList property.
     * 
     * @return
     *     possible object is
     *     {@link DepartmentBrandAssociationListType }
     *     
     */
    public DepartmentBrandAssociationListType getDepartmentBrandAssociationList() {
        return departmentBrandAssociationList;
    }

    /**
     * Sets the value of the departmentBrandAssociationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepartmentBrandAssociationListType }
     *     
     */
    public void setDepartmentBrandAssociationList(DepartmentBrandAssociationListType value) {
        this.departmentBrandAssociationList = value;
    }

}
