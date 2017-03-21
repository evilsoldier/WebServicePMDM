
package com.kohls.schemas.cdm.producttypescdm.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.kohls.schemas.cdm.productgrouptypes.v1.ClassBCType;


/**
 * A subclass is a categorization in the merchandise hierarchy. (Ex. Mens/Kids --> Mens Sportsware --> Mens Bottoms --> Shorts --> Walking Shorts)
 * 
 * <p>Java class for SubClassType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubClassType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}SubClassAttributes" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}KohlsStyleList" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductGroupTypes/V1}ClassBC" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubClassType", propOrder = {
    "subClassAttributes",
    "kohlsStyleList",
    "classBC"
})
public class SubClassType {

    @XmlElement(name = "SubClassAttributes")
    protected SubClassAttributesType subClassAttributes;
    @XmlElement(name = "KohlsStyleList")
    protected KohlsStyleListType kohlsStyleList;
    @XmlElement(name = "ClassBC", namespace = "http://www.kohls.com/schemas/cdm/ProductGroupTypes/V1")
    protected ClassBCType classBC;

    /**
     * Gets the value of the subClassAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link SubClassAttributesType }
     *     
     */
    public SubClassAttributesType getSubClassAttributes() {
        return subClassAttributes;
    }

    /**
     * Sets the value of the subClassAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubClassAttributesType }
     *     
     */
    public void setSubClassAttributes(SubClassAttributesType value) {
        this.subClassAttributes = value;
    }

    /**
     * Gets the value of the kohlsStyleList property.
     * 
     * @return
     *     possible object is
     *     {@link KohlsStyleListType }
     *     
     */
    public KohlsStyleListType getKohlsStyleList() {
        return kohlsStyleList;
    }

    /**
     * Sets the value of the kohlsStyleList property.
     * 
     * @param value
     *     allowed object is
     *     {@link KohlsStyleListType }
     *     
     */
    public void setKohlsStyleList(KohlsStyleListType value) {
        this.kohlsStyleList = value;
    }

    /**
     * Gets the value of the classBC property.
     * 
     * @return
     *     possible object is
     *     {@link ClassBCType }
     *     
     */
    public ClassBCType getClassBC() {
        return classBC;
    }

    /**
     * Sets the value of the classBC property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassBCType }
     *     
     */
    public void setClassBC(ClassBCType value) {
        this.classBC = value;
    }

}
