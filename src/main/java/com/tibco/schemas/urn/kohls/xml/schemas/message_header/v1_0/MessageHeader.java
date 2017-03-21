
package com.tibco.schemas.urn.kohls.xml.schemas.message_header.v1_0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;


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
 *         &lt;element name="MessageID" type="{http://www.tibco.com/schemas/urn:kohls:xml:schemas:message-header:v1_0.xsd}NonBlankStringType"/&gt;
 *         &lt;element name="CreateDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="From" type="{http://www.tibco.com/schemas/urn:kohls:xml:schemas:message-header:v1_0.xsd}FromType"/&gt;
 *         &lt;element name="InReplyTo" type="{http://www.tibco.com/schemas/urn:kohls:xml:schemas:message-header:v1_0.xsd}NonBlankStringType" minOccurs="0"/&gt;
 *         &lt;element name="CorrelationID" type="{http://www.tibco.com/schemas/urn:kohls:xml:schemas:message-header:v1_0.xsd}NonBlankStringType" minOccurs="0"/&gt;
 *         &lt;element name="ExpiryDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Action" type="{http://www.tibco.com/schemas/urn:kohls:xml:schemas:message-header:v1_0.xsd}ActionType" minOccurs="0"/&gt;
 *         &lt;element name="To" type="{http://www.tibco.com/schemas/urn:kohls:xml:schemas:message-header:v1_0.xsd}ToType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RoutingKeys" type="{http://www.tibco.com/schemas/urn:kohls:xml:schemas:message-header:v1_0.xsd}RoutingKeysType" minOccurs="0"/&gt;
 *         &lt;element name="ReplyTo" type="{http://www.tibco.com/schemas/urn:kohls:xml:schemas:message-header:v1_0.xsd}ReplyToType" minOccurs="0"/&gt;
 *         &lt;element name="FaultTo" type="{http://www.tibco.com/schemas/urn:kohls:xml:schemas:message-header:v1_0.xsd}FaultToType" minOccurs="0"/&gt;
 *         &lt;element name="Fault" type="{http://www.tibco.com/schemas/urn:kohls:xml:schemas:message-header:v1_0.xsd}FaultType" minOccurs="0"/&gt;
 *         &lt;element name="SessionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="1.0" /&gt;
 *       &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "messageID",
    "createDateTime",
    "from",
    "inReplyTo",
    "correlationID",
    "expiryDateTime",
    "action",
    "to",
    "routingKeys",
    "replyTo",
    "faultTo",
    "fault",
    "sessionID",
    "any"
})
@XmlRootElement(name = "MessageHeader")
public class MessageHeader {

    @XmlElement(name = "MessageID", required = true)
    protected String messageID;
    @XmlElement(name = "CreateDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDateTime;
    @XmlElement(name = "From", required = true)
    protected FromType from;
    @XmlElement(name = "InReplyTo")
    protected String inReplyTo;
    @XmlElement(name = "CorrelationID")
    protected String correlationID;
    @XmlElement(name = "ExpiryDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expiryDateTime;
    @XmlElement(name = "Action")
    protected String action;
    @XmlElement(name = "To")
    protected List<ToType> to;
    @XmlElement(name = "RoutingKeys")
    protected RoutingKeysType routingKeys;
    @XmlElement(name = "ReplyTo")
    protected ReplyToType replyTo;
    @XmlElement(name = "FaultTo")
    protected FaultToType faultTo;
    @XmlElement(name = "Fault")
    protected FaultType fault;
    @XmlElement(name = "SessionID")
    protected String sessionID;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute(name = "version", required = true)
    protected String version;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the messageID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageID() {
        return messageID;
    }

    /**
     * Sets the value of the messageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageID(String value) {
        this.messageID = value;
    }

    /**
     * Gets the value of the createDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateDateTime() {
        return createDateTime;
    }

    /**
     * Sets the value of the createDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateDateTime(XMLGregorianCalendar value) {
        this.createDateTime = value;
    }

    /**
     * Gets the value of the from property.
     * 
     * @return
     *     possible object is
     *     {@link FromType }
     *     
     */
    public FromType getFrom() {
        return from;
    }

    /**
     * Sets the value of the from property.
     * 
     * @param value
     *     allowed object is
     *     {@link FromType }
     *     
     */
    public void setFrom(FromType value) {
        this.from = value;
    }

    /**
     * Gets the value of the inReplyTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInReplyTo() {
        return inReplyTo;
    }

    /**
     * Sets the value of the inReplyTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInReplyTo(String value) {
        this.inReplyTo = value;
    }

    /**
     * Gets the value of the correlationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrelationID() {
        return correlationID;
    }

    /**
     * Sets the value of the correlationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrelationID(String value) {
        this.correlationID = value;
    }

    /**
     * Gets the value of the expiryDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpiryDateTime() {
        return expiryDateTime;
    }

    /**
     * Sets the value of the expiryDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpiryDateTime(XMLGregorianCalendar value) {
        this.expiryDateTime = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAction(String value) {
        this.action = value;
    }

    /**
     * Gets the value of the to property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the to property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ToType }
     * 
     * 
     */
    public List<ToType> getTo() {
        if (to == null) {
            to = new ArrayList<ToType>();
        }
        return this.to;
    }

    /**
     * Gets the value of the routingKeys property.
     * 
     * @return
     *     possible object is
     *     {@link RoutingKeysType }
     *     
     */
    public RoutingKeysType getRoutingKeys() {
        return routingKeys;
    }

    /**
     * Sets the value of the routingKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoutingKeysType }
     *     
     */
    public void setRoutingKeys(RoutingKeysType value) {
        this.routingKeys = value;
    }

    /**
     * Gets the value of the replyTo property.
     * 
     * @return
     *     possible object is
     *     {@link ReplyToType }
     *     
     */
    public ReplyToType getReplyTo() {
        return replyTo;
    }

    /**
     * Sets the value of the replyTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReplyToType }
     *     
     */
    public void setReplyTo(ReplyToType value) {
        this.replyTo = value;
    }

    /**
     * Gets the value of the faultTo property.
     * 
     * @return
     *     possible object is
     *     {@link FaultToType }
     *     
     */
    public FaultToType getFaultTo() {
        return faultTo;
    }

    /**
     * Sets the value of the faultTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FaultToType }
     *     
     */
    public void setFaultTo(FaultToType value) {
        this.faultTo = value;
    }

    /**
     * Gets the value of the fault property.
     * 
     * @return
     *     possible object is
     *     {@link FaultType }
     *     
     */
    public FaultType getFault() {
        return fault;
    }

    /**
     * Sets the value of the fault property.
     * 
     * @param value
     *     allowed object is
     *     {@link FaultType }
     *     
     */
    public void setFault(FaultType value) {
        this.fault = value;
    }

    /**
     * Gets the value of the sessionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionID() {
        return sessionID;
    }

    /**
     * Sets the value of the sessionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionID(String value) {
        this.sessionID = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        if (version == null) {
            return "1.0";
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
