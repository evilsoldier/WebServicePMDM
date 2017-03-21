
package com.kohls.schemas.cdm.producttypescdm.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.kohls.schemas.cdm.productgrouptypes.v1.DepartmentBCType;


/**
 * A major class is a categorization in the merchandise hierarchy. (Ex. Mens/Kids --> Mens Sportsware --> Mens Bottoms --> Shorts)
 * 
 * <p>Java class for ClassType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClassType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ClassAttributes" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}SubClassList" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductGroupTypes/V1}DepartmentBC" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClassType", propOrder = {
    "classAttributes",
    "subClassList",
    "departmentBC"
})
public class ClassType {

    @XmlElement(name = "ClassAttributes")
    protected ClassAttributesType classAttributes;
    @XmlElement(name = "SubClassList")
    protected SubClassListType subClassList;
    @XmlElement(name = "DepartmentBC", namespace = "http://www.kohls.com/schemas/cdm/ProductGroupTypes/V1")
    protected DepartmentBCType departmentBC;

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

    /**
     * Gets the value of the subClassList property.
     * 
     * @return
     *     possible object is
     *     {@link SubClassListType }
     *     
     */
    public SubClassListType getSubClassList() {
        return subClassList;
    }

    /**
     * Sets the value of the subClassList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubClassListType }
     *     
     */
    public void setSubClassList(SubClassListType value) {
        this.subClassList = value;
    }

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

}
