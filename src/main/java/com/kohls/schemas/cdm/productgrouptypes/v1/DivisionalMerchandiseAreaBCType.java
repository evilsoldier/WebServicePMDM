
package com.kohls.schemas.cdm.productgrouptypes.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Divisional Merchandise Area is the second level of categorization in the merchandise hierarchy.  (ie:  Shoes, Home, Misses, Kids, Intimate) 
 * 
 * <p>Java class for DivisionalMerchandiseAreaBCType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DivisionalMerchandiseAreaBCType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductGroupTypes/V1}GeneralMerchandiseAreaBC" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="DMADescription" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DMANumber" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DivisionalMerchandiseAreaBCType", propOrder = {
    "generalMerchandiseAreaBC"
})
public class DivisionalMerchandiseAreaBCType {

    @XmlElement(name = "GeneralMerchandiseAreaBC")
    protected GeneralMerchandiseAreaBCType generalMerchandiseAreaBC;
    @XmlAttribute(name = "DMADescription")
    protected String dmaDescription;
    @XmlAttribute(name = "DMANumber")
    protected Long dmaNumber;

    /**
     * Gets the value of the generalMerchandiseAreaBC property.
     * 
     * @return
     *     possible object is
     *     {@link GeneralMerchandiseAreaBCType }
     *     
     */
    public GeneralMerchandiseAreaBCType getGeneralMerchandiseAreaBC() {
        return generalMerchandiseAreaBC;
    }

    /**
     * Sets the value of the generalMerchandiseAreaBC property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralMerchandiseAreaBCType }
     *     
     */
    public void setGeneralMerchandiseAreaBC(GeneralMerchandiseAreaBCType value) {
        this.generalMerchandiseAreaBC = value;
    }

    /**
     * Gets the value of the dmaDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDMADescription() {
        return dmaDescription;
    }

    /**
     * Sets the value of the dmaDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDMADescription(String value) {
        this.dmaDescription = value;
    }

    /**
     * Gets the value of the dmaNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDMANumber() {
        return dmaNumber;
    }

    /**
     * Sets the value of the dmaNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDMANumber(Long value) {
        this.dmaNumber = value;
    }

}
