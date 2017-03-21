
package com.kohls.schemas.cdm.producttypescdm.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.kohls.schemas.cdm.productgrouptypes.v1.KohlsStyleBCType;


/**
 * A Customer Choice is a unique combination of a Kohl's Style and Color.  It is the actual visual choices that the customer see's when walking into a Kohl's selling facility, excluding the 'size' factor.
 * 
 * <p>Java class for CustomerChoiceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerChoiceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}CustomerChoiceAttributes" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}SKUList" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductGroupTypes/V1}KohlsStyleBC" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerChoiceType", propOrder = {
    "customerChoiceAttributes",
    "skuList",
    "kohlsStyleBC"
})
public class CustomerChoiceType {

    @XmlElement(name = "CustomerChoiceAttributes")
    protected CustomerChoiceAttributesType customerChoiceAttributes;
    @XmlElement(name = "SKUList")
    protected SKUListType skuList;
    @XmlElement(name = "KohlsStyleBC", namespace = "http://www.kohls.com/schemas/cdm/ProductGroupTypes/V1")
    protected KohlsStyleBCType kohlsStyleBC;

    /**
     * Gets the value of the customerChoiceAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerChoiceAttributesType }
     *     
     */
    public CustomerChoiceAttributesType getCustomerChoiceAttributes() {
        return customerChoiceAttributes;
    }

    /**
     * Sets the value of the customerChoiceAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerChoiceAttributesType }
     *     
     */
    public void setCustomerChoiceAttributes(CustomerChoiceAttributesType value) {
        this.customerChoiceAttributes = value;
    }

    /**
     * Gets the value of the skuList property.
     * 
     * @return
     *     possible object is
     *     {@link SKUListType }
     *     
     */
    public SKUListType getSKUList() {
        return skuList;
    }

    /**
     * Sets the value of the skuList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SKUListType }
     *     
     */
    public void setSKUList(SKUListType value) {
        this.skuList = value;
    }

    /**
     * Gets the value of the kohlsStyleBC property.
     * 
     * @return
     *     possible object is
     *     {@link KohlsStyleBCType }
     *     
     */
    public KohlsStyleBCType getKohlsStyleBC() {
        return kohlsStyleBC;
    }

    /**
     * Sets the value of the kohlsStyleBC property.
     * 
     * @param value
     *     allowed object is
     *     {@link KohlsStyleBCType }
     *     
     */
    public void setKohlsStyleBC(KohlsStyleBCType value) {
        this.kohlsStyleBC = value;
    }

}
