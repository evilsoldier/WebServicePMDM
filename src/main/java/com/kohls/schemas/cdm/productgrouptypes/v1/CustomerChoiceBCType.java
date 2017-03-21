
package com.kohls.schemas.cdm.productgrouptypes.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A Customer Choice is a unique combination of a Kohl's Style and Color.  It is the actual visual choices that the customer see's when walking into a Kohl's selling facility, excluding the 'size' factor.
 * 
 * <p>Java class for CustomerChoiceBCType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerChoiceBCType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductGroupTypes/V1}KohlsStyleBC" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="CustomerChoiceDescription" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="CustomerChoiceIdentifier" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerChoiceBCType", propOrder = {
    "kohlsStyleBC"
})
public class CustomerChoiceBCType {

    @XmlElement(name = "KohlsStyleBC")
    protected KohlsStyleBCType kohlsStyleBC;
    @XmlAttribute(name = "CustomerChoiceDescription")
    protected String customerChoiceDescription;
    @XmlAttribute(name = "CustomerChoiceIdentifier")
    protected Long customerChoiceIdentifier;

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

    /**
     * Gets the value of the customerChoiceDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerChoiceDescription() {
        return customerChoiceDescription;
    }

    /**
     * Sets the value of the customerChoiceDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerChoiceDescription(String value) {
        this.customerChoiceDescription = value;
    }

    /**
     * Gets the value of the customerChoiceIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCustomerChoiceIdentifier() {
        return customerChoiceIdentifier;
    }

    /**
     * Sets the value of the customerChoiceIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCustomerChoiceIdentifier(Long value) {
        this.customerChoiceIdentifier = value;
    }

}
