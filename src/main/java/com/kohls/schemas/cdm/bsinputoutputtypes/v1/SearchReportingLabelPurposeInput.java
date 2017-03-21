
package com.kohls.schemas.cdm.bsinputoutputtypes.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.kohls.schemas.cdm.producttypescdm.v1.AdvanceFilterType;
import com.kohls.schemas.cdm.producttypescdm.v1.ReportingLabelPurposeType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReportingLabelPurpose" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}AdvanceFilter" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "reportingLabelPurpose",
    "advanceFilter"
})
@XmlRootElement(name = "SearchReportingLabelPurposeInput")
public class SearchReportingLabelPurposeInput {

    @XmlElement(name = "ReportingLabelPurpose", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1")
    protected ReportingLabelPurposeType reportingLabelPurpose;
    @XmlElement(name = "AdvanceFilter", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1")
    protected AdvanceFilterType advanceFilter;

    /**
     * Gets the value of the reportingLabelPurpose property.
     * 
     * @return
     *     possible object is
     *     {@link ReportingLabelPurposeType }
     *     
     */
    public ReportingLabelPurposeType getReportingLabelPurpose() {
        return reportingLabelPurpose;
    }

    /**
     * Sets the value of the reportingLabelPurpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportingLabelPurposeType }
     *     
     */
    public void setReportingLabelPurpose(ReportingLabelPurposeType value) {
        this.reportingLabelPurpose = value;
    }

    /**
     * Gets the value of the advanceFilter property.
     * 
     * @return
     *     possible object is
     *     {@link AdvanceFilterType }
     *     
     */
    public AdvanceFilterType getAdvanceFilter() {
        return advanceFilter;
    }

    /**
     * Sets the value of the advanceFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdvanceFilterType }
     *     
     */
    public void setAdvanceFilter(AdvanceFilterType value) {
        this.advanceFilter = value;
    }

}
