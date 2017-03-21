
package com.kohls.schemas.cdm.producttypescdm.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerChoiceBirthstoneListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerChoiceBirthstoneListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}CustomerChoiceBirthstone" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerChoiceBirthstoneListType", propOrder = {
    "customerChoiceBirthstone"
})
public class CustomerChoiceBirthstoneListType {

    @XmlElement(name = "CustomerChoiceBirthstone")
    protected List<CustomerChoiceBirthstoneType> customerChoiceBirthstone;

    /**
     * Gets the value of the customerChoiceBirthstone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerChoiceBirthstone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerChoiceBirthstone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerChoiceBirthstoneType }
     * 
     * 
     */
    public List<CustomerChoiceBirthstoneType> getCustomerChoiceBirthstone() {
        if (customerChoiceBirthstone == null) {
            customerChoiceBirthstone = new ArrayList<CustomerChoiceBirthstoneType>();
        }
        return this.customerChoiceBirthstone;
    }

}
