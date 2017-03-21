
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
 * This entity will contain the metadata needed to support the following concepts:
 *  1.  Category Specific Attributes
 *  2.  Conditional Dropdowns
 *  3.  Smart Defaults
 *  4.  Required/Not Required (not supported in this table - out of scope)
 * 
 * The users will be able to set up the criteria upon which a rule operates.  They CANNOT add an entirely new Attribute to this table without IS involvement in writing code to call the rule api's.
 * 
 * <p>Java class for AttributeRuleManagementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AttributeRuleManagementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SmartDefaultReferenceValueM" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueListType" minOccurs="0"/&gt;
 *         &lt;element name="ConditionalDropDownReferenceValueM" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueListType" minOccurs="0"/&gt;
 *         &lt;element name="MajorCategory" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *         &lt;element name="Category" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *         &lt;element name="ProductType" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *         &lt;element name="ProductSubtype" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="AttributeName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="AttributeRuleManagementIdentifier" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="CategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ClassNumber" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="ConditionalDropDownReferenceValueCodeM" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DMANumber" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="DepartmentNumber" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="MajorCategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ModifiedDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="ProductSubtypeCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ProductTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RecordStatusFlag" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RepositoryName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RequiredIndicator" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ShowIndicator" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SmartDefaultReferenceValueCodeM" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SubClassNumber" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttributeRuleManagementType", propOrder = {
    "smartDefaultReferenceValueM",
    "conditionalDropDownReferenceValueM",
    "majorCategory",
    "category",
    "productType",
    "productSubtype"
})
public class AttributeRuleManagementType {

