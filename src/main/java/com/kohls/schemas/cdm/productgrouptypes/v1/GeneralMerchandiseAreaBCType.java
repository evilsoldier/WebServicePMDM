
package com.kohls.schemas.cdm.productgrouptypes.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * General Merchandise Area is the highest level of categorization in the merchandise hierarchy.  (ex. Mens/Kids, Home/Shoes, Juniors/Accessories)
 * 
 * <p>Java class for GeneralMerchandiseAreaBCType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeneralMerchandiseAreaBCType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductGroupTypes/V1}OperatingCompanyBC" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="GMADescription" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="GMANumber" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeneralMerchandiseAreaBCType", propOrder = {
    "operatingCompanyBC"
})
public class GeneralMerchandiseAreaBCType {

    @XmlElement(name = "OperatingCompanyBC")
    protected OperatingCompanyBCType operatingCompanyBC;
    @XmlAttribute(name = "GMADescription")
    protected String gmaDescription;
    @XmlAttribute(name = "GMANumber")
    protected Long gmaNumber;

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

    /**
     * Gets the value of the gmaDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGMADescription() {
        return gmaDescription;
    }

    /**
     * Sets the value of the gmaDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGMADescription(String value) {
        this.gmaDescription = value;
    }

    /**
     * Gets the value of the gmaNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGMANumber() {
        return gmaNumber;
    }

    /**
     * Sets the value of the gmaNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGMANumber(Long value) {
        this.gmaNumber = value;
    }

}
