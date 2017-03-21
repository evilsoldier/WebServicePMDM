
package com.kohls.schemas.cdm.producttypescdm.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CPSKUType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CPSKUType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}OperatingCompanyAttributes" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}GeneralMerchandiseAreaAttributes" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}DivisionalMerchandiseAreaAttributes" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}DepartmentAttributes" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ClassAttributes" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}SubClassAttributes" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}KohlsStyleAttributes" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}KohlsStyleProductCapacityList" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}KohlsStyleVendorStylePartnerList" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}KohlsStyleMaximumPurchaseLimitList" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}CustomerChoiceAttributes" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}SKUAttributes" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}UPCList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CPSKUType", propOrder = {
    "operatingCompanyAttributes",
    "generalMerchandiseAreaAttributes",
    "divisionalMerchandiseAreaAttributes",
    "departmentAttributes",
    "classAttributes",
    "subClassAttributes",
    "kohlsStyleAttributes",
    "kohlsStyleProductCapacityList",
    "kohlsStyleVendorStylePartnerList",
    "kohlsStyleMaximumPurchaseLimitList",
    "customerChoiceAttributes",
    "skuAttributes",
    "upcList"
})
public class CPSKUType {

    @XmlElement(name = "OperatingCompanyAttributes")
    protected OperatingCompanyAttributesType operatingCompanyAttributes;
    @XmlElement(name = "GeneralMerchandiseAreaAttributes")
    protected GeneralMerchandiseAreaAttributesType generalMerchandiseAreaAttributes;
    @XmlElement(name = "DivisionalMerchandiseAreaAttributes")
    protected DivisionalMerchandiseAreaAttributesType divisionalMerchandiseAreaAttributes;
    @XmlElement(name = "DepartmentAttributes")
    protected DepartmentAttributesType departmentAttributes;
    @XmlElement(name = "ClassAttributes")
    protected ClassAttributesType classAttributes;
    @XmlElement(name = "SubClassAttributes")
    protected SubClassAttributesType subClassAttributes;
    @XmlElement(name = "KohlsStyleAttributes")
    protected KohlsStyleAttributesType kohlsStyleAttributes;
    @XmlElement(name = "KohlsStyleProductCapacityList")
    protected KohlsStyleProductCapacityListType kohlsStyleProductCapacityList;
    @XmlElement(name = "KohlsStyleVendorStylePartnerList")
    protected KohlsStyleVendorStylePartnerListType kohlsStyleVendorStylePartnerList;
    @XmlElement(name = "KohlsStyleMaximumPurchaseLimitList")
    protected KohlsStyleMaximumPurchaseLimitListType kohlsStyleMaximumPurchaseLimitList;
    @XmlElement(name = "CustomerChoiceAttributes")
    protected CustomerChoiceAttributesType customerChoiceAttributes;
    @XmlElement(name = "SKUAttributes")
    protected SKUAttributesType skuAttributes;
    @XmlElement(name = "UPCList")
    protected UPCListType upcList;

    /**
     * Gets the value of the operatingCompanyAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link OperatingCompanyAttributesType }
     *     
     */
    public OperatingCompanyAttributesType getOperatingCompanyAttributes() {
        return operatingCompanyAttributes;
    }

    /**
     * Sets the value of the operatingCompanyAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatingCompanyAttributesType }
     *     
     */
    public void setOperatingCompanyAttributes(OperatingCompanyAttributesType value) {
        this.operatingCompanyAttributes = value;
    }

    /**
     * Gets the value of the generalMerchandiseAreaAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link GeneralMerchandiseAreaAttributesType }
     *     
     */
    public GeneralMerchandiseAreaAttributesType getGeneralMerchandiseAreaAttributes() {
        return generalMerchandiseAreaAttributes;
    }

    /**
     * Sets the value of the generalMerchandiseAreaAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralMerchandiseAreaAttributesType }
     *     
     */
    public void setGeneralMerchandiseAreaAttributes(GeneralMerchandiseAreaAttributesType value) {
        this.generalMerchandiseAreaAttributes = value;
    }

    /**
     * Gets the value of the divisionalMerchandiseAreaAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link DivisionalMerchandiseAreaAttributesType }
     *     
     */
    public DivisionalMerchandiseAreaAttributesType getDivisionalMerchandiseAreaAttributes() {
        return divisionalMerchandiseAreaAttributes;
    }

    /**
     * Sets the value of the divisionalMerchandiseAreaAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link DivisionalMerchandiseAreaAttributesType }
     *     
     */
    public void setDivisionalMerchandiseAreaAttributes(DivisionalMerchandiseAreaAttributesType value) {
        this.divisionalMerchandiseAreaAttributes = value;
    }

