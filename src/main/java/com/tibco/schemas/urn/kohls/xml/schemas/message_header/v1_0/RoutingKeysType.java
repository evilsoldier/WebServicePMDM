
package com.tibco.schemas.urn.kohls.xml.schemas.message_header.v1_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoutingKeysType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoutingKeysType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RoutingKey" type="{http://www.tibco.com/schemas/urn:kohls:xml:schemas:message-header:v1_0.xsd}RoutingKeyType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoutingKeysType", propOrder = {
    "routingKey"
})
public class RoutingKeysType {

    @XmlElement(name = "RoutingKey", required = true)
    protected List<RoutingKeyType> routingKey;

    /**
     * Gets the value of the routingKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the routingKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoutingKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoutingKeyType }
     * 
     * 
     */
    public List<RoutingKeyType> getRoutingKey() {
        if (routingKey == null) {
            routingKey = new ArrayList<RoutingKeyType>();
        }
        return this.routingKey;
    }

}
