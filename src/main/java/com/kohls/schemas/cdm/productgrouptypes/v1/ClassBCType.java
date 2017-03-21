
package com.kohls.schemas.cdm.productgrouptypes.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A major class is a categorization in the merchandise hierarchy. (Ex. Mens/Kids --> Mens Sportsware --> Mens Bottoms --> Shorts)
 * 
 * <p>Java class for ClassBCType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClassBCType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductGroupTypes/V1}DepartmentBC" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ClassDescription" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ClassNumber" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClassBCType", propOrder = {
    "departmentBC"
})
public class ClassBCType {

    @XmlElement(name = "DepartmentBC")
    protected DepartmentBCType departmentBC;
    @XmlAttribute(name = "ClassDescription")
    protected String classDescription;
    @XmlAttribute(name = "ClassNumber")
    protected Long classNumber;

    /**
     * Gets the value of the departmentBC property.
     * 
     * @return
     *     possible object is
     *     {@link DepartmentBCType }
     *     
     */
    public DepartmentBCType getDepartmentBC() {
        return departmentBC;
    }

    /**
     * Sets the value of the departmentBC property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepartmentBCType }
     *     
     */
    public void setDepartmentBC(DepartmentBCType value) {
        this.departmentBC = value;
    }

    /**
     * Gets the value of the classDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassDescription() {
        return classDescription;
    }

    /**
     * Sets the value of the classDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassDescription(String value) {
        this.classDescription = value;
    }

    /**
     * Gets the value of the classNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getClassNumber() {
        return classNumber;
    }

    /**
     * Sets the value of the classNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setClassNumber(Long value) {
        this.classNumber = value;
    }

}