    /**
     * Gets the value of the departmentAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link DepartmentAttributesType }
     *     
     */
    public DepartmentAttributesType getDepartmentAttributes() {
        return departmentAttributes;
    }

    /**
     * Sets the value of the departmentAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepartmentAttributesType }
     *     
     */
    public void setDepartmentAttributes(DepartmentAttributesType value) {
        this.departmentAttributes = value;
    }

    /**
     * Gets the value of the classAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link ClassAttributesType }
     *     
     */
    public ClassAttributesType getClassAttributes() {
        return classAttributes;
    }

    /**
     * Sets the value of the classAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassAttributesType }
     *     
     */
    public void setClassAttributes(ClassAttributesType value) {
        this.classAttributes = value;
    }

    /**
     * Gets the value of the subClassAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link SubClassAttributesType }
     *     
     */
    public SubClassAttributesType getSubClassAttributes() {
        return subClassAttributes;
    }

    /**
     * Sets the value of the subClassAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubClassAttributesType }
     *     
     */
    public void setSubClassAttributes(SubClassAttributesType value) {
        this.subClassAttributes = value;
    }

    /**
     * Gets the value of the kohlsStyleAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link KohlsStyleAttributesType }
     *     
     */
    public KohlsStyleAttributesType getKohlsStyleAttributes() {
        return kohlsStyleAttributes;
    }

    /**
     * Sets the value of the kohlsStyleAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link KohlsStyleAttributesType }
     *     
     */
    public void setKohlsStyleAttributes(KohlsStyleAttributesType value) {
        this.kohlsStyleAttributes = value;
    }

    /**
     * Gets the value of the kohlsStyleProductCapacityList property.
     * 
     * @return
     *     possible object is
     *     {@link KohlsStyleProductCapacityListType }
     *     
     */
    public KohlsStyleProductCapacityListType getKohlsStyleProductCapacityList() {
        return kohlsStyleProductCapacityList;
    }

    /**
     * Sets the value of the kohlsStyleProductCapacityList property.
     * 
     * @param value
     *     allowed object is
     *     {@link KohlsStyleProductCapacityListType }
     *     
     */
    public void setKohlsStyleProductCapacityList(KohlsStyleProductCapacityListType value) {
        this.kohlsStyleProductCapacityList = value;
    }

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
     * Gets the value of the kohlsStyleMaximumPurchaseLimitList property.
     * 
     * @return
     *     possible object is
     *     {@link KohlsStyleMaximumPurchaseLimitListType }
     *     
     */
    public KohlsStyleMaximumPurchaseLimitListType getKohlsStyleMaximumPurchaseLimitList() {
        return kohlsStyleMaximumPurchaseLimitList;
    }

    /**
     * Sets the value of the kohlsStyleMaximumPurchaseLimitList property.
     * 
     * @param value
     *     allowed object is
     *     {@link KohlsStyleMaximumPurchaseLimitListType }
     *     
     */
    public void setKohlsStyleMaximumPurchaseLimitList(KohlsStyleMaximumPurchaseLimitListType value) {
        this.kohlsStyleMaximumPurchaseLimitList = value;
    }

    /**
     * Gets the value of the customerChoiceAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerChoiceAttributesType }
     *     
     */
    public CustomerChoiceAttributesType getCustomerChoiceAttributes() {
        return customerChoiceAttributes;
    }

    /**
     * Sets the value of the customerChoiceAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerChoiceAttributesType }
     *     
     */
    public void setCustomerChoiceAttributes(CustomerChoiceAttributesType value) {
        this.customerChoiceAttributes = value;
    }

    /**
     * Gets the value of the skuAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link SKUAttributesType }
     *     
     */
    public SKUAttributesType getSKUAttributes() {
        return skuAttributes;
    }

    /**
     * Sets the value of the skuAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link SKUAttributesType }
     *     
     */
    public void setSKUAttributes(SKUAttributesType value) {
        this.skuAttributes = value;
    }

    /**
     * Gets the value of the upcList property.
     * 
     * @return
     *     possible object is
     *     {@link UPCListType }
     *     
     */
    public UPCListType getUPCList() {
        return upcList;
    }

    /**
     * Sets the value of the upcList property.
     * 
     * @param value
     *     allowed object is
     *     {@link UPCListType }
     *     
     */
    public void setUPCList(UPCListType value) {
        this.upcList = value;
    }

}
