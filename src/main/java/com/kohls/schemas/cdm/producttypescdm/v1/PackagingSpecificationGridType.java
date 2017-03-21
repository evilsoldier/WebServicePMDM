
package com.kohls.schemas.cdm.producttypescdm.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * This should not even be Master Data. LH - 10/20/2012 - changed all relationships to this entity to the color "white" because there were too many lines running through the diagram.
 * 
 * <p>Java class for PackagingSpecificationGridType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PackagingSpecificationGridType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MerchandiseLevel" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *         &lt;element name="DistributionType" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryStrategy" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ActiveIndicator" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ClassNumber" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DeliveryStrategyCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DepartmentNumber" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="DistributionTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="EnterpriseIdentifier" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="InnerPackQuantity" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="MerchandiseLevelCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ModifiedDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="OpenToBuyWeekEffectiveBeginDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="OpenToBuyWeekEffectiveEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="OuterPackQuantity" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="PackagingSpeicificationGridIdentifier" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="RecordStatusFlag" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SKUNumber" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="SubClassNumber" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="VendorStyleNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackagingSpecificationGridType", propOrder = {
    "merchandiseLevel",
    "distributionType",
    "deliveryStrategy"
})
public class PackagingSpecificationGridType {

    @XmlElement(name = "MerchandiseLevel")
    protected ReferenceValueType merchandiseLevel;
    @XmlElement(name = "DistributionType")
    protected ReferenceValueType distributionType;
    @XmlElement(name = "DeliveryStrategy")
    protected ReferenceValueType deliveryStrategy;
    @XmlAttribute(name = "ActiveIndicator")
    protected String activeIndicator;
    @XmlAttribute(name = "ClassNumber")
    protected Long classNumber;
    @XmlAttribute(name = "CountryCode")
    protected String countryCode;
    @XmlAttribute(name = "DeliveryStrategyCode")
    protected String deliveryStrategyCode;
    @XmlAttribute(name = "DepartmentNumber")
    protected Long departmentNumber;
    @XmlAttribute(name = "DistributionTypeCode")
    protected String distributionTypeCode;
    @XmlAttribute(name = "EnterpriseIdentifier")
    protected Long enterpriseIdentifier;
    @XmlAttribute(name = "InnerPackQuantity")
    protected Long innerPackQuantity;
    @XmlAttribute(name = "MerchandiseLevelCode")
    protected String merchandiseLevelCode;
    @XmlAttribute(name = "ModifiedDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifiedDateTime;
    @XmlAttribute(name = "OpenToBuyWeekEffectiveBeginDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar openToBuyWeekEffectiveBeginDate;
    @XmlAttribute(name = "OpenToBuyWeekEffectiveEndDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar openToBuyWeekEffectiveEndDate;
    @XmlAttribute(name = "OuterPackQuantity")
    protected Long outerPackQuantity;
    @XmlAttribute(name = "PackagingSpeicificationGridIdentifier")
    protected Long packagingSpeicificationGridIdentifier;
    @XmlAttribute(name = "RecordStatusFlag")
    protected String recordStatusFlag;
    @XmlAttribute(name = "SKUNumber")
    protected Long skuNumber;
    @XmlAttribute(name = "SubClassNumber")
    protected Long subClassNumber;
    @XmlAttribute(name = "VendorStyleNumber")
    protected String vendorStyleNumber;

    /**
     * Gets the value of the merchandiseLevel property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceValueType }
     *     
     */
    public ReferenceValueType getMerchandiseLevel() {
        return merchandiseLevel;
    }

    /**
     * Sets the value of the merchandiseLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceValueType }
     *     
     */
    public void setMerchandiseLevel(ReferenceValueType value) {
        this.merchandiseLevel = value;
    }

    /**
     * Gets the value of the distributionType property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceValueType }
     *     
     */
    public ReferenceValueType getDistributionType() {
        return distributionType;
    }

    /**
     * Sets the value of the distributionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceValueType }
     *     
     */
    public void setDistributionType(ReferenceValueType value) {
        this.distributionType = value;
    }

    /**
     * Gets the value of the deliveryStrategy property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceValueType }
     *     
     */
    public ReferenceValueType getDeliveryStrategy() {
        return deliveryStrategy;
    }

    /**
     * Sets the value of the deliveryStrategy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceValueType }
     *     
     */
    public void setDeliveryStrategy(ReferenceValueType value) {
        this.deliveryStrategy = value;
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
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the deliveryStrategyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryStrategyCode() {
        return deliveryStrategyCode;
    }

    /**
     * Sets the value of the deliveryStrategyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryStrategyCode(String value) {
        this.deliveryStrategyCode = value;
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
     * Gets the value of the distributionTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistributionTypeCode() {
        return distributionTypeCode;
    }

    /**
     * Sets the value of the distributionTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistributionTypeCode(String value) {
        this.distributionTypeCode = value;
    }

    /**
     * Gets the value of the enterpriseIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEnterpriseIdentifier() {
        return enterpriseIdentifier;
    }

    /**
     * Sets the value of the enterpriseIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEnterpriseIdentifier(Long value) {
        this.enterpriseIdentifier = value;
    }

    /**
     * Gets the value of the innerPackQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInnerPackQuantity() {
        return innerPackQuantity;
    }

    /**
     * Sets the value of the innerPackQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInnerPackQuantity(Long value) {
        this.innerPackQuantity = value;
    }

    /**
     * Gets the value of the merchandiseLevelCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchandiseLevelCode() {
        return merchandiseLevelCode;
    }

    /**
     * Sets the value of the merchandiseLevelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchandiseLevelCode(String value) {
        this.merchandiseLevelCode = value;
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
     * Gets the value of the openToBuyWeekEffectiveBeginDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOpenToBuyWeekEffectiveBeginDate() {
        return openToBuyWeekEffectiveBeginDate;
    }

    /**
     * Sets the value of the openToBuyWeekEffectiveBeginDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOpenToBuyWeekEffectiveBeginDate(XMLGregorianCalendar value) {
        this.openToBuyWeekEffectiveBeginDate = value;
    }

    /**
     * Gets the value of the openToBuyWeekEffectiveEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOpenToBuyWeekEffectiveEndDate() {
        return openToBuyWeekEffectiveEndDate;
    }

    /**
     * Sets the value of the openToBuyWeekEffectiveEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOpenToBuyWeekEffectiveEndDate(XMLGregorianCalendar value) {
        this.openToBuyWeekEffectiveEndDate = value;
    }

    /**
     * Gets the value of the outerPackQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOuterPackQuantity() {
        return outerPackQuantity;
    }

    /**
     * Sets the value of the outerPackQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOuterPackQuantity(Long value) {
        this.outerPackQuantity = value;
    }

    /**
     * Gets the value of the packagingSpeicificationGridIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPackagingSpeicificationGridIdentifier() {
        return packagingSpeicificationGridIdentifier;
    }

    /**
     * Sets the value of the packagingSpeicificationGridIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPackagingSpeicificationGridIdentifier(Long value) {
        this.packagingSpeicificationGridIdentifier = value;
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
     * Gets the value of the skuNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSKUNumber() {
        return skuNumber;
    }

    /**
     * Sets the value of the skuNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSKUNumber(Long value) {
        this.skuNumber = value;
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

    /**
     * Gets the value of the vendorStyleNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorStyleNumber() {
        return vendorStyleNumber;
    }

    /**
     * Sets the value of the vendorStyleNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorStyleNumber(String value) {
        this.vendorStyleNumber = value;
    }

}
