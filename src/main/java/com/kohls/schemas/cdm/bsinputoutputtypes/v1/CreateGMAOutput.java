
package com.kohls.schemas.cdm.bsinputoutputtypes.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.kohls.schemas.cdm.producttypescdm.v1.GeneralMerchandiseAreaListType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
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
@XmlType(name = "", propOrder = {
    "generalMerchandiseAreaList"
})
@XmlRootElement(name = "CreateGMAOutput")
public class CreateGMAOutput {

    @XmlElement(name = "GeneralMerchandiseAreaList", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1")
    protected GeneralMerchandiseAreaListType generalMerchandiseAreaList;

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
