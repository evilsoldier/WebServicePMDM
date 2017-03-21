
package com.kohls.schemas.cdm.productgrouptypes.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A collection of sku's/upc's that all have similar characteristics and are considered a particular 'style'.  (Ex. 12345678 Sonoma Hiking Boot)
 * 
 * <p>Java class for KohlsStyleBCType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KohlsStyleBCType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductGroupTypes/V1}SubClassBC" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="KohlsStyleDescription" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="KohlsStyleIdentifier" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KohlsStyleBCType", propOrder = {
    "subClassBC"
})
public class KohlsStyleBCType {

    @XmlElement(name = "SubClassBC")
    protected SubClassBCType subClassBC;
    @XmlAttribute(name = "KohlsStyleDescription")
    protected String kohlsStyleDescription;
    @XmlAttribute(name = "KohlsStyleIdentifier")
    protected Long kohlsStyleIdentifier;

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
     * Gets the value of the kohlsStyleDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKohlsStyleDescription() {
        return kohlsStyleDescription;
    }

    /**
     * Sets the value of the kohlsStyleDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKohlsStyleDescription(String value) {
        this.kohlsStyleDescription = value;
    }

    /**
     * Gets the value of the kohlsStyleIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getKohlsStyleIdentifier() {
        return kohlsStyleIdentifier;
    }

    /**
     * Sets the value of the kohlsStyleIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setKohlsStyleIdentifier(Long value) {
        this.kohlsStyleIdentifier = value;
    }

}
