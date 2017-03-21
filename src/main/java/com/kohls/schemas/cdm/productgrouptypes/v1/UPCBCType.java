
package com.kohls.schemas.cdm.productgrouptypes.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A barcode symbology (i.e., a specific type of barcode), that is widely used in North America, and in countries including the UK, Australia, and New Zealand for tracking trade items in stores.
 * 
 * <p>Java class for UPCBCType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UPCBCType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductGroupTypes/V1}SKUBC" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="UPCNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UPCBCType", propOrder = {
    "skubc"
})
public class UPCBCType {

    @XmlElement(name = "SKUBC")
    protected SKUBCType skubc;
    @XmlAttribute(name = "UPCNumber")
    protected String upcNumber;

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

    /**
     * Gets the value of the upcNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUPCNumber() {
        return upcNumber;
    }

    /**
     * Sets the value of the upcNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUPCNumber(String value) {
        this.upcNumber = value;
    }

}
