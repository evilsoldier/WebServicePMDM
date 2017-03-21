
package com.kohls.schemas.cdm.producttypescdm.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExtendedFilterInputType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExtendedFilterInputType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="WantCC" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="WantCP" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="WantCPG" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="WantKS" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="WantSKU" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="WantUPC" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtendedFilterInputType")
public class ExtendedFilterInputType {

    @XmlAttribute(name = "WantCC")
    protected Boolean wantCC;
    @XmlAttribute(name = "WantCP")
    protected Boolean wantCP;
    @XmlAttribute(name = "WantCPG")
    protected Boolean wantCPG;
    @XmlAttribute(name = "WantKS")
    protected Boolean wantKS;
    @XmlAttribute(name = "WantSKU")
    protected Boolean wantSKU;
    @XmlAttribute(name = "WantUPC")
    protected Boolean wantUPC;

    /**
     * Gets the value of the wantCC property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWantCC() {
        return wantCC;
    }

    /**
     * Sets the value of the wantCC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWantCC(Boolean value) {
        this.wantCC = value;
    }

    /**
     * Gets the value of the wantCP property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWantCP() {
        return wantCP;
    }

    /**
     * Sets the value of the wantCP property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWantCP(Boolean value) {
        this.wantCP = value;
    }

    /**
     * Gets the value of the wantCPG property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWantCPG() {
        return wantCPG;
    }

    /**
     * Sets the value of the wantCPG property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWantCPG(Boolean value) {
        this.wantCPG = value;
    }

    /**
     * Gets the value of the wantKS property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWantKS() {
        return wantKS;
    }

    /**
     * Sets the value of the wantKS property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWantKS(Boolean value) {
        this.wantKS = value;
    }

    /**
     * Gets the value of the wantSKU property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWantSKU() {
        return wantSKU;
    }

    /**
     * Sets the value of the wantSKU property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWantSKU(Boolean value) {
        this.wantSKU = value;
    }

    /**
     * Gets the value of the wantUPC property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWantUPC() {
        return wantUPC;
    }

    /**
     * Sets the value of the wantUPC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWantUPC(Boolean value) {
        this.wantUPC = value;
    }

}
