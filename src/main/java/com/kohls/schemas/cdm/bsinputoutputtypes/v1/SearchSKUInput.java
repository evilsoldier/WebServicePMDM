
package com.kohls.schemas.cdm.bsinputoutputtypes.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.kohls.schemas.cdm.producttypescdm.v1.AdvanceFilterType;
import com.kohls.schemas.cdm.producttypescdm.v1.ExtendedFilterInputType;
import com.kohls.schemas.cdm.producttypescdm.v1.SKUType;


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
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}SKU" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}AdvanceFilter" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ExtendedFilterInput" minOccurs="0"/&gt;
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
    "sku",
    "advanceFilter",
    "extendedFilterInput"
})
@XmlRootElement(name = "SearchSKUInput")
public class SearchSKUInput {

    @XmlElement(name = "SKU", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1")
    protected SKUType sku;
    @XmlElement(name = "AdvanceFilter", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1")
    protected AdvanceFilterType advanceFilter;
    @XmlElement(name = "ExtendedFilterInput", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1")
    protected ExtendedFilterInputType extendedFilterInput;

    /**
     * Gets the value of the sku property.
     * 
     * @return
     *     possible object is
     *     {@link SKUType }
     *     
     */
    public SKUType getSKU() {
        return sku;
    }

    /**
     * Sets the value of the sku property.
     * 
     * @param value
     *     allowed object is
     *     {@link SKUType }
     *     
     */
    public void setSKU(SKUType value) {
        this.sku = value;
    }

    /**
     * Gets the value of the advanceFilter property.
     * 
     * @return
     *     possible object is
     *     {@link AdvanceFilterType }
     *     
     */
    public AdvanceFilterType getAdvanceFilter() {
        return advanceFilter;
    }

    /**
     * Sets the value of the advanceFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdvanceFilterType }
     *     
     */
    public void setAdvanceFilter(AdvanceFilterType value) {
        this.advanceFilter = value;
    }

    /**
     * Gets the value of the extendedFilterInput property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedFilterInputType }
     *     
     */
    public ExtendedFilterInputType getExtendedFilterInput() {
        return extendedFilterInput;
    }

    /**
     * Sets the value of the extendedFilterInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedFilterInputType }
     *     
     */
    public void setExtendedFilterInput(ExtendedFilterInputType value) {
        this.extendedFilterInput = value;
    }

}
