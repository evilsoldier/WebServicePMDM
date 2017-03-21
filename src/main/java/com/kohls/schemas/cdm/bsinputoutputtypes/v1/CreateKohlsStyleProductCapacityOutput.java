
package com.kohls.schemas.cdm.bsinputoutputtypes.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.kohls.schemas.cdm.producttypescdm.v1.KohlsStyleProductCapacityListType;


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
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}KohlsStyleProductCapacityList" minOccurs="0"/&gt;
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
    "kohlsStyleProductCapacityList"
})
@XmlRootElement(name = "CreateKohlsStyleProductCapacityOutput")
public class CreateKohlsStyleProductCapacityOutput {

    @XmlElement(name = "KohlsStyleProductCapacityList", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1")
    protected KohlsStyleProductCapacityListType kohlsStyleProductCapacityList;

    /**
     * Gets the value of the kohlsStyleProductCapacityList property.
     * 
     * @return
     *     possible object is
     *     {@link KohlsStyleProductCapacityListType }
     *     
     */
    public KohlsStyleProductCapacityListType getKohlsStyleProductCapacityList() {
        return kohlsStyleProductCapacityList;
    }

    /**
     * Sets the value of the kohlsStyleProductCapacityList property.
     * 
     * @param value
     *     allowed object is
     *     {@link KohlsStyleProductCapacityListType }
     *     
     */
    public void setKohlsStyleProductCapacityList(KohlsStyleProductCapacityListType value) {
        this.kohlsStyleProductCapacityList = value;
    }

}
