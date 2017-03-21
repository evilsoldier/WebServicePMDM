
package com.kohls.schemas.cdm.producttypescdm.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CPStoreHierarchyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CPStoreHierarchyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}CPSKUGroupList" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}NonCPSKUList" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}CPSKUList" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}CPProductList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CPStoreHierarchyType", propOrder = {
    "cpskuGroupList",
    "nonCPSKUList",
    "cpskuList",
    "cpProductList"
})
public class CPStoreHierarchyType {

    @XmlElement(name = "CPSKUGroupList")
    protected CPSKUGroupListType cpskuGroupList;
    @XmlElement(name = "NonCPSKUList")
    protected NonCPSKUListType nonCPSKUList;
    @XmlElement(name = "CPSKUList")
    protected CPSKUListType cpskuList;
    @XmlElement(name = "CPProductList")
    protected CPProductListType cpProductList;

    /**
     * Gets the value of the cpskuGroupList property.
     * 
     * @return
     *     possible object is
     *     {@link CPSKUGroupListType }
     *     
     */
    public CPSKUGroupListType getCPSKUGroupList() {
        return cpskuGroupList;
    }

    /**
     * Sets the value of the cpskuGroupList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPSKUGroupListType }
     *     
     */
    public void setCPSKUGroupList(CPSKUGroupListType value) {
        this.cpskuGroupList = value;
    }

    /**
     * Gets the value of the nonCPSKUList property.
     * 
     * @return
     *     possible object is
     *     {@link NonCPSKUListType }
     *     
     */
    public NonCPSKUListType getNonCPSKUList() {
        return nonCPSKUList;
    }

    /**
     * Sets the value of the nonCPSKUList property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonCPSKUListType }
     *     
     */
    public void setNonCPSKUList(NonCPSKUListType value) {
        this.nonCPSKUList = value;
    }

    /**
     * Gets the value of the cpskuList property.
     * 
     * @return
     *     possible object is
     *     {@link CPSKUListType }
     *     
     */
    public CPSKUListType getCPSKUList() {
        return cpskuList;
    }

    /**
     * Sets the value of the cpskuList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPSKUListType }
     *     
     */
    public void setCPSKUList(CPSKUListType value) {
        this.cpskuList = value;
    }

    /**
     * Gets the value of the cpProductList property.
     * 
     * @return
     *     possible object is
     *     {@link CPProductListType }
     *     
     */
    public CPProductListType getCPProductList() {
        return cpProductList;
    }

    /**
     * Sets the value of the cpProductList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPProductListType }
     *     
     */
    public void setCPProductList(CPProductListType value) {
        this.cpProductList = value;
    }

}