    @XmlElementRef(name = "SmartDefaultReferenceValueM", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<ReferenceValueListType> smartDefaultReferenceValueM;
    @XmlElementRef(name = "ConditionalDropDownReferenceValueM", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<ReferenceValueListType> conditionalDropDownReferenceValueM;
    @XmlElement(name = "MajorCategory")
    protected ReferenceValueType majorCategory;
    @XmlElement(name = "Category")
    protected ReferenceValueType category;
    @XmlElement(name = "ProductType")
    protected ReferenceValueType productType;
    @XmlElement(name = "ProductSubtype")
    protected ReferenceValueType productSubtype;
    @XmlAttribute(name = "AttributeName")
    protected String attributeName;
    @XmlAttribute(name = "AttributeRuleManagementIdentifier")
    protected Long attributeRuleManagementIdentifier;
    @XmlAttribute(name = "CategoryCode")
    protected String categoryCode;
    @XmlAttribute(name = "ClassNumber")
    protected Long classNumber;
    @XmlAttribute(name = "ConditionalDropDownReferenceValueCodeM")
    protected String conditionalDropDownReferenceValueCodeM;
    @XmlAttribute(name = "DMANumber")
    protected Long dmaNumber;
    @XmlAttribute(name = "DepartmentNumber")
    protected Long departmentNumber;
    @XmlAttribute(name = "MajorCategoryCode")
    protected String majorCategoryCode;
    @XmlAttribute(name = "ModifiedDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifiedDateTime;
    @XmlAttribute(name = "ProductSubtypeCode")
    protected String productSubtypeCode;
    @XmlAttribute(name = "ProductTypeCode")
    protected String productTypeCode;
    @XmlAttribute(name = "RecordStatusFlag")
    protected String recordStatusFlag;
    @XmlAttribute(name = "RepositoryName")
    protected String repositoryName;
    @XmlAttribute(name = "RequiredIndicator")
    protected String requiredIndicator;
    @XmlAttribute(name = "ShowIndicator")
    protected String showIndicator;
    @XmlAttribute(name = "SmartDefaultReferenceValueCodeM")
    protected String smartDefaultReferenceValueCodeM;
    @XmlAttribute(name = "SubClassNumber")
    protected Long subClassNumber;

    /**
     * Gets the value of the smartDefaultReferenceValueM property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueListType }{@code >}
     *     
     */
    public JAXBElement<ReferenceValueListType> getSmartDefaultReferenceValueM() {
        return smartDefaultReferenceValueM;
    }

    /**
     * Sets the value of the smartDefaultReferenceValueM property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueListType }{@code >}
     *     
     */
    public void setSmartDefaultReferenceValueM(JAXBElement<ReferenceValueListType> value) {
        this.smartDefaultReferenceValueM = value;
    }

    /**
     * Gets the value of the conditionalDropDownReferenceValueM property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueListType }{@code >}
     *     
     */
    public JAXBElement<ReferenceValueListType> getConditionalDropDownReferenceValueM() {
        return conditionalDropDownReferenceValueM;
    }

    /**
     * Sets the value of the conditionalDropDownReferenceValueM property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueListType }{@code >}
     *     
     */
    public void setConditionalDropDownReferenceValueM(JAXBElement<ReferenceValueListType> value) {
        this.conditionalDropDownReferenceValueM = value;
    }

    /**
     * Gets the value of the majorCategory property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceValueType }
     *     
     */
    public ReferenceValueType getMajorCategory() {
        return majorCategory;
    }

    /**
     * Sets the value of the majorCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceValueType }
     *     
     */
    public void setMajorCategory(ReferenceValueType value) {
        this.majorCategory = value;
    }

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
     * Gets the value of the productType property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceValueType }
     *     
     */
    public ReferenceValueType getProductType() {
        return productType;
    }

    /**
     * Sets the value of the productType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceValueType }
     *     
     */
    public void setProductType(ReferenceValueType value) {
        this.productType = value;
    }

    /**
     * Gets the value of the productSubtype property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceValueType }
     *     
     */
    public ReferenceValueType getProductSubtype() {
        return productSubtype;
    }

    /**
     * Sets the value of the productSubtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceValueType }
     *     
     */
    public void setProductSubtype(ReferenceValueType value) {
        this.productSubtype = value;
    }

    /**
     * Gets the value of the attributeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttributeName() {
        return attributeName;
    }

    /**
     * Sets the value of the attributeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttributeName(String value) {
        this.attributeName = value;
    }

    /**
     * Gets the value of the attributeRuleManagementIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAttributeRuleManagementIdentifier() {
        return attributeRuleManagementIdentifier;
    }

    /**
     * Sets the value of the attributeRuleManagementIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAttributeRuleManagementIdentifier(Long value) {
        this.attributeRuleManagementIdentifier = value;
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
     * Gets the value of the classNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getClassNumber() {
        return classNumber;
    }

    /**
     * Sets the value of the classNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setClassNumber(Long value) {
        this.classNumber = value;
    }

    /**
     * Gets the value of the conditionalDropDownReferenceValueCodeM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConditionalDropDownReferenceValueCodeM() {
        return conditionalDropDownReferenceValueCodeM;
    }

    /**
     * Sets the value of the conditionalDropDownReferenceValueCodeM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConditionalDropDownReferenceValueCodeM(String value) {
        this.conditionalDropDownReferenceValueCodeM = value;
    }

    /**
     * Gets the value of the dmaNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDMANumber() {
        return dmaNumber;
    }

    /**
     * Sets the value of the dmaNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDMANumber(Long value) {
        this.dmaNumber = value;
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
     * Gets the value of the majorCategoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMajorCategoryCode() {
        return majorCategoryCode;
    }

    /**
     * Sets the value of the majorCategoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMajorCategoryCode(String value) {
        this.majorCategoryCode = value;
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
     * Gets the value of the productSubtypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductSubtypeCode() {
        return productSubtypeCode;
    }

    /**
     * Sets the value of the productSubtypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductSubtypeCode(String value) {
        this.productSubtypeCode = value;
    }

    /**
     * Gets the value of the productTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductTypeCode() {
        return productTypeCode;
    }

    /**
     * Sets the value of the productTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductTypeCode(String value) {
        this.productTypeCode = value;
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
     * Gets the value of the repositoryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepositoryName() {
        return repositoryName;
    }

    /**
     * Sets the value of the repositoryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepositoryName(String value) {
        this.repositoryName = value;
    }

    /**
     * Gets the value of the requiredIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequiredIndicator() {
        return requiredIndicator;
    }

    /**
     * Sets the value of the requiredIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequiredIndicator(String value) {
        this.requiredIndicator = value;
    }

    /**
     * Gets the value of the showIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShowIndicator() {
        return showIndicator;
    }

    /**
     * Sets the value of the showIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShowIndicator(String value) {
        this.showIndicator = value;
    }

    /**
     * Gets the value of the smartDefaultReferenceValueCodeM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmartDefaultReferenceValueCodeM() {
        return smartDefaultReferenceValueCodeM;
    }

    /**
     * Sets the value of the smartDefaultReferenceValueCodeM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmartDefaultReferenceValueCodeM(String value) {
        this.smartDefaultReferenceValueCodeM = value;
    }

    /**
     * Gets the value of the subClassNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSubClassNumber() {
        return subClassNumber;
    }

    /**
     * Sets the value of the subClassNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSubClassNumber(Long value) {
        this.subClassNumber = value;
    }

}
