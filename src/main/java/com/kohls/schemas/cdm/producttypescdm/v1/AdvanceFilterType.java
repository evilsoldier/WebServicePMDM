
package com.kohls.schemas.cdm.producttypescdm.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AdvanceFilterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdvanceFilterType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}Filter" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="AppName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="BeforeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="ExtractDirPath" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="FilterDeletedRecords" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="FilterStr" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Format" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="OnAndAfterDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="ReqestID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RequestType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SkipBC" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="WantChildren" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="WantLegacyKeys" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="WantOnlyCount" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="WantRelationship" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="WantSummary" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdvanceFilterType", propOrder = {
    "filter"
})
public class AdvanceFilterType {

    @XmlElement(name = "Filter")
    protected FilterType filter;
    @XmlAttribute(name = "AppName")
    protected String appName;
    @XmlAttribute(name = "BeforeDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar beforeDate;
    @XmlAttribute(name = "ExtractDirPath")
    protected String extractDirPath;
    @XmlAttribute(name = "FilterDeletedRecords")
    protected Boolean filterDeletedRecords;
    @XmlAttribute(name = "FilterStr")
    protected String filterStr;
    @XmlAttribute(name = "Format")
    protected String format;
    @XmlAttribute(name = "OnAndAfterDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar onAndAfterDate;
    @XmlAttribute(name = "ReqestID")
    protected String reqestID;
    @XmlAttribute(name = "RequestType")
    protected String requestType;
    @XmlAttribute(name = "SkipBC")
    protected Boolean skipBC;
    @XmlAttribute(name = "WantChildren")
    protected Boolean wantChildren;
    @XmlAttribute(name = "WantLegacyKeys")
    protected Boolean wantLegacyKeys;
    @XmlAttribute(name = "WantOnlyCount")
    protected Boolean wantOnlyCount;
    @XmlAttribute(name = "WantRelationship")
    protected Boolean wantRelationship;
    @XmlAttribute(name = "WantSummary")
    protected Boolean wantSummary;

    /**
     * Gets the value of the filter property.
     * 
     * @return
     *     possible object is
     *     {@link FilterType }
     *     
     */
    public FilterType getFilter() {
        return filter;
    }

    /**
     * Sets the value of the filter property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterType }
     *     
     */
    public void setFilter(FilterType value) {
        this.filter = value;
    }

    /**
     * Gets the value of the appName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppName() {
        return appName;
    }

    /**
     * Sets the value of the appName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppName(String value) {
        this.appName = value;
    }

    /**
     * Gets the value of the beforeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBeforeDate() {
        return beforeDate;
    }

    /**
     * Sets the value of the beforeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBeforeDate(XMLGregorianCalendar value) {
        this.beforeDate = value;
    }

    /**
     * Gets the value of the extractDirPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtractDirPath() {
        return extractDirPath;
    }

    /**
     * Sets the value of the extractDirPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtractDirPath(String value) {
        this.extractDirPath = value;
    }

    /**
     * Gets the value of the filterDeletedRecords property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFilterDeletedRecords() {
        return filterDeletedRecords;
    }

    /**
     * Sets the value of the filterDeletedRecords property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFilterDeletedRecords(Boolean value) {
        this.filterDeletedRecords = value;
    }

    /**
     * Gets the value of the filterStr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilterStr() {
        return filterStr;
    }

    /**
     * Sets the value of the filterStr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilterStr(String value) {
        this.filterStr = value;
    }

    /**
     * Gets the value of the format property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormat() {
        return format;
    }

    /**
     * Sets the value of the format property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormat(String value) {
        this.format = value;
    }

    /**
     * Gets the value of the onAndAfterDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOnAndAfterDate() {
        return onAndAfterDate;
    }

    /**
     * Sets the value of the onAndAfterDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOnAndAfterDate(XMLGregorianCalendar value) {
        this.onAndAfterDate = value;
    }

    /**
     * Gets the value of the reqestID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqestID() {
        return reqestID;
    }

    /**
     * Sets the value of the reqestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReqestID(String value) {
        this.reqestID = value;
    }

    /**
     * Gets the value of the requestType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestType() {
        return requestType;
    }

    /**
     * Sets the value of the requestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestType(String value) {
        this.requestType = value;
    }

    /**
     * Gets the value of the skipBC property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSkipBC() {
        return skipBC;
    }

    /**
     * Sets the value of the skipBC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSkipBC(Boolean value) {
        this.skipBC = value;
    }

    /**
     * Gets the value of the wantChildren property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWantChildren() {
        return wantChildren;
    }

    /**
     * Sets the value of the wantChildren property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWantChildren(Boolean value) {
        this.wantChildren = value;
    }

    /**
     * Gets the value of the wantLegacyKeys property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWantLegacyKeys() {
        return wantLegacyKeys;
    }

    /**
     * Sets the value of the wantLegacyKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWantLegacyKeys(Boolean value) {
        this.wantLegacyKeys = value;
    }

    /**
     * Gets the value of the wantOnlyCount property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWantOnlyCount() {
        return wantOnlyCount;
    }

    /**
     * Sets the value of the wantOnlyCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWantOnlyCount(Boolean value) {
        this.wantOnlyCount = value;
    }

    /**
     * Gets the value of the wantRelationship property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWantRelationship() {
        return wantRelationship;
    }

    /**
     * Sets the value of the wantRelationship property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWantRelationship(Boolean value) {
        this.wantRelationship = value;
    }

    /**
     * Gets the value of the wantSummary property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWantSummary() {
        return wantSummary;
    }

    /**
     * Sets the value of the wantSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWantSummary(Boolean value) {
        this.wantSummary = value;
    }

}
