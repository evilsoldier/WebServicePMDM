
package com.kohls.schemas.cdm.producttypescdm.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * A specific size measurement. Example: - Pants waist size 34 - Shirt Collar size 15 1/2 - Pajamas size medium - Dress size 10 This includes Size Range, Standard Size, Size Membership
 * 
 * <p>Java class for SizeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SizeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}DepartmentSizeAssociationList" minOccurs="0"/&gt;
 *         &lt;element name="SizeCategory" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *         &lt;element name="PrimarySizeType" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *         &lt;element name="SecondarySizeType" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *         &lt;element name="StandardSize" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *         &lt;element name="SizeRange" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *         &lt;element name="SizeGroup" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ActiveIndicator" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="KohlsPrimarySizeDescription" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="KohlsSecondarySizeDescription" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="KohlsSizeCode" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="KohlsSizeDescription" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ModifiedDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="NRFPrimaryDescription" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="NRFSecondaryDescription" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="NRFSizeCode" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="OldKohlsSizeDescription" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="PrimarySizeTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RecordStatusFlag" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SecondarySizeTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SizeCategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SizeGroupCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SizeRangeCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="StandardSizeCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SizeType", propOrder = {
    "departmentSizeAssociationList",
    "sizeCategory",
    "primarySizeType",
    "secondarySizeType",
    "standardSize",
    "sizeRange",
    "sizeGroup"
})
public class SizeType {

