
package com.kohls.schemas.cdm.producttypescdm.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A type of ORGANIZATION that supplies ITEMs (Goods or Services) to an Enterprise for resale or internal use. Can specify a (high level) VENDOR or a Location-specific VENDOR (if that is the level at which transactions are done for the Enterprise). Example: Ordering goods or services from ACME (or Denver ACME
 * 
 * <p>Java class for VendorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VendorType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}VendorAttributes" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}VendorDepartmentAssociationList" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}VendorStyleList" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}VendorUPCList" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}KohlsStyleVendorStylePartnerList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VendorType", propOrder = {
    "vendorAttributes",
    "vendorDepartmentAssociationList",
    "vendorStyleList",
    "vendorUPCList",
    "kohlsStyleVendorStylePartnerList"
})
public class VendorType {

    @XmlElement(name = "VendorAttributes")
    protected VendorAttributesType vendorAttributes;
    @XmlElement(name = "VendorDepartmentAssociationList")
    protected VendorDepartmentAssociationListType vendorDepartmentAssociationList;
    @XmlElement(name = "VendorStyleList")
    protected KohlsStyleVendorStyleAssociationListType vendorStyleList;
    @XmlElement(name = "VendorUPCList")
    protected VendorUPCListType vendorUPCList;
    @XmlElement(name = "KohlsStyleVendorStylePartnerList")
    protected KohlsStyleVendorStylePartnerListType kohlsStyleVendorStylePartnerList;

    /**
     * Gets the value of the vendorAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link VendorAttributesType }
     *     
     */
    public VendorAttributesType getVendorAttributes() {
        return vendorAttributes;
    }

    /**
     * Sets the value of the vendorAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link VendorAttributesType }
     *     
     */
    public void setVendorAttributes(VendorAttributesType value) {
        this.vendorAttributes = value;
    }

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
     * Gets the value of the vendorStyleList property.
     * 
     * @return
     *     possible object is
     *     {@link KohlsStyleVendorStyleAssociationListType }
     *     
     */
    public KohlsStyleVendorStyleAssociationListType getVendorStyleList() {
        return vendorStyleList;
    }

    /**
     * Sets the value of the vendorStyleList property.
     * 
     * @param value
     *     allowed object is
     *     {@link KohlsStyleVendorStyleAssociationListType }
     *     
     */
    public void setVendorStyleList(KohlsStyleVendorStyleAssociationListType value) {
        this.vendorStyleList = value;
    }

    /**
     * Gets the value of the vendorUPCList property.
     * 
     * @return
     *     possible object is
     *     {@link VendorUPCListType }
     *     
     */
    public VendorUPCListType getVendorUPCList() {
        return vendorUPCList;
    }

    /**
     * Sets the value of the vendorUPCList property.
     * 
     * @param value
     *     allowed object is
     *     {@link VendorUPCListType }
     *     
     */
    public void setVendorUPCList(VendorUPCListType value) {
        this.vendorUPCList = value;
    }

    /**
     * Gets the value of the kohlsStyleVendorStylePartnerList property.
     * 
     * @return
     *     possible object is
     *     {@link KohlsStyleVendorStylePartnerListType }
     *     
     */
    public KohlsStyleVendorStylePartnerListType getKohlsStyleVendorStylePartnerList() {
        return kohlsStyleVendorStylePartnerList;
    }

    /**
     * Sets the value of the kohlsStyleVendorStylePartnerList property.
     * 
     * @param value
     *     allowed object is
     *     {@link KohlsStyleVendorStylePartnerListType }
     *     
     */
    public void setKohlsStyleVendorStylePartnerList(KohlsStyleVendorStylePartnerListType value) {
        this.kohlsStyleVendorStylePartnerList = value;
    }

}
