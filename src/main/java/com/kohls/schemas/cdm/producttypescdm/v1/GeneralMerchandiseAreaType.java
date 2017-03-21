
package com.kohls.schemas.cdm.producttypescdm.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.kohls.schemas.cdm.productgrouptypes.v1.OperatingCompanyBCType;


/**
 * General Merchandise Area is the highest level of categorization in the merchandise hierarchy.  (ex. Mens/Kids, Home/Shoes, Juniors/Accessories)
 * 
 * <p>Java class for GeneralMerchandiseAreaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeneralMerchandiseAreaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}GeneralMerchandiseAreaAttributes" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}DivisionalMerchandiseAreaList" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductGroupTypes/V1}OperatingCompanyBC" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeneralMerchandiseAreaType", propOrder = {
    "generalMerchandiseAreaAttributes",
    "divisionalMerchandiseAreaList",
    "operatingCompanyBC"
})
public class GeneralMerchandiseAreaType {

    @XmlElement(name = "GeneralMerchandiseAreaAttributes")
    protected GeneralMerchandiseAreaAttributesType generalMerchandiseAreaAttributes;
    @XmlElement(name = "DivisionalMerchandiseAreaList")
    protected DivisionalMerchandiseAreaListType divisionalMerchandiseAreaList;
    @XmlElement(name = "OperatingCompanyBC", namespace = "http://www.kohls.com/schemas/cdm/ProductGroupTypes/V1")
    protected OperatingCompanyBCType operatingCompanyBC;

    /**
     * Gets the value of the generalMerchandiseAreaAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link GeneralMerchandiseAreaAttributesType }
     *     
     */
    public GeneralMerchandiseAreaAttributesType getGeneralMerchandiseAreaAttributes() {
        return generalMerchandiseAreaAttributes;
    }

    /**
     * Sets the value of the generalMerchandiseAreaAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralMerchandiseAreaAttributesType }
     *     
     */
    public void setGeneralMerchandiseAreaAttributes(GeneralMerchandiseAreaAttributesType value) {
        this.generalMerchandiseAreaAttributes = value;
    }

    /**
     * Gets the value of the divisionalMerchandiseAreaList property.
     * 
     * @return
     *     possible object is
     *     {@link DivisionalMerchandiseAreaListType }
     *     
     */
    public DivisionalMerchandiseAreaListType getDivisionalMerchandiseAreaList() {
        return divisionalMerchandiseAreaList;
    }

    /**
     * Sets the value of the divisionalMerchandiseAreaList property.
     * 
     * @param value
     *     allowed object is
     *     {@link DivisionalMerchandiseAreaListType }
     *     
     */
    public void setDivisionalMerchandiseAreaList(DivisionalMerchandiseAreaListType value) {
        this.divisionalMerchandiseAreaList = value;
    }

    /**
     * Gets the value of the operatingCompanyBC property.
     * 
     * @return
     *     possible object is
     *     {@link OperatingCompanyBCType }
     *     
     */
    public OperatingCompanyBCType getOperatingCompanyBC() {
        return operatingCompanyBC;
    }

    /**
     * Sets the value of the operatingCompanyBC property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatingCompanyBCType }
     *     
     */
    public void setOperatingCompanyBC(OperatingCompanyBCType value) {
        this.operatingCompanyBC = value;
    }

}
