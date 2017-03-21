
package com.kohls.schemas.cdm.productgrouptypes.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A department is a categorization in the merchandise hierarchy.  It is the level under Divisional Merchandise Area and groups together Major Classes. (Ex. Mens/Kids --> Mens Sportsware --> Mens Bottoms)
 * 
 * <p>Java class for DepartmentBCType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DepartmentBCType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductGroupTypes/V1}DivisionalMerchandiseAreaBC" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="DepartmentDescription" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DepartmentNumber" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DepartmentBCType", propOrder = {
    "divisionalMerchandiseAreaBC"
})
public class DepartmentBCType {

    @XmlElement(name = "DivisionalMerchandiseAreaBC")
    protected DivisionalMerchandiseAreaBCType divisionalMerchandiseAreaBC;
    @XmlAttribute(name = "DepartmentDescription")
    protected String departmentDescription;
    @XmlAttribute(name = "DepartmentNumber")
    protected Long departmentNumber;

    /**
     * Gets the value of the divisionalMerchandiseAreaBC property.
     * 
     * @return
     *     possible object is
     *     {@link DivisionalMerchandiseAreaBCType }
     *     
     */
    public DivisionalMerchandiseAreaBCType getDivisionalMerchandiseAreaBC() {
        return divisionalMerchandiseAreaBC;
    }

    /**
     * Sets the value of the divisionalMerchandiseAreaBC property.
     * 
     * @param value
     *     allowed object is
     *     {@link DivisionalMerchandiseAreaBCType }
     *     
     */
    public void setDivisionalMerchandiseAreaBC(DivisionalMerchandiseAreaBCType value) {
        this.divisionalMerchandiseAreaBC = value;
    }

    /**
     * Gets the value of the departmentDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartmentDescription() {
        return departmentDescription;
    }

    /**
     * Sets the value of the departmentDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartmentDescription(String value) {
        this.departmentDescription = value;
    }

    /**
     * Gets the value of the departmentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDepartmentNumber() {
        return departmentNumber;
    }

    /**
     * Sets the value of the departmentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDepartmentNumber(Long value) {
        this.departmentNumber = value;
    }

}
