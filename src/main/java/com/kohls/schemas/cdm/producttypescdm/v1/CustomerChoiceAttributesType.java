
package com.kohls.schemas.cdm.producttypescdm.v1;

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
 * A Customer Choice is a unique combination of a Kohl's Style and Color.  It is the actual visual choices that the customer see's when walking into a Kohl's selling facility, excluding the 'size' factor.
 * 
 * <p>Java class for CustomerChoiceAttributesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerChoiceAttributesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PrimaryTrend" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *         &lt;element name="Seasonality" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *         &lt;element name="SupportingNRFColorFamilyM" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ColorListType" minOccurs="0"/&gt;
 *         &lt;element name="ConsumerMetalColorM" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueListType" minOccurs="0"/&gt;
 *         &lt;element name="ConsumerPrimaryTrendM" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueListType" minOccurs="0"/&gt;
 *         &lt;element name="ConsumerPattern" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *         &lt;element name="ConsumerMaterialFinishM" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueListType" minOccurs="0"/&gt;
 *         &lt;element name="ConsumerOutsoleMaterialM" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueListType" minOccurs="0"/&gt;
 *         &lt;element name="GemstoneM" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}GemstoneListType" minOccurs="0"/&gt;
 *         &lt;element name="Scent" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}NRFColor" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ConsumerNRFColor" minOccurs="0"/&gt;
 *         &lt;element name="SecondaryTrendM" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueListType" minOccurs="0"/&gt;
 *         &lt;element name="PresentationInitiativeM" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueListType" minOccurs="0"/&gt;
 *         &lt;element name="Transition" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *         &lt;element name="Pattern" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *         &lt;element name="Wash" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *         &lt;element name="MetalTone" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *         &lt;element name="DialColor" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="AMCustomerChoiceCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ConsumerMaterialFinishCodeM" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ConsumerMetalColorCodeM" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ConsumerNRFColorCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ConsumerOutsoleMaterialCodeM" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ConsumerPatternCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ConsumerPrimaryTrendCodeM" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="CustomerChoiceDescription" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="CustomerChoiceIdentifier" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="CustomerChoiceVendorColorDescription" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DialColorCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DigitalTurnInDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="DigitalTurnInIndicator" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DisplayColorDescription" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="GemstoneCodeM" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="KohlsStyleIdentifier" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="MetalToneCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ModifiedDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="NRFColorCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="PatternCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="PresentationInitiativeCodeM" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="PrimaryTrendCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RecordStatusFlag" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ScentCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SeasonalityCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SecondaryTrendCodeM" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ShoeBoxIdentifier" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="SupportingNRFColorFamilyCodeM" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ThumbnailPhotoLinkText" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="TransitionCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="WashCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerChoiceAttributesType", propOrder = {
    "primaryTrend",
    "seasonality",
    "supportingNRFColorFamilyM",
    "consumerMetalColorM",
    "consumerPrimaryTrendM",
    "consumerPattern",
    "consumerMaterialFinishM",
    "consumerOutsoleMaterialM",
    "gemstoneM",
    "scent",
    "nrfColor",
    "consumerNRFColor",
    "secondaryTrendM",
    "presentationInitiativeM",
    "transition",
    "pattern",
    "wash",
    "metalTone",
    "dialColor"
})
public class CustomerChoiceAttributesType {

