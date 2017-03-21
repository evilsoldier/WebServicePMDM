
package com.tibco.schemas.urn.kohls.xml.schemas.message_header.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Complex type with empty content and attributes only
 * 
 * <p>Java class for FromType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FromType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="app" use="required" type="{http://www.tibco.com/schemas/urn:kohls:xml:schemas:message-header:v1_0.xsd}NonBlankStringType" /&gt;
 *       &lt;attribute name="module" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="nodeID" use="required" type="{http://www.tibco.com/schemas/urn:kohls:xml:schemas:message-header:v1_0.xsd}NonBlankStringType" /&gt;
 *       &lt;attribute name="systemCode" use="required" type="{http://www.tibco.com/schemas/urn:kohls:xml:schemas:message-header:v1_0.xsd}NonBlankStringType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FromType")
public class FromType {

    @XmlAttribute(name = "app", required = true)
    protected String app;
    @XmlAttribute(name = "module")
    protected String module;
    @XmlAttribute(name = "nodeID", required = true)
    protected String nodeID;
    @XmlAttribute(name = "systemCode", required = true)
    protected String systemCode;

    /**
     * Gets the value of the app property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApp() {
        return app;
    }

    /**
     * Sets the value of the app property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApp(String value) {
        this.app = value;
    }

    /**
     * Gets the value of the module property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModule() {
        return module;
    }

    /**
     * Sets the value of the module property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModule(String value) {
        this.module = value;
    }

    /**
     * Gets the value of the nodeID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodeID() {
        return nodeID;
    }

    /**
     * Sets the value of the nodeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodeID(String value) {
        this.nodeID = value;
    }

    /**
     * Gets the value of the systemCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemCode() {
        return systemCode;
    }

    /**
     * Sets the value of the systemCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemCode(String value) {
        this.systemCode = value;
    }

}
