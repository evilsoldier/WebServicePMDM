
package com.kohls.schemas.cdm.producttypescdm.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A seperately owned and operated business entity.  (ex. Kohl's US, Kohl's North)
 * 
 * <p>Java class for OperatingCompanyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OperatingCompanyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}OperatingCompanyAttributes" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}GeneralMerchandiseAreaList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperatingCompanyType", propOrder = {
    "operatingCompanyAttributes",
    "generalMerchandiseAreaList"
})
public class OperatingCompanyType {

    @XmlElement(name = "OperatingCompanyAttributes")
    protected OperatingCompanyAttributesType operatingCompanyAttributes;
    @XmlElement(name = "GeneralMerchandiseAreaList")
    protected GeneralMerchandiseAreaListType generalMerchandiseAreaList;

    /**
     * Gets the value of the operatingCompanyAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link OperatingCompanyAttributesType }
     *     
     */
    public OperatingCompanyAttributesType getOperatingCompanyAttributes() {
        return operatingCompanyAttributes;
    }

    /**
     * Sets the value of the operatingCompanyAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatingCompanyAttributesType }
     *     
     */
    public void setOperatingCompanyAttributes(OperatingCompanyAttributesType value) {
        this.operatingCompanyAttributes = value;
    }

    /**
     * Gets the value of the generalMerchandiseAreaList property.
     * 
     * @return
     *     possible object is
     *     {@link GeneralMerchandiseAreaListType }
     *     
     */
    public GeneralMerchandiseAreaListType getGeneralMerchandiseAreaList() {
        return generalMerchandiseAreaList;
    }

    /**
     * Sets the value of the generalMerchandiseAreaList property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralMerchandiseAreaListType }
     *     
     */
    public void setGeneralMerchandiseAreaList(GeneralMerchandiseAreaListType value) {
        this.generalMerchandiseAreaList = value;
    }

}