    @XmlElement(name = "PrimaryTrend")
    protected ReferenceValueType primaryTrend;
    @XmlElementRef(name = "Seasonality", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<ReferenceValueType> seasonality;
    @XmlElementRef(name = "SupportingNRFColorFamilyM", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<ColorListType> supportingNRFColorFamilyM;
    @XmlElementRef(name = "ConsumerMetalColorM", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<ReferenceValueListType> consumerMetalColorM;
    @XmlElementRef(name = "ConsumerPrimaryTrendM", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<ReferenceValueListType> consumerPrimaryTrendM;
    @XmlElementRef(name = "ConsumerPattern", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<ReferenceValueType> consumerPattern;
    @XmlElementRef(name = "ConsumerMaterialFinishM", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<ReferenceValueListType> consumerMaterialFinishM;
    @XmlElementRef(name = "ConsumerOutsoleMaterialM", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<ReferenceValueListType> consumerOutsoleMaterialM;
    @XmlElementRef(name = "GemstoneM", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<GemstoneListType> gemstoneM;
    @XmlElement(name = "Scent")
    protected ReferenceValueType scent;
    @XmlElement(name = "NRFColor")
    protected ColorType nrfColor;
    @XmlElement(name = "ConsumerNRFColor")
    protected ColorType consumerNRFColor;
    @XmlElement(name = "SecondaryTrendM")
    protected ReferenceValueListType secondaryTrendM;
    @XmlElement(name = "PresentationInitiativeM")
    protected ReferenceValueListType presentationInitiativeM;
    @XmlElement(name = "Transition")
    protected ReferenceValueType transition;
    @XmlElementRef(name = "Pattern", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<ReferenceValueType> pattern;
    @XmlElementRef(name = "Wash", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<ReferenceValueType> wash;
    @XmlElementRef(name = "MetalTone", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<ReferenceValueType> metalTone;
    @XmlElementRef(name = "DialColor", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<ReferenceValueType> dialColor;
    @XmlAttribute(name = "AMCustomerChoiceCode")
    protected String amCustomerChoiceCode;
    @XmlAttribute(name = "ConsumerMaterialFinishCodeM")
    protected String consumerMaterialFinishCodeM;
    @XmlAttribute(name = "ConsumerMetalColorCodeM")
    protected String consumerMetalColorCodeM;
    @XmlAttribute(name = "ConsumerNRFColorCode")
    protected String consumerNRFColorCode;
    @XmlAttribute(name = "ConsumerOutsoleMaterialCodeM")
    protected String consumerOutsoleMaterialCodeM;
    @XmlAttribute(name = "ConsumerPatternCode")
    protected String consumerPatternCode;
    @XmlAttribute(name = "ConsumerPrimaryTrendCodeM")
    protected String consumerPrimaryTrendCodeM;
    @XmlAttribute(name = "CustomerChoiceDescription")
    protected String customerChoiceDescription;
    @XmlAttribute(name = "CustomerChoiceIdentifier")
    protected Long customerChoiceIdentifier;
    @XmlAttribute(name = "CustomerChoiceVendorColorDescription")
    protected String customerChoiceVendorColorDescription;
    @XmlAttribute(name = "DialColorCode")
    protected String dialColorCode;
    @XmlAttribute(name = "DigitalTurnInDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar digitalTurnInDate;
    @XmlAttribute(name = "DigitalTurnInIndicator")
    protected String digitalTurnInIndicator;
    @XmlAttribute(name = "DisplayColorDescription")
    protected String displayColorDescription;
    @XmlAttribute(name = "GemstoneCodeM")
    protected String gemstoneCodeM;
    @XmlAttribute(name = "KohlsStyleIdentifier")
    protected Long kohlsStyleIdentifier;
    @XmlAttribute(name = "MetalToneCode")
    protected String metalToneCode;
    @XmlAttribute(name = "ModifiedDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifiedDateTime;
    @XmlAttribute(name = "NRFColorCode")
    protected String nrfColorCode;
    @XmlAttribute(name = "PatternCode")
    protected String patternCode;
    @XmlAttribute(name = "PresentationInitiativeCodeM")
    protected String presentationInitiativeCodeM;
    @XmlAttribute(name = "PrimaryTrendCode")
    protected String primaryTrendCode;
    @XmlAttribute(name = "RecordStatusFlag")
    protected String recordStatusFlag;
    @XmlAttribute(name = "ScentCode")
    protected String scentCode;
    @XmlAttribute(name = "SeasonalityCode")
    protected String seasonalityCode;
    @XmlAttribute(name = "SecondaryTrendCodeM")
    protected String secondaryTrendCodeM;
    @XmlAttribute(name = "ShoeBoxIdentifier")
    protected Long shoeBoxIdentifier;
    @XmlAttribute(name = "SupportingNRFColorFamilyCodeM")
    protected String supportingNRFColorFamilyCodeM;
    @XmlAttribute(name = "ThumbnailPhotoLinkText")
    protected String thumbnailPhotoLinkText;
    @XmlAttribute(name = "TransitionCode")
    protected String transitionCode;
    @XmlAttribute(name = "WashCode")
    protected String washCode;

    /**
     * Gets the value of the primaryTrend property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceValueType }
     *     
     */
    public ReferenceValueType getPrimaryTrend() {
        return primaryTrend;
    }

    /**
     * Sets the value of the primaryTrend property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceValueType }
     *     
     */
    public void setPrimaryTrend(ReferenceValueType value) {
        this.primaryTrend = value;
    }

    /**
     * Gets the value of the seasonality property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueType }{@code >}
     *     
     */
    public JAXBElement<ReferenceValueType> getSeasonality() {
        return seasonality;
    }

    /**
     * Sets the value of the seasonality property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueType }{@code >}
     *     
     */
    public void setSeasonality(JAXBElement<ReferenceValueType> value) {
        this.seasonality = value;
    }

    /**
     * Gets the value of the supportingNRFColorFamilyM property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ColorListType }{@code >}
     *     
     */
    public JAXBElement<ColorListType> getSupportingNRFColorFamilyM() {
        return supportingNRFColorFamilyM;
    }

    /**
     * Sets the value of the supportingNRFColorFamilyM property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ColorListType }{@code >}
     *     
     */
    public void setSupportingNRFColorFamilyM(JAXBElement<ColorListType> value) {
        this.supportingNRFColorFamilyM = value;
    }

    /**
     * Gets the value of the consumerMetalColorM property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueListType }{@code >}
     *     
     */
    public JAXBElement<ReferenceValueListType> getConsumerMetalColorM() {
        return consumerMetalColorM;
    }

    /**
     * Sets the value of the consumerMetalColorM property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueListType }{@code >}
     *     
     */
    public void setConsumerMetalColorM(JAXBElement<ReferenceValueListType> value) {
        this.consumerMetalColorM = value;
    }

    /**
     * Gets the value of the consumerPrimaryTrendM property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueListType }{@code >}
     *     
     */
    public JAXBElement<ReferenceValueListType> getConsumerPrimaryTrendM() {
        return consumerPrimaryTrendM;
    }

    /**
     * Sets the value of the consumerPrimaryTrendM property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueListType }{@code >}
     *     
     */
    public void setConsumerPrimaryTrendM(JAXBElement<ReferenceValueListType> value) {
        this.consumerPrimaryTrendM = value;
    }

    /**
     * Gets the value of the consumerPattern property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueType }{@code >}
     *     
     */
    public JAXBElement<ReferenceValueType> getConsumerPattern() {
        return consumerPattern;
    }

    /**
     * Sets the value of the consumerPattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueType }{@code >}
     *     
     */
    public void setConsumerPattern(JAXBElement<ReferenceValueType> value) {
        this.consumerPattern = value;
    }

    /**
     * Gets the value of the consumerMaterialFinishM property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueListType }{@code >}
     *     
     */
    public JAXBElement<ReferenceValueListType> getConsumerMaterialFinishM() {
        return consumerMaterialFinishM;
    }

    /**
     * Sets the value of the consumerMaterialFinishM property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueListType }{@code >}
     *     
     */
    public void setConsumerMaterialFinishM(JAXBElement<ReferenceValueListType> value) {
        this.consumerMaterialFinishM = value;
    }

    /**
     * Gets the value of the consumerOutsoleMaterialM property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueListType }{@code >}
     *     
     */
    public JAXBElement<ReferenceValueListType> getConsumerOutsoleMaterialM() {
        return consumerOutsoleMaterialM;
    }

    /**
     * Sets the value of the consumerOutsoleMaterialM property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueListType }{@code >}
     *     
     */
    public void setConsumerOutsoleMaterialM(JAXBElement<ReferenceValueListType> value) {
        this.consumerOutsoleMaterialM = value;
    }

    /**
     * Gets the value of the gemstoneM property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GemstoneListType }{@code >}
     *     
     */
    public JAXBElement<GemstoneListType> getGemstoneM() {
        return gemstoneM;
    }

    /**
     * Sets the value of the gemstoneM property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GemstoneListType }{@code >}
     *     
     */
    public void setGemstoneM(JAXBElement<GemstoneListType> value) {
        this.gemstoneM = value;
    }

    /**
     * Gets the value of the scent property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceValueType }
     *     
     */
    public ReferenceValueType getScent() {
        return scent;
    }

    /**
     * Sets the value of the scent property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceValueType }
     *     
     */
    public void setScent(ReferenceValueType value) {
        this.scent = value;
    }

    /**
     * Gets the value of the nrfColor property.
     * 
     * @return
     *     possible object is
     *     {@link ColorType }
     *     
     */
    public ColorType getNRFColor() {
        return nrfColor;
    }

    /**
     * Sets the value of the nrfColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link ColorType }
     *     
     */
    public void setNRFColor(ColorType value) {
        this.nrfColor = value;
    }

    /**
     * Gets the value of the consumerNRFColor property.
     * 
     * @return
     *     possible object is
     *     {@link ColorType }
     *     
     */
    public ColorType getConsumerNRFColor() {
        return consumerNRFColor;
    }

    /**
     * Sets the value of the consumerNRFColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link ColorType }
     *     
     */
    public void setConsumerNRFColor(ColorType value) {
        this.consumerNRFColor = value;
    }

    /**
     * Gets the value of the secondaryTrendM property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceValueListType }
     *     
     */
    public ReferenceValueListType getSecondaryTrendM() {
        return secondaryTrendM;
    }

    /**
     * Sets the value of the secondaryTrendM property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceValueListType }
     *     
     */
    public void setSecondaryTrendM(ReferenceValueListType value) {
        this.secondaryTrendM = value;
    }

    /**
     * Gets the value of the presentationInitiativeM property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceValueListType }
     *     
     */
    public ReferenceValueListType getPresentationInitiativeM() {
        return presentationInitiativeM;
    }

    /**
     * Sets the value of the presentationInitiativeM property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceValueListType }
     *     
     */
    public void setPresentationInitiativeM(ReferenceValueListType value) {
        this.presentationInitiativeM = value;
    }

    /**
     * Gets the value of the transition property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceValueType }
     *     
     */
    public ReferenceValueType getTransition() {
        return transition;
    }

    /**
     * Sets the value of the transition property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceValueType }
     *     
     */
    public void setTransition(ReferenceValueType value) {
        this.transition = value;
    }

    /**
     * Gets the value of the pattern property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueType }{@code >}
     *     
     */
    public JAXBElement<ReferenceValueType> getPattern() {
        return pattern;
    }

    /**
     * Sets the value of the pattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueType }{@code >}
     *     
     */
    public void setPattern(JAXBElement<ReferenceValueType> value) {
        this.pattern = value;
    }

    /**
     * Gets the value of the wash property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueType }{@code >}
     *     
     */
    public JAXBElement<ReferenceValueType> getWash() {
        return wash;
    }

    /**
     * Sets the value of the wash property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueType }{@code >}
     *     
     */
    public void setWash(JAXBElement<ReferenceValueType> value) {
        this.wash = value;
    }

    /**
     * Gets the value of the metalTone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueType }{@code >}
     *     
     */
    public JAXBElement<ReferenceValueType> getMetalTone() {
        return metalTone;
    }

    /**
     * Sets the value of the metalTone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueType }{@code >}
     *     
     */
    public void setMetalTone(JAXBElement<ReferenceValueType> value) {
        this.metalTone = value;
    }

    /**
     * Gets the value of the dialColor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueType }{@code >}
     *     
     */
    public JAXBElement<ReferenceValueType> getDialColor() {
        return dialColor;
    }

    /**
     * Sets the value of the dialColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueType }{@code >}
     *     
     */
    public void setDialColor(JAXBElement<ReferenceValueType> value) {
        this.dialColor = value;
    }

    /**
     * Gets the value of the amCustomerChoiceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAMCustomerChoiceCode() {
        return amCustomerChoiceCode;
    }

    /**
     * Sets the value of the amCustomerChoiceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAMCustomerChoiceCode(String value) {
        this.amCustomerChoiceCode = value;
    }

    /**
     * Gets the value of the consumerMaterialFinishCodeM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumerMaterialFinishCodeM() {
        return consumerMaterialFinishCodeM;
    }

    /**
     * Sets the value of the consumerMaterialFinishCodeM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerMaterialFinishCodeM(String value) {
        this.consumerMaterialFinishCodeM = value;
    }

    /**
     * Gets the value of the consumerMetalColorCodeM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumerMetalColorCodeM() {
        return consumerMetalColorCodeM;
    }

    /**
     * Sets the value of the consumerMetalColorCodeM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerMetalColorCodeM(String value) {
        this.consumerMetalColorCodeM = value;
    }

    /**
     * Gets the value of the consumerNRFColorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumerNRFColorCode() {
        return consumerNRFColorCode;
    }

    /**
     * Sets the value of the consumerNRFColorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerNRFColorCode(String value) {
        this.consumerNRFColorCode = value;
    }

    /**
     * Gets the value of the consumerOutsoleMaterialCodeM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumerOutsoleMaterialCodeM() {
        return consumerOutsoleMaterialCodeM;
    }

    /**
     * Sets the value of the consumerOutsoleMaterialCodeM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerOutsoleMaterialCodeM(String value) {
        this.consumerOutsoleMaterialCodeM = value;
    }

    /**
     * Gets the value of the consumerPatternCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumerPatternCode() {
        return consumerPatternCode;
    }

    /**
     * Sets the value of the consumerPatternCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerPatternCode(String value) {
        this.consumerPatternCode = value;
    }

    /**
     * Gets the value of the consumerPrimaryTrendCodeM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumerPrimaryTrendCodeM() {
        return consumerPrimaryTrendCodeM;
    }

    /**
     * Sets the value of the consumerPrimaryTrendCodeM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerPrimaryTrendCodeM(String value) {
        this.consumerPrimaryTrendCodeM = value;
    }

    /**
     * Gets the value of the customerChoiceDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerChoiceDescription() {
        return customerChoiceDescription;
    }

    /**
     * Sets the value of the customerChoiceDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerChoiceDescription(String value) {
        this.customerChoiceDescription = value;
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
     * Gets the value of the customerChoiceVendorColorDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerChoiceVendorColorDescription() {
        return customerChoiceVendorColorDescription;
    }

    /**
     * Sets the value of the customerChoiceVendorColorDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerChoiceVendorColorDescription(String value) {
        this.customerChoiceVendorColorDescription = value;
    }

    /**
     * Gets the value of the dialColorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDialColorCode() {
        return dialColorCode;
    }

    /**
     * Sets the value of the dialColorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDialColorCode(String value) {
        this.dialColorCode = value;
    }

    /**
     * Gets the value of the digitalTurnInDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDigitalTurnInDate() {
        return digitalTurnInDate;
    }

    /**
     * Sets the value of the digitalTurnInDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDigitalTurnInDate(XMLGregorianCalendar value) {
        this.digitalTurnInDate = value;
    }

    /**
     * Gets the value of the digitalTurnInIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDigitalTurnInIndicator() {
        return digitalTurnInIndicator;
    }

    /**
     * Sets the value of the digitalTurnInIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDigitalTurnInIndicator(String value) {
        this.digitalTurnInIndicator = value;
    }

    /**
     * Gets the value of the displayColorDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayColorDescription() {
        return displayColorDescription;
    }

    /**
     * Sets the value of the displayColorDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayColorDescription(String value) {
        this.displayColorDescription = value;
    }

    /**
     * Gets the value of the gemstoneCodeM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGemstoneCodeM() {
        return gemstoneCodeM;
    }

    /**
     * Sets the value of the gemstoneCodeM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGemstoneCodeM(String value) {
        this.gemstoneCodeM = value;
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
     * Gets the value of the metalToneCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetalToneCode() {
        return metalToneCode;
    }

    /**
     * Sets the value of the metalToneCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetalToneCode(String value) {
        this.metalToneCode = value;
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
     * Gets the value of the nrfColorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNRFColorCode() {
        return nrfColorCode;
    }

    /**
     * Sets the value of the nrfColorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNRFColorCode(String value) {
        this.nrfColorCode = value;
    }

    /**
     * Gets the value of the patternCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatternCode() {
        return patternCode;
    }

    /**
     * Sets the value of the patternCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatternCode(String value) {
        this.patternCode = value;
    }

    /**
     * Gets the value of the presentationInitiativeCodeM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPresentationInitiativeCodeM() {
        return presentationInitiativeCodeM;
    }

    /**
     * Sets the value of the presentationInitiativeCodeM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPresentationInitiativeCodeM(String value) {
        this.presentationInitiativeCodeM = value;
    }

    /**
     * Gets the value of the primaryTrendCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryTrendCode() {
        return primaryTrendCode;
    }

    /**
     * Sets the value of the primaryTrendCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryTrendCode(String value) {
        this.primaryTrendCode = value;
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
     * Gets the value of the scentCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScentCode() {
        return scentCode;
    }

    /**
     * Sets the value of the scentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScentCode(String value) {
        this.scentCode = value;
    }

    /**
     * Gets the value of the seasonalityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeasonalityCode() {
        return seasonalityCode;
    }

    /**
     * Sets the value of the seasonalityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeasonalityCode(String value) {
        this.seasonalityCode = value;
    }

    /**
     * Gets the value of the secondaryTrendCodeM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryTrendCodeM() {
        return secondaryTrendCodeM;
    }

    /**
     * Sets the value of the secondaryTrendCodeM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryTrendCodeM(String value) {
        this.secondaryTrendCodeM = value;
    }

    /**
     * Gets the value of the shoeBoxIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getShoeBoxIdentifier() {
        return shoeBoxIdentifier;
    }

    /**
     * Sets the value of the shoeBoxIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setShoeBoxIdentifier(Long value) {
        this.shoeBoxIdentifier = value;
    }

    /**
     * Gets the value of the supportingNRFColorFamilyCodeM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupportingNRFColorFamilyCodeM() {
        return supportingNRFColorFamilyCodeM;
    }

    /**
     * Sets the value of the supportingNRFColorFamilyCodeM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupportingNRFColorFamilyCodeM(String value) {
        this.supportingNRFColorFamilyCodeM = value;
    }

    /**
     * Gets the value of the thumbnailPhotoLinkText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThumbnailPhotoLinkText() {
        return thumbnailPhotoLinkText;
    }

    /**
     * Sets the value of the thumbnailPhotoLinkText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThumbnailPhotoLinkText(String value) {
        this.thumbnailPhotoLinkText = value;
    }

    /**
     * Gets the value of the transitionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransitionCode() {
        return transitionCode;
    }

    /**
     * Sets the value of the transitionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransitionCode(String value) {
        this.transitionCode = value;
    }

    /**
     * Gets the value of the washCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWashCode() {
        return washCode;
    }

    /**
     * Sets the value of the washCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWashCode(String value) {
        this.washCode = value;
    }

}
