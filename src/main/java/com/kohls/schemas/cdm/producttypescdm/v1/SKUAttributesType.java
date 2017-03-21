
package com.kohls.schemas.cdm.producttypescdm.v1;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * A SKU is the lowest level for which inventory and sales records are currently retained within the Enterprise.  Most often it represents the unique size and color of a style. For the future we may consider UPC or RF ID as the level to track sales and inventory .
 * 
 * A unique identifier for a grouping of one or more products or services and the corresponding price plan, rate structure or unit charge that may be marketed by the organization for the purpose of generating revenue.  An item is what a customer purchases or subscribes to.
 * 
 * Examples: 
 * - Parker Elite fountain pen in silver, 
 * - Photo Printing Service 8x10 glossy,
 * - 14K white gold 1/3 carat snowflake pendant
 * - cashmere scarf, Burberry tan plaid
 * - Mock turtleneck sweater, women's medium, grey merino wool
 * 
 * 
 * 
 * <p>Java class for SKUAttributesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SKUAttributesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ShoeWidth" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *         &lt;element name="FeatureM" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueListType" minOccurs="0"/&gt;
 *         &lt;element name="ReturnDisposition" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *         &lt;element name="ShippingRestriction" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *         &lt;element name="ShippingService" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *         &lt;element name="ShippingPackageCategory" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}SKUDirectShipList" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}SKUSellingChannelList" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}NRFSize" minOccurs="0"/&gt;
 *         &lt;element name="ProductLifecycleStage" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *         &lt;element name="SportsLeagueM" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueListType" minOccurs="0"/&gt;
 *         &lt;element name="SportsTeamM" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueListType" minOccurs="0"/&gt;
 *         &lt;element name="SportsPlayerM" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueListType" minOccurs="0"/&gt;
 *         &lt;element name="OmniChannelFulfillmentEligibilityM" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueListType" minOccurs="0"/&gt;
 *         &lt;element name="LengthCharacteristic" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *         &lt;element name="CallbackType" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *         &lt;element name="OmniChannelFulfillmentCharacteristicM" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueListType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="CallbackEffectiveBeginDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="CallbackEffectiveEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="CallbackIdentifier" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="CallbackTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="CustomerChoiceIdentifier" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="DirectShipIndicator" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="FeatureCodeM" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="GiftWrapEligibleIndicator" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="GroupCodeText" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="InnerPackQuantity" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="InternalUPCIdentifier" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="ItemNumber" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="LengthCharacteristicCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ModifiedDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="NRFSizeCode" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="OmniChannelFulfillmentCharacteristicCodeM" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="OmniChannelFulfillmentEligibilityCodeM" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="OuterPackQuantity" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="ProductLaunchDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="ProductLifecycleStageCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RecordStatusFlag" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RegulatedClassText" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RegulatedIndicator" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RegulatedSubClassText" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ReplenishmentIndicator" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ReturnDispositionCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SKUDescription" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SKUFirstUnitCostAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="SKULandedUnitCostAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="SKUNumber" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="SellingChannelCodeM" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ShippingPackageCategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ShippingRestrictionCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ShippingServiceCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ShoeWidthCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SportsLeagueCodeM" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SportsPlayerCodeM" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SportsTeamCodeM" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SKUAttributesType", propOrder = {
    "shoeWidth",
    "featureM",
    "returnDisposition",
    "shippingRestriction",
    "shippingService",
    "shippingPackageCategory",
    "skuDirectShipList",
    "skuSellingChannelList",
    "nrfSize",
    "productLifecycleStage",
    "sportsLeagueM",
    "sportsTeamM",
    "sportsPlayerM",
    "omniChannelFulfillmentEligibilityM",
    "lengthCharacteristic",
    "callbackType",
    "omniChannelFulfillmentCharacteristicM"
})
public class SKUAttributesType {

