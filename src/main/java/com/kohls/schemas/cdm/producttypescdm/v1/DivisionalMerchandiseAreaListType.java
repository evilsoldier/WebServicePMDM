
package com.kohls.schemas.cdm.producttypescdm.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DivisionalMerchandiseAreaListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DivisionalMerchandiseAreaListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}DivisionalMerchandiseArea" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DivisionalMerchandiseAreaListType", propOrder = {
    "divisionalMerchandiseArea"
})
public class DivisionalMerchandiseAreaListType {

    @XmlElement(name = "DivisionalMerchandiseArea")
    protected List<DivisionalMerchandiseAreaType> divisionalMerchandiseArea;

    /**
     * Gets the value of the divisionalMerchandiseArea property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the divisionalMerchandiseArea property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDivisionalMerchandiseArea().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DivisionalMerchandiseAreaType }
     * 
     * 
     */
    public List<DivisionalMerchandiseAreaType> getDivisionalMerchandiseArea() {
        if (divisionalMerchandiseArea == null) {
            divisionalMerchandiseArea = new ArrayList<DivisionalMerchandiseAreaType>();
        }
        return this.divisionalMerchandiseArea;
    }

}
