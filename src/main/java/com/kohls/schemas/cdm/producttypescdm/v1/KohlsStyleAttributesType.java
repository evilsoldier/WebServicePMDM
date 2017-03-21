
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
 * A collection of sku's/upc's that all have similar characteristics and are considered a particular 'style'.  (Ex. 12345678 Sonoma Hiking Boot)
 * 
 * <p>Java class for KohlsStyleAttributesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KohlsStyleAttributesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Category" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *         &lt;element name="FashionPyramid" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *         &lt;element name="PriceComparative" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *         &lt;element name="ConsumerPersonaCategoryM" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueListType" minOccurs="0"/&gt;
 *         &lt;element name="ConsumerPersonaGroupM" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueListType" minOccurs="0"/&gt;
 *         &lt;element name="ConsumerPersonaSubjectM" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueListType" minOccurs="0"/&gt;
 *         &lt;element name="ConsumerPersonaThemeM" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueListType" minOccurs="0"/&gt;
 *         &lt;element name="ConsumerFit" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *         &lt;element name="ConsumerLength" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *         &lt;element name="ConsumerLegOpening" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *         &lt;element name="ConsumerRise" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *         &lt;element name="ConsumerPantFront" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *         &lt;element name="ConsumerSilhouetteM" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueListType" minOccurs="0"/&gt;
 *         &lt;element name="ConsumerNecklineM" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueListType" minOccurs="0"/&gt;
 *         &lt;element name="ConsumerSleeveLength" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *         &lt;element name="ConsumerClosureM" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueListType" minOccurs="0"/&gt;
 *         &lt;element name="CustomerBodyCharacteristicM" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueListType" minOccurs="0"/&gt;
 *         &lt;element name="ConsumerMaterialM" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueListType" minOccurs="0"/&gt;
 *         &lt;element name="ConsumerFillMaterialM" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueListType" minOccurs="0"/&gt;
 *         &lt;element name="ConsumerCareInstructionsM" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueListType" minOccurs="0"/&gt;
 *         &lt;element name="ConsumerOccasionM" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueListType" minOccurs="0"/&gt;
 *         &lt;element name="ConsumerHandleStyleM" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueListType" minOccurs="0"/&gt;
 *         &lt;element name="HeelHeightUOM" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *         &lt;element name="BootShaftCharacteristicM" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueListType" minOccurs="0"/&gt;
 *         &lt;element name="GenderM" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueListType" minOccurs="0"/&gt;
 *         &lt;element name="DisplaySizeUOM" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *         &lt;element name="DisplayResolution" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *         &lt;element name="ElectronicStorageCapacityUOM" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *         &lt;element name="MetalCaratM" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueListType" minOccurs="0"/&gt;
 *         &lt;element name="GemstoneCarat" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *         &lt;element name="DiamondColorGradeM" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueListType" minOccurs="0"/&gt;
 *         &lt;element name="DiamondClarityGradeM" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueListType" minOccurs="0"/&gt;
 *         &lt;element name="KohlsSpecialSKUType" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *         &lt;element name="DevicePlatformM" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueListType" minOccurs="0"/&gt;
 *         &lt;element name="BeverageTypeM" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueListType" minOccurs="0"/&gt;
 *         &lt;element name="FirmnessRatingM" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueListType" minOccurs="0"/&gt;
 *         &lt;element name="UPFRating" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *         &lt;element name="BodySupportRatingM" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueListType" minOccurs="0"/&gt;
 *         &lt;element name="MaterialWeightRatingM" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueListType" minOccurs="0"/&gt;
 *         &lt;element name="AgeCategoryM" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueListType" minOccurs="0"/&gt;
 *         &lt;element name="AppropriateAgeRangeM" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueListType" minOccurs="0"/&gt;
 *         &lt;element name="RoomM" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueListType" minOccurs="0"/&gt;
 *         &lt;element name="RecommendedUsageM" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueListType" minOccurs="0"/&gt;
 *         &lt;element name="WatchClockMovement" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *         &lt;element name="FraudRisk" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *         &lt;element name="TaxwareProduct" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *         &lt;element name="ProductType" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *         &lt;element name="ProductSubtype" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}Brand" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}KohlsStyleMaximumPurchaseLimitList" minOccurs="0"/&gt;
 *         &lt;element name="MajorCategory" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *         &lt;element name="FillMaterial" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *         &lt;element name="Fit" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *         &lt;element name="LegOpening" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *         &lt;element name="Length" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *         &lt;element name="Neckline" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *         &lt;element name="PantFront" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *         &lt;element name="SleeveLength" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *         &lt;element name="Material" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *         &lt;element name="Silhouette" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *         &lt;element name="KeyClassfication" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *         &lt;element name="TicketType" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *         &lt;element name="HangFold" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *         &lt;element name="ProductPrimaryType" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *         &lt;element name="ReportingLabelM" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueListType" minOccurs="0"/&gt;
 *         &lt;element name="ValueInitiativeM" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueListType" minOccurs="0"/&gt;
 *         &lt;element name="SetPieceSellableUnit" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *         &lt;element name="MattressThicknessUOM" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *         &lt;element name="WindowTreatmentTopConstructionM" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueListType" minOccurs="0"/&gt;
 *         &lt;element name="MediaRatingM" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueListType" minOccurs="0"/&gt;
 *         &lt;element name="ExclusionM" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueListType" minOccurs="0"/&gt;
 *         &lt;element name="PetTypeM" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueListType" minOccurs="0"/&gt;
 *         &lt;element name="CupCoverage" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *         &lt;element name="CupType" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *         &lt;element name="CuffType" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *         &lt;element name="PocketType" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *         &lt;element name="Sheerness" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *         &lt;element name="StrapType" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *         &lt;element name="SaleablePackageType" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *         &lt;element name="SecondaryProductShape" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *         &lt;element name="PrimaryToeCharacteristic" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *         &lt;element name="Closure" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *         &lt;element name="GemstoneCut" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *         &lt;element name="OccasionPurpose" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *         &lt;element name="Property" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *         &lt;element name="Theme" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *         &lt;element name="BodyCharacteristic" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *         &lt;element name="SourceSystem" type="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ReferenceValueType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="AgeCategoryCodeM" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="AppropriateAgeRangeCodeM" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="BeverageTypeCodeM" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="BodyCharacteristicCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="BodySupportRatingCodeM" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="BootShaftCharacteristicCodeM" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="BrandIdentifier" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="CategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ChokingHazardIndicator" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ClassNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ClosureCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ConsumerCareInstructionsCodeM" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ConsumerClosureCodeM" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ConsumerFillMaterialCodeM" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ConsumerFitCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ConsumerHandleStyleCodeM" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ConsumerLegOpeningCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ConsumerLengthCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ConsumerMaterialCodeM" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ConsumerNecklineCodeM" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ConsumerOccasionCodeM" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ConsumerPantFrontCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ConsumerPersonaCategoryCodeM" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ConsumerPersonaGroupCodeM" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ConsumerPersonaSubjectCodeM" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ConsumerPersonaThemeCodeM" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ConsumerRiseCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ConsumerSilhouetteCodeM" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ConsumerSleeveLengthCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="CuffTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="CupCoverageCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="CupTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="CustomerBodyCharacteristicCodeM" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DepartmentNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DevicePlatformCodeM" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DiamondClarityGradeCodeM" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DiamondColorGradeCodeM" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DisplayResolutionCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DisplaySizeNumber" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="DisplaySizeUOMCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DrawerCountQuantity" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="ElectronicStorageCapacityQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="ElectronicStorageCapacityUOMCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ExclusionCodeM" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="FashionPyramidCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="FillMaterialCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="FirmnessRatingCodeM" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="FitCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="FraudRiskCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="GemstoneCaratCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="GemstoneCutCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="GemstoneQuantity" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="GenderCodeM" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="HangFoldCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="HazardousMaterialIndicator" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="HeelHeightQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="HeelHeightUOMCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="KeyClassficationCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="KohlsSpecialSKUTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="KohlsStyleDescription" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="KohlsStyleIdentifier" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="LegOpeningCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="LengthCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="LightBulbCountQuantity" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="MajorCategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="MaterialCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="MaterialWeightRatingCodeM" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="MattressThicknessQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="MattressThicknessUOMCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="MaximumPurchaseQuantity" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="MediaRatingCodeM" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="MegapixelQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="MetalCaratCodeM" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ModifiedDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="NecklineCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="OccasionPurposeCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="OpeningCountQuantity" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="PantFrontCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="PerishableIndicator" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="PetTypeCodeM" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="PlaceSettingQuantity" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="PocketTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="PriceComparativeCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="PrimaryToeCharacteristicCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ProductPrimaryTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ProductSubtypeCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ProductTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ProductTypeIQ" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ProfileGroupNameText" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="PropertyCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RecommendedUsageCodeM" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RecordStatusFlag" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ReportingLabelCodeM" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RoomCodeM" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SaleablePackageTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SecondaryProductShapeCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SetPieceCountQuantity" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="SetPieceSellableUnitCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SheernessCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ShelfCountQuantity" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="ShipAloneIndicator" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SilhouetteCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SleeveLengthCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SourceSystemCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SourceSystemIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="StrapTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SubClassNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="TaxwareProductCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ThemeCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ThreadCountQuantity" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="TicketTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="TierCountQuantity" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="UPFRatingCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ValueInitiativeCodeM" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="VendorStyleIdentifier" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="WatchClockMovementCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="WickCountQuantity" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="WindowTreatmentTopConstructionCodeM" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KohlsStyleAttributesType", propOrder = {
    "category",
    "fashionPyramid",
    "priceComparative",
    "consumerPersonaCategoryM",
    "consumerPersonaGroupM",
    "consumerPersonaSubjectM",
    "consumerPersonaThemeM",
    "consumerFit",
    "consumerLength",
    "consumerLegOpening",
    "consumerRise",
    "consumerPantFront",
    "consumerSilhouetteM",
    "consumerNecklineM",
    "consumerSleeveLength",
    "consumerClosureM",
    "customerBodyCharacteristicM",
    "consumerMaterialM",
    "consumerFillMaterialM",
    "consumerCareInstructionsM",
    "consumerOccasionM",
    "consumerHandleStyleM",
    "heelHeightUOM",
    "bootShaftCharacteristicM",
    "genderM",
    "displaySizeUOM",
    "displayResolution",
    "electronicStorageCapacityUOM",
    "metalCaratM",
    "gemstoneCarat",
    "diamondColorGradeM",
    "diamondClarityGradeM",
    "kohlsSpecialSKUType",
    "devicePlatformM",
    "beverageTypeM",
    "firmnessRatingM",
    "upfRating",
    "bodySupportRatingM",
    "materialWeightRatingM",
    "ageCategoryM",
    "appropriateAgeRangeM",
    "roomM",
    "recommendedUsageM",
    "watchClockMovement",
    "fraudRisk",
    "taxwareProduct",
    "productType",
    "productSubtype",
    "brand",
    "kohlsStyleMaximumPurchaseLimitList",
    "majorCategory",
    "fillMaterial",
    "fit",
    "legOpening",
    "length",
    "neckline",
    "pantFront",
    "sleeveLength",
    "material",
    "silhouette",
    "keyClassfication",
    "ticketType",
    "hangFold",
    "productPrimaryType",
    "reportingLabelM",
    "valueInitiativeM",
    "setPieceSellableUnit",
    "mattressThicknessUOM",
    "windowTreatmentTopConstructionM",
    "mediaRatingM",
    "exclusionM",
    "petTypeM",
    "cupCoverage",
    "cupType",
    "cuffType",
    "pocketType",
    "sheerness",
    "strapType",
    "saleablePackageType",
    "secondaryProductShape",
    "primaryToeCharacteristic",
    "closure",
    "gemstoneCut",
    "occasionPurpose",
    "property",
    "theme",
    "bodyCharacteristic",
    "sourceSystem"
})
public class KohlsStyleAttributesType {

