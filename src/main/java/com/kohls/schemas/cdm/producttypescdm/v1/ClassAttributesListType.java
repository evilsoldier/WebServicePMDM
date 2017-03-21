
package com.kohls.schemas.cdm.producttypescdm.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClassAttributesListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClassAttributesListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ClassAttributes"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClassAttributesListType", propOrder = {
    "classAttributes"
})
public class ClassAttributesListType {

    @XmlElement(name = "ClassAttributes", required = true)
    protected ClassAttributesType classAttributes;

    /**
     * Gets the value of the classAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link ClassAttributesType }
     *     
     */
    public ClassAttributesType getClassAttributes() {
        return classAttributes;
    }

    /**
     * Sets the value of the classAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassAttributesType }
     *     
     */
    public void setClassAttributes(ClassAttributesType value) {
        this.classAttributes = value;
    }

}
