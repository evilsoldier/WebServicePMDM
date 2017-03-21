
package com.kohls.schemas.cdm.producttypescdm.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConsumerProductGroupAttributesListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsumerProductGroupAttributesListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ConsumerProductGroupAttributes" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsumerProductGroupAttributesListType", propOrder = {
    "consumerProductGroupAttributes"
})
public class ConsumerProductGroupAttributesListType {

    @XmlElement(name = "ConsumerProductGroupAttributes")
    protected List<ConsumerProductGroupAttributesType> consumerProductGroupAttributes;

    /**
     * Gets the value of the consumerProductGroupAttributes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consumerProductGroupAttributes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsumerProductGroupAttributes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsumerProductGroupAttributesType }
     * 
     * 
     */
    public List<ConsumerProductGroupAttributesType> getConsumerProductGroupAttributes() {
        if (consumerProductGroupAttributes == null) {
            consumerProductGroupAttributes = new ArrayList<ConsumerProductGroupAttributesType>();
        }
        return this.consumerProductGroupAttributes;
    }

}
