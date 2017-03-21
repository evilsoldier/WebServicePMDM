
package com.kohls.schemas.cdm.producttypescdm.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * This is the association of a specific Vendor Style to a specific Kohl's Style.  This resolves the many-to-many relationship between Kohl's Style and Vendor Style.  This is needed to support Multiple Vendors.  It allows a Vendor Style to span multiple Kohl's Styles (ex. the vendor had both solids and stripes as one Vendor Style and we want to have two seperate Kohl's Styles).  It also allows a Kohl's Style to span multiple Vendor Styles (ex. the vendor has two seperate Vendor Styles but we want to only have one Kohl's Style).
 * 
 * <p>Java class for KohlsStyleVendorStyleAssociationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KohlsStyleVendorStyleAssociationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}KohlsStyleVendorStylePartnerList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="CountryOfProductionCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="EnterpriseIdentifier" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="KohlsStyleIdentifier" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="ModifiedDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="PrimaryVendorStyleIndicator" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RecordStatusFlag" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="VendorStyleNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KohlsStyleVendorStyleAssociationType", propOrder = {
    "kohlsStyleVendorStylePartnerList"
})
public class KohlsStyleVendorStyleAssociationType {

    @XmlElement(name = "KohlsStyleVendorStylePartnerList")
    protected KohlsStyleVendorStylePartnerListType kohlsStyleVendorStylePartnerList;
    @XmlAttribute(name = "CountryOfProductionCode")
    protected String countryOfProductionCode;
    @XmlAttribute(name = "EnterpriseIdentifier")
    protected Long enterpriseIdentifier;
    @XmlAttribute(name = "KohlsStyleIdentifier")
    protected Long kohlsStyleIdentifier;
    @XmlAttribute(name = "ModifiedDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifiedDateTime;
    @XmlAttribute(name = "PrimaryVendorStyleIndicator")
    protected String primaryVendorStyleIndicator;
    @XmlAttribute(name = "RecordStatusFlag")
    protected String recordStatusFlag;
    @XmlAttribute(name = "VendorStyleNumber")
    protected String vendorStyleNumber;

    /**
     * Gets the value of the kohlsStyleVendorStylePartnerList property.
     * 
     * @return
     *     possible object is
     *     {@link KohlsStyleVendorStylePartnerListType }
     *     
     */
    public KohlsStyleVendorStylePartnerListType getKohlsStyleVendorStylePartnerList() {
        return kohlsStyleVendorStylePartnerList;
    }

    /**
     * Sets the value of the kohlsStyleVendorStylePartnerList property.
     * 
     * @param value
     *     allowed object is
     *     {@link KohlsStyleVendorStylePartnerListType }
     *     
     */
    public void setKohlsStyleVendorStylePartnerList(KohlsStyleVendorStylePartnerListType value) {
        this.kohlsStyleVendorStylePartnerList = value;
    }

    /**
     * Gets the value of the countryOfProductionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryOfProductionCode() {
        return countryOfProductionCode;
    }

    /**
     * Sets the value of the countryOfProductionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryOfProductionCode(String value) {
        this.countryOfProductionCode = value;
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
     * Gets the value of the kohlsStyleIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getKohlsStyleIdentifier() {
        return kohlsStyleIdentifier;
    }

    /**
     * Sets the value of the kohlsStyleIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setKohlsStyleIdentifier(Long value) {
        this.kohlsStyleIdentifier = value;
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
     * Gets the value of the primaryVendorStyleIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryVendorStyleIndicator() {
        return primaryVendorStyleIndicator;
    }

    /**
     * Sets the value of the primaryVendorStyleIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryVendorStyleIndicator(String value) {
        this.primaryVendorStyleIndicator = value;
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
