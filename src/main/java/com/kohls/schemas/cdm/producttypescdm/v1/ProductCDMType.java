
package com.kohls.schemas.cdm.producttypescdm.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductCDMType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductCDMType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceLibrary" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}MerchandiseHierarchy" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}CPStoreHierarchy" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductCDMType", propOrder = {
    "referenceLibrary",
    "merchandiseHierarchy",
    "cpStoreHierarchy"
})
public class ProductCDMType {

    @XmlElement(name = "ReferenceLibrary")
    protected ReferenceLibraryType referenceLibrary;
    @XmlElement(name = "MerchandiseHierarchy")
    protected MerchandiseHierarchyType merchandiseHierarchy;
    @XmlElement(name = "CPStoreHierarchy")
    protected CPStoreHierarchyType cpStoreHierarchy;

    /**
     * Gets the value of the referenceLibrary property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceLibraryType }
     *     
     */
    public ReferenceLibraryType getReferenceLibrary() {
        return referenceLibrary;
    }

    /**
     * Sets the value of the referenceLibrary property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceLibraryType }
     *     
     */
    public void setReferenceLibrary(ReferenceLibraryType value) {
        this.referenceLibrary = value;
    }

    /**
     * Gets the value of the merchandiseHierarchy property.
     * 
     * @return
     *     possible object is
     *     {@link MerchandiseHierarchyType }
     *     
     */
    public MerchandiseHierarchyType getMerchandiseHierarchy() {
        return merchandiseHierarchy;
    }

    /**
     * Sets the value of the merchandiseHierarchy property.
     * 
     * @param value
     *     allowed object is
     *     {@link MerchandiseHierarchyType }
     *     
     */
    public void setMerchandiseHierarchy(MerchandiseHierarchyType value) {
        this.merchandiseHierarchy = value;
    }

    /**
     * Gets the value of the cpStoreHierarchy property.
     * 
     * @return
     *     possible object is
     *     {@link CPStoreHierarchyType }
     *     
     */
    public CPStoreHierarchyType getCPStoreHierarchy() {
        return cpStoreHierarchy;
    }

    /**
     * Sets the value of the cpStoreHierarchy property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPStoreHierarchyType }
     *     
     */
    public void setCPStoreHierarchy(CPStoreHierarchyType value) {
        this.cpStoreHierarchy = value;
    }

}
