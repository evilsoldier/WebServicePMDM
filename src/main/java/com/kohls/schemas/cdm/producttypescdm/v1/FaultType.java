
package com.kohls.schemas.cdm.producttypescdm.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FaultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FaultType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="DisplayStr" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="FaultCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="FaultStr" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FaultType")
public class FaultType {

    @XmlAttribute(name = "DisplayStr")
    protected String displayStr;
    @XmlAttribute(name = "FaultCode")
    protected String faultCode;
    @XmlAttribute(name = "FaultStr")
    protected String faultStr;

    /**
     * Gets the value of the displayStr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayStr() {
        return displayStr;
    }

    /**
     * Sets the value of the displayStr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayStr(String value) {
        this.displayStr = value;
    }

    /**
     * Gets the value of the faultCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaultCode() {
        return faultCode;
    }

    /**
     * Sets the value of the faultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaultCode(String value) {
        this.faultCode = value;
    }

    /**
     * Gets the value of the faultStr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaultStr() {
        return faultStr;
    }

    /**
     * Sets the value of the faultStr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaultStr(String value) {
        this.faultStr = value;
    }

}
