
package com.kohls.schemas.cdm.bsinputoutputtypes.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.kohls.schemas.cdm.producttypescdm.v1.KohlsStyleVendorStylePartnerListType;


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
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}KohlsStyleVendorStylePartnerList" minOccurs="0"/&gt;
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
    "kohlsStyleVendorStylePartnerList"
})
@XmlRootElement(name = "GetKohlsStyleVendorStylePartnerOutput")
public class GetKohlsStyleVendorStylePartnerOutput {

    @XmlElement(name = "KohlsStyleVendorStylePartnerList", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1")
    protected KohlsStyleVendorStylePartnerListType kohlsStyleVendorStylePartnerList;

    /**
     * Gets the value of the kohlsStyleVendorStylePartnerList property.
     * 
     * @return
     *     possible object is
     *     {@link KohlsStyleVendorStylePartnerListType }
     *     
     */
    public KohlsStyleVendorStylePartnerListType getKohlsStyleVendorStylePartnerList() {
        return kohlsStyleVendorStylePartnerList;
    }

    /**
     * Sets the value of the kohlsStyleVendorStylePartnerList property.
     * 
     * @param value
     *     allowed object is
     *     {@link KohlsStyleVendorStylePartnerListType }
     *     
     */
    public void setKohlsStyleVendorStylePartnerList(KohlsStyleVendorStylePartnerListType value) {
        this.kohlsStyleVendorStylePartnerList = value;
    }

}
