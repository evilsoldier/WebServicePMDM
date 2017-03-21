
package com.kohls.schemas.cdm.producttypescdm.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * A department is a categorization in the merchandise hierarchy.  It is the level under Divisional Merchandise Area and groups together Major Classes. (Ex. Mens/Kids --> Mens Sportsware --> Mens Bottoms)
 * 
 * <p>Java class for DepartmentAttributesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DepartmentAttributesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MerchandiseLine" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *         &lt;element name="StoreZone" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}PrivateBrandCostFactorList" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}BuyingContact" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}BusinessGroup" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="BusinessGroupNumber" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="BuyerContactNumber" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="DMANumber" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="DepartmentDescription" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DepartmentNumber" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="MerchandiseLineCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ModifiedDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="PrivateBrandLoadPercent" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RecordStatusFlag" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ReportAfterClearanceDays" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="ReportDaysBeforeShipping" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="StoreZoneCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DepartmentAttributesType", propOrder = {
    "merchandiseLine",
    "storeZone",
    "privateBrandCostFactorList",
    "buyingContact",
    "businessGroup"
})
public class DepartmentAttributesType {

    @XmlElement(name = "MerchandiseLine")
    protected ReferenceValueType merchandiseLine;
    @XmlElement(name = "StoreZone")
    protected ReferenceValueType storeZone;
    @XmlElement(name = "PrivateBrandCostFactorList")
    protected PrivateBrandCostFactorListType privateBrandCostFactorList;
    @XmlElement(name = "BuyingContact")
    protected BuyingContactType buyingContact;
    @XmlElement(name = "BusinessGroup")
    protected BusinessGroupType businessGroup;
    @XmlAttribute(name = "BusinessGroupNumber")
    protected Long businessGroupNumber;
    @XmlAttribute(name = "BuyerContactNumber")
    protected Long buyerContactNumber;
    @XmlAttribute(name = "DMANumber")
    protected Long dmaNumber;
    @XmlAttribute(name = "DepartmentDescription")
    protected String departmentDescription;
    @XmlAttribute(name = "DepartmentNumber")
    protected Long departmentNumber;
    @XmlAttribute(name = "MerchandiseLineCode")
    protected String merchandiseLineCode;
    @XmlAttribute(name = "ModifiedDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifiedDateTime;
    @XmlAttribute(name = "PrivateBrandLoadPercent")
    protected String privateBrandLoadPercent;
    @XmlAttribute(name = "RecordStatusFlag")
    protected String recordStatusFlag;
    @XmlAttribute(name = "ReportAfterClearanceDays")
    protected Long reportAfterClearanceDays;
    @XmlAttribute(name = "ReportDaysBeforeShipping")
    protected Long reportDaysBeforeShipping;
    @XmlAttribute(name = "StoreZoneCode")
    protected String storeZoneCode;

    /**
     * Gets the value of the merchandiseLine property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceValueType }
     *     
     */
    public ReferenceValueType getMerchandiseLine() {
        return merchandiseLine;
    }

    /**
     * Sets the value of the merchandiseLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceValueType }
     *     
     */
    public void setMerchandiseLine(ReferenceValueType value) {
        this.merchandiseLine = value;
    }

    /**
     * Gets the value of the storeZone property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceValueType }
     *     
     */
    public ReferenceValueType getStoreZone() {
        return storeZone;
    }

    /**
     * Sets the value of the storeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceValueType }
     *     
     */
    public void setStoreZone(ReferenceValueType value) {
        this.storeZone = value;
    }

    /**
     * Gets the value of the privateBrandCostFactorList property.
     * 
     * @return
     *     possible object is
     *     {@link PrivateBrandCostFactorListType }
     *     
     */
    public PrivateBrandCostFactorListType getPrivateBrandCostFactorList() {
        return privateBrandCostFactorList;
    }

    /**
     * Sets the value of the privateBrandCostFactorList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrivateBrandCostFactorListType }
     *     
     */
    public void setPrivateBrandCostFactorList(PrivateBrandCostFactorListType value) {
        this.privateBrandCostFactorList = value;
    }

    /**
     * Gets the value of the buyingContact property.
     * 
     * @return
     *     possible object is
     *     {@link BuyingContactType }
     *     
     */
    public BuyingContactType getBuyingContact() {
        return buyingContact;
    }

    /**
     * Sets the value of the buyingContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuyingContactType }
     *     
     */
    public void setBuyingContact(BuyingContactType value) {
        this.buyingContact = value;
    }

    /**
     * Gets the value of the businessGroup property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessGroupType }
     *     
     */
    public BusinessGroupType getBusinessGroup() {
        return businessGroup;
    }

    /**
     * Sets the value of the businessGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessGroupType }
     *     
     */
    public void setBusinessGroup(BusinessGroupType value) {
        this.businessGroup = value;
    }

    /**
     * Gets the value of the businessGroupNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBusinessGroupNumber() {
        return businessGroupNumber;
    }

    /**
     * Sets the value of the businessGroupNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBusinessGroupNumber(Long value) {
        this.businessGroupNumber = value;
    }

    /**
     * Gets the value of the buyerContactNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBuyerContactNumber() {
        return buyerContactNumber;
    }

    /**
     * Sets the value of the buyerContactNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBuyerContactNumber(Long value) {
        this.buyerContactNumber = value;
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
     * Gets the value of the departmentDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartmentDescription() {
        return departmentDescription;
    }

    /**
     * Sets the value of the departmentDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartmentDescription(String value) {
        this.departmentDescription = value;
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
     * Gets the value of the merchandiseLineCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchandiseLineCode() {
        return merchandiseLineCode;
    }

    /**
     * Sets the value of the merchandiseLineCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchandiseLineCode(String value) {
        this.merchandiseLineCode = value;
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
     * Gets the value of the privateBrandLoadPercent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrivateBrandLoadPercent() {
        return privateBrandLoadPercent;
    }

    /**
     * Sets the value of the privateBrandLoadPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrivateBrandLoadPercent(String value) {
        this.privateBrandLoadPercent = value;
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
     * Gets the value of the reportAfterClearanceDays property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReportAfterClearanceDays() {
        return reportAfterClearanceDays;
    }

    /**
     * Sets the value of the reportAfterClearanceDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReportAfterClearanceDays(Long value) {
        this.reportAfterClearanceDays = value;
    }

    /**
     * Gets the value of the reportDaysBeforeShipping property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReportDaysBeforeShipping() {
        return reportDaysBeforeShipping;
    }

    /**
     * Sets the value of the reportDaysBeforeShipping property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReportDaysBeforeShipping(Long value) {
        this.reportDaysBeforeShipping = value;
    }

    /**
     * Gets the value of the storeZoneCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreZoneCode() {
        return storeZoneCode;
    }

    /**
     * Sets the value of the storeZoneCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreZoneCode(String value) {
        this.storeZoneCode = value;
    }

}
