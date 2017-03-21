
package com.kohls.schemas.cdm.producttypescdm.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.kohls.schemas.cdm.productgrouptypes.v1.SubClassBCType;


/**
 * A collection of sku's/upc's that all have similar characteristics and are considered a particular 'style'.  (Ex. 12345678 Sonoma Hiking Boot)
 * 
 * <p>Java class for KohlsStyleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KohlsStyleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}KohlsStyleAttributes" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}VendorStyleList" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}CustomerChoiceList" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}KohlsStyleProductCapacityList" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductGroupTypes/V1}SubClassBC" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}KohlsStyleCountryList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KohlsStyleType", propOrder = {
    "kohlsStyleAttributes",
    "vendorStyleList",
    "customerChoiceList",
    "kohlsStyleProductCapacityList",
    "subClassBC",
    "kohlsStyleCountryList"
})
public class KohlsStyleType {

    @XmlElement(name = "KohlsStyleAttributes")
    protected KohlsStyleAttributesType kohlsStyleAttributes;
    @XmlElement(name = "VendorStyleList")
    protected KohlsStyleVendorStyleAssociationListType vendorStyleList;
    @XmlElement(name = "CustomerChoiceList")
    protected CustomerChoiceListType customerChoiceList;
    @XmlElement(name = "KohlsStyleProductCapacityList")
    protected KohlsStyleProductCapacityListType kohlsStyleProductCapacityList;
    @XmlElement(name = "SubClassBC", namespace = "http://www.kohls.com/schemas/cdm/ProductGroupTypes/V1")
    protected SubClassBCType subClassBC;
    @XmlElement(name = "KohlsStyleCountryList")
    protected KohlsStyleCountryListType kohlsStyleCountryList;

    /**
     * Gets the value of the kohlsStyleAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link KohlsStyleAttributesType }
     *     
     */
    public KohlsStyleAttributesType getKohlsStyleAttributes() {
        return kohlsStyleAttributes;
    }

    /**
     * Sets the value of the kohlsStyleAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link KohlsStyleAttributesType }
     *     
     */
    public void setKohlsStyleAttributes(KohlsStyleAttributesType value) {
        this.kohlsStyleAttributes = value;
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
     * Gets the value of the customerChoiceList property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerChoiceListType }
     *     
     */
    public CustomerChoiceListType getCustomerChoiceList() {
        return customerChoiceList;
    }

    /**
     * Sets the value of the customerChoiceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerChoiceListType }
     *     
     */
    public void setCustomerChoiceList(CustomerChoiceListType value) {
        this.customerChoiceList = value;
    }

    /**
     * Gets the value of the kohlsStyleProductCapacityList property.
     * 
     * @return
     *     possible object is
     *     {@link KohlsStyleProductCapacityListType }
     *     
     */
    public KohlsStyleProductCapacityListType getKohlsStyleProductCapacityList() {
        return kohlsStyleProductCapacityList;
    }

    /**
     * Sets the value of the kohlsStyleProductCapacityList property.
     * 
     * @param value
     *     allowed object is
     *     {@link KohlsStyleProductCapacityListType }
     *     
     */
    public void setKohlsStyleProductCapacityList(KohlsStyleProductCapacityListType value) {
        this.kohlsStyleProductCapacityList = value;
    }

    /**
     * Gets the value of the subClassBC property.
     * 
     * @return
     *     possible object is
     *     {@link SubClassBCType }
     *     
     */
    public SubClassBCType getSubClassBC() {
        return subClassBC;
    }

    /**
     * Sets the value of the subClassBC property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubClassBCType }
     *     
     */
    public void setSubClassBC(SubClassBCType value) {
        this.subClassBC = value;
    }

    /**
     * Gets the value of the kohlsStyleCountryList property.
     * 
     * @return
     *     possible object is
     *     {@link KohlsStyleCountryListType }
     *     
     */
    public KohlsStyleCountryListType getKohlsStyleCountryList() {
        return kohlsStyleCountryList;
    }

    /**
     * Sets the value of the kohlsStyleCountryList property.
     * 
     * @param value
     *     allowed object is
     *     {@link KohlsStyleCountryListType }
     *     
     */
    public void setKohlsStyleCountryList(KohlsStyleCountryListType value) {
        this.kohlsStyleCountryList = value;
    }

}
