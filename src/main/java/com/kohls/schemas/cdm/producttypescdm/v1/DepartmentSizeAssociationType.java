
package com.kohls.schemas.cdm.producttypescdm.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DepartmentSizeAssociationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DepartmentSizeAssociationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ChildSizeRangeM" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueListType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ChildSizeRangeCodeM" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ConsumerSizeDescription" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DepartmentNumber" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="KohlsSizeSortNumber" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="ModifiedDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="NRFSizeCode" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="RecordStatusFlag" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DepartmentSizeAssociationType", propOrder = {
    "childSizeRangeM"
})
public class DepartmentSizeAssociationType {

    @XmlElementRef(name = "ChildSizeRangeM", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<ReferenceValueListType> childSizeRangeM;
    @XmlAttribute(name = "ChildSizeRangeCodeM")
    protected String childSizeRangeCodeM;
    @XmlAttribute(name = "ConsumerSizeDescription")
    protected String consumerSizeDescription;
    @XmlAttribute(name = "DepartmentNumber")
    protected Long departmentNumber;
    @XmlAttribute(name = "KohlsSizeSortNumber")
    protected Long kohlsSizeSortNumber;
    @XmlAttribute(name = "ModifiedDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifiedDateTime;
    @XmlAttribute(name = "NRFSizeCode")
    protected Long nrfSizeCode;
    @XmlAttribute(name = "RecordStatusFlag")
    protected String recordStatusFlag;

    /**
     * Gets the value of the childSizeRangeM property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueListType }{@code >}
     *     
     */
    public JAXBElement<ReferenceValueListType> getChildSizeRangeM() {
        return childSizeRangeM;
    }

    /**
     * Sets the value of the childSizeRangeM property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueListType }{@code >}
     *     
     */
    public void setChildSizeRangeM(JAXBElement<ReferenceValueListType> value) {
        this.childSizeRangeM = value;
    }

    /**
     * Gets the value of the childSizeRangeCodeM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChildSizeRangeCodeM() {
        return childSizeRangeCodeM;
    }

    /**
     * Sets the value of the childSizeRangeCodeM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChildSizeRangeCodeM(String value) {
        this.childSizeRangeCodeM = value;
    }

    /**
     * Gets the value of the consumerSizeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumerSizeDescription() {
        return consumerSizeDescription;
    }

    /**
     * Sets the value of the consumerSizeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerSizeDescription(String value) {
        this.consumerSizeDescription = value;
    }

    /**
     * Gets the value of the departmentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDepartmentNumber() {
        return departmentNumber;
    }

    /**
     * Sets the value of the departmentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDepartmentNumber(Long value) {
        this.departmentNumber = value;
    }

    /**
     * Gets the value of the kohlsSizeSortNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getKohlsSizeSortNumber() {
        return kohlsSizeSortNumber;
    }

    /**
     * Sets the value of the kohlsSizeSortNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setKohlsSizeSortNumber(Long value) {
        this.kohlsSizeSortNumber = value;
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
     * Gets the value of the nrfSizeCode property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNRFSizeCode() {
        return nrfSizeCode;
    }

    /**
     * Sets the value of the nrfSizeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNRFSizeCode(Long value) {
        this.nrfSizeCode = value;
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

}
