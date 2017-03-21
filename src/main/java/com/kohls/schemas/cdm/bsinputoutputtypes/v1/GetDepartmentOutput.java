
package com.kohls.schemas.cdm.bsinputoutputtypes.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.kohls.schemas.cdm.producttypescdm.v1.DepartmentListType;


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
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}DepartmentList" minOccurs="0"/&gt;
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
    "departmentList"
})
@XmlRootElement(name = "GetDepartmentOutput")
public class GetDepartmentOutput {

    @XmlElement(name = "DepartmentList", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1")
    protected DepartmentListType departmentList;

    /**
     * Gets the value of the departmentList property.
     * 
     * @return
     *     possible object is
     *     {@link DepartmentListType }
     *     
     */
    public DepartmentListType getDepartmentList() {
        return departmentList;
    }

    /**
     * Sets the value of the departmentList property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepartmentListType }
     *     
     */
    public void setDepartmentList(DepartmentListType value) {
        this.departmentList = value;
    }

}
