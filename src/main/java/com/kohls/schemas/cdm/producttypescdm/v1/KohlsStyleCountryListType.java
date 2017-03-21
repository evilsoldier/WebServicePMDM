
package com.kohls.schemas.cdm.producttypescdm.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KohlsStyleCountryListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KohlsStyleCountryListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}KohlsStyleCountry" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KohlsStyleCountryListType", propOrder = {
    "kohlsStyleCountry"
})
public class KohlsStyleCountryListType {

    @XmlElement(name = "KohlsStyleCountry")
    protected List<KohlsStyleCountryType> kohlsStyleCountry;

    /**
     * Gets the value of the kohlsStyleCountry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kohlsStyleCountry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKohlsStyleCountry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KohlsStyleCountryType }
     * 
     * 
     */
    public List<KohlsStyleCountryType> getKohlsStyleCountry() {
        if (kohlsStyleCountry == null) {
            kohlsStyleCountry = new ArrayList<KohlsStyleCountryType>();
        }
        return this.kohlsStyleCountry;
    }

}
