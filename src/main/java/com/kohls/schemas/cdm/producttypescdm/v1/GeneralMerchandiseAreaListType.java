
package com.kohls.schemas.cdm.producttypescdm.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeneralMerchandiseAreaListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeneralMerchandiseAreaListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}GeneralMerchandiseArea" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeneralMerchandiseAreaListType", propOrder = {
    "generalMerchandiseArea"
})
public class GeneralMerchandiseAreaListType {

    @XmlElement(name = "GeneralMerchandiseArea")
    protected List<GeneralMerchandiseAreaType> generalMerchandiseArea;

    /**
     * Gets the value of the generalMerchandiseArea property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the generalMerchandiseArea property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeneralMerchandiseArea().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GeneralMerchandiseAreaType }
     * 
     * 
     */
    public List<GeneralMerchandiseAreaType> getGeneralMerchandiseArea() {
        if (generalMerchandiseArea == null) {
            generalMerchandiseArea = new ArrayList<GeneralMerchandiseAreaType>();
        }
        return this.generalMerchandiseArea;
    }

}
