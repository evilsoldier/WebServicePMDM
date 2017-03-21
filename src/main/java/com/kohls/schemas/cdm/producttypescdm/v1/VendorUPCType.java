
package com.kohls.schemas.cdm.producttypescdm.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This is the association of a specific Vendor Style to a UPC.  This is needed in order to support multiple vendors supplying the same product.
 * 
 * <p>Java class for VendorUPCType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VendorUPCType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}VendorUPCAttributes" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}Color" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}Size" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}VendorUPCCountryList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VendorUPCType", propOrder = {
    "vendorUPCAttributes",
    "color",
    "size",
    "vendorUPCCountryList"
})
public class VendorUPCType {

    @XmlElement(name = "VendorUPCAttributes")
    protected VendorUPCAttributesType vendorUPCAttributes;
    @XmlElement(name = "Color")
    protected ColorType color;
    @XmlElement(name = "Size")
    protected SizeType size;
    @XmlElement(name = "VendorUPCCountryList")
    protected VendorUPCCountryListType vendorUPCCountryList;

    /**
     * Gets the value of the vendorUPCAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link VendorUPCAttributesType }
     *     
     */
    public VendorUPCAttributesType getVendorUPCAttributes() {
        return vendorUPCAttributes;
    }

    /**
     * Sets the value of the vendorUPCAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link VendorUPCAttributesType }
     *     
     */
    public void setVendorUPCAttributes(VendorUPCAttributesType value) {
        this.vendorUPCAttributes = value;
    }

    /**
     * Gets the value of the color property.
     * 
     * @return
     *     possible object is
     *     {@link ColorType }
     *     
     */
    public ColorType getColor() {
        return color;
    }

    /**
     * Sets the value of the color property.
     * 
     * @param value
     *     allowed object is
     *     {@link ColorType }
     *     
     */
    public void setColor(ColorType value) {
        this.color = value;
    }

    /**
     * Gets the value of the size property.
     * 
     * @return
     *     possible object is
     *     {@link SizeType }
     *     
     */
    public SizeType getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     * @param value
     *     allowed object is
     *     {@link SizeType }
     *     
     */
    public void setSize(SizeType value) {
        this.size = value;
    }

    /**
     * Gets the value of the vendorUPCCountryList property.
     * 
     * @return
     *     possible object is
     *     {@link VendorUPCCountryListType }
     *     
     */
    public VendorUPCCountryListType getVendorUPCCountryList() {
        return vendorUPCCountryList;
    }

    /**
     * Sets the value of the vendorUPCCountryList property.
     * 
     * @param value
     *     allowed object is
     *     {@link VendorUPCCountryListType }
     *     
     */
    public void setVendorUPCCountryList(VendorUPCCountryListType value) {
        this.vendorUPCCountryList = value;
    }

}
