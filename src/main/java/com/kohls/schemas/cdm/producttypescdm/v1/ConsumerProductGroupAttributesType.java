
package com.kohls.schemas.cdm.producttypescdm.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * A grouping of Consumer Product Ids that may cross Departments or Buying responsibilities among other things.  This is a customer presentation decision.  Ex. Croft & Barrow® Island Collection Tropical Casual Button-Front Shirt (923054)  Aka:  Super Web Id
 * 
 * Open Topic:
 *  1.  Presentation template would need to be able to be chosen at this level.
 * 
 * <p>Java class for ConsumerProductGroupAttributesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsumerProductGroupAttributesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ConsumerProductGroupType" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *         &lt;element name="ConsumerProductGroupSubType" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *         &lt;element name="ConsumerFitM" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueListType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="NRFSizeM" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}SizeListType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ConsumerPatternM" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueListType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ConsumerProductGroupPrimaryType" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ConsumerFitCodeM" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ConsumerPatternCodeM" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ConsumerProductGroupDescription" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ConsumerProductGroupIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ConsumerProductGroupPrimaryTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ConsumerProductGroupSubTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ConsumerProductGroupTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ModifiedDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="NRFSizeCodeM" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RecordStatusFlag" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="StatusCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsumerProductGroupAttributesType", propOrder = {
    "consumerProductGroupType",
    "consumerProductGroupSubType",
    "status",
    "consumerFitM",
    "nrfSizeM",
    "consumerPatternM",
    "consumerProductGroupPrimaryType"
})
public class ConsumerProductGroupAttributesType {

    @XmlElement(name = "ConsumerProductGroupType")
    protected ReferenceValueType consumerProductGroupType;
    @XmlElement(name = "ConsumerProductGroupSubType")
    protected ReferenceValueType consumerProductGroupSubType;
    @XmlElement(name = "Status")
    protected ReferenceValueType status;
    @XmlElement(name = "ConsumerFitM")
    protected List<ReferenceValueListType> consumerFitM;
    @XmlElement(name = "NRFSizeM")
    protected List<SizeListType> nrfSizeM;
    @XmlElement(name = "ConsumerPatternM")
    protected List<ReferenceValueListType> consumerPatternM;
    @XmlElement(name = "ConsumerProductGroupPrimaryType")
    protected ReferenceValueType consumerProductGroupPrimaryType;
    @XmlAttribute(name = "ConsumerFitCodeM")
    protected String consumerFitCodeM;
    @XmlAttribute(name = "ConsumerPatternCodeM")
    protected String consumerPatternCodeM;
    @XmlAttribute(name = "ConsumerProductGroupDescription")
    protected String consumerProductGroupDescription;
    @XmlAttribute(name = "ConsumerProductGroupIdentifier")
    protected String consumerProductGroupIdentifier;
    @XmlAttribute(name = "ConsumerProductGroupPrimaryTypeCode")
    protected String consumerProductGroupPrimaryTypeCode;
    @XmlAttribute(name = "ConsumerProductGroupSubTypeCode")
    protected String consumerProductGroupSubTypeCode;
    @XmlAttribute(name = "ConsumerProductGroupTypeCode")
    protected String consumerProductGroupTypeCode;
    @XmlAttribute(name = "ModifiedDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifiedDateTime;
    @XmlAttribute(name = "NRFSizeCodeM")
    protected String nrfSizeCodeM;
    @XmlAttribute(name = "RecordStatusFlag")
    protected String recordStatusFlag;
    @XmlAttribute(name = "StatusCode")
    protected String statusCode;

    /**
     * Gets the value of the consumerProductGroupType property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceValueType }
     *     
     */
    public ReferenceValueType getConsumerProductGroupType() {
        return consumerProductGroupType;
    }

    /**
     * Sets the value of the consumerProductGroupType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceValueType }
     *     
     */
    public void setConsumerProductGroupType(ReferenceValueType value) {
        this.consumerProductGroupType = value;
    }

    /**
     * Gets the value of the consumerProductGroupSubType property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceValueType }
     *     
     */
    public ReferenceValueType getConsumerProductGroupSubType() {
        return consumerProductGroupSubType;
    }

    /**
     * Sets the value of the consumerProductGroupSubType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceValueType }
     *     
     */
    public void setConsumerProductGroupSubType(ReferenceValueType value) {
        this.consumerProductGroupSubType = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceValueType }
     *     
     */
    public ReferenceValueType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceValueType }
     *     
     */
    public void setStatus(ReferenceValueType value) {
        this.status = value;
    }

