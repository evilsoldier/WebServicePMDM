
package com.kohls.schemas.cdm.producttypescdm.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.kohls.schemas.cdm.productgrouptypes.v1.DivisionalMerchandiseAreaBCType;


/**
 * A department is a categorization in the merchandise hierarchy.  It is the level under Divisional Merchandise Area and groups together Major Classes. (Ex. Mens/Kids --> Mens Sportsware --> Mens Bottoms)
 * 
 * <p>Java class for DepartmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DepartmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}DepartmentAttributes" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ClassList" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}VendorList" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}BrandList" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}DepartmentSizeAssociationList" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductGroupTypes/V1}DivisionalMerchandiseAreaBC" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DepartmentType", propOrder = {
    "departmentAttributes",
    "classList",
    "vendorList",
    "brandList",
    "departmentSizeAssociationList",
    "divisionalMerchandiseAreaBC"
})
public class DepartmentType {

    @XmlElement(name = "DepartmentAttributes")
    protected DepartmentAttributesType departmentAttributes;
    @XmlElement(name = "ClassList")
    protected ClassListType classList;
    @XmlElement(name = "VendorList")
    protected VendorListType vendorList;
    @XmlElement(name = "BrandList")
    protected BrandListType brandList;
    @XmlElement(name = "DepartmentSizeAssociationList")
    protected DepartmentSizeAssociationListType departmentSizeAssociationList;
    @XmlElement(name = "DivisionalMerchandiseAreaBC", namespace = "http://www.kohls.com/schemas/cdm/ProductGroupTypes/V1")
    protected DivisionalMerchandiseAreaBCType divisionalMerchandiseAreaBC;

    /**
     * Gets the value of the departmentAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link DepartmentAttributesType }
     *     
     */
    public DepartmentAttributesType getDepartmentAttributes() {
        return departmentAttributes;
    }

    /**
     * Sets the value of the departmentAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepartmentAttributesType }
     *     
     */
    public void setDepartmentAttributes(DepartmentAttributesType value) {
        this.departmentAttributes = value;
    }

    /**
     * Gets the value of the classList property.
     * 
     * @return
     *     possible object is
     *     {@link ClassListType }
     *     
     */
    public ClassListType getClassList() {
        return classList;
    }

    /**
     * Sets the value of the classList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassListType }
     *     
     */
    public void setClassList(ClassListType value) {
        this.classList = value;
    }

    /**
     * Gets the value of the vendorList property.
     * 
     * @return
     *     possible object is
     *     {@link VendorListType }
     *     
     */
    public VendorListType getVendorList() {
        return vendorList;
    }

    /**
     * Sets the value of the vendorList property.
     * 
     * @param value
     *     allowed object is
     *     {@link VendorListType }
     *     
     */
    public void setVendorList(VendorListType value) {
        this.vendorList = value;
    }

    /**
     * Gets the value of the brandList property.
     * 
     * @return
     *     possible object is
     *     {@link BrandListType }
     *     
     */
    public BrandListType getBrandList() {
        return brandList;
    }

    /**
     * Sets the value of the brandList property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrandListType }
     *     
     */
    public void setBrandList(BrandListType value) {
        this.brandList = value;
    }

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
     * Gets the value of the divisionalMerchandiseAreaBC property.
     * 
     * @return
     *     possible object is
     *     {@link DivisionalMerchandiseAreaBCType }
     *     
     */
    public DivisionalMerchandiseAreaBCType getDivisionalMerchandiseAreaBC() {
        return divisionalMerchandiseAreaBC;
    }

    /**
     * Sets the value of the divisionalMerchandiseAreaBC property.
     * 
     * @param value
     *     allowed object is
     *     {@link DivisionalMerchandiseAreaBCType }
     *     
     */
    public void setDivisionalMerchandiseAreaBC(DivisionalMerchandiseAreaBCType value) {
        this.divisionalMerchandiseAreaBC = value;
    }

}
