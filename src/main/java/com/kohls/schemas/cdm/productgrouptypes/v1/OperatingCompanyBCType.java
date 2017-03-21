
package com.kohls.schemas.cdm.productgrouptypes.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * A seperately owned and operated business entity.  (ex. Kohl's US, Kohl's North)
 * 
 * <p>Java class for OperatingCompanyBCType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OperatingCompanyBCType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="OperatingCompanyDescription" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="OperatingCompanyNumber" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperatingCompanyBCType")
public class OperatingCompanyBCType {

    @XmlAttribute(name = "OperatingCompanyDescription")
    protected String operatingCompanyDescription;
    @XmlAttribute(name = "OperatingCompanyNumber")
    protected Long operatingCompanyNumber;

    /**
     * Gets the value of the operatingCompanyDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatingCompanyDescription() {
        return operatingCompanyDescription;
    }

    /**
     * Sets the value of the operatingCompanyDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatingCompanyDescription(String value) {
        this.operatingCompanyDescription = value;
    }

    /**
     * Gets the value of the operatingCompanyNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOperatingCompanyNumber() {
        return operatingCompanyNumber;
    }

    /**
     * Sets the value of the operatingCompanyNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOperatingCompanyNumber(Long value) {
        this.operatingCompanyNumber = value;
    }

}