    @XmlElementRef(name = "ShoeWidth", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<ReferenceValueType> shoeWidth;
    @XmlElementRef(name = "FeatureM", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<ReferenceValueListType> featureM;
    @XmlElementRef(name = "ReturnDisposition", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<ReferenceValueType> returnDisposition;
    @XmlElementRef(name = "ShippingRestriction", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<ReferenceValueType> shippingRestriction;
    @XmlElementRef(name = "ShippingService", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<ReferenceValueType> shippingService;
    @XmlElementRef(name = "ShippingPackageCategory", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<ReferenceValueType> shippingPackageCategory;
    @XmlElement(name = "SKUDirectShipList")
    protected SKUDirectShipListType skuDirectShipList;
    @XmlElement(name = "SKUSellingChannelList")
    protected SKUSellingChannelListType skuSellingChannelList;
    @XmlElement(name = "NRFSize")
    protected SizeType nrfSize;
    @XmlElement(name = "ProductLifecycleStage")
    protected ReferenceValueType productLifecycleStage;
    @XmlElementRef(name = "SportsLeagueM", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<ReferenceValueListType> sportsLeagueM;
    @XmlElementRef(name = "SportsTeamM", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<ReferenceValueListType> sportsTeamM;
    @XmlElementRef(name = "SportsPlayerM", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<ReferenceValueListType> sportsPlayerM;
    @XmlElement(name = "OmniChannelFulfillmentEligibilityM")
    protected ReferenceValueListType omniChannelFulfillmentEligibilityM;
    @XmlElement(name = "LengthCharacteristic")
    protected ReferenceValueType lengthCharacteristic;
    @XmlElement(name = "CallbackType")
    protected ReferenceValueType callbackType;
    @XmlElement(name = "OmniChannelFulfillmentCharacteristicM")
    protected ReferenceValueListType omniChannelFulfillmentCharacteristicM;
    @XmlAttribute(name = "CallbackEffectiveBeginDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar callbackEffectiveBeginDate;
    @XmlAttribute(name = "CallbackEffectiveEndDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar callbackEffectiveEndDate;
    @XmlAttribute(name = "CallbackIdentifier")
    protected Long callbackIdentifier;
    @XmlAttribute(name = "CallbackTypeCode")
    protected String callbackTypeCode;
    @XmlAttribute(name = "CreatedBy")
    protected String createdBy;
    @XmlAttribute(name = "CreatedDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlAttribute(name = "CustomerChoiceIdentifier")
    protected Long customerChoiceIdentifier;
    @XmlAttribute(name = "DirectShipIndicator")
    protected String directShipIndicator;
    @XmlAttribute(name = "FeatureCodeM")
    protected String featureCodeM;
    @XmlAttribute(name = "GiftWrapEligibleIndicator")
    protected String giftWrapEligibleIndicator;
    @XmlAttribute(name = "GroupCodeText")
    protected String groupCodeText;
    @XmlAttribute(name = "InnerPackQuantity")
    protected Long innerPackQuantity;
    @XmlAttribute(name = "InternalUPCIdentifier")
    protected Long internalUPCIdentifier;
    @XmlAttribute(name = "ItemNumber")
    protected Long itemNumber;
    @XmlAttribute(name = "LengthCharacteristicCode")
    protected String lengthCharacteristicCode;
    @XmlAttribute(name = "ModifiedDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifiedDateTime;
    @XmlAttribute(name = "NRFSizeCode")
    protected Long nrfSizeCode;
    @XmlAttribute(name = "OmniChannelFulfillmentCharacteristicCodeM")
    protected String omniChannelFulfillmentCharacteristicCodeM;
    @XmlAttribute(name = "OmniChannelFulfillmentEligibilityCodeM")
    protected String omniChannelFulfillmentEligibilityCodeM;
    @XmlAttribute(name = "OuterPackQuantity")
    protected Long outerPackQuantity;
    @XmlAttribute(name = "ProductLaunchDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar productLaunchDate;
    @XmlAttribute(name = "ProductLifecycleStageCode")
    protected String productLifecycleStageCode;
    @XmlAttribute(name = "RecordStatusFlag")
    protected String recordStatusFlag;
    @XmlAttribute(name = "RegulatedClassText")
    protected String regulatedClassText;
    @XmlAttribute(name = "RegulatedIndicator")
    protected String regulatedIndicator;
    @XmlAttribute(name = "RegulatedSubClassText")
    protected String regulatedSubClassText;
    @XmlAttribute(name = "ReplenishmentIndicator")
    protected String replenishmentIndicator;
    @XmlAttribute(name = "ReturnDispositionCode")
    protected String returnDispositionCode;
    @XmlAttribute(name = "SKUDescription")
    protected String skuDescription;
    @XmlAttribute(name = "SKUFirstUnitCostAmount")
    protected BigDecimal skuFirstUnitCostAmount;
    @XmlAttribute(name = "SKULandedUnitCostAmount")
    protected BigDecimal skuLandedUnitCostAmount;
    @XmlAttribute(name = "SKUNumber")
    protected Long skuNumber;
    @XmlAttribute(name = "SellingChannelCodeM")
    protected String sellingChannelCodeM;
    @XmlAttribute(name = "ShippingPackageCategoryCode")
    protected String shippingPackageCategoryCode;
    @XmlAttribute(name = "ShippingRestrictionCode")
    protected String shippingRestrictionCode;
    @XmlAttribute(name = "ShippingServiceCode")
    protected String shippingServiceCode;
    @XmlAttribute(name = "ShoeWidthCode")
    protected String shoeWidthCode;
    @XmlAttribute(name = "SportsLeagueCodeM")
    protected String sportsLeagueCodeM;
    @XmlAttribute(name = "SportsPlayerCodeM")
    protected String sportsPlayerCodeM;
    @XmlAttribute(name = "SportsTeamCodeM")
    protected String sportsTeamCodeM;

    /**
     * Gets the value of the shoeWidth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueType }{@code >}
     *     
     */
    public JAXBElement<ReferenceValueType> getShoeWidth() {
        return shoeWidth;
    }

    /**
     * Sets the value of the shoeWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueType }{@code >}
     *     
     */
    public void setShoeWidth(JAXBElement<ReferenceValueType> value) {
        this.shoeWidth = value;
    }

    /**
     * Gets the value of the featureM property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueListType }{@code >}
     *     
     */
    public JAXBElement<ReferenceValueListType> getFeatureM() {
        return featureM;
    }

    /**
     * Sets the value of the featureM property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueListType }{@code >}
     *     
     */
    public void setFeatureM(JAXBElement<ReferenceValueListType> value) {
        this.featureM = value;
    }

    /**
     * Gets the value of the returnDisposition property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueType }{@code >}
     *     
     */
    public JAXBElement<ReferenceValueType> getReturnDisposition() {
        return returnDisposition;
    }

    /**
     * Sets the value of the returnDisposition property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueType }{@code >}
     *     
     */
    public void setReturnDisposition(JAXBElement<ReferenceValueType> value) {
        this.returnDisposition = value;
    }

    /**
     * Gets the value of the shippingRestriction property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueType }{@code >}
     *     
     */
    public JAXBElement<ReferenceValueType> getShippingRestriction() {
        return shippingRestriction;
    }

    /**
     * Sets the value of the shippingRestriction property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueType }{@code >}
     *     
     */
    public void setShippingRestriction(JAXBElement<ReferenceValueType> value) {
        this.shippingRestriction = value;
    }

    /**
     * Gets the value of the shippingService property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueType }{@code >}
     *     
     */
    public JAXBElement<ReferenceValueType> getShippingService() {
        return shippingService;
    }

    /**
     * Sets the value of the shippingService property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueType }{@code >}
     *     
     */
    public void setShippingService(JAXBElement<ReferenceValueType> value) {
        this.shippingService = value;
    }

    /**
     * Gets the value of the shippingPackageCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueType }{@code >}
     *     
     */
    public JAXBElement<ReferenceValueType> getShippingPackageCategory() {
        return shippingPackageCategory;
    }

    /**
     * Sets the value of the shippingPackageCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueType }{@code >}
     *     
     */
    public void setShippingPackageCategory(JAXBElement<ReferenceValueType> value) {
        this.shippingPackageCategory = value;
    }

    /**
     * Gets the value of the skuDirectShipList property.
     * 
     * @return
     *     possible object is
     *     {@link SKUDirectShipListType }
     *     
     */
    public SKUDirectShipListType getSKUDirectShipList() {
        return skuDirectShipList;
    }

    /**
     * Sets the value of the skuDirectShipList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SKUDirectShipListType }
     *     
     */
    public void setSKUDirectShipList(SKUDirectShipListType value) {
        this.skuDirectShipList = value;
    }

    /**
     * Gets the value of the skuSellingChannelList property.
     * 
     * @return
     *     possible object is
     *     {@link SKUSellingChannelListType }
     *     
     */
    public SKUSellingChannelListType getSKUSellingChannelList() {
        return skuSellingChannelList;
    }

    /**
     * Sets the value of the skuSellingChannelList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SKUSellingChannelListType }
     *     
     */
    public void setSKUSellingChannelList(SKUSellingChannelListType value) {
        this.skuSellingChannelList = value;
    }

    /**
     * Gets the value of the nrfSize property.
     * 
     * @return
     *     possible object is
     *     {@link SizeType }
     *     
     */
    public SizeType getNRFSize() {
        return nrfSize;
    }

    /**
     * Sets the value of the nrfSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link SizeType }
     *     
     */
    public void setNRFSize(SizeType value) {
        this.nrfSize = value;
    }

    /**
     * Gets the value of the productLifecycleStage property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceValueType }
     *     
     */
    public ReferenceValueType getProductLifecycleStage() {
        return productLifecycleStage;
    }

    /**
     * Sets the value of the productLifecycleStage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceValueType }
     *     
     */
    public void setProductLifecycleStage(ReferenceValueType value) {
        this.productLifecycleStage = value;
    }

    /**
     * Gets the value of the sportsLeagueM property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueListType }{@code >}
     *     
     */
    public JAXBElement<ReferenceValueListType> getSportsLeagueM() {
        return sportsLeagueM;
    }

    /**
     * Sets the value of the sportsLeagueM property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueListType }{@code >}
     *     
     */
    public void setSportsLeagueM(JAXBElement<ReferenceValueListType> value) {
        this.sportsLeagueM = value;
    }

    /**
     * Gets the value of the sportsTeamM property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueListType }{@code >}
     *     
     */
    public JAXBElement<ReferenceValueListType> getSportsTeamM() {
        return sportsTeamM;
    }

    /**
     * Sets the value of the sportsTeamM property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueListType }{@code >}
     *     
     */
    public void setSportsTeamM(JAXBElement<ReferenceValueListType> value) {
        this.sportsTeamM = value;
    }

    /**
     * Gets the value of the sportsPlayerM property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueListType }{@code >}
     *     
     */
    public JAXBElement<ReferenceValueListType> getSportsPlayerM() {
        return sportsPlayerM;
    }

    /**
     * Sets the value of the sportsPlayerM property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueListType }{@code >}
     *     
     */
    public void setSportsPlayerM(JAXBElement<ReferenceValueListType> value) {
        this.sportsPlayerM = value;
    }

    /**
     * Gets the value of the omniChannelFulfillmentEligibilityM property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceValueListType }
     *     
     */
    public ReferenceValueListType getOmniChannelFulfillmentEligibilityM() {
        return omniChannelFulfillmentEligibilityM;
    }

    /**
     * Sets the value of the omniChannelFulfillmentEligibilityM property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceValueListType }
     *     
     */
    public void setOmniChannelFulfillmentEligibilityM(ReferenceValueListType value) {
        this.omniChannelFulfillmentEligibilityM = value;
    }

    /**
     * Gets the value of the lengthCharacteristic property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceValueType }
     *     
     */
    public ReferenceValueType getLengthCharacteristic() {
        return lengthCharacteristic;
    }

    /**
     * Sets the value of the lengthCharacteristic property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceValueType }
     *     
     */
    public void setLengthCharacteristic(ReferenceValueType value) {
        this.lengthCharacteristic = value;
    }

    /**
     * Gets the value of the callbackType property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceValueType }
     *     
     */
    public ReferenceValueType getCallbackType() {
        return callbackType;
    }

    /**
     * Sets the value of the callbackType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceValueType }
     *     
     */
    public void setCallbackType(ReferenceValueType value) {
        this.callbackType = value;
    }

    /**
     * Gets the value of the omniChannelFulfillmentCharacteristicM property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceValueListType }
     *     
     */
    public ReferenceValueListType getOmniChannelFulfillmentCharacteristicM() {
        return omniChannelFulfillmentCharacteristicM;
    }

    /**
     * Sets the value of the omniChannelFulfillmentCharacteristicM property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceValueListType }
     *     
     */
    public void setOmniChannelFulfillmentCharacteristicM(ReferenceValueListType value) {
        this.omniChannelFulfillmentCharacteristicM = value;
    }

    /**
     * Gets the value of the callbackEffectiveBeginDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCallbackEffectiveBeginDate() {
        return callbackEffectiveBeginDate;
    }

    /**
     * Sets the value of the callbackEffectiveBeginDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCallbackEffectiveBeginDate(XMLGregorianCalendar value) {
        this.callbackEffectiveBeginDate = value;
    }

    /**
     * Gets the value of the callbackEffectiveEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCallbackEffectiveEndDate() {
        return callbackEffectiveEndDate;
    }

    /**
     * Sets the value of the callbackEffectiveEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCallbackEffectiveEndDate(XMLGregorianCalendar value) {
        this.callbackEffectiveEndDate = value;
    }

    /**
     * Gets the value of the callbackIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCallbackIdentifier() {
        return callbackIdentifier;
    }

    /**
     * Sets the value of the callbackIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCallbackIdentifier(Long value) {
        this.callbackIdentifier = value;
    }

    /**
     * Gets the value of the callbackTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallbackTypeCode() {
        return callbackTypeCode;
    }

    /**
     * Sets the value of the callbackTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallbackTypeCode(String value) {
        this.callbackTypeCode = value;
    }

    /**
     * Gets the value of the createdBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets the value of the createdBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedBy(String value) {
        this.createdBy = value;
    }

    /**
     * Gets the value of the createdDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets the value of the createdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedDate(XMLGregorianCalendar value) {
        this.createdDate = value;
    }

    /**
     * Gets the value of the customerChoiceIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCustomerChoiceIdentifier() {
        return customerChoiceIdentifier;
    }

    /**
     * Sets the value of the customerChoiceIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCustomerChoiceIdentifier(Long value) {
        this.customerChoiceIdentifier = value;
    }

    /**
     * Gets the value of the directShipIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectShipIndicator() {
        return directShipIndicator;
    }

    /**
     * Sets the value of the directShipIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectShipIndicator(String value) {
        this.directShipIndicator = value;
    }

    /**
     * Gets the value of the featureCodeM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeatureCodeM() {
        return featureCodeM;
    }

    /**
     * Sets the value of the featureCodeM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeatureCodeM(String value) {
        this.featureCodeM = value;
    }

    /**
     * Gets the value of the giftWrapEligibleIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiftWrapEligibleIndicator() {
        return giftWrapEligibleIndicator;
    }

    /**
     * Sets the value of the giftWrapEligibleIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiftWrapEligibleIndicator(String value) {
        this.giftWrapEligibleIndicator = value;
    }

    /**
     * Gets the value of the groupCodeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupCodeText() {
        return groupCodeText;
    }

    /**
     * Sets the value of the groupCodeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupCodeText(String value) {
        this.groupCodeText = value;
    }

    /**
     * Gets the value of the innerPackQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInnerPackQuantity() {
        return innerPackQuantity;
    }

    /**
     * Sets the value of the innerPackQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInnerPackQuantity(Long value) {
        this.innerPackQuantity = value;
    }

    /**
     * Gets the value of the internalUPCIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInternalUPCIdentifier() {
        return internalUPCIdentifier;
    }

    /**
     * Sets the value of the internalUPCIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInternalUPCIdentifier(Long value) {
        this.internalUPCIdentifier = value;
    }

    /**
     * Gets the value of the itemNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getItemNumber() {
        return itemNumber;
    }

    /**
     * Sets the value of the itemNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setItemNumber(Long value) {
        this.itemNumber = value;
    }

    /**
     * Gets the value of the lengthCharacteristicCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLengthCharacteristicCode() {
        return lengthCharacteristicCode;
    }

    /**
     * Sets the value of the lengthCharacteristicCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLengthCharacteristicCode(String value) {
        this.lengthCharacteristicCode = value;
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
     * Gets the value of the nrfSizeCode property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNRFSizeCode() {
        return nrfSizeCode;
    }

    /**
     * Sets the value of the nrfSizeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNRFSizeCode(Long value) {
        this.nrfSizeCode = value;
    }

    /**
     * Gets the value of the omniChannelFulfillmentCharacteristicCodeM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOmniChannelFulfillmentCharacteristicCodeM() {
        return omniChannelFulfillmentCharacteristicCodeM;
    }

    /**
     * Sets the value of the omniChannelFulfillmentCharacteristicCodeM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOmniChannelFulfillmentCharacteristicCodeM(String value) {
        this.omniChannelFulfillmentCharacteristicCodeM = value;
    }

    /**
     * Gets the value of the omniChannelFulfillmentEligibilityCodeM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOmniChannelFulfillmentEligibilityCodeM() {
        return omniChannelFulfillmentEligibilityCodeM;
    }

    /**
     * Sets the value of the omniChannelFulfillmentEligibilityCodeM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOmniChannelFulfillmentEligibilityCodeM(String value) {
        this.omniChannelFulfillmentEligibilityCodeM = value;
    }

    /**
     * Gets the value of the outerPackQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOuterPackQuantity() {
        return outerPackQuantity;
    }

    /**
     * Sets the value of the outerPackQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOuterPackQuantity(Long value) {
        this.outerPackQuantity = value;
    }

    /**
     * Gets the value of the productLaunchDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProductLaunchDate() {
        return productLaunchDate;
    }

    /**
     * Sets the value of the productLaunchDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProductLaunchDate(XMLGregorianCalendar value) {
        this.productLaunchDate = value;
    }

    /**
     * Gets the value of the productLifecycleStageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductLifecycleStageCode() {
        return productLifecycleStageCode;
    }

    /**
     * Sets the value of the productLifecycleStageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductLifecycleStageCode(String value) {
        this.productLifecycleStageCode = value;
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
     * Gets the value of the regulatedClassText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegulatedClassText() {
        return regulatedClassText;
    }

    /**
     * Sets the value of the regulatedClassText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegulatedClassText(String value) {
        this.regulatedClassText = value;
    }

    /**
     * Gets the value of the regulatedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegulatedIndicator() {
        return regulatedIndicator;
    }

    /**
     * Sets the value of the regulatedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegulatedIndicator(String value) {
        this.regulatedIndicator = value;
    }

    /**
     * Gets the value of the regulatedSubClassText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegulatedSubClassText() {
        return regulatedSubClassText;
    }

    /**
     * Sets the value of the regulatedSubClassText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegulatedSubClassText(String value) {
        this.regulatedSubClassText = value;
    }

    /**
     * Gets the value of the replenishmentIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplenishmentIndicator() {
        return replenishmentIndicator;
    }

    /**
     * Sets the value of the replenishmentIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplenishmentIndicator(String value) {
        this.replenishmentIndicator = value;
    }

    /**
     * Gets the value of the returnDispositionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnDispositionCode() {
        return returnDispositionCode;
    }

    /**
     * Sets the value of the returnDispositionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnDispositionCode(String value) {
        this.returnDispositionCode = value;
    }

    /**
     * Gets the value of the skuDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSKUDescription() {
        return skuDescription;
    }

    /**
     * Sets the value of the skuDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSKUDescription(String value) {
        this.skuDescription = value;
    }

    /**
     * Gets the value of the skuFirstUnitCostAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSKUFirstUnitCostAmount() {
        return skuFirstUnitCostAmount;
    }

    /**
     * Sets the value of the skuFirstUnitCostAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSKUFirstUnitCostAmount(BigDecimal value) {
        this.skuFirstUnitCostAmount = value;
    }

    /**
     * Gets the value of the skuLandedUnitCostAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSKULandedUnitCostAmount() {
        return skuLandedUnitCostAmount;
    }

    /**
     * Sets the value of the skuLandedUnitCostAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSKULandedUnitCostAmount(BigDecimal value) {
        this.skuLandedUnitCostAmount = value;
    }

    /**
     * Gets the value of the skuNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSKUNumber() {
        return skuNumber;
    }

    /**
     * Sets the value of the skuNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSKUNumber(Long value) {
        this.skuNumber = value;
    }

    /**
     * Gets the value of the sellingChannelCodeM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellingChannelCodeM() {
        return sellingChannelCodeM;
    }

    /**
     * Sets the value of the sellingChannelCodeM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellingChannelCodeM(String value) {
        this.sellingChannelCodeM = value;
    }

    /**
     * Gets the value of the shippingPackageCategoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingPackageCategoryCode() {
        return shippingPackageCategoryCode;
    }

    /**
     * Sets the value of the shippingPackageCategoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingPackageCategoryCode(String value) {
        this.shippingPackageCategoryCode = value;
    }

    /**
     * Gets the value of the shippingRestrictionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingRestrictionCode() {
        return shippingRestrictionCode;
    }

    /**
     * Sets the value of the shippingRestrictionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingRestrictionCode(String value) {
        this.shippingRestrictionCode = value;
    }

    /**
     * Gets the value of the shippingServiceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingServiceCode() {
        return shippingServiceCode;
    }

    /**
     * Sets the value of the shippingServiceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingServiceCode(String value) {
        this.shippingServiceCode = value;
    }

    /**
     * Gets the value of the shoeWidthCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShoeWidthCode() {
        return shoeWidthCode;
    }

    /**
     * Sets the value of the shoeWidthCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShoeWidthCode(String value) {
        this.shoeWidthCode = value;
    }

    /**
     * Gets the value of the sportsLeagueCodeM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSportsLeagueCodeM() {
        return sportsLeagueCodeM;
    }

    /**
     * Sets the value of the sportsLeagueCodeM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSportsLeagueCodeM(String value) {
        this.sportsLeagueCodeM = value;
    }

    /**
     * Gets the value of the sportsPlayerCodeM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSportsPlayerCodeM() {
        return sportsPlayerCodeM;
    }

    /**
     * Sets the value of the sportsPlayerCodeM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSportsPlayerCodeM(String value) {
        this.sportsPlayerCodeM = value;
    }

    /**
     * Gets the value of the sportsTeamCodeM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSportsTeamCodeM() {
        return sportsTeamCodeM;
    }

    /**
     * Sets the value of the sportsTeamCodeM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSportsTeamCodeM(String value) {
        this.sportsTeamCodeM = value;
    }

}