    @XmlElement(name = "DepartmentSizeAssociationList")
    protected DepartmentSizeAssociationListType departmentSizeAssociationList;
    @XmlElementRef(name = "SizeCategory", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<ReferenceValueType> sizeCategory;
    @XmlElement(name = "PrimarySizeType")
    protected ReferenceValueType primarySizeType;
    @XmlElement(name = "SecondarySizeType")
    protected ReferenceValueType secondarySizeType;
    @XmlElement(name = "StandardSize")
    protected ReferenceValueType standardSize;
    @XmlElement(name = "SizeRange")
    protected ReferenceValueType sizeRange;
    @XmlElement(name = "SizeGroup")
    protected ReferenceValueType sizeGroup;
    @XmlAttribute(name = "ActiveIndicator")
    protected String activeIndicator;
    @XmlAttribute(name = "KohlsPrimarySizeDescription")
    protected String kohlsPrimarySizeDescription;
    @XmlAttribute(name = "KohlsSecondarySizeDescription")
    protected String kohlsSecondarySizeDescription;
    @XmlAttribute(name = "KohlsSizeCode")
    protected Long kohlsSizeCode;
    @XmlAttribute(name = "KohlsSizeDescription")
    protected String kohlsSizeDescription;
    @XmlAttribute(name = "ModifiedDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifiedDateTime;
    @XmlAttribute(name = "NRFPrimaryDescription")
    protected String nrfPrimaryDescription;
    @XmlAttribute(name = "NRFSecondaryDescription")
    protected String nrfSecondaryDescription;
    @XmlAttribute(name = "NRFSizeCode")
    protected Long nrfSizeCode;
    @XmlAttribute(name = "OldKohlsSizeDescription")
    protected String oldKohlsSizeDescription;
    @XmlAttribute(name = "PrimarySizeTypeCode")
    protected String primarySizeTypeCode;
    @XmlAttribute(name = "RecordStatusFlag")
    protected String recordStatusFlag;
    @XmlAttribute(name = "SecondarySizeTypeCode")
    protected String secondarySizeTypeCode;
    @XmlAttribute(name = "SizeCategoryCode")
    protected String sizeCategoryCode;
    @XmlAttribute(name = "SizeGroupCode")
    protected String sizeGroupCode;
    @XmlAttribute(name = "SizeRangeCode")
    protected String sizeRangeCode;
    @XmlAttribute(name = "StandardSizeCode")
    protected String standardSizeCode;

    /**
     * Gets the value of the departmentSizeAssociationList property.
     * 
     * @return
     *     possible object is
     *     {@link DepartmentSizeAssociationListType }
     *     
     */
    public DepartmentSizeAssociationListType getDepartmentSizeAssociationList() {
        return departmentSizeAssociationList;
    }

    /**
     * Sets the value of the departmentSizeAssociationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepartmentSizeAssociationListType }
     *     
     */
    public void setDepartmentSizeAssociationList(DepartmentSizeAssociationListType value) {
        this.departmentSizeAssociationList = value;
    }

    /**
     * Gets the value of the sizeCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueType }{@code >}
     *     
     */
    public JAXBElement<ReferenceValueType> getSizeCategory() {
        return sizeCategory;
    }

    /**
     * Sets the value of the sizeCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueType }{@code >}
     *     
     */
    public void setSizeCategory(JAXBElement<ReferenceValueType> value) {
        this.sizeCategory = value;
    }

    /**
     * Gets the value of the primarySizeType property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceValueType }
     *     
     */
    public ReferenceValueType getPrimarySizeType() {
        return primarySizeType;
    }

    /**
     * Sets the value of the primarySizeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceValueType }
     *     
     */
    public void setPrimarySizeType(ReferenceValueType value) {
        this.primarySizeType = value;
    }

    /**
     * Gets the value of the secondarySizeType property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceValueType }
     *     
     */
    public ReferenceValueType getSecondarySizeType() {
        return secondarySizeType;
    }

    /**
     * Sets the value of the secondarySizeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceValueType }
     *     
     */
    public void setSecondarySizeType(ReferenceValueType value) {
        this.secondarySizeType = value;
    }

    /**
     * Gets the value of the standardSize property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceValueType }
     *     
     */
    public ReferenceValueType getStandardSize() {
        return standardSize;
    }

    /**
     * Sets the value of the standardSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceValueType }
     *     
     */
    public void setStandardSize(ReferenceValueType value) {
        this.standardSize = value;
    }

    /**
     * Gets the value of the sizeRange property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceValueType }
     *     
     */
    public ReferenceValueType getSizeRange() {
        return sizeRange;
    }

    /**
     * Sets the value of the sizeRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceValueType }
     *     
     */
    public void setSizeRange(ReferenceValueType value) {
        this.sizeRange = value;
    }

    /**
     * Gets the value of the sizeGroup property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceValueType }
     *     
     */
    public ReferenceValueType getSizeGroup() {
        return sizeGroup;
    }

    /**
     * Sets the value of the sizeGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceValueType }
     *     
     */
    public void setSizeGroup(ReferenceValueType value) {
        this.sizeGroup = value;
    }

    /**
     * Gets the value of the activeIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActiveIndicator() {
        return activeIndicator;
    }

    /**
     * Sets the value of the activeIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActiveIndicator(String value) {
        this.activeIndicator = value;
    }

    /**
     * Gets the value of the kohlsPrimarySizeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKohlsPrimarySizeDescription() {
        return kohlsPrimarySizeDescription;
    }

    /**
     * Sets the value of the kohlsPrimarySizeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKohlsPrimarySizeDescription(String value) {
        this.kohlsPrimarySizeDescription = value;
    }

    /**
     * Gets the value of the kohlsSecondarySizeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKohlsSecondarySizeDescription() {
        return kohlsSecondarySizeDescription;
    }

    /**
     * Sets the value of the kohlsSecondarySizeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKohlsSecondarySizeDescription(String value) {
        this.kohlsSecondarySizeDescription = value;
    }

    /**
     * Gets the value of the kohlsSizeCode property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getKohlsSizeCode() {
        return kohlsSizeCode;
    }

    /**
     * Sets the value of the kohlsSizeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setKohlsSizeCode(Long value) {
        this.kohlsSizeCode = value;
    }

    /**
     * Gets the value of the kohlsSizeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKohlsSizeDescription() {
        return kohlsSizeDescription;
    }

    /**
     * Sets the value of the kohlsSizeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKohlsSizeDescription(String value) {
        this.kohlsSizeDescription = value;
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
     * Gets the value of the nrfPrimaryDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNRFPrimaryDescription() {
        return nrfPrimaryDescription;
    }

    /**
     * Sets the value of the nrfPrimaryDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNRFPrimaryDescription(String value) {
        this.nrfPrimaryDescription = value;
    }

    /**
     * Gets the value of the nrfSecondaryDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNRFSecondaryDescription() {
        return nrfSecondaryDescription;
    }

    /**
     * Sets the value of the nrfSecondaryDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNRFSecondaryDescription(String value) {
        this.nrfSecondaryDescription = value;
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
     * Gets the value of the oldKohlsSizeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldKohlsSizeDescription() {
        return oldKohlsSizeDescription;
    }

    /**
     * Sets the value of the oldKohlsSizeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldKohlsSizeDescription(String value) {
        this.oldKohlsSizeDescription = value;
    }

    /**
     * Gets the value of the primarySizeTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimarySizeTypeCode() {
        return primarySizeTypeCode;
    }

    /**
     * Sets the value of the primarySizeTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimarySizeTypeCode(String value) {
        this.primarySizeTypeCode = value;
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
     * Gets the value of the secondarySizeTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondarySizeTypeCode() {
        return secondarySizeTypeCode;
    }

    /**
     * Sets the value of the secondarySizeTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondarySizeTypeCode(String value) {
        this.secondarySizeTypeCode = value;
    }

    /**
     * Gets the value of the sizeCategoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSizeCategoryCode() {
        return sizeCategoryCode;
    }

    /**
     * Sets the value of the sizeCategoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSizeCategoryCode(String value) {
        this.sizeCategoryCode = value;
    }

    /**
     * Gets the value of the sizeGroupCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSizeGroupCode() {
        return sizeGroupCode;
    }

    /**
     * Sets the value of the sizeGroupCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSizeGroupCode(String value) {
        this.sizeGroupCode = value;
    }

    /**
     * Gets the value of the sizeRangeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSizeRangeCode() {
        return sizeRangeCode;
    }

    /**
     * Sets the value of the sizeRangeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSizeRangeCode(String value) {
        this.sizeRangeCode = value;
    }

    /**
     * Gets the value of the standardSizeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStandardSizeCode() {
        return standardSizeCode;
    }

    /**
     * Sets the value of the standardSizeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStandardSizeCode(String value) {
        this.standardSizeCode = value;
    }

}
