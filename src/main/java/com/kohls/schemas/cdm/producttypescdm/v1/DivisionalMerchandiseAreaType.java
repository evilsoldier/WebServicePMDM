
package com.kohls.schemas.cdm.producttypescdm.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.kohls.schemas.cdm.productgrouptypes.v1.GeneralMerchandiseAreaBCType;


/**
 * Divisional Merchandise Area is the second level of categorization in the merchandise hierarchy.  (ie:  Shoes, Home, Misses, Kids, Intimate) 
 * 
 * <p>Java class for DivisionalMerchandiseAreaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DivisionalMerchandiseAreaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}DivisionalMerchandiseAreaAttributes" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}DepartmentList" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductGroupTypes/V1}GeneralMerchandiseAreaBC" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DivisionalMerchandiseAreaType", propOrder = {
    "divisionalMerchandiseAreaAttributes",
    "departmentList",
    "generalMerchandiseAreaBC"
})
public class DivisionalMerchandiseAreaType {

    @XmlElement(name = "DivisionalMerchandiseAreaAttributes")
    protected DivisionalMerchandiseAreaAttributesType divisionalMerchandiseAreaAttributes;
    @XmlElement(name = "DepartmentList")
    protected DepartmentListType departmentList;
    @XmlElement(name = "GeneralMerchandiseAreaBC", namespace = "http://www.kohls.com/schemas/cdm/ProductGroupTypes/V1")
    protected GeneralMerchandiseAreaBCType generalMerchandiseAreaBC;

    /**
     * Gets the value of the divisionalMerchandiseAreaAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link DivisionalMerchandiseAreaAttributesType }
     *     
     */
    public DivisionalMerchandiseAreaAttributesType getDivisionalMerchandiseAreaAttributes() {
        return divisionalMerchandiseAreaAttributes;
    }

    /**
     * Sets the value of the divisionalMerchandiseAreaAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link DivisionalMerchandiseAreaAttributesType }
     *     
     */
    public void setDivisionalMerchandiseAreaAttributes(DivisionalMerchandiseAreaAttributesType value) {
        this.divisionalMerchandiseAreaAttributes = value;
    }

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

    /**
     * Gets the value of the generalMerchandiseAreaBC property.
     * 
     * @return
     *     possible object is
     *     {@link GeneralMerchandiseAreaBCType }
     *     
     */
    public GeneralMerchandiseAreaBCType getGeneralMerchandiseAreaBC() {
        return generalMerchandiseAreaBC;
    }

    /**
     * Sets the value of the generalMerchandiseAreaBC property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralMerchandiseAreaBCType }
     *     
     */
    public void setGeneralMerchandiseAreaBC(GeneralMerchandiseAreaBCType value) {
        this.generalMerchandiseAreaBC = value;
    }

}
