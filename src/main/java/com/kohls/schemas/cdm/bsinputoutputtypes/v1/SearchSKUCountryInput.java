
package com.kohls.schemas.cdm.bsinputoutputtypes.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.kohls.schemas.cdm.producttypescdm.v1.AdvanceFilterType;
import com.kohls.schemas.cdm.producttypescdm.v1.ExtendedFilterInputType;
import com.kohls.schemas.cdm.producttypescdm.v1.SKUCountryType;


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
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}SKUCountry" minOccurs="0"/&gt;
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
    "skuCountry",
    "advanceFilter",
    "extendedFilterInput"
})
@XmlRootElement(name = "SearchSKUCountryInput")
public class SearchSKUCountryInput {

    @XmlElement(name = "SKUCountry", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1")
    protected SKUCountryType skuCountry;
    @XmlElement(name = "AdvanceFilter", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1")
    protected AdvanceFilterType advanceFilter;
    @XmlElement(name = "ExtendedFilterInput", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1")
    protected ExtendedFilterInputType extendedFilterInput;

    /**
     * Gets the value of the skuCountry property.
     * 
     * @return
     *     possible object is
     *     {@link SKUCountryType }
     *     
     */
    public SKUCountryType getSKUCountry() {
        return skuCountry;
    }

    /**
     * Sets the value of the skuCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link SKUCountryType }
     *     
     */
    public void setSKUCountry(SKUCountryType value) {
        this.skuCountry = value;
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
