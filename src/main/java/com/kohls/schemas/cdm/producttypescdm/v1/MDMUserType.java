
package com.kohls.schemas.cdm.producttypescdm.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MDMUserType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MDMUserType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}MDMRoleList"/&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}MDMCommandList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Country" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DateFormat" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Enterprise" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Language" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Password" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SecurityType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SessionID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="TimeFormat" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="UserName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MDMUserType", propOrder = {
    "mdmRoleList",
    "mdmCommandList"
})
public class MDMUserType {

    @XmlElement(name = "MDMRoleList", required = true)
    protected MDMRoleListType mdmRoleList;
    @XmlElement(name = "MDMCommandList")
    protected MDMCommandListType mdmCommandList;
    @XmlAttribute(name = "Country")
    protected String country;
    @XmlAttribute(name = "DateFormat")
    protected String dateFormat;
    @XmlAttribute(name = "Enterprise")
    protected String enterprise;
    @XmlAttribute(name = "FirstName")
    protected String firstName;
    @XmlAttribute(name = "Language")
    protected String language;
    @XmlAttribute(name = "LastName")
    protected String lastName;
    @XmlAttribute(name = "Password")
    protected String password;
    @XmlAttribute(name = "SecurityType")
    protected String securityType;
    @XmlAttribute(name = "SessionID")
    protected String sessionID;
    @XmlAttribute(name = "TimeFormat")
    protected String timeFormat;
    @XmlAttribute(name = "UserName")
    protected String userName;

    /**
     * Gets the value of the mdmRoleList property.
     * 
     * @return
     *     possible object is
     *     {@link MDMRoleListType }
     *     
     */
    public MDMRoleListType getMDMRoleList() {
        return mdmRoleList;
    }

    /**
     * Sets the value of the mdmRoleList property.
     * 
     * @param value
     *     allowed object is
     *     {@link MDMRoleListType }
     *     
     */
    public void setMDMRoleList(MDMRoleListType value) {
        this.mdmRoleList = value;
    }

    /**
     * Gets the value of the mdmCommandList property.
     * 
     * @return
     *     possible object is
     *     {@link MDMCommandListType }
     *     
     */
    public MDMCommandListType getMDMCommandList() {
        return mdmCommandList;
    }

    /**
     * Sets the value of the mdmCommandList property.
     * 
     * @param value
     *     allowed object is
     *     {@link MDMCommandListType }
     *     
     */
    public void setMDMCommandList(MDMCommandListType value) {
        this.mdmCommandList = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the dateFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateFormat() {
        return dateFormat;
    }

    /**
     * Sets the value of the dateFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateFormat(String value) {
        this.dateFormat = value;
    }

    /**
     * Gets the value of the enterprise property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnterprise() {
        return enterprise;
    }

    /**
     * Sets the value of the enterprise property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnterprise(String value) {
        this.enterprise = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the securityType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityType() {
        return securityType;
    }

    /**
     * Sets the value of the securityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityType(String value) {
        this.securityType = value;
    }

    /**
     * Gets the value of the sessionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionID() {
        return sessionID;
    }

    /**
     * Sets the value of the sessionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionID(String value) {
        this.sessionID = value;
    }

    /**
     * Gets the value of the timeFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeFormat() {
        return timeFormat;
    }

    /**
     * Sets the value of the timeFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeFormat(String value) {
        this.timeFormat = value;
    }

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

}