    @XmlElement(name = "Category")
    protected ReferenceValueType category;
    @XmlElement(name = "FashionPyramid")
    protected ReferenceValueType fashionPyramid;
    @XmlElement(name = "PriceComparative")
    protected ReferenceValueType priceComparative;
    @XmlElementRef(name = "ConsumerPersonaCategoryM", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<ReferenceValueListType> consumerPersonaCategoryM;
    @XmlElementRef(name = "ConsumerPersonaGroupM", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<ReferenceValueListType> consumerPersonaGroupM;
    @XmlElementRef(name = "ConsumerPersonaSubjectM", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<ReferenceValueListType> consumerPersonaSubjectM;
    @XmlElementRef(name = "ConsumerPersonaThemeM", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<ReferenceValueListType> consumerPersonaThemeM;
    @XmlElementRef(name = "ConsumerFit", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<ReferenceValueType> consumerFit;
    @XmlElementRef(name = "ConsumerLength", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<ReferenceValueType> consumerLength;
    @XmlElementRef(name = "ConsumerLegOpening", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<ReferenceValueType> consumerLegOpening;
    @XmlElementRef(name = "ConsumerRise", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<ReferenceValueType> consumerRise;
    @XmlElementRef(name = "ConsumerPantFront", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<ReferenceValueType> consumerPantFront;
    @XmlElementRef(name = "ConsumerSilhouetteM", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<ReferenceValueListType> consumerSilhouetteM;
    @XmlElementRef(name = "ConsumerNecklineM", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<ReferenceValueListType> consumerNecklineM;
    @XmlElementRef(name = "ConsumerSleeveLength", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<ReferenceValueType> consumerSleeveLength;
    @XmlElementRef(name = "ConsumerClosureM", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<ReferenceValueListType> consumerClosureM;
    @XmlElementRef(name = "CustomerBodyCharacteristicM", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<ReferenceValueListType> customerBodyCharacteristicM;
    @XmlElementRef(name = "ConsumerMaterialM", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<ReferenceValueListType> consumerMaterialM;
    @XmlElementRef(name = "ConsumerFillMaterialM", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<ReferenceValueListType> consumerFillMaterialM;
    @XmlElementRef(name = "ConsumerCareInstructionsM", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<ReferenceValueListType> consumerCareInstructionsM;
    @XmlElementRef(name = "ConsumerOccasionM", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<ReferenceValueListType> consumerOccasionM;
    @XmlElementRef(name = "ConsumerHandleStyleM", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<ReferenceValueListType> consumerHandleStyleM;
    @XmlElementRef(name = "HeelHeightUOM", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<ReferenceValueType> heelHeightUOM;
    @XmlElementRef(name = "BootShaftCharacteristicM", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<ReferenceValueListType> bootShaftCharacteristicM;
    @XmlElementRef(name = "GenderM", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<ReferenceValueListType> genderM;
    @XmlElementRef(name = "DisplaySizeUOM", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<ReferenceValueType> displaySizeUOM;
    @XmlElementRef(name = "DisplayResolution", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<ReferenceValueType> displayResolution;
    @XmlElementRef(name = "ElectronicStorageCapacityUOM", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<ReferenceValueType> electronicStorageCapacityUOM;
    @XmlElementRef(name = "MetalCaratM", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<ReferenceValueListType> metalCaratM;
    @XmlElementRef(name = "GemstoneCarat", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<ReferenceValueType> gemstoneCarat;
    @XmlElementRef(name = "DiamondColorGradeM", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<ReferenceValueListType> diamondColorGradeM;
    @XmlElementRef(name = "DiamondClarityGradeM", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<ReferenceValueListType> diamondClarityGradeM;
    @XmlElementRef(name = "KohlsSpecialSKUType", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<ReferenceValueType> kohlsSpecialSKUType;
    @XmlElementRef(name = "DevicePlatformM", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<ReferenceValueListType> devicePlatformM;
    @XmlElementRef(name = "BeverageTypeM", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<ReferenceValueListType> beverageTypeM;
    @XmlElementRef(name = "FirmnessRatingM", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<ReferenceValueListType> firmnessRatingM;
    @XmlElementRef(name = "UPFRating", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<ReferenceValueType> upfRating;
    @XmlElementRef(name = "BodySupportRatingM", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<ReferenceValueListType> bodySupportRatingM;
    @XmlElementRef(name = "MaterialWeightRatingM", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<ReferenceValueListType> materialWeightRatingM;
    @XmlElementRef(name = "AgeCategoryM", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<ReferenceValueListType> ageCategoryM;
    @XmlElementRef(name = "AppropriateAgeRangeM", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<ReferenceValueListType> appropriateAgeRangeM;
    @XmlElementRef(name = "RoomM", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<ReferenceValueListType> roomM;
    @XmlElementRef(name = "RecommendedUsageM", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<ReferenceValueListType> recommendedUsageM;
    @XmlElementRef(name = "WatchClockMovement", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<ReferenceValueType> watchClockMovement;
    @XmlElementRef(name = "FraudRisk", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<ReferenceValueType> fraudRisk;
    @XmlElementRef(name = "TaxwareProduct", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<ReferenceValueType> taxwareProduct;
    @XmlElementRef(name = "ProductType", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<ReferenceValueType> productType;
    @XmlElementRef(name = "ProductSubtype", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<ReferenceValueType> productSubtype;
    @XmlElement(name = "Brand")
    protected BrandType brand;
    @XmlElement(name = "KohlsStyleMaximumPurchaseLimitList")
    protected KohlsStyleMaximumPurchaseLimitListType kohlsStyleMaximumPurchaseLimitList;
    @XmlElement(name = "MajorCategory")
    protected ReferenceValueType majorCategory;
    @XmlElement(name = "FillMaterial")
    protected ReferenceValueType fillMaterial;
    @XmlElement(name = "Fit")
    protected ReferenceValueType fit;
    @XmlElement(name = "LegOpening")
    protected ReferenceValueType legOpening;
    @XmlElement(name = "Length")
    protected ReferenceValueType length;
    @XmlElement(name = "Neckline")
    protected ReferenceValueType neckline;
    @XmlElement(name = "PantFront")
    protected ReferenceValueType pantFront;
    @XmlElement(name = "SleeveLength")
    protected ReferenceValueType sleeveLength;
    @XmlElement(name = "Material")
    protected ReferenceValueType material;
    @XmlElement(name = "Silhouette")
    protected ReferenceValueType silhouette;
    @XmlElement(name = "KeyClassfication")
    protected ReferenceValueType keyClassfication;
    @XmlElement(name = "TicketType")
    protected ReferenceValueType ticketType;
    @XmlElement(name = "HangFold")
    protected ReferenceValueType hangFold;
    @XmlElement(name = "ProductPrimaryType")
    protected ReferenceValueType productPrimaryType;
    @XmlElement(name = "ReportingLabelM")
    protected ReferenceValueListType reportingLabelM;
    @XmlElement(name = "ValueInitiativeM")
    protected ReferenceValueListType valueInitiativeM;
    @XmlElement(name = "SetPieceSellableUnit")
    protected ReferenceValueType setPieceSellableUnit;
    @XmlElement(name = "MattressThicknessUOM")
    protected ReferenceValueType mattressThicknessUOM;
    @XmlElement(name = "WindowTreatmentTopConstructionM")
    protected ReferenceValueListType windowTreatmentTopConstructionM;
    @XmlElement(name = "MediaRatingM")
    protected ReferenceValueListType mediaRatingM;
    @XmlElement(name = "ExclusionM")
    protected ReferenceValueListType exclusionM;
    @XmlElement(name = "PetTypeM")
    protected ReferenceValueListType petTypeM;
    @XmlElementRef(name = "CupCoverage", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<ReferenceValueType> cupCoverage;
    @XmlElementRef(name = "CupType", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<ReferenceValueType> cupType;
    @XmlElementRef(name = "CuffType", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<ReferenceValueType> cuffType;
    @XmlElementRef(name = "PocketType", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<ReferenceValueType> pocketType;
    @XmlElementRef(name = "Sheerness", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<ReferenceValueType> sheerness;
    @XmlElementRef(name = "StrapType", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<ReferenceValueType> strapType;
    @XmlElementRef(name = "SaleablePackageType", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<ReferenceValueType> saleablePackageType;
    @XmlElementRef(name = "SecondaryProductShape", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<ReferenceValueType> secondaryProductShape;
    @XmlElementRef(name = "PrimaryToeCharacteristic", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<ReferenceValueType> primaryToeCharacteristic;
    @XmlElementRef(name = "Closure", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<ReferenceValueType> closure;
    @XmlElementRef(name = "GemstoneCut", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<ReferenceValueType> gemstoneCut;
    @XmlElementRef(name = "OccasionPurpose", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<ReferenceValueType> occasionPurpose;
    @XmlElementRef(name = "Property", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<ReferenceValueType> property;
    @XmlElementRef(name = "Theme", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<ReferenceValueType> theme;
    @XmlElementRef(name = "BodyCharacteristic", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<ReferenceValueType> bodyCharacteristic;
    @XmlElementRef(name = "SourceSystem", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<ReferenceValueType> sourceSystem;
    @XmlAttribute(name = "AgeCategoryCodeM")
    protected String ageCategoryCodeM;
    @XmlAttribute(name = "AppropriateAgeRangeCodeM")
    protected String appropriateAgeRangeCodeM;
    @XmlAttribute(name = "BeverageTypeCodeM")
    protected String beverageTypeCodeM;
    @XmlAttribute(name = "BodyCharacteristicCode")
    protected String bodyCharacteristicCode;
    @XmlAttribute(name = "BodySupportRatingCodeM")
    protected String bodySupportRatingCodeM;
    @XmlAttribute(name = "BootShaftCharacteristicCodeM")
    protected String bootShaftCharacteristicCodeM;
    @XmlAttribute(name = "BrandIdentifier")
    protected Long brandIdentifier;
    @XmlAttribute(name = "CategoryCode")
    protected String categoryCode;
    @XmlAttribute(name = "ChokingHazardIndicator")
    protected String chokingHazardIndicator;
    @XmlAttribute(name = "ClassNumber")
    protected String classNumber;
    @XmlAttribute(name = "ClosureCode")
    protected String closureCode;
    @XmlAttribute(name = "ConsumerCareInstructionsCodeM")
    protected String consumerCareInstructionsCodeM;
    @XmlAttribute(name = "ConsumerClosureCodeM")
    protected String consumerClosureCodeM;
    @XmlAttribute(name = "ConsumerFillMaterialCodeM")
    protected String consumerFillMaterialCodeM;
    @XmlAttribute(name = "ConsumerFitCode")
    protected String consumerFitCode;
    @XmlAttribute(name = "ConsumerHandleStyleCodeM")
    protected String consumerHandleStyleCodeM;
    @XmlAttribute(name = "ConsumerLegOpeningCode")
    protected String consumerLegOpeningCode;
    @XmlAttribute(name = "ConsumerLengthCode")
    protected String consumerLengthCode;
    @XmlAttribute(name = "ConsumerMaterialCodeM")
    protected String consumerMaterialCodeM;
    @XmlAttribute(name = "ConsumerNecklineCodeM")
    protected String consumerNecklineCodeM;
    @XmlAttribute(name = "ConsumerOccasionCodeM")
    protected String consumerOccasionCodeM;
    @XmlAttribute(name = "ConsumerPantFrontCode")
    protected String consumerPantFrontCode;
    @XmlAttribute(name = "ConsumerPersonaCategoryCodeM")
    protected String consumerPersonaCategoryCodeM;
    @XmlAttribute(name = "ConsumerPersonaGroupCodeM")
    protected String consumerPersonaGroupCodeM;
    @XmlAttribute(name = "ConsumerPersonaSubjectCodeM")
    protected String consumerPersonaSubjectCodeM;
    @XmlAttribute(name = "ConsumerPersonaThemeCodeM")
    protected String consumerPersonaThemeCodeM;
    @XmlAttribute(name = "ConsumerRiseCode")
    protected String consumerRiseCode;
    @XmlAttribute(name = "ConsumerSilhouetteCodeM")
    protected String consumerSilhouetteCodeM;
    @XmlAttribute(name = "ConsumerSleeveLengthCode")
    protected String consumerSleeveLengthCode;
    @XmlAttribute(name = "CuffTypeCode")
    protected String cuffTypeCode;
    @XmlAttribute(name = "CupCoverageCode")
    protected String cupCoverageCode;
    @XmlAttribute(name = "CupTypeCode")
    protected String cupTypeCode;
    @XmlAttribute(name = "CustomerBodyCharacteristicCodeM")
    protected String customerBodyCharacteristicCodeM;
    @XmlAttribute(name = "DepartmentNumber")
    protected String departmentNumber;
    @XmlAttribute(name = "DevicePlatformCodeM")
    protected String devicePlatformCodeM;
    @XmlAttribute(name = "DiamondClarityGradeCodeM")
    protected String diamondClarityGradeCodeM;
    @XmlAttribute(name = "DiamondColorGradeCodeM")
    protected String diamondColorGradeCodeM;
    @XmlAttribute(name = "DisplayResolutionCode")
    protected String displayResolutionCode;
    @XmlAttribute(name = "DisplaySizeNumber")
    protected BigDecimal displaySizeNumber;
    @XmlAttribute(name = "DisplaySizeUOMCode")
    protected String displaySizeUOMCode;
    @XmlAttribute(name = "DrawerCountQuantity")
    protected Long drawerCountQuantity;
    @XmlAttribute(name = "ElectronicStorageCapacityQuantity")
    protected BigDecimal electronicStorageCapacityQuantity;
    @XmlAttribute(name = "ElectronicStorageCapacityUOMCode")
    protected String electronicStorageCapacityUOMCode;
    @XmlAttribute(name = "ExclusionCodeM")
    protected String exclusionCodeM;
    @XmlAttribute(name = "FashionPyramidCode")
    protected String fashionPyramidCode;
    @XmlAttribute(name = "FillMaterialCode")
    protected String fillMaterialCode;
    @XmlAttribute(name = "FirmnessRatingCodeM")
    protected String firmnessRatingCodeM;
    @XmlAttribute(name = "FitCode")
    protected String fitCode;
    @XmlAttribute(name = "FraudRiskCode")
    protected String fraudRiskCode;
    @XmlAttribute(name = "GemstoneCaratCode")
    protected String gemstoneCaratCode;
    @XmlAttribute(name = "GemstoneCutCode")
    protected String gemstoneCutCode;
    @XmlAttribute(name = "GemstoneQuantity")
    protected Long gemstoneQuantity;
    @XmlAttribute(name = "GenderCodeM")
    protected String genderCodeM;
    @XmlAttribute(name = "HangFoldCode")
    protected String hangFoldCode;
    @XmlAttribute(name = "HazardousMaterialIndicator")
    protected String hazardousMaterialIndicator;
    @XmlAttribute(name = "HeelHeightQuantity")
    protected BigDecimal heelHeightQuantity;
    @XmlAttribute(name = "HeelHeightUOMCode")
    protected String heelHeightUOMCode;
    @XmlAttribute(name = "KeyClassficationCode")
    protected String keyClassficationCode;
    @XmlAttribute(name = "KohlsSpecialSKUTypeCode")
    protected String kohlsSpecialSKUTypeCode;
    @XmlAttribute(name = "KohlsStyleDescription")
    protected String kohlsStyleDescription;
    @XmlAttribute(name = "KohlsStyleIdentifier")
    protected Long kohlsStyleIdentifier;
    @XmlAttribute(name = "LegOpeningCode")
    protected String legOpeningCode;
    @XmlAttribute(name = "LengthCode")
    protected String lengthCode;
    @XmlAttribute(name = "LightBulbCountQuantity")
    protected Long lightBulbCountQuantity;
    @XmlAttribute(name = "MajorCategoryCode")
    protected String majorCategoryCode;
    @XmlAttribute(name = "MaterialCode")
    protected String materialCode;
    @XmlAttribute(name = "MaterialWeightRatingCodeM")
    protected String materialWeightRatingCodeM;
    @XmlAttribute(name = "MattressThicknessQuantity")
    protected BigDecimal mattressThicknessQuantity;
    @XmlAttribute(name = "MattressThicknessUOMCode")
    protected String mattressThicknessUOMCode;
    @XmlAttribute(name = "MaximumPurchaseQuantity")
    protected Long maximumPurchaseQuantity;
    @XmlAttribute(name = "MediaRatingCodeM")
    protected String mediaRatingCodeM;
    @XmlAttribute(name = "MegapixelQuantity")
    protected BigDecimal megapixelQuantity;
    @XmlAttribute(name = "MetalCaratCodeM")
    protected String metalCaratCodeM;
    @XmlAttribute(name = "ModifiedDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifiedDateTime;
    @XmlAttribute(name = "NecklineCode")
    protected String necklineCode;
    @XmlAttribute(name = "OccasionPurposeCode")
    protected String occasionPurposeCode;
    @XmlAttribute(name = "OpeningCountQuantity")
    protected Long openingCountQuantity;
    @XmlAttribute(name = "PantFrontCode")
    protected String pantFrontCode;
    @XmlAttribute(name = "PerishableIndicator")
    protected String perishableIndicator;
    @XmlAttribute(name = "PetTypeCodeM")
    protected String petTypeCodeM;
    @XmlAttribute(name = "PlaceSettingQuantity")
    protected Long placeSettingQuantity;
    @XmlAttribute(name = "PocketTypeCode")
    protected String pocketTypeCode;
    @XmlAttribute(name = "PriceComparativeCode")
    protected String priceComparativeCode;
    @XmlAttribute(name = "PrimaryToeCharacteristicCode")
    protected String primaryToeCharacteristicCode;
    @XmlAttribute(name = "ProductPrimaryTypeCode")
    protected String productPrimaryTypeCode;
    @XmlAttribute(name = "ProductSubtypeCode")
    protected String productSubtypeCode;
    @XmlAttribute(name = "ProductTypeCode")
    protected String productTypeCode;
    @XmlAttribute(name = "ProductTypeIQ")
    protected String productTypeIQ;
    @XmlAttribute(name = "ProfileGroupNameText")
    protected String profileGroupNameText;
    @XmlAttribute(name = "PropertyCode")
    protected String propertyCode;
    @XmlAttribute(name = "RecommendedUsageCodeM")
    protected String recommendedUsageCodeM;
    @XmlAttribute(name = "RecordStatusFlag")
    protected String recordStatusFlag;
    @XmlAttribute(name = "ReportingLabelCodeM")
    protected String reportingLabelCodeM;
    @XmlAttribute(name = "RoomCodeM")
    protected String roomCodeM;
    @XmlAttribute(name = "SaleablePackageTypeCode")
    protected String saleablePackageTypeCode;
    @XmlAttribute(name = "SecondaryProductShapeCode")
    protected String secondaryProductShapeCode;
    @XmlAttribute(name = "SetPieceCountQuantity")
    protected Long setPieceCountQuantity;
    @XmlAttribute(name = "SetPieceSellableUnitCode")
    protected String setPieceSellableUnitCode;
    @XmlAttribute(name = "SheernessCode")
    protected String sheernessCode;
    @XmlAttribute(name = "ShelfCountQuantity")
    protected Long shelfCountQuantity;
    @XmlAttribute(name = "ShipAloneIndicator")
    protected String shipAloneIndicator;
    @XmlAttribute(name = "SilhouetteCode")
    protected String silhouetteCode;
    @XmlAttribute(name = "SleeveLengthCode")
    protected String sleeveLengthCode;
    @XmlAttribute(name = "SourceSystemCode")
    protected String sourceSystemCode;
    @XmlAttribute(name = "SourceSystemIdentifier")
    protected String sourceSystemIdentifier;
    @XmlAttribute(name = "StrapTypeCode")
    protected String strapTypeCode;
    @XmlAttribute(name = "SubClassNumber")
    protected String subClassNumber;
    @XmlAttribute(name = "TaxwareProductCode")
    protected String taxwareProductCode;
    @XmlAttribute(name = "ThemeCode")
    protected String themeCode;
    @XmlAttribute(name = "ThreadCountQuantity")
    protected Long threadCountQuantity;
    @XmlAttribute(name = "TicketTypeCode")
    protected String ticketTypeCode;
    @XmlAttribute(name = "TierCountQuantity")
    protected Long tierCountQuantity;
    @XmlAttribute(name = "UPFRatingCode")
    protected String upfRatingCode;
    @XmlAttribute(name = "ValueInitiativeCodeM")
    protected String valueInitiativeCodeM;
    @XmlAttribute(name = "VendorStyleIdentifier")
    protected Long vendorStyleIdentifier;
    @XmlAttribute(name = "WatchClockMovementCode")
    protected String watchClockMovementCode;
    @XmlAttribute(name = "WickCountQuantity")
    protected Long wickCountQuantity;
    @XmlAttribute(name = "WindowTreatmentTopConstructionCodeM")
    protected String windowTreatmentTopConstructionCodeM;

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceValueType }
     *     
     */
    public ReferenceValueType getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceValueType }
     *     
     */
    public void setCategory(ReferenceValueType value) {
        this.category = value;
    }

    /**
     * Gets the value of the fashionPyramid property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceValueType }
     *     
     */
    public ReferenceValueType getFashionPyramid() {
        return fashionPyramid;
    }

    /**
     * Sets the value of the fashionPyramid property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceValueType }
     *     
     */
    public void setFashionPyramid(ReferenceValueType value) {
        this.fashionPyramid = value;
    }

    /**
     * Gets the value of the priceComparative property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceValueType }
     *     
     */
    public ReferenceValueType getPriceComparative() {
        return priceComparative;
    }

    /**
     * Sets the value of the priceComparative property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceValueType }
     *     
     */
    public void setPriceComparative(ReferenceValueType value) {
        this.priceComparative = value;
    }

    /**
     * Gets the value of the consumerPersonaCategoryM property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueListType }{@code >}
     *     
     */
    public JAXBElement<ReferenceValueListType> getConsumerPersonaCategoryM() {
        return consumerPersonaCategoryM;
    }

    /**
     * Sets the value of the consumerPersonaCategoryM property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueListType }{@code >}
     *     
     */
    public void setConsumerPersonaCategoryM(JAXBElement<ReferenceValueListType> value) {
        this.consumerPersonaCategoryM = value;
    }

    /**
     * Gets the value of the consumerPersonaGroupM property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueListType }{@code >}
     *     
     */
    public JAXBElement<ReferenceValueListType> getConsumerPersonaGroupM() {
        return consumerPersonaGroupM;
    }

    /**
     * Sets the value of the consumerPersonaGroupM property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueListType }{@code >}
     *     
     */
    public void setConsumerPersonaGroupM(JAXBElement<ReferenceValueListType> value) {
        this.consumerPersonaGroupM = value;
    }

    /**
     * Gets the value of the consumerPersonaSubjectM property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueListType }{@code >}
     *     
     */
    public JAXBElement<ReferenceValueListType> getConsumerPersonaSubjectM() {
        return consumerPersonaSubjectM;
    }

    /**
     * Sets the value of the consumerPersonaSubjectM property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueListType }{@code >}
     *     
     */
    public void setConsumerPersonaSubjectM(JAXBElement<ReferenceValueListType> value) {
        this.consumerPersonaSubjectM = value;
    }

    /**
     * Gets the value of the consumerPersonaThemeM property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueListType }{@code >}
     *     
     */
    public JAXBElement<ReferenceValueListType> getConsumerPersonaThemeM() {
        return consumerPersonaThemeM;
    }

    /**
     * Sets the value of the consumerPersonaThemeM property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueListType }{@code >}
     *     
     */
    public void setConsumerPersonaThemeM(JAXBElement<ReferenceValueListType> value) {
        this.consumerPersonaThemeM = value;
    }

    /**
     * Gets the value of the consumerFit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueType }{@code >}
     *     
     */
    public JAXBElement<ReferenceValueType> getConsumerFit() {
        return consumerFit;
    }

    /**
     * Sets the value of the consumerFit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueType }{@code >}
     *     
     */
    public void setConsumerFit(JAXBElement<ReferenceValueType> value) {
        this.consumerFit = value;
    }

    /**
     * Gets the value of the consumerLength property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueType }{@code >}
     *     
     */
    public JAXBElement<ReferenceValueType> getConsumerLength() {
        return consumerLength;
    }

    /**
     * Sets the value of the consumerLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueType }{@code >}
     *     
     */
    public void setConsumerLength(JAXBElement<ReferenceValueType> value) {
        this.consumerLength = value;
    }

    /**
     * Gets the value of the consumerLegOpening property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueType }{@code >}
     *     
     */
    public JAXBElement<ReferenceValueType> getConsumerLegOpening() {
        return consumerLegOpening;
    }

    /**
     * Sets the value of the consumerLegOpening property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueType }{@code >}
     *     
     */
    public void setConsumerLegOpening(JAXBElement<ReferenceValueType> value) {
        this.consumerLegOpening = value;
    }

    /**
     * Gets the value of the consumerRise property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueType }{@code >}
     *     
     */
    public JAXBElement<ReferenceValueType> getConsumerRise() {
        return consumerRise;
    }

    /**
     * Sets the value of the consumerRise property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueType }{@code >}
     *     
     */
    public void setConsumerRise(JAXBElement<ReferenceValueType> value) {
        this.consumerRise = value;
    }

    /**
     * Gets the value of the consumerPantFront property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueType }{@code >}
     *     
     */
    public JAXBElement<ReferenceValueType> getConsumerPantFront() {
        return consumerPantFront;
    }

    /**
     * Sets the value of the consumerPantFront property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueType }{@code >}
     *     
     */
    public void setConsumerPantFront(JAXBElement<ReferenceValueType> value) {
        this.consumerPantFront = value;
    }

    /**
     * Gets the value of the consumerSilhouetteM property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueListType }{@code >}
     *     
     */
    public JAXBElement<ReferenceValueListType> getConsumerSilhouetteM() {
        return consumerSilhouetteM;
    }

    /**
     * Sets the value of the consumerSilhouetteM property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueListType }{@code >}
     *     
     */
    public void setConsumerSilhouetteM(JAXBElement<ReferenceValueListType> value) {
        this.consumerSilhouetteM = value;
    }

    /**
     * Gets the value of the consumerNecklineM property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueListType }{@code >}
     *     
     */
    public JAXBElement<ReferenceValueListType> getConsumerNecklineM() {
        return consumerNecklineM;
    }

    /**
     * Sets the value of the consumerNecklineM property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueListType }{@code >}
     *     
     */
    public void setConsumerNecklineM(JAXBElement<ReferenceValueListType> value) {
        this.consumerNecklineM = value;
    }

    /**
     * Gets the value of the consumerSleeveLength property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueType }{@code >}
     *     
     */
    public JAXBElement<ReferenceValueType> getConsumerSleeveLength() {
        return consumerSleeveLength;
    }

    /**
     * Sets the value of the consumerSleeveLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueType }{@code >}
     *     
     */
    public void setConsumerSleeveLength(JAXBElement<ReferenceValueType> value) {
        this.consumerSleeveLength = value;
    }

    /**
     * Gets the value of the consumerClosureM property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueListType }{@code >}
     *     
     */
    public JAXBElement<ReferenceValueListType> getConsumerClosureM() {
        return consumerClosureM;
    }

    /**
     * Sets the value of the consumerClosureM property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueListType }{@code >}
     *     
     */
    public void setConsumerClosureM(JAXBElement<ReferenceValueListType> value) {
        this.consumerClosureM = value;
    }

    /**
     * Gets the value of the customerBodyCharacteristicM property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueListType }{@code >}
     *     
     */
    public JAXBElement<ReferenceValueListType> getCustomerBodyCharacteristicM() {
        return customerBodyCharacteristicM;
    }

    /**
     * Sets the value of the customerBodyCharacteristicM property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueListType }{@code >}
     *     
     */
    public void setCustomerBodyCharacteristicM(JAXBElement<ReferenceValueListType> value) {
        this.customerBodyCharacteristicM = value;
    }

    /**
     * Gets the value of the consumerMaterialM property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueListType }{@code >}
     *     
     */
    public JAXBElement<ReferenceValueListType> getConsumerMaterialM() {
        return consumerMaterialM;
    }

    /**
     * Sets the value of the consumerMaterialM property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueListType }{@code >}
     *     
     */
    public void setConsumerMaterialM(JAXBElement<ReferenceValueListType> value) {
        this.consumerMaterialM = value;
    }

    /**
     * Gets the value of the consumerFillMaterialM property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueListType }{@code >}
     *     
     */
    public JAXBElement<ReferenceValueListType> getConsumerFillMaterialM() {
        return consumerFillMaterialM;
    }

    /**
     * Sets the value of the consumerFillMaterialM property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueListType }{@code >}
     *     
     */
    public void setConsumerFillMaterialM(JAXBElement<ReferenceValueListType> value) {
        this.consumerFillMaterialM = value;
    }

    /**
     * Gets the value of the consumerCareInstructionsM property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueListType }{@code >}
     *     
     */
    public JAXBElement<ReferenceValueListType> getConsumerCareInstructionsM() {
        return consumerCareInstructionsM;
    }

    /**
     * Sets the value of the consumerCareInstructionsM property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueListType }{@code >}
     *     
     */
    public void setConsumerCareInstructionsM(JAXBElement<ReferenceValueListType> value) {
        this.consumerCareInstructionsM = value;
    }

    /**
     * Gets the value of the consumerOccasionM property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueListType }{@code >}
     *     
     */
    public JAXBElement<ReferenceValueListType> getConsumerOccasionM() {
        return consumerOccasionM;
    }

    /**
     * Sets the value of the consumerOccasionM property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueListType }{@code >}
     *     
     */
    public void setConsumerOccasionM(JAXBElement<ReferenceValueListType> value) {
        this.consumerOccasionM = value;
    }

    /**
     * Gets the value of the consumerHandleStyleM property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueListType }{@code >}
     *     
     */
    public JAXBElement<ReferenceValueListType> getConsumerHandleStyleM() {
        return consumerHandleStyleM;
    }

    /**
     * Sets the value of the consumerHandleStyleM property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueListType }{@code >}
     *     
     */
    public void setConsumerHandleStyleM(JAXBElement<ReferenceValueListType> value) {
        this.consumerHandleStyleM = value;
    }

    /**
     * Gets the value of the heelHeightUOM property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueType }{@code >}
     *     
     */
    public JAXBElement<ReferenceValueType> getHeelHeightUOM() {
        return heelHeightUOM;
    }

    /**
     * Sets the value of the heelHeightUOM property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueType }{@code >}
     *     
     */
    public void setHeelHeightUOM(JAXBElement<ReferenceValueType> value) {
        this.heelHeightUOM = value;
    }

    /**
     * Gets the value of the bootShaftCharacteristicM property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueListType }{@code >}
     *     
     */
    public JAXBElement<ReferenceValueListType> getBootShaftCharacteristicM() {
        return bootShaftCharacteristicM;
    }

    /**
     * Sets the value of the bootShaftCharacteristicM property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueListType }{@code >}
     *     
     */
    public void setBootShaftCharacteristicM(JAXBElement<ReferenceValueListType> value) {
        this.bootShaftCharacteristicM = value;
    }

    /**
     * Gets the value of the genderM property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueListType }{@code >}
     *     
     */
    public JAXBElement<ReferenceValueListType> getGenderM() {
        return genderM;
    }

    /**
     * Sets the value of the genderM property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueListType }{@code >}
     *     
     */
    public void setGenderM(JAXBElement<ReferenceValueListType> value) {
        this.genderM = value;
    }

    /**
     * Gets the value of the displaySizeUOM property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueType }{@code >}
     *     
     */
    public JAXBElement<ReferenceValueType> getDisplaySizeUOM() {
        return displaySizeUOM;
    }

    /**
     * Sets the value of the displaySizeUOM property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueType }{@code >}
     *     
     */
    public void setDisplaySizeUOM(JAXBElement<ReferenceValueType> value) {
        this.displaySizeUOM = value;
    }

    /**
     * Gets the value of the displayResolution property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueType }{@code >}
     *     
     */
    public JAXBElement<ReferenceValueType> getDisplayResolution() {
        return displayResolution;
    }

    /**
     * Sets the value of the displayResolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueType }{@code >}
     *     
     */
    public void setDisplayResolution(JAXBElement<ReferenceValueType> value) {
        this.displayResolution = value;
    }

    /**
     * Gets the value of the electronicStorageCapacityUOM property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueType }{@code >}
     *     
     */
    public JAXBElement<ReferenceValueType> getElectronicStorageCapacityUOM() {
        return electronicStorageCapacityUOM;
    }

    /**
     * Sets the value of the electronicStorageCapacityUOM property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueType }{@code >}
     *     
     */
    public void setElectronicStorageCapacityUOM(JAXBElement<ReferenceValueType> value) {
        this.electronicStorageCapacityUOM = value;
    }

    /**
     * Gets the value of the metalCaratM property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueListType }{@code >}
     *     
     */
    public JAXBElement<ReferenceValueListType> getMetalCaratM() {
        return metalCaratM;
    }

    /**
     * Sets the value of the metalCaratM property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueListType }{@code >}
     *     
     */
    public void setMetalCaratM(JAXBElement<ReferenceValueListType> value) {
        this.metalCaratM = value;
    }

    /**
     * Gets the value of the gemstoneCarat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueType }{@code >}
     *     
     */
    public JAXBElement<ReferenceValueType> getGemstoneCarat() {
        return gemstoneCarat;
    }

    /**
     * Sets the value of the gemstoneCarat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueType }{@code >}
     *     
     */
    public void setGemstoneCarat(JAXBElement<ReferenceValueType> value) {
        this.gemstoneCarat = value;
    }

    /**
     * Gets the value of the diamondColorGradeM property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueListType }{@code >}
     *     
     */
    public JAXBElement<ReferenceValueListType> getDiamondColorGradeM() {
        return diamondColorGradeM;
    }

    /**
     * Sets the value of the diamondColorGradeM property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueListType }{@code >}
     *     
     */
    public void setDiamondColorGradeM(JAXBElement<ReferenceValueListType> value) {
        this.diamondColorGradeM = value;
    }

    /**
     * Gets the value of the diamondClarityGradeM property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueListType }{@code >}
     *     
     */
    public JAXBElement<ReferenceValueListType> getDiamondClarityGradeM() {
        return diamondClarityGradeM;
    }

    /**
     * Sets the value of the diamondClarityGradeM property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueListType }{@code >}
     *     
     */
    public void setDiamondClarityGradeM(JAXBElement<ReferenceValueListType> value) {
        this.diamondClarityGradeM = value;
    }

    /**
     * Gets the value of the kohlsSpecialSKUType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueType }{@code >}
     *     
     */
    public JAXBElement<ReferenceValueType> getKohlsSpecialSKUType() {
        return kohlsSpecialSKUType;
    }

    /**
     * Sets the value of the kohlsSpecialSKUType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueType }{@code >}
     *     
     */
    public void setKohlsSpecialSKUType(JAXBElement<ReferenceValueType> value) {
        this.kohlsSpecialSKUType = value;
    }

    /**
     * Gets the value of the devicePlatformM property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueListType }{@code >}
     *     
     */
    public JAXBElement<ReferenceValueListType> getDevicePlatformM() {
        return devicePlatformM;
    }

    /**
     * Sets the value of the devicePlatformM property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueListType }{@code >}
     *     
     */
    public void setDevicePlatformM(JAXBElement<ReferenceValueListType> value) {
        this.devicePlatformM = value;
    }

    /**
     * Gets the value of the beverageTypeM property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueListType }{@code >}
     *     
     */
    public JAXBElement<ReferenceValueListType> getBeverageTypeM() {
        return beverageTypeM;
    }

    /**
     * Sets the value of the beverageTypeM property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueListType }{@code >}
     *     
     */
    public void setBeverageTypeM(JAXBElement<ReferenceValueListType> value) {
        this.beverageTypeM = value;
    }

    /**
     * Gets the value of the firmnessRatingM property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueListType }{@code >}
     *     
     */
    public JAXBElement<ReferenceValueListType> getFirmnessRatingM() {
        return firmnessRatingM;
    }

    /**
     * Sets the value of the firmnessRatingM property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueListType }{@code >}
     *     
     */
    public void setFirmnessRatingM(JAXBElement<ReferenceValueListType> value) {
        this.firmnessRatingM = value;
    }

    /**
     * Gets the value of the upfRating property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueType }{@code >}
     *     
     */
    public JAXBElement<ReferenceValueType> getUPFRating() {
        return upfRating;
    }

    /**
     * Sets the value of the upfRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueType }{@code >}
     *     
     */
    public void setUPFRating(JAXBElement<ReferenceValueType> value) {
        this.upfRating = value;
    }

    /**
     * Gets the value of the bodySupportRatingM property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueListType }{@code >}
     *     
     */
    public JAXBElement<ReferenceValueListType> getBodySupportRatingM() {
        return bodySupportRatingM;
    }

    /**
     * Sets the value of the bodySupportRatingM property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueListType }{@code >}
     *     
     */
    public void setBodySupportRatingM(JAXBElement<ReferenceValueListType> value) {
        this.bodySupportRatingM = value;
    }

    /**
     * Gets the value of the materialWeightRatingM property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueListType }{@code >}
     *     
     */
    public JAXBElement<ReferenceValueListType> getMaterialWeightRatingM() {
        return materialWeightRatingM;
    }

    /**
     * Sets the value of the materialWeightRatingM property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueListType }{@code >}
     *     
     */
    public void setMaterialWeightRatingM(JAXBElement<ReferenceValueListType> value) {
        this.materialWeightRatingM = value;
    }

    /**
     * Gets the value of the ageCategoryM property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueListType }{@code >}
     *     
     */
    public JAXBElement<ReferenceValueListType> getAgeCategoryM() {
        return ageCategoryM;
    }

    /**
     * Sets the value of the ageCategoryM property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueListType }{@code >}
     *     
     */
    public void setAgeCategoryM(JAXBElement<ReferenceValueListType> value) {
        this.ageCategoryM = value;
    }

    /**
     * Gets the value of the appropriateAgeRangeM property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueListType }{@code >}
     *     
     */
    public JAXBElement<ReferenceValueListType> getAppropriateAgeRangeM() {
        return appropriateAgeRangeM;
    }

    /**
     * Sets the value of the appropriateAgeRangeM property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueListType }{@code >}
     *     
     */
    public void setAppropriateAgeRangeM(JAXBElement<ReferenceValueListType> value) {
        this.appropriateAgeRangeM = value;
    }

    /**
     * Gets the value of the roomM property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueListType }{@code >}
     *     
     */
    public JAXBElement<ReferenceValueListType> getRoomM() {
        return roomM;
    }

    /**
     * Sets the value of the roomM property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueListType }{@code >}
     *     
     */
    public void setRoomM(JAXBElement<ReferenceValueListType> value) {
        this.roomM = value;
    }

    /**
     * Gets the value of the recommendedUsageM property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueListType }{@code >}
     *     
     */
    public JAXBElement<ReferenceValueListType> getRecommendedUsageM() {
        return recommendedUsageM;
    }

    /**
     * Sets the value of the recommendedUsageM property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueListType }{@code >}
     *     
     */
    public void setRecommendedUsageM(JAXBElement<ReferenceValueListType> value) {
        this.recommendedUsageM = value;
    }

    /**
     * Gets the value of the watchClockMovement property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueType }{@code >}
     *     
     */
    public JAXBElement<ReferenceValueType> getWatchClockMovement() {
        return watchClockMovement;
    }

    /**
     * Sets the value of the watchClockMovement property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueType }{@code >}
     *     
     */
    public void setWatchClockMovement(JAXBElement<ReferenceValueType> value) {
        this.watchClockMovement = value;
    }

    /**
     * Gets the value of the fraudRisk property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueType }{@code >}
     *     
     */
    public JAXBElement<ReferenceValueType> getFraudRisk() {
        return fraudRisk;
    }

    /**
     * Sets the value of the fraudRisk property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueType }{@code >}
     *     
     */
    public void setFraudRisk(JAXBElement<ReferenceValueType> value) {
        this.fraudRisk = value;
    }

    /**
     * Gets the value of the taxwareProduct property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueType }{@code >}
     *     
     */
    public JAXBElement<ReferenceValueType> getTaxwareProduct() {
        return taxwareProduct;
    }

    /**
     * Sets the value of the taxwareProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueType }{@code >}
     *     
     */
    public void setTaxwareProduct(JAXBElement<ReferenceValueType> value) {
        this.taxwareProduct = value;
    }

    /**
     * Gets the value of the productType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueType }{@code >}
     *     
     */
    public JAXBElement<ReferenceValueType> getProductType() {
        return productType;
    }

    /**
     * Sets the value of the productType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueType }{@code >}
     *     
     */
    public void setProductType(JAXBElement<ReferenceValueType> value) {
        this.productType = value;
    }

    /**
     * Gets the value of the productSubtype property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueType }{@code >}
     *     
     */
    public JAXBElement<ReferenceValueType> getProductSubtype() {
        return productSubtype;
    }

    /**
     * Sets the value of the productSubtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueType }{@code >}
     *     
     */
    public void setProductSubtype(JAXBElement<ReferenceValueType> value) {
        this.productSubtype = value;
    }

    /**
     * Gets the value of the brand property.
     * 
     * @return
     *     possible object is
     *     {@link BrandType }
     *     
     */
    public BrandType getBrand() {
        return brand;
    }

    /**
     * Sets the value of the brand property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrandType }
     *     
     */
    public void setBrand(BrandType value) {
        this.brand = value;
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
     * Gets the value of the majorCategory property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceValueType }
     *     
     */
    public ReferenceValueType getMajorCategory() {
        return majorCategory;
    }

    /**
     * Sets the value of the majorCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceValueType }
     *     
     */
    public void setMajorCategory(ReferenceValueType value) {
        this.majorCategory = value;
    }

    /**
     * Gets the value of the fillMaterial property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceValueType }
     *     
     */
    public ReferenceValueType getFillMaterial() {
        return fillMaterial;
    }

    /**
     * Sets the value of the fillMaterial property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceValueType }
     *     
     */
    public void setFillMaterial(ReferenceValueType value) {
        this.fillMaterial = value;
    }

    /**
     * Gets the value of the fit property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceValueType }
     *     
     */
    public ReferenceValueType getFit() {
        return fit;
    }

    /**
     * Sets the value of the fit property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceValueType }
     *     
     */
    public void setFit(ReferenceValueType value) {
        this.fit = value;
    }

    /**
     * Gets the value of the legOpening property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceValueType }
     *     
     */
    public ReferenceValueType getLegOpening() {
        return legOpening;
    }

    /**
     * Sets the value of the legOpening property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceValueType }
     *     
     */
    public void setLegOpening(ReferenceValueType value) {
        this.legOpening = value;
    }

    /**
     * Gets the value of the length property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceValueType }
     *     
     */
    public ReferenceValueType getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceValueType }
     *     
     */
    public void setLength(ReferenceValueType value) {
        this.length = value;
    }

    /**
     * Gets the value of the neckline property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceValueType }
     *     
     */
    public ReferenceValueType getNeckline() {
        return neckline;
    }

    /**
     * Sets the value of the neckline property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceValueType }
     *     
     */
    public void setNeckline(ReferenceValueType value) {
        this.neckline = value;
    }

    /**
     * Gets the value of the pantFront property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceValueType }
     *     
     */
    public ReferenceValueType getPantFront() {
        return pantFront;
    }

    /**
     * Sets the value of the pantFront property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceValueType }
     *     
     */
    public void setPantFront(ReferenceValueType value) {
        this.pantFront = value;
    }

    /**
     * Gets the value of the sleeveLength property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceValueType }
     *     
     */
    public ReferenceValueType getSleeveLength() {
        return sleeveLength;
    }

    /**
     * Sets the value of the sleeveLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceValueType }
     *     
     */
    public void setSleeveLength(ReferenceValueType value) {
        this.sleeveLength = value;
    }

    /**
     * Gets the value of the material property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceValueType }
     *     
     */
    public ReferenceValueType getMaterial() {
        return material;
    }

    /**
     * Sets the value of the material property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceValueType }
     *     
     */
    public void setMaterial(ReferenceValueType value) {
        this.material = value;
    }

    /**
     * Gets the value of the silhouette property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceValueType }
     *     
     */
    public ReferenceValueType getSilhouette() {
        return silhouette;
    }

    /**
     * Sets the value of the silhouette property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceValueType }
     *     
     */
    public void setSilhouette(ReferenceValueType value) {
        this.silhouette = value;
    }

    /**
     * Gets the value of the keyClassfication property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceValueType }
     *     
     */
    public ReferenceValueType getKeyClassfication() {
        return keyClassfication;
    }

    /**
     * Sets the value of the keyClassfication property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceValueType }
     *     
     */
    public void setKeyClassfication(ReferenceValueType value) {
        this.keyClassfication = value;
    }

    /**
     * Gets the value of the ticketType property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceValueType }
     *     
     */
    public ReferenceValueType getTicketType() {
        return ticketType;
    }

    /**
     * Sets the value of the ticketType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceValueType }
     *     
     */
    public void setTicketType(ReferenceValueType value) {
        this.ticketType = value;
    }

    /**
     * Gets the value of the hangFold property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceValueType }
     *     
     */
    public ReferenceValueType getHangFold() {
        return hangFold;
    }

    /**
     * Sets the value of the hangFold property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceValueType }
     *     
     */
    public void setHangFold(ReferenceValueType value) {
        this.hangFold = value;
    }

    /**
     * Gets the value of the productPrimaryType property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceValueType }
     *     
     */
    public ReferenceValueType getProductPrimaryType() {
        return productPrimaryType;
    }

    /**
     * Sets the value of the productPrimaryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceValueType }
     *     
     */
    public void setProductPrimaryType(ReferenceValueType value) {
        this.productPrimaryType = value;
    }

    /**
     * Gets the value of the reportingLabelM property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceValueListType }
     *     
     */
    public ReferenceValueListType getReportingLabelM() {
        return reportingLabelM;
    }

    /**
     * Sets the value of the reportingLabelM property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceValueListType }
     *     
     */
    public void setReportingLabelM(ReferenceValueListType value) {
        this.reportingLabelM = value;
    }

    /**
     * Gets the value of the valueInitiativeM property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceValueListType }
     *     
     */
    public ReferenceValueListType getValueInitiativeM() {
        return valueInitiativeM;
    }

    /**
     * Sets the value of the valueInitiativeM property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceValueListType }
     *     
     */
    public void setValueInitiativeM(ReferenceValueListType value) {
        this.valueInitiativeM = value;
    }

    /**
     * Gets the value of the setPieceSellableUnit property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceValueType }
     *     
     */
    public ReferenceValueType getSetPieceSellableUnit() {
        return setPieceSellableUnit;
    }

    /**
     * Sets the value of the setPieceSellableUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceValueType }
     *     
     */
    public void setSetPieceSellableUnit(ReferenceValueType value) {
        this.setPieceSellableUnit = value;
    }

    /**
     * Gets the value of the mattressThicknessUOM property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceValueType }
     *     
     */
    public ReferenceValueType getMattressThicknessUOM() {
        return mattressThicknessUOM;
    }

    /**
     * Sets the value of the mattressThicknessUOM property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceValueType }
     *     
     */
    public void setMattressThicknessUOM(ReferenceValueType value) {
        this.mattressThicknessUOM = value;
    }

    /**
     * Gets the value of the windowTreatmentTopConstructionM property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceValueListType }
     *     
     */
    public ReferenceValueListType getWindowTreatmentTopConstructionM() {
        return windowTreatmentTopConstructionM;
    }

    /**
     * Sets the value of the windowTreatmentTopConstructionM property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceValueListType }
     *     
     */
    public void setWindowTreatmentTopConstructionM(ReferenceValueListType value) {
        this.windowTreatmentTopConstructionM = value;
    }

    /**
     * Gets the value of the mediaRatingM property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceValueListType }
     *     
     */
    public ReferenceValueListType getMediaRatingM() {
        return mediaRatingM;
    }

    /**
     * Sets the value of the mediaRatingM property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceValueListType }
     *     
     */
    public void setMediaRatingM(ReferenceValueListType value) {
        this.mediaRatingM = value;
    }

    /**
     * Gets the value of the exclusionM property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceValueListType }
     *     
     */
    public ReferenceValueListType getExclusionM() {
        return exclusionM;
    }

    /**
     * Sets the value of the exclusionM property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceValueListType }
     *     
     */
    public void setExclusionM(ReferenceValueListType value) {
        this.exclusionM = value;
    }

    /**
     * Gets the value of the petTypeM property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceValueListType }
     *     
     */
    public ReferenceValueListType getPetTypeM() {
        return petTypeM;
    }

    /**
     * Sets the value of the petTypeM property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceValueListType }
     *     
     */
    public void setPetTypeM(ReferenceValueListType value) {
        this.petTypeM = value;
    }

    /**
     * Gets the value of the cupCoverage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueType }{@code >}
     *     
     */
    public JAXBElement<ReferenceValueType> getCupCoverage() {
        return cupCoverage;
    }

    /**
     * Sets the value of the cupCoverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueType }{@code >}
     *     
     */
    public void setCupCoverage(JAXBElement<ReferenceValueType> value) {
        this.cupCoverage = value;
    }

    /**
     * Gets the value of the cupType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueType }{@code >}
     *     
     */
    public JAXBElement<ReferenceValueType> getCupType() {
        return cupType;
    }

    /**
     * Sets the value of the cupType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueType }{@code >}
     *     
     */
    public void setCupType(JAXBElement<ReferenceValueType> value) {
        this.cupType = value;
    }

    /**
     * Gets the value of the cuffType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueType }{@code >}
     *     
     */
    public JAXBElement<ReferenceValueType> getCuffType() {
        return cuffType;
    }

    /**
     * Sets the value of the cuffType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueType }{@code >}
     *     
     */
    public void setCuffType(JAXBElement<ReferenceValueType> value) {
        this.cuffType = value;
    }

    /**
     * Gets the value of the pocketType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueType }{@code >}
     *     
     */
    public JAXBElement<ReferenceValueType> getPocketType() {
        return pocketType;
    }

    /**
     * Sets the value of the pocketType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueType }{@code >}
     *     
     */
    public void setPocketType(JAXBElement<ReferenceValueType> value) {
        this.pocketType = value;
    }

    /**
     * Gets the value of the sheerness property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueType }{@code >}
     *     
     */
    public JAXBElement<ReferenceValueType> getSheerness() {
        return sheerness;
    }

    /**
     * Sets the value of the sheerness property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueType }{@code >}
     *     
     */
    public void setSheerness(JAXBElement<ReferenceValueType> value) {
        this.sheerness = value;
    }

    /**
     * Gets the value of the strapType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueType }{@code >}
     *     
     */
    public JAXBElement<ReferenceValueType> getStrapType() {
        return strapType;
    }

    /**
     * Sets the value of the strapType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueType }{@code >}
     *     
     */
    public void setStrapType(JAXBElement<ReferenceValueType> value) {
        this.strapType = value;
    }

    /**
     * Gets the value of the saleablePackageType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueType }{@code >}
     *     
     */
    public JAXBElement<ReferenceValueType> getSaleablePackageType() {
        return saleablePackageType;
    }

    /**
     * Sets the value of the saleablePackageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueType }{@code >}
     *     
     */
    public void setSaleablePackageType(JAXBElement<ReferenceValueType> value) {
        this.saleablePackageType = value;
    }

    /**
     * Gets the value of the secondaryProductShape property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueType }{@code >}
     *     
     */
    public JAXBElement<ReferenceValueType> getSecondaryProductShape() {
        return secondaryProductShape;
    }

    /**
     * Sets the value of the secondaryProductShape property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueType }{@code >}
     *     
     */
    public void setSecondaryProductShape(JAXBElement<ReferenceValueType> value) {
        this.secondaryProductShape = value;
    }

    /**
     * Gets the value of the primaryToeCharacteristic property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueType }{@code >}
     *     
     */
    public JAXBElement<ReferenceValueType> getPrimaryToeCharacteristic() {
        return primaryToeCharacteristic;
    }

    /**
     * Sets the value of the primaryToeCharacteristic property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueType }{@code >}
     *     
     */
    public void setPrimaryToeCharacteristic(JAXBElement<ReferenceValueType> value) {
        this.primaryToeCharacteristic = value;
    }

    /**
     * Gets the value of the closure property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueType }{@code >}
     *     
     */
    public JAXBElement<ReferenceValueType> getClosure() {
        return closure;
    }

    /**
     * Sets the value of the closure property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueType }{@code >}
     *     
     */
    public void setClosure(JAXBElement<ReferenceValueType> value) {
        this.closure = value;
    }

    /**
     * Gets the value of the gemstoneCut property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueType }{@code >}
     *     
     */
    public JAXBElement<ReferenceValueType> getGemstoneCut() {
        return gemstoneCut;
    }

    /**
     * Sets the value of the gemstoneCut property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueType }{@code >}
     *     
     */
    public void setGemstoneCut(JAXBElement<ReferenceValueType> value) {
        this.gemstoneCut = value;
    }

    /**
     * Gets the value of the occasionPurpose property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueType }{@code >}
     *     
     */
    public JAXBElement<ReferenceValueType> getOccasionPurpose() {
        return occasionPurpose;
    }

    /**
     * Sets the value of the occasionPurpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueType }{@code >}
     *     
     */
    public void setOccasionPurpose(JAXBElement<ReferenceValueType> value) {
        this.occasionPurpose = value;
    }

    /**
     * Gets the value of the property property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueType }{@code >}
     *     
     */
    public JAXBElement<ReferenceValueType> getProperty() {
        return property;
    }

    /**
     * Sets the value of the property property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueType }{@code >}
     *     
     */
    public void setProperty(JAXBElement<ReferenceValueType> value) {
        this.property = value;
    }

    /**
     * Gets the value of the theme property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueType }{@code >}
     *     
     */
    public JAXBElement<ReferenceValueType> getTheme() {
        return theme;
    }

    /**
     * Sets the value of the theme property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueType }{@code >}
     *     
     */
    public void setTheme(JAXBElement<ReferenceValueType> value) {
        this.theme = value;
    }

    /**
     * Gets the value of the bodyCharacteristic property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueType }{@code >}
     *     
     */
    public JAXBElement<ReferenceValueType> getBodyCharacteristic() {
        return bodyCharacteristic;
    }

    /**
     * Sets the value of the bodyCharacteristic property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueType }{@code >}
     *     
     */
    public void setBodyCharacteristic(JAXBElement<ReferenceValueType> value) {
        this.bodyCharacteristic = value;
    }

    /**
     * Gets the value of the sourceSystem property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueType }{@code >}
     *     
     */
    public JAXBElement<ReferenceValueType> getSourceSystem() {
        return sourceSystem;
    }

    /**
     * Sets the value of the sourceSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReferenceValueType }{@code >}
     *     
     */
    public void setSourceSystem(JAXBElement<ReferenceValueType> value) {
        this.sourceSystem = value;
    }

    /**
     * Gets the value of the ageCategoryCodeM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgeCategoryCodeM() {
        return ageCategoryCodeM;
    }

    /**
     * Sets the value of the ageCategoryCodeM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgeCategoryCodeM(String value) {
        this.ageCategoryCodeM = value;
    }

    /**
     * Gets the value of the appropriateAgeRangeCodeM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppropriateAgeRangeCodeM() {
        return appropriateAgeRangeCodeM;
    }

    /**
     * Sets the value of the appropriateAgeRangeCodeM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppropriateAgeRangeCodeM(String value) {
        this.appropriateAgeRangeCodeM = value;
    }

    /**
     * Gets the value of the beverageTypeCodeM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeverageTypeCodeM() {
        return beverageTypeCodeM;
    }

    /**
     * Sets the value of the beverageTypeCodeM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeverageTypeCodeM(String value) {
        this.beverageTypeCodeM = value;
    }

    /**
     * Gets the value of the bodyCharacteristicCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBodyCharacteristicCode() {
        return bodyCharacteristicCode;
    }

    /**
     * Sets the value of the bodyCharacteristicCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBodyCharacteristicCode(String value) {
        this.bodyCharacteristicCode = value;
    }

    /**
     * Gets the value of the bodySupportRatingCodeM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBodySupportRatingCodeM() {
        return bodySupportRatingCodeM;
    }

    /**
     * Sets the value of the bodySupportRatingCodeM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBodySupportRatingCodeM(String value) {
        this.bodySupportRatingCodeM = value;
    }

    /**
     * Gets the value of the bootShaftCharacteristicCodeM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBootShaftCharacteristicCodeM() {
        return bootShaftCharacteristicCodeM;
    }

    /**
     * Sets the value of the bootShaftCharacteristicCodeM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBootShaftCharacteristicCodeM(String value) {
        this.bootShaftCharacteristicCodeM = value;
    }

    /**
     * Gets the value of the brandIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBrandIdentifier() {
        return brandIdentifier;
    }

    /**
     * Sets the value of the brandIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBrandIdentifier(Long value) {
        this.brandIdentifier = value;
    }

    /**
     * Gets the value of the categoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryCode() {
        return categoryCode;
    }

    /**
     * Sets the value of the categoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryCode(String value) {
        this.categoryCode = value;
    }

    /**
     * Gets the value of the chokingHazardIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChokingHazardIndicator() {
        return chokingHazardIndicator;
    }

    /**
     * Sets the value of the chokingHazardIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChokingHazardIndicator(String value) {
        this.chokingHazardIndicator = value;
    }

    /**
     * Gets the value of the classNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassNumber() {
        return classNumber;
    }

    /**
     * Sets the value of the classNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassNumber(String value) {
        this.classNumber = value;
    }

    /**
     * Gets the value of the closureCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClosureCode() {
        return closureCode;
    }

    /**
     * Sets the value of the closureCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClosureCode(String value) {
        this.closureCode = value;
    }

    /**
     * Gets the value of the consumerCareInstructionsCodeM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumerCareInstructionsCodeM() {
        return consumerCareInstructionsCodeM;
    }

    /**
     * Sets the value of the consumerCareInstructionsCodeM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerCareInstructionsCodeM(String value) {
        this.consumerCareInstructionsCodeM = value;
    }

    /**
     * Gets the value of the consumerClosureCodeM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumerClosureCodeM() {
        return consumerClosureCodeM;
    }

    /**
     * Sets the value of the consumerClosureCodeM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerClosureCodeM(String value) {
        this.consumerClosureCodeM = value;
    }

    /**
     * Gets the value of the consumerFillMaterialCodeM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumerFillMaterialCodeM() {
        return consumerFillMaterialCodeM;
    }

    /**
     * Sets the value of the consumerFillMaterialCodeM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerFillMaterialCodeM(String value) {
        this.consumerFillMaterialCodeM = value;
    }

    /**
     * Gets the value of the consumerFitCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumerFitCode() {
        return consumerFitCode;
    }

    /**
     * Sets the value of the consumerFitCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerFitCode(String value) {
        this.consumerFitCode = value;
    }

    /**
     * Gets the value of the consumerHandleStyleCodeM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumerHandleStyleCodeM() {
        return consumerHandleStyleCodeM;
    }

    /**
     * Sets the value of the consumerHandleStyleCodeM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerHandleStyleCodeM(String value) {
        this.consumerHandleStyleCodeM = value;
    }

    /**
     * Gets the value of the consumerLegOpeningCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumerLegOpeningCode() {
        return consumerLegOpeningCode;
    }

    /**
     * Sets the value of the consumerLegOpeningCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerLegOpeningCode(String value) {
        this.consumerLegOpeningCode = value;
    }

    /**
     * Gets the value of the consumerLengthCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumerLengthCode() {
        return consumerLengthCode;
    }

    /**
     * Sets the value of the consumerLengthCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerLengthCode(String value) {
        this.consumerLengthCode = value;
    }

    /**
     * Gets the value of the consumerMaterialCodeM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumerMaterialCodeM() {
        return consumerMaterialCodeM;
    }

    /**
     * Sets the value of the consumerMaterialCodeM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerMaterialCodeM(String value) {
        this.consumerMaterialCodeM = value;
    }

    /**
     * Gets the value of the consumerNecklineCodeM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumerNecklineCodeM() {
        return consumerNecklineCodeM;
    }

    /**
     * Sets the value of the consumerNecklineCodeM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerNecklineCodeM(String value) {
        this.consumerNecklineCodeM = value;
    }

    /**
     * Gets the value of the consumerOccasionCodeM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumerOccasionCodeM() {
        return consumerOccasionCodeM;
    }

    /**
     * Sets the value of the consumerOccasionCodeM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerOccasionCodeM(String value) {
        this.consumerOccasionCodeM = value;
    }

    /**
     * Gets the value of the consumerPantFrontCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumerPantFrontCode() {
        return consumerPantFrontCode;
    }

    /**
     * Sets the value of the consumerPantFrontCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerPantFrontCode(String value) {
        this.consumerPantFrontCode = value;
    }

    /**
     * Gets the value of the consumerPersonaCategoryCodeM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumerPersonaCategoryCodeM() {
        return consumerPersonaCategoryCodeM;
    }

    /**
     * Sets the value of the consumerPersonaCategoryCodeM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerPersonaCategoryCodeM(String value) {
        this.consumerPersonaCategoryCodeM = value;
    }

    /**
     * Gets the value of the consumerPersonaGroupCodeM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumerPersonaGroupCodeM() {
        return consumerPersonaGroupCodeM;
    }

    /**
     * Sets the value of the consumerPersonaGroupCodeM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerPersonaGroupCodeM(String value) {
        this.consumerPersonaGroupCodeM = value;
    }

    /**
     * Gets the value of the consumerPersonaSubjectCodeM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumerPersonaSubjectCodeM() {
        return consumerPersonaSubjectCodeM;
    }

    /**
     * Sets the value of the consumerPersonaSubjectCodeM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerPersonaSubjectCodeM(String value) {
        this.consumerPersonaSubjectCodeM = value;
    }

    /**
     * Gets the value of the consumerPersonaThemeCodeM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumerPersonaThemeCodeM() {
        return consumerPersonaThemeCodeM;
    }

    /**
     * Sets the value of the consumerPersonaThemeCodeM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerPersonaThemeCodeM(String value) {
        this.consumerPersonaThemeCodeM = value;
    }

    /**
     * Gets the value of the consumerRiseCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumerRiseCode() {
        return consumerRiseCode;
    }

    /**
     * Sets the value of the consumerRiseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerRiseCode(String value) {
        this.consumerRiseCode = value;
    }

    /**
     * Gets the value of the consumerSilhouetteCodeM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumerSilhouetteCodeM() {
        return consumerSilhouetteCodeM;
    }

    /**
     * Sets the value of the consumerSilhouetteCodeM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerSilhouetteCodeM(String value) {
        this.consumerSilhouetteCodeM = value;
    }

    /**
     * Gets the value of the consumerSleeveLengthCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumerSleeveLengthCode() {
        return consumerSleeveLengthCode;
    }

    /**
     * Sets the value of the consumerSleeveLengthCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerSleeveLengthCode(String value) {
        this.consumerSleeveLengthCode = value;
    }

    /**
     * Gets the value of the cuffTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCuffTypeCode() {
        return cuffTypeCode;
    }

    /**
     * Sets the value of the cuffTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCuffTypeCode(String value) {
        this.cuffTypeCode = value;
    }

    /**
     * Gets the value of the cupCoverageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCupCoverageCode() {
        return cupCoverageCode;
    }

    /**
     * Sets the value of the cupCoverageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCupCoverageCode(String value) {
        this.cupCoverageCode = value;
    }

    /**
     * Gets the value of the cupTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCupTypeCode() {
        return cupTypeCode;
    }

    /**
     * Sets the value of the cupTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCupTypeCode(String value) {
        this.cupTypeCode = value;
    }

    /**
     * Gets the value of the customerBodyCharacteristicCodeM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerBodyCharacteristicCodeM() {
        return customerBodyCharacteristicCodeM;
    }

    /**
     * Sets the value of the customerBodyCharacteristicCodeM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerBodyCharacteristicCodeM(String value) {
        this.customerBodyCharacteristicCodeM = value;
    }

    /**
     * Gets the value of the departmentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartmentNumber() {
        return departmentNumber;
    }

    /**
     * Sets the value of the departmentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartmentNumber(String value) {
        this.departmentNumber = value;
    }

    /**
     * Gets the value of the devicePlatformCodeM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevicePlatformCodeM() {
        return devicePlatformCodeM;
    }

    /**
     * Sets the value of the devicePlatformCodeM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevicePlatformCodeM(String value) {
        this.devicePlatformCodeM = value;
    }

    /**
     * Gets the value of the diamondClarityGradeCodeM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiamondClarityGradeCodeM() {
        return diamondClarityGradeCodeM;
    }

    /**
     * Sets the value of the diamondClarityGradeCodeM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiamondClarityGradeCodeM(String value) {
        this.diamondClarityGradeCodeM = value;
    }

    /**
     * Gets the value of the diamondColorGradeCodeM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiamondColorGradeCodeM() {
        return diamondColorGradeCodeM;
    }

    /**
     * Sets the value of the diamondColorGradeCodeM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiamondColorGradeCodeM(String value) {
        this.diamondColorGradeCodeM = value;
    }

    /**
     * Gets the value of the displayResolutionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayResolutionCode() {
        return displayResolutionCode;
    }

    /**
     * Sets the value of the displayResolutionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayResolutionCode(String value) {
        this.displayResolutionCode = value;
    }

    /**
     * Gets the value of the displaySizeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDisplaySizeNumber() {
        return displaySizeNumber;
    }

    /**
     * Sets the value of the displaySizeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDisplaySizeNumber(BigDecimal value) {
        this.displaySizeNumber = value;
    }

    /**
     * Gets the value of the displaySizeUOMCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplaySizeUOMCode() {
        return displaySizeUOMCode;
    }

    /**
     * Sets the value of the displaySizeUOMCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplaySizeUOMCode(String value) {
        this.displaySizeUOMCode = value;
    }

    /**
     * Gets the value of the drawerCountQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDrawerCountQuantity() {
        return drawerCountQuantity;
    }

    /**
     * Sets the value of the drawerCountQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDrawerCountQuantity(Long value) {
        this.drawerCountQuantity = value;
    }

    /**
     * Gets the value of the electronicStorageCapacityQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getElectronicStorageCapacityQuantity() {
        return electronicStorageCapacityQuantity;
    }

    /**
     * Sets the value of the electronicStorageCapacityQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setElectronicStorageCapacityQuantity(BigDecimal value) {
        this.electronicStorageCapacityQuantity = value;
    }

    /**
     * Gets the value of the electronicStorageCapacityUOMCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElectronicStorageCapacityUOMCode() {
        return electronicStorageCapacityUOMCode;
    }

    /**
     * Sets the value of the electronicStorageCapacityUOMCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElectronicStorageCapacityUOMCode(String value) {
        this.electronicStorageCapacityUOMCode = value;
    }

    /**
     * Gets the value of the exclusionCodeM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExclusionCodeM() {
        return exclusionCodeM;
    }

    /**
     * Sets the value of the exclusionCodeM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExclusionCodeM(String value) {
        this.exclusionCodeM = value;
    }

    /**
     * Gets the value of the fashionPyramidCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFashionPyramidCode() {
        return fashionPyramidCode;
    }

    /**
     * Sets the value of the fashionPyramidCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFashionPyramidCode(String value) {
        this.fashionPyramidCode = value;
    }

    /**
     * Gets the value of the fillMaterialCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFillMaterialCode() {
        return fillMaterialCode;
    }

    /**
     * Sets the value of the fillMaterialCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFillMaterialCode(String value) {
        this.fillMaterialCode = value;
    }

    /**
     * Gets the value of the firmnessRatingCodeM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirmnessRatingCodeM() {
        return firmnessRatingCodeM;
    }

    /**
     * Sets the value of the firmnessRatingCodeM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirmnessRatingCodeM(String value) {
        this.firmnessRatingCodeM = value;
    }

    /**
     * Gets the value of the fitCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFitCode() {
        return fitCode;
    }

    /**
     * Sets the value of the fitCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFitCode(String value) {
        this.fitCode = value;
    }

    /**
     * Gets the value of the fraudRiskCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFraudRiskCode() {
        return fraudRiskCode;
    }

    /**
     * Sets the value of the fraudRiskCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFraudRiskCode(String value) {
        this.fraudRiskCode = value;
    }

    /**
     * Gets the value of the gemstoneCaratCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGemstoneCaratCode() {
        return gemstoneCaratCode;
    }

    /**
     * Sets the value of the gemstoneCaratCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGemstoneCaratCode(String value) {
        this.gemstoneCaratCode = value;
    }

    /**
     * Gets the value of the gemstoneCutCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGemstoneCutCode() {
        return gemstoneCutCode;
    }

    /**
     * Sets the value of the gemstoneCutCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGemstoneCutCode(String value) {
        this.gemstoneCutCode = value;
    }

    /**
     * Gets the value of the gemstoneQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGemstoneQuantity() {
        return gemstoneQuantity;
    }

    /**
     * Sets the value of the gemstoneQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGemstoneQuantity(Long value) {
        this.gemstoneQuantity = value;
    }

    /**
     * Gets the value of the genderCodeM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenderCodeM() {
        return genderCodeM;
    }

    /**
     * Sets the value of the genderCodeM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenderCodeM(String value) {
        this.genderCodeM = value;
    }

    /**
     * Gets the value of the hangFoldCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHangFoldCode() {
        return hangFoldCode;
    }

    /**
     * Sets the value of the hangFoldCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHangFoldCode(String value) {
        this.hangFoldCode = value;
    }

    /**
     * Gets the value of the hazardousMaterialIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHazardousMaterialIndicator() {
        return hazardousMaterialIndicator;
    }

    /**
     * Sets the value of the hazardousMaterialIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHazardousMaterialIndicator(String value) {
        this.hazardousMaterialIndicator = value;
    }

    /**
     * Gets the value of the heelHeightQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHeelHeightQuantity() {
        return heelHeightQuantity;
    }

    /**
     * Sets the value of the heelHeightQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHeelHeightQuantity(BigDecimal value) {
        this.heelHeightQuantity = value;
    }

    /**
     * Gets the value of the heelHeightUOMCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeelHeightUOMCode() {
        return heelHeightUOMCode;
    }

    /**
     * Sets the value of the heelHeightUOMCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeelHeightUOMCode(String value) {
        this.heelHeightUOMCode = value;
    }

    /**
     * Gets the value of the keyClassficationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyClassficationCode() {
        return keyClassficationCode;
    }

    /**
     * Sets the value of the keyClassficationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyClassficationCode(String value) {
        this.keyClassficationCode = value;
    }

    /**
     * Gets the value of the kohlsSpecialSKUTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKohlsSpecialSKUTypeCode() {
        return kohlsSpecialSKUTypeCode;
    }

    /**
     * Sets the value of the kohlsSpecialSKUTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKohlsSpecialSKUTypeCode(String value) {
        this.kohlsSpecialSKUTypeCode = value;
    }

    /**
     * Gets the value of the kohlsStyleDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKohlsStyleDescription() {
        return kohlsStyleDescription;
    }

    /**
     * Sets the value of the kohlsStyleDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKohlsStyleDescription(String value) {
        this.kohlsStyleDescription = value;
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
     * Gets the value of the legOpeningCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegOpeningCode() {
        return legOpeningCode;
    }

    /**
     * Sets the value of the legOpeningCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegOpeningCode(String value) {
        this.legOpeningCode = value;
    }

    /**
     * Gets the value of the lengthCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLengthCode() {
        return lengthCode;
    }

    /**
     * Sets the value of the lengthCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLengthCode(String value) {
        this.lengthCode = value;
    }

    /**
     * Gets the value of the lightBulbCountQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLightBulbCountQuantity() {
        return lightBulbCountQuantity;
    }

    /**
     * Sets the value of the lightBulbCountQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLightBulbCountQuantity(Long value) {
        this.lightBulbCountQuantity = value;
    }

    /**
     * Gets the value of the majorCategoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMajorCategoryCode() {
        return majorCategoryCode;
    }

    /**
     * Sets the value of the majorCategoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMajorCategoryCode(String value) {
        this.majorCategoryCode = value;
    }

    /**
     * Gets the value of the materialCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaterialCode() {
        return materialCode;
    }

    /**
     * Sets the value of the materialCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaterialCode(String value) {
        this.materialCode = value;
    }

    /**
     * Gets the value of the materialWeightRatingCodeM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaterialWeightRatingCodeM() {
        return materialWeightRatingCodeM;
    }

    /**
     * Sets the value of the materialWeightRatingCodeM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaterialWeightRatingCodeM(String value) {
        this.materialWeightRatingCodeM = value;
    }

    /**
     * Gets the value of the mattressThicknessQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMattressThicknessQuantity() {
        return mattressThicknessQuantity;
    }

    /**
     * Sets the value of the mattressThicknessQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMattressThicknessQuantity(BigDecimal value) {
        this.mattressThicknessQuantity = value;
    }

    /**
     * Gets the value of the mattressThicknessUOMCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMattressThicknessUOMCode() {
        return mattressThicknessUOMCode;
    }

    /**
     * Sets the value of the mattressThicknessUOMCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMattressThicknessUOMCode(String value) {
        this.mattressThicknessUOMCode = value;
    }

    /**
     * Gets the value of the maximumPurchaseQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaximumPurchaseQuantity() {
        return maximumPurchaseQuantity;
    }

    /**
     * Sets the value of the maximumPurchaseQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaximumPurchaseQuantity(Long value) {
        this.maximumPurchaseQuantity = value;
    }

    /**
     * Gets the value of the mediaRatingCodeM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaRatingCodeM() {
        return mediaRatingCodeM;
    }

    /**
     * Sets the value of the mediaRatingCodeM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaRatingCodeM(String value) {
        this.mediaRatingCodeM = value;
    }

    /**
     * Gets the value of the megapixelQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMegapixelQuantity() {
        return megapixelQuantity;
    }

    /**
     * Sets the value of the megapixelQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMegapixelQuantity(BigDecimal value) {
        this.megapixelQuantity = value;
    }

    /**
     * Gets the value of the metalCaratCodeM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetalCaratCodeM() {
        return metalCaratCodeM;
    }

    /**
     * Sets the value of the metalCaratCodeM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetalCaratCodeM(String value) {
        this.metalCaratCodeM = value;
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
     * Gets the value of the necklineCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNecklineCode() {
        return necklineCode;
    }

    /**
     * Sets the value of the necklineCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNecklineCode(String value) {
        this.necklineCode = value;
    }

    /**
     * Gets the value of the occasionPurposeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccasionPurposeCode() {
        return occasionPurposeCode;
    }

    /**
     * Sets the value of the occasionPurposeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccasionPurposeCode(String value) {
        this.occasionPurposeCode = value;
    }

    /**
     * Gets the value of the openingCountQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOpeningCountQuantity() {
        return openingCountQuantity;
    }

    /**
     * Sets the value of the openingCountQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOpeningCountQuantity(Long value) {
        this.openingCountQuantity = value;
    }

    /**
     * Gets the value of the pantFrontCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPantFrontCode() {
        return pantFrontCode;
    }

    /**
     * Sets the value of the pantFrontCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPantFrontCode(String value) {
        this.pantFrontCode = value;
    }

    /**
     * Gets the value of the perishableIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerishableIndicator() {
        return perishableIndicator;
    }

    /**
     * Sets the value of the perishableIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerishableIndicator(String value) {
        this.perishableIndicator = value;
    }

    /**
     * Gets the value of the petTypeCodeM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPetTypeCodeM() {
        return petTypeCodeM;
    }

    /**
     * Sets the value of the petTypeCodeM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPetTypeCodeM(String value) {
        this.petTypeCodeM = value;
    }

    /**
     * Gets the value of the placeSettingQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPlaceSettingQuantity() {
        return placeSettingQuantity;
    }

    /**
     * Sets the value of the placeSettingQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPlaceSettingQuantity(Long value) {
        this.placeSettingQuantity = value;
    }

    /**
     * Gets the value of the pocketTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPocketTypeCode() {
        return pocketTypeCode;
    }

    /**
     * Sets the value of the pocketTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPocketTypeCode(String value) {
        this.pocketTypeCode = value;
    }

    /**
     * Gets the value of the priceComparativeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceComparativeCode() {
        return priceComparativeCode;
    }

    /**
     * Sets the value of the priceComparativeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceComparativeCode(String value) {
        this.priceComparativeCode = value;
    }

    /**
     * Gets the value of the primaryToeCharacteristicCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryToeCharacteristicCode() {
        return primaryToeCharacteristicCode;
    }

    /**
     * Sets the value of the primaryToeCharacteristicCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryToeCharacteristicCode(String value) {
        this.primaryToeCharacteristicCode = value;
    }

    /**
     * Gets the value of the productPrimaryTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductPrimaryTypeCode() {
        return productPrimaryTypeCode;
    }

    /**
     * Sets the value of the productPrimaryTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductPrimaryTypeCode(String value) {
        this.productPrimaryTypeCode = value;
    }

    /**
     * Gets the value of the productSubtypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductSubtypeCode() {
        return productSubtypeCode;
    }

    /**
     * Sets the value of the productSubtypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductSubtypeCode(String value) {
        this.productSubtypeCode = value;
    }

    /**
     * Gets the value of the productTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductTypeCode() {
        return productTypeCode;
    }

    /**
     * Sets the value of the productTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductTypeCode(String value) {
        this.productTypeCode = value;
    }

    /**
     * Gets the value of the productTypeIQ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductTypeIQ() {
        return productTypeIQ;
    }

    /**
     * Sets the value of the productTypeIQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductTypeIQ(String value) {
        this.productTypeIQ = value;
    }

    /**
     * Gets the value of the profileGroupNameText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileGroupNameText() {
        return profileGroupNameText;
    }

    /**
     * Sets the value of the profileGroupNameText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileGroupNameText(String value) {
        this.profileGroupNameText = value;
    }

    /**
     * Gets the value of the propertyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyCode() {
        return propertyCode;
    }

    /**
     * Sets the value of the propertyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyCode(String value) {
        this.propertyCode = value;
    }

    /**
     * Gets the value of the recommendedUsageCodeM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecommendedUsageCodeM() {
        return recommendedUsageCodeM;
    }

    /**
     * Sets the value of the recommendedUsageCodeM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecommendedUsageCodeM(String value) {
        this.recommendedUsageCodeM = value;
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
     * Gets the value of the reportingLabelCodeM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportingLabelCodeM() {
        return reportingLabelCodeM;
    }

    /**
     * Sets the value of the reportingLabelCodeM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportingLabelCodeM(String value) {
        this.reportingLabelCodeM = value;
    }

    /**
     * Gets the value of the roomCodeM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomCodeM() {
        return roomCodeM;
    }

    /**
     * Sets the value of the roomCodeM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomCodeM(String value) {
        this.roomCodeM = value;
    }

    /**
     * Gets the value of the saleablePackageTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleablePackageTypeCode() {
        return saleablePackageTypeCode;
    }

    /**
     * Sets the value of the saleablePackageTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaleablePackageTypeCode(String value) {
        this.saleablePackageTypeCode = value;
    }

    /**
     * Gets the value of the secondaryProductShapeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryProductShapeCode() {
        return secondaryProductShapeCode;
    }

    /**
     * Sets the value of the secondaryProductShapeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryProductShapeCode(String value) {
        this.secondaryProductShapeCode = value;
    }

    /**
     * Gets the value of the setPieceCountQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSetPieceCountQuantity() {
        return setPieceCountQuantity;
    }

    /**
     * Sets the value of the setPieceCountQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSetPieceCountQuantity(Long value) {
        this.setPieceCountQuantity = value;
    }

    /**
     * Gets the value of the setPieceSellableUnitCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSetPieceSellableUnitCode() {
        return setPieceSellableUnitCode;
    }

    /**
     * Sets the value of the setPieceSellableUnitCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSetPieceSellableUnitCode(String value) {
        this.setPieceSellableUnitCode = value;
    }

    /**
     * Gets the value of the sheernessCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSheernessCode() {
        return sheernessCode;
    }

    /**
     * Sets the value of the sheernessCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSheernessCode(String value) {
        this.sheernessCode = value;
    }

    /**
     * Gets the value of the shelfCountQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getShelfCountQuantity() {
        return shelfCountQuantity;
    }

    /**
     * Sets the value of the shelfCountQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setShelfCountQuantity(Long value) {
        this.shelfCountQuantity = value;
    }

    /**
     * Gets the value of the shipAloneIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipAloneIndicator() {
        return shipAloneIndicator;
    }

    /**
     * Sets the value of the shipAloneIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipAloneIndicator(String value) {
        this.shipAloneIndicator = value;
    }

    /**
     * Gets the value of the silhouetteCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSilhouetteCode() {
        return silhouetteCode;
    }

    /**
     * Sets the value of the silhouetteCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSilhouetteCode(String value) {
        this.silhouetteCode = value;
    }

    /**
     * Gets the value of the sleeveLengthCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSleeveLengthCode() {
        return sleeveLengthCode;
    }

    /**
     * Sets the value of the sleeveLengthCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSleeveLengthCode(String value) {
        this.sleeveLengthCode = value;
    }

    /**
     * Gets the value of the sourceSystemCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceSystemCode() {
        return sourceSystemCode;
    }

    /**
     * Sets the value of the sourceSystemCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceSystemCode(String value) {
        this.sourceSystemCode = value;
    }

    /**
     * Gets the value of the sourceSystemIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceSystemIdentifier() {
        return sourceSystemIdentifier;
    }

    /**
     * Sets the value of the sourceSystemIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceSystemIdentifier(String value) {
        this.sourceSystemIdentifier = value;
    }

    /**
     * Gets the value of the strapTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrapTypeCode() {
        return strapTypeCode;
    }

    /**
     * Sets the value of the strapTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrapTypeCode(String value) {
        this.strapTypeCode = value;
    }

    /**
     * Gets the value of the subClassNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubClassNumber() {
        return subClassNumber;
    }

    /**
     * Sets the value of the subClassNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubClassNumber(String value) {
        this.subClassNumber = value;
    }

    /**
     * Gets the value of the taxwareProductCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxwareProductCode() {
        return taxwareProductCode;
    }

    /**
     * Sets the value of the taxwareProductCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxwareProductCode(String value) {
        this.taxwareProductCode = value;
    }

    /**
     * Gets the value of the themeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThemeCode() {
        return themeCode;
    }

    /**
     * Sets the value of the themeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThemeCode(String value) {
        this.themeCode = value;
    }

    /**
     * Gets the value of the threadCountQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getThreadCountQuantity() {
        return threadCountQuantity;
    }

    /**
     * Sets the value of the threadCountQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setThreadCountQuantity(Long value) {
        this.threadCountQuantity = value;
    }

    /**
     * Gets the value of the ticketTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketTypeCode() {
        return ticketTypeCode;
    }

    /**
     * Sets the value of the ticketTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketTypeCode(String value) {
        this.ticketTypeCode = value;
    }

    /**
     * Gets the value of the tierCountQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTierCountQuantity() {
        return tierCountQuantity;
    }

    /**
     * Sets the value of the tierCountQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTierCountQuantity(Long value) {
        this.tierCountQuantity = value;
    }

    /**
     * Gets the value of the upfRatingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUPFRatingCode() {
        return upfRatingCode;
    }

    /**
     * Sets the value of the upfRatingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUPFRatingCode(String value) {
        this.upfRatingCode = value;
    }

    /**
     * Gets the value of the valueInitiativeCodeM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueInitiativeCodeM() {
        return valueInitiativeCodeM;
    }

    /**
     * Sets the value of the valueInitiativeCodeM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueInitiativeCodeM(String value) {
        this.valueInitiativeCodeM = value;
    }

    /**
     * Gets the value of the vendorStyleIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVendorStyleIdentifier() {
        return vendorStyleIdentifier;
    }

    /**
     * Sets the value of the vendorStyleIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVendorStyleIdentifier(Long value) {
        this.vendorStyleIdentifier = value;
    }

    /**
     * Gets the value of the watchClockMovementCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWatchClockMovementCode() {
        return watchClockMovementCode;
    }

    /**
     * Sets the value of the watchClockMovementCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWatchClockMovementCode(String value) {
        this.watchClockMovementCode = value;
    }

    /**
     * Gets the value of the wickCountQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getWickCountQuantity() {
        return wickCountQuantity;
    }

    /**
     * Sets the value of the wickCountQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setWickCountQuantity(Long value) {
        this.wickCountQuantity = value;
    }

    /**
     * Gets the value of the windowTreatmentTopConstructionCodeM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWindowTreatmentTopConstructionCodeM() {
        return windowTreatmentTopConstructionCodeM;
    }

    /**
     * Sets the value of the windowTreatmentTopConstructionCodeM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWindowTreatmentTopConstructionCodeM(String value) {
        this.windowTreatmentTopConstructionCodeM = value;
    }

}
