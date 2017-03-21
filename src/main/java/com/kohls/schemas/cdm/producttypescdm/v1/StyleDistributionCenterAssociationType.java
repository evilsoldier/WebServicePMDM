
package com.kohls.schemas.cdm.producttypescdm.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for StyleDistributionCenterAssociationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StyleDistributionCenterAssociationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="BaggableIndicator" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="BinBoxCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ConveyableIndicator" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="KohlsStyleIdentifier" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="ModifiedDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="PickLocationAssignmentCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RecordStatusFlag" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SortableIndicator" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StyleDistributionCenterAssociationType")
public class StyleDistributionCenterAssociationType {

    @XmlAttribute(name = "BaggableIndicator")
    protected String baggableIndicator;
    @XmlAttribute(name = "BinBoxCode")
    protected String binBoxCode;
    @XmlAttribute(name = "ConveyableIndicator")
    protected String conveyableIndicator;
    @XmlAttribute(name = "KohlsStyleIdentifier")
    protected Long kohlsStyleIdentifier;
    @XmlAttribute(name = "ModifiedDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifiedDateTime;
    @XmlAttribute(name = "PickLocationAssignmentCode")
    protected String pickLocationAssignmentCode;
    @XmlAttribute(name = "RecordStatusFlag")
    protected String recordStatusFlag;
    @XmlAttribute(name = "SortableIndicator")
    protected String sortableIndicator;

    /**
     * Gets the value of the baggableIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaggableIndicator() {
        return baggableIndicator;
    }

    /**
     * Sets the value of the baggableIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaggableIndicator(String value) {
        this.baggableIndicator = value;
    }

    /**
     * Gets the value of the binBoxCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBinBoxCode() {
        return binBoxCode;
    }

    /**
     * Sets the value of the binBoxCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBinBoxCode(String value) {
        this.binBoxCode = value;
    }

    /**
     * Gets the value of the conveyableIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConveyableIndicator() {
        return conveyableIndicator;
    }

    /**
     * Sets the value of the conveyableIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConveyableIndicator(String value) {
        this.conveyableIndicator = value;
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
     * Gets the value of the pickLocationAssignmentCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickLocationAssignmentCode() {
        return pickLocationAssignmentCode;
    }

    /**
     * Sets the value of the pickLocationAssignmentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickLocationAssignmentCode(String value) {
        this.pickLocationAssignmentCode = value;
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
     * Gets the value of the sortableIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSortableIndicator() {
        return sortableIndicator;
    }

    /**
     * Sets the value of the sortableIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSortableIndicator(String value) {
        this.sortableIndicator = value;
    }

}
