
package com.kohls.schemas.cdm.producttypescdm.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KohlsStyleMaximumPurchaseLimitListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KohlsStyleMaximumPurchaseLimitListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}KohlsStyleMaximumPurchaseLimit" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KohlsStyleMaximumPurchaseLimitListType", propOrder = {
    "kohlsStyleMaximumPurchaseLimit"
})
public class KohlsStyleMaximumPurchaseLimitListType {

    @XmlElement(name = "KohlsStyleMaximumPurchaseLimit")
    protected List<KohlsStyleMaximumPurchaseLimitType> kohlsStyleMaximumPurchaseLimit;

    /**
     * Gets the value of the kohlsStyleMaximumPurchaseLimit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kohlsStyleMaximumPurchaseLimit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKohlsStyleMaximumPurchaseLimit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KohlsStyleMaximumPurchaseLimitType }
     * 
     * 
     */
    public List<KohlsStyleMaximumPurchaseLimitType> getKohlsStyleMaximumPurchaseLimit() {
        if (kohlsStyleMaximumPurchaseLimit == null) {
            kohlsStyleMaximumPurchaseLimit = new ArrayList<KohlsStyleMaximumPurchaseLimitType>();
        }
        return this.kohlsStyleMaximumPurchaseLimit;
    }

}
