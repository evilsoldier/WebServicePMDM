
package com.kohls.schemas.cdm.producttypescdm.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The consumer-recognized name associated with a group of similar, like or complimentaty items, that are marketed as a group. Examples would include Little Tikes, Levi's, Sonoma, Matel.  Brands are categorized as 'private', 'exclusive', 'regular'. We really have levels of Brand.  Mattel --> Disney --> Snow White This is now called Persona Category, Persona Theme and Persona Subject.. (These are all enforced using a classification scheme in MDM)
 * 
 * <p>Java class for BrandType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BrandType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}BrandAttributes" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}DepartmentBrandVendorAssociationList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BrandType", propOrder = {
    "brandAttributes",
    "departmentBrandVendorAssociationList"
})
public class BrandType {

    @XmlElement(name = "BrandAttributes")
    protected BrandAttributesType brandAttributes;
    @XmlElement(name = "DepartmentBrandVendorAssociationList")
    protected DepartmentBrandVendorAssociationListType departmentBrandVendorAssociationList;

    /**
     * Gets the value of the brandAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link BrandAttributesType }
     *     
     */
    public BrandAttributesType getBrandAttributes() {
        return brandAttributes;
    }

    /**
     * Sets the value of the brandAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrandAttributesType }
     *     
     */
    public void setBrandAttributes(BrandAttributesType value) {
        this.brandAttributes = value;
    }

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

}
