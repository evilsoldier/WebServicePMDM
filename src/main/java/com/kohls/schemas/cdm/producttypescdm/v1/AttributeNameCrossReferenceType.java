
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
 * <p>Java class for AttributeNameCrossReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AttributeNameCrossReferenceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AttributeRuleLevel" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *         &lt;element name="CorporateDefaultReferenceValueM" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueListType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}AttributeRuleManagementList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="AttributeName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="AttributeRuleEligibleIndicator" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="AttributeRuleLevelCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="CategorySpecificAttributeIndicator" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="CorporateDefaultReferenceValueCodeM" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ModifiedDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="MultiValueAttributeIndicator" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RecordStatusFlag" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ReferenceCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RepositoryName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttributeNameCrossReferenceType", propOrder = {
    "attributeRuleLevel",
    "corporateDefaultReferenceValueM",
    "attributeRuleManagementList"
})
public class AttributeNameCrossReferenceType {

    @XmlElement(name = "AttributeRuleLevel")
    protected ReferenceValueType attributeRuleLevel;
    @XmlElement(name = "CorporateDefaultReferenceValueM")
    protected List<ReferenceValueListType> corporateDefaultReferenceValueM;
    @XmlElement(name = "AttributeRuleManagementList")
    protected AttributeRuleManagementListType attributeRuleManagementList;
    @XmlAttribute(name = "AttributeName")
    protected String attributeName;
    @XmlAttribute(name = "AttributeRuleEligibleIndicator")
    protected String attributeRuleEligibleIndicator;
    @XmlAttribute(name = "AttributeRuleLevelCode")
    protected String attributeRuleLevelCode;
    @XmlAttribute(name = "CategorySpecificAttributeIndicator")
    protected String categorySpecificAttributeIndicator;
    @XmlAttribute(name = "CorporateDefaultReferenceValueCodeM")
    protected String corporateDefaultReferenceValueCodeM;
    @XmlAttribute(name = "ModifiedDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifiedDateTime;
    @XmlAttribute(name = "MultiValueAttributeIndicator")
    protected String multiValueAttributeIndicator;
    @XmlAttribute(name = "RecordStatusFlag")
    protected String recordStatusFlag;
    @XmlAttribute(name = "ReferenceCode")
    protected String referenceCode;
    @XmlAttribute(name = "RepositoryName")
    protected String repositoryName;

    /**
     * Gets the value of the attributeRuleLevel property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceValueType }
     *     
     */
    public ReferenceValueType getAttributeRuleLevel() {
        return attributeRuleLevel;
    }

    /**
     * Sets the value of the attributeRuleLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceValueType }
     *     
     */
    public void setAttributeRuleLevel(ReferenceValueType value) {
        this.attributeRuleLevel = value;
    }

    /**
     * Gets the value of the corporateDefaultReferenceValueM property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the corporateDefaultReferenceValueM property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorporateDefaultReferenceValueM().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceValueListType }
     * 
     * 
     */
    public List<ReferenceValueListType> getCorporateDefaultReferenceValueM() {
        if (corporateDefaultReferenceValueM == null) {
            corporateDefaultReferenceValueM = new ArrayList<ReferenceValueListType>();
        }
        return this.corporateDefaultReferenceValueM;
    }

    /**
     * Gets the value of the attributeRuleManagementList property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeRuleManagementListType }
     *     
     */
    public AttributeRuleManagementListType getAttributeRuleManagementList() {
        return attributeRuleManagementList;
    }

    /**
     * Sets the value of the attributeRuleManagementList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeRuleManagementListType }
     *     
     */
    public void setAttributeRuleManagementList(AttributeRuleManagementListType value) {
        this.attributeRuleManagementList = value;
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
     * Gets the value of the attributeRuleEligibleIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttributeRuleEligibleIndicator() {
        return attributeRuleEligibleIndicator;
    }

    /**
     * Sets the value of the attributeRuleEligibleIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttributeRuleEligibleIndicator(String value) {
        this.attributeRuleEligibleIndicator = value;
    }

    /**
     * Gets the value of the attributeRuleLevelCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttributeRuleLevelCode() {
        return attributeRuleLevelCode;
    }

    /**
     * Sets the value of the attributeRuleLevelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttributeRuleLevelCode(String value) {
        this.attributeRuleLevelCode = value;
    }

    /**
     * Gets the value of the categorySpecificAttributeIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategorySpecificAttributeIndicator() {
        return categorySpecificAttributeIndicator;
    }

    /**
     * Sets the value of the categorySpecificAttributeIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategorySpecificAttributeIndicator(String value) {
        this.categorySpecificAttributeIndicator = value;
    }

    /**
     * Gets the value of the corporateDefaultReferenceValueCodeM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorporateDefaultReferenceValueCodeM() {
        return corporateDefaultReferenceValueCodeM;
    }

    /**
     * Sets the value of the corporateDefaultReferenceValueCodeM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorporateDefaultReferenceValueCodeM(String value) {
        this.corporateDefaultReferenceValueCodeM = value;
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
     * Gets the value of the multiValueAttributeIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMultiValueAttributeIndicator() {
        return multiValueAttributeIndicator;
    }

    /**
     * Sets the value of the multiValueAttributeIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMultiValueAttributeIndicator(String value) {
        this.multiValueAttributeIndicator = value;
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
     * Gets the value of the referenceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceCode() {
        return referenceCode;
    }

    /**
     * Sets the value of the referenceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceCode(String value) {
        this.referenceCode = value;
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

}
