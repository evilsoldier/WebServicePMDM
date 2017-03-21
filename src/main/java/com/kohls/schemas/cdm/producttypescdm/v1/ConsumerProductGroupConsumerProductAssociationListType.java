
package com.kohls.schemas.cdm.producttypescdm.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConsumerProductGroupConsumerProductAssociationListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsumerProductGroupConsumerProductAssociationListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ConsumerProductGroupConsumerProductAssociation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsumerProductGroupConsumerProductAssociationListType", propOrder = {
    "consumerProductGroupConsumerProductAssociation"
})
public class ConsumerProductGroupConsumerProductAssociationListType {

    @XmlElement(name = "ConsumerProductGroupConsumerProductAssociation")
    protected List<ConsumerProductGroupConsumerProductAssociationType> consumerProductGroupConsumerProductAssociation;

    /**
     * Gets the value of the consumerProductGroupConsumerProductAssociation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consumerProductGroupConsumerProductAssociation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsumerProductGroupConsumerProductAssociation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsumerProductGroupConsumerProductAssociationType }
     * 
     * 
     */
    public List<ConsumerProductGroupConsumerProductAssociationType> getConsumerProductGroupConsumerProductAssociation() {
        if (consumerProductGroupConsumerProductAssociation == null) {
            consumerProductGroupConsumerProductAssociation = new ArrayList<ConsumerProductGroupConsumerProductAssociationType>();
        }
        return this.consumerProductGroupConsumerProductAssociation;
    }

}
