
package com.kohls.schemas.cdm.producttypescdm.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.kohls.schemas.cdm.productgrouptypes.v1.SKUBCType;


/**
 * A barcode symbology (i.e., a specific type of barcode), that is widely used in North America, and in countries including the UK, Australia, and New Zealand for tracking trade items in stores.
 * 
 * <p>Java class for UPCType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UPCType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}UPCAttributes" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}VendorUPCList" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductGroupTypes/V1}SKUBC" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UPCType", propOrder = {
    "upcAttributes",
    "vendorUPCList",
    "skubc"
})
public class UPCType {

    @XmlElement(name = "UPCAttributes")
    protected UPCAttributesType upcAttributes;
    @XmlElement(name = "VendorUPCList")
    protected VendorUPCListType vendorUPCList;
    @XmlElement(name = "SKUBC", namespace = "http://www.kohls.com/schemas/cdm/ProductGroupTypes/V1")
    protected SKUBCType skubc;

    /**
     * Gets the value of the upcAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link UPCAttributesType }
     *     
     */
    public UPCAttributesType getUPCAttributes() {
        return upcAttributes;
    }

    /**
     * Sets the value of the upcAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link UPCAttributesType }
     *     
     */
    public void setUPCAttributes(UPCAttributesType value) {
        this.upcAttributes = value;
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
     * Gets the value of the skubc property.
     * 
     * @return
     *     possible object is
     *     {@link SKUBCType }
     *     
     */
    public SKUBCType getSKUBC() {
        return skubc;
    }

    /**
     * Sets the value of the skubc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SKUBCType }
     *     
     */
    public void setSKUBC(SKUBCType value) {
        this.skubc = value;
    }

}
