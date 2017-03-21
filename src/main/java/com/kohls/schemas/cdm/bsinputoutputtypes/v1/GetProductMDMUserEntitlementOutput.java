
package com.kohls.schemas.cdm.bsinputoutputtypes.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.tibco.cim.services.adminservice.wsdl._2.UserEntitlementResponse;


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
 *         &lt;element ref="{http://www.tibco.com/cim/services/adminservice/wsdl/2.0}UserEntitlementResponse" minOccurs="0"/&gt;
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
    "userEntitlementResponse"
})
@XmlRootElement(name = "GetProductMDMUserEntitlementOutput")
public class GetProductMDMUserEntitlementOutput {

    @XmlElement(name = "UserEntitlementResponse", namespace = "http://www.tibco.com/cim/services/adminservice/wsdl/2.0")
    protected UserEntitlementResponse userEntitlementResponse;

    /**
     * Gets the value of the userEntitlementResponse property.
     * 
     * @return
     *     possible object is
     *     {@link UserEntitlementResponse }
     *     
     */
    public UserEntitlementResponse getUserEntitlementResponse() {
        return userEntitlementResponse;
    }

    /**
     * Sets the value of the userEntitlementResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserEntitlementResponse }
     *     
     */
    public void setUserEntitlementResponse(UserEntitlementResponse value) {
        this.userEntitlementResponse = value;
    }

}