    /**
     * Gets the value of the consumerFitM property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consumerFitM property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsumerFitM().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceValueListType }
     * 
     * 
     */
    public List<ReferenceValueListType> getConsumerFitM() {
        if (consumerFitM == null) {
            consumerFitM = new ArrayList<ReferenceValueListType>();
        }
        return this.consumerFitM;
    }

    /**
     * Gets the value of the nrfSizeM property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nrfSizeM property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNRFSizeM().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SizeListType }
     * 
     * 
     */
    public List<SizeListType> getNRFSizeM() {
        if (nrfSizeM == null) {
            nrfSizeM = new ArrayList<SizeListType>();
        }
        return this.nrfSizeM;
    }

    /**
     * Gets the value of the consumerPatternM property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consumerPatternM property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsumerPatternM().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceValueListType }
     * 
     * 
     */
    public List<ReferenceValueListType> getConsumerPatternM() {
        if (consumerPatternM == null) {
            consumerPatternM = new ArrayList<ReferenceValueListType>();
        }
        return this.consumerPatternM;
    }

    /**
     * Gets the value of the consumerProductGroupPrimaryType property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceValueType }
     *     
     */
    public ReferenceValueType getConsumerProductGroupPrimaryType() {
        return consumerProductGroupPrimaryType;
    }

    /**
     * Sets the value of the consumerProductGroupPrimaryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceValueType }
     *     
     */
    public void setConsumerProductGroupPrimaryType(ReferenceValueType value) {
        this.consumerProductGroupPrimaryType = value;
    }

    /**
     * Gets the value of the consumerFitCodeM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumerFitCodeM() {
        return consumerFitCodeM;
    }

    /**
     * Sets the value of the consumerFitCodeM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerFitCodeM(String value) {
        this.consumerFitCodeM = value;
    }

    /**
     * Gets the value of the consumerPatternCodeM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumerPatternCodeM() {
        return consumerPatternCodeM;
    }

    /**
     * Sets the value of the consumerPatternCodeM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerPatternCodeM(String value) {
        this.consumerPatternCodeM = value;
    }

    /**
     * Gets the value of the consumerProductGroupDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumerProductGroupDescription() {
        return consumerProductGroupDescription;
    }

    /**
     * Sets the value of the consumerProductGroupDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerProductGroupDescription(String value) {
        this.consumerProductGroupDescription = value;
    }

    /**
     * Gets the value of the consumerProductGroupIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumerProductGroupIdentifier() {
        return consumerProductGroupIdentifier;
    }

    /**
     * Sets the value of the consumerProductGroupIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerProductGroupIdentifier(String value) {
        this.consumerProductGroupIdentifier = value;
    }

    /**
     * Gets the value of the consumerProductGroupPrimaryTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumerProductGroupPrimaryTypeCode() {
        return consumerProductGroupPrimaryTypeCode;
    }

    /**
     * Sets the value of the consumerProductGroupPrimaryTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerProductGroupPrimaryTypeCode(String value) {
        this.consumerProductGroupPrimaryTypeCode = value;
    }

    /**
     * Gets the value of the consumerProductGroupSubTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumerProductGroupSubTypeCode() {
        return consumerProductGroupSubTypeCode;
    }

    /**
     * Sets the value of the consumerProductGroupSubTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerProductGroupSubTypeCode(String value) {
        this.consumerProductGroupSubTypeCode = value;
    }

    /**
     * Gets the value of the consumerProductGroupTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumerProductGroupTypeCode() {
        return consumerProductGroupTypeCode;
    }

    /**
     * Sets the value of the consumerProductGroupTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerProductGroupTypeCode(String value) {
        this.consumerProductGroupTypeCode = value;
    }

    /**
     * Gets the value of the modifiedDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getModifiedDateTime() {
        return modifiedDateTime;
    }

    /**
     * Sets the value of the modifiedDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setModifiedDateTime(XMLGregorianCalendar value) {
        this.modifiedDateTime = value;
    }

    /**
     * Gets the value of the nrfSizeCodeM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNRFSizeCodeM() {
        return nrfSizeCodeM;
    }

    /**
     * Sets the value of the nrfSizeCodeM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNRFSizeCodeM(String value) {
        this.nrfSizeCodeM = value;
    }

    /**
     * Gets the value of the recordStatusFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordStatusFlag() {
        return recordStatusFlag;
    }

    /**
     * Sets the value of the recordStatusFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordStatusFlag(String value) {
        this.recordStatusFlag = value;
    }

    /**
     * Gets the value of the statusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusCode(String value) {
        this.statusCode = value;
    }

}
