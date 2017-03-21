
package com.kohls.schemas.cdm.producttypescdm.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReferenceLibraryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReferenceLibraryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ColorList" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceCodeList" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}SizeList" minOccurs="0"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferenceLibraryType", propOrder = {
    "colorList",
    "referenceCodeList",
    "sizeList"
})
public class ReferenceLibraryType {

    @XmlElement(name = "ColorList")
    protected ColorListType colorList;
    @XmlElement(name = "ReferenceCodeList")
    protected ReferenceCodeListType referenceCodeList;
    @XmlElement(name = "SizeList")
    protected SizeListType sizeList;

    /**
     * Gets the value of the colorList property.
     * 
     * @return
     *     possible object is
     *     {@link ColorListType }
     *     
     */
    public ColorListType getColorList() {
        return colorList;
    }

    /**
     * Sets the value of the colorList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ColorListType }
     *     
     */
    public void setColorList(ColorListType value) {
        this.colorList = value;
    }

    /**
     * Gets the value of the referenceCodeList property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceCodeListType }
     *     
     */
    public ReferenceCodeListType getReferenceCodeList() {
        return referenceCodeList;
    }

    /**
     * Sets the value of the referenceCodeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceCodeListType }
     *     
     */
    public void setReferenceCodeList(ReferenceCodeListType value) {
        this.referenceCodeList = value;
    }

    /**
     * Gets the value of the sizeList property.
     * 
     * @return
     *     possible object is
     *     {@link SizeListType }
     *     
     */
    public SizeListType getSizeList() {
        return sizeList;
    }

    /**
     * Sets the value of the sizeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SizeListType }
     *     
     */
    public void setSizeList(SizeListType value) {
        this.sizeList = value;
    }

}
