
package com.kohls.schemas.cdm.producttypescdm.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VendorUPCCountryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VendorUPCCountryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}VendorUPCCountryAttributes" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VendorUPCCountryType", propOrder = {
    "vendorUPCCountryAttributes"
})
public class VendorUPCCountryType {

    @XmlElement(name = "VendorUPCCountryAttributes")
    protected VendorUPCCountryAttributesType vendorUPCCountryAttributes;

    /**
     * Gets the value of the vendorUPCCountryAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link VendorUPCCountryAttributesType }
     *     
     */
    public VendorUPCCountryAttributesType getVendorUPCCountryAttributes() {
        return vendorUPCCountryAttributes;
    }

    /**
     * Sets the value of the vendorUPCCountryAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link VendorUPCCountryAttributesType }
     *     
     */
    public void setVendorUPCCountryAttributes(VendorUPCCountryAttributesType value) {
        this.vendorUPCCountryAttributes = value;
    }

}
