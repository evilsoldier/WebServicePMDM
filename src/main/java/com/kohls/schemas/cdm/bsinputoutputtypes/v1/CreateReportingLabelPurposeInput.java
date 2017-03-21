
package com.kohls.schemas.cdm.bsinputoutputtypes.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.kohls.schemas.cdm.producttypescdm.v1.MDMUserType;
import com.kohls.schemas.cdm.producttypescdm.v1.ReportingLabelPurposeListType;


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
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReportingLabelPurposeList" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}MDMUser" minOccurs="0"/&gt;
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
    "reportingLabelPurposeList",
    "mdmUser"
})
@XmlRootElement(name = "CreateReportingLabelPurposeInput")
public class CreateReportingLabelPurposeInput {

    @XmlElement(name = "ReportingLabelPurposeList", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1")
    protected ReportingLabelPurposeListType reportingLabelPurposeList;
    @XmlElement(name = "MDMUser", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1")
    protected MDMUserType mdmUser;

    /**
     * Gets the value of the reportingLabelPurposeList property.
     * 
     * @return
     *     possible object is
     *     {@link ReportingLabelPurposeListType }
     *     
     */
    public ReportingLabelPurposeListType getReportingLabelPurposeList() {
        return reportingLabelPurposeList;
    }

    /**
     * Sets the value of the reportingLabelPurposeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportingLabelPurposeListType }
     *     
     */
    public void setReportingLabelPurposeList(ReportingLabelPurposeListType value) {
        this.reportingLabelPurposeList = value;
    }

    /**
     * Gets the value of the mdmUser property.
     * 
     * @return
     *     possible object is
     *     {@link MDMUserType }
     *     
     */
    public MDMUserType getMDMUser() {
        return mdmUser;
    }

    /**
     * Sets the value of the mdmUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link MDMUserType }
     *     
     */
    public void setMDMUser(MDMUserType value) {
        this.mdmUser = value;
    }

}
