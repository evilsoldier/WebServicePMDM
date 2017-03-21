
package com.kohls.schemas.cdm.producttypescdm.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeneralMerchandiseAreaAttributesListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeneralMerchandiseAreaAttributesListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}GeneralMerchandiseAreaAttributes" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeneralMerchandiseAreaAttributesListType", propOrder = {
    "generalMerchandiseAreaAttributes"
})
public class GeneralMerchandiseAreaAttributesListType {

    @XmlElement(name = "GeneralMerchandiseAreaAttributes")
    protected List<GeneralMerchandiseAreaAttributesType> generalMerchandiseAreaAttributes;

    /**
     * Gets the value of the generalMerchandiseAreaAttributes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the generalMerchandiseAreaAttributes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeneralMerchandiseAreaAttributes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GeneralMerchandiseAreaAttributesType }
     * 
     * 
     */
    public List<GeneralMerchandiseAreaAttributesType> getGeneralMerchandiseAreaAttributes() {
        if (generalMerchandiseAreaAttributes == null) {
            generalMerchandiseAreaAttributes = new ArrayList<GeneralMerchandiseAreaAttributesType>();
        }
        return this.generalMerchandiseAreaAttributes;
    }

}
