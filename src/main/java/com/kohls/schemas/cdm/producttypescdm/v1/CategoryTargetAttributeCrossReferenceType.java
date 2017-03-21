
package com.kohls.schemas.cdm.producttypescdm.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CategoryTargetAttributeCrossReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CategoryTargetAttributeCrossReferenceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Category" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *         &lt;element name="TargetAttributeReference" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *         &lt;element name="SourceAttributeReference" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *         &lt;element name="ReportingLabelM" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueListType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="CategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ModifiedDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="RecordStatusFlag" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ReportingLabelCodeM" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SourceAttributeReferenceCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="TargetAttributeReferenceCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CategoryTargetAttributeCrossReferenceType", propOrder = {
    "category",
    "targetAttributeReference",
    "sourceAttributeReference",
    "reportingLabelM"
})
public class CategoryTargetAttributeCrossReferenceType {

    @XmlElement(name = "Category")
    protected ReferenceValueType category;
    @XmlElement(name = "TargetAttributeReference")
    protected ReferenceValueType targetAttributeReference;
    @XmlElement(name = "SourceAttributeReference")
    protected ReferenceValueType sourceAttributeReference;
    @XmlElement(name = "ReportingLabelM")
    protected ReferenceValueListType reportingLabelM;
    @XmlAttribute(name = "CategoryCode")
    protected String categoryCode;
    @XmlAttribute(name = "ModifiedDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifiedDateTime;
    @XmlAttribute(name = "RecordStatusFlag")
    protected String recordStatusFlag;
    @XmlAttribute(name = "ReportingLabelCodeM")
    protected String reportingLabelCodeM;
    @XmlAttribute(name = "SourceAttributeReferenceCode")
    protected String sourceAttributeReferenceCode;
    @XmlAttribute(name = "TargetAttributeReferenceCode")
    protected String targetAttributeReferenceCode;

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceValueType }
     *     
     */
    public ReferenceValueType getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceValueType }
     *     
     */
    public void setCategory(ReferenceValueType value) {
        this.category = value;
    }

    /**
     * Gets the value of the targetAttributeReference property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceValueType }
     *     
     */
    public ReferenceValueType getTargetAttributeReference() {
        return targetAttributeReference;
    }

    /**
     * Sets the value of the targetAttributeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceValueType }
     *     
     */
    public void setTargetAttributeReference(ReferenceValueType value) {
        this.targetAttributeReference = value;
    }

    /**
     * Gets the value of the sourceAttributeReference property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceValueType }
     *     
     */
    public ReferenceValueType getSourceAttributeReference() {
        return sourceAttributeReference;
    }

    /**
     * Sets the value of the sourceAttributeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceValueType }
     *     
     */
    public void setSourceAttributeReference(ReferenceValueType value) {
        this.sourceAttributeReference = value;
    }

    /**
     * Gets the value of the reportingLabelM property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceValueListType }
     *     
     */
    public ReferenceValueListType getReportingLabelM() {
        return reportingLabelM;
    }

    /**
     * Sets the value of the reportingLabelM property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceValueListType }
     *     
     */
    public void setReportingLabelM(ReferenceValueListType value) {
        this.reportingLabelM = value;
    }

    /**
     * Gets the value of the categoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryCode() {
        return categoryCode;
    }

    /**
     * Sets the value of the categoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryCode(String value) {
        this.categoryCode = value;
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
     * Gets the value of the reportingLabelCodeM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportingLabelCodeM() {
        return reportingLabelCodeM;
    }

    /**
     * Sets the value of the reportingLabelCodeM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportingLabelCodeM(String value) {
        this.reportingLabelCodeM = value;
    }

    /**
     * Gets the value of the sourceAttributeReferenceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceAttributeReferenceCode() {
        return sourceAttributeReferenceCode;
    }

    /**
     * Sets the value of the sourceAttributeReferenceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceAttributeReferenceCode(String value) {
        this.sourceAttributeReferenceCode = value;
    }

    /**
     * Gets the value of the targetAttributeReferenceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetAttributeReferenceCode() {
        return targetAttributeReferenceCode;
    }

    /**
     * Sets the value of the targetAttributeReferenceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetAttributeReferenceCode(String value) {
        this.targetAttributeReferenceCode = value;
    }

}
