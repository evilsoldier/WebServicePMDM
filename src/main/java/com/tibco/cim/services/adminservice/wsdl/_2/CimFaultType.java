
package com.tibco.cim.services.adminservice.wsdl._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CimFaultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CimFaultType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Request" type="{http://www.tibco.com/cim/services/adminservice/wsdl/2.0}AnyType" minOccurs="0"/&gt;
 *         &lt;element name="CimDetail" type="{http://www.tibco.com/cim/services/adminservice/wsdl/2.0}ErrorType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CimFaultType", propOrder = {
    "request",
    "cimDetail"
})
public class CimFaultType {

    @XmlElement(name = "Request")
    protected AnyType request;
    @XmlElement(name = "CimDetail")
    protected ErrorType cimDetail;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link AnyType }
     *     
     */
    public AnyType getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnyType }
     *     
     */
    public void setRequest(AnyType value) {
        this.request = value;
    }

    /**
     * Gets the value of the cimDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorType }
     *     
     */
    public ErrorType getCimDetail() {
        return cimDetail;
    }

    /**
     * Sets the value of the cimDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorType }
     *     
     */
    public void setCimDetail(ErrorType value) {
        this.cimDetail = value;
    }

}
