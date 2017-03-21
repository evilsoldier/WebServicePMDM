
package com.kohls.schemas.cdm.productgrouptypes.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A subclass is a categorization in the merchandise hierarchy. (Ex. Mens/Kids --> Mens Sportsware --> Mens Bottoms --> Shorts --> Walking Shorts)
 * 
 * <p>Java class for SubClassBCType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubClassBCType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductGroupTypes/V1}ClassBC" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="SubClassDescription" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SubClassNumber" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubClassBCType", propOrder = {
    "classBC"
})
public class SubClassBCType {

    @XmlElement(name = "ClassBC")
    protected ClassBCType classBC;
    @XmlAttribute(name = "SubClassDescription")
    protected String subClassDescription;
    @XmlAttribute(name = "SubClassNumber")
    protected Long subClassNumber;

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

    /**
     * Gets the value of the subClassDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubClassDescription() {
        return subClassDescription;
    }

    /**
     * Sets the value of the subClassDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubClassDescription(String value) {
        this.subClassDescription = value;
    }

    /**
     * Gets the value of the subClassNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSubClassNumber() {
        return subClassNumber;
    }

    /**
     * Sets the value of the subClassNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSubClassNumber(Long value) {
        this.subClassNumber = value;
    }

}
