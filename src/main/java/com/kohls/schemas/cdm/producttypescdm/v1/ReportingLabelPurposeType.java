
package com.kohls.schemas.cdm.producttypescdm.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ReportingLabelPurposeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReportingLabelPurposeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Category" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *         &lt;element name="ReportingLabel" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *         &lt;element name="ReportingLabelPurpose" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="CategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ModifiedDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="RecordStatusFlag" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ReportingLabelCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ReportingLabelPurposeCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportingLabelPurposeType", propOrder = {
    "category",
    "reportingLabel",
    "reportingLabelPurpose"
})
public class ReportingLabelPurposeType {

    @XmlElement(name = "Category")
    protected ReferenceValueType category;
    @XmlElement(name = "ReportingLabel")
    protected ReferenceValueType reportingLabel;
    @XmlElement(name = "ReportingLabelPurpose")
    protected ReferenceValueType reportingLabelPurpose;
    @XmlAttribute(name = "CategoryCode")
    protected String categoryCode;
    @XmlAttribute(name = "ModifiedDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifiedDateTime;
    @XmlAttribute(name = "RecordStatusFlag")
    protected String recordStatusFlag;
    @XmlAttribute(name = "ReportingLabelCode")
    protected String reportingLabelCode;
    @XmlAttribute(name = "ReportingLabelPurposeCode")
    protected String reportingLabelPurposeCode;

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
     * Gets the value of the reportingLabel property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceValueType }
     *     
     */
    public ReferenceValueType getReportingLabel() {
        return reportingLabel;
    }

    /**
     * Sets the value of the reportingLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceValueType }
     *     
     */
    public void setReportingLabel(ReferenceValueType value) {
        this.reportingLabel = value;
    }

    /**
     * Gets the value of the reportingLabelPurpose property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceValueType }
     *     
     */
    public ReferenceValueType getReportingLabelPurpose() {
        return reportingLabelPurpose;
    }

    /**
     * Sets the value of the reportingLabelPurpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceValueType }
     *     
     */
    public void setReportingLabelPurpose(ReferenceValueType value) {
        this.reportingLabelPurpose = value;
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
     * Gets the value of the reportingLabelCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportingLabelCode() {
        return reportingLabelCode;
    }

    /**
     * Sets the value of the reportingLabelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportingLabelCode(String value) {
        this.reportingLabelCode = value;
    }

    /**
     * Gets the value of the reportingLabelPurposeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportingLabelPurposeCode() {
        return reportingLabelPurposeCode;
    }

    /**
     * Sets the value of the reportingLabelPurposeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportingLabelPurposeCode(String value) {
        this.reportingLabelPurposeCode = value;
    }

}
