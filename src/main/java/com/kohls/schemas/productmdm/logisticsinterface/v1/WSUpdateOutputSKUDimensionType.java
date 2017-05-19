
package com.kohls.schemas.productmdm.logisticsinterface.v1;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSUpdateOutputSKUDimensionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSUpdateOutputSKUDimensionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="AccuracyLevelCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DepthQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="HeightQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="HeightWidthDepthUnitOfMeasureCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="PieceNumber" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="SKUDimensionUsageCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SKUNumber" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="VolumeQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="VolumeUnitOfMeasureCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="WeightQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="WeightUnitOfMeasureCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="WidthQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSUpdateOutputSKUDimensionType")
public class WSUpdateOutputSKUDimensionType {

    @XmlAttribute(name = "AccuracyLevelCode")
    protected String accuracyLevelCode;
    @XmlAttribute(name = "DepthQuantity")
    protected BigDecimal depthQuantity;
    @XmlAttribute(name = "HeightQuantity")
    protected BigDecimal heightQuantity;
    @XmlAttribute(name = "HeightWidthDepthUnitOfMeasureCode")
    protected String heightWidthDepthUnitOfMeasureCode;
    @XmlAttribute(name = "PieceNumber")
    protected Long pieceNumber;
    @XmlAttribute(name = "SKUDimensionUsageCode")
    protected String skuDimensionUsageCode;
    @XmlAttribute(name = "SKUNumber")
    protected Long skuNumber;
    @XmlAttribute(name = "VolumeQuantity")
    protected BigDecimal volumeQuantity;
    @XmlAttribute(name = "VolumeUnitOfMeasureCode")
    protected String volumeUnitOfMeasureCode;
    @XmlAttribute(name = "WeightQuantity")
    protected BigDecimal weightQuantity;
    @XmlAttribute(name = "WeightUnitOfMeasureCode")
    protected String weightUnitOfMeasureCode;
    @XmlAttribute(name = "WidthQuantity")
    protected BigDecimal widthQuantity;

    /**
     * Gets the value of the accuracyLevelCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccuracyLevelCode() {
        return accuracyLevelCode;
    }

    /**
     * Sets the value of the accuracyLevelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccuracyLevelCode(String value) {
        this.accuracyLevelCode = value;
    }

    /**
     * Gets the value of the depthQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDepthQuantity() {
        return depthQuantity;
    }

    /**
     * Sets the value of the depthQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDepthQuantity(BigDecimal value) {
        this.depthQuantity = value;
    }

    /**
     * Gets the value of the heightQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHeightQuantity() {
        return heightQuantity;
    }

    /**
     * Sets the value of the heightQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHeightQuantity(BigDecimal value) {
        this.heightQuantity = value;
    }

    /**
     * Gets the value of the heightWidthDepthUnitOfMeasureCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeightWidthDepthUnitOfMeasureCode() {
        return heightWidthDepthUnitOfMeasureCode;
    }

    /**
     * Sets the value of the heightWidthDepthUnitOfMeasureCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeightWidthDepthUnitOfMeasureCode(String value) {
        this.heightWidthDepthUnitOfMeasureCode = value;
    }

    /**
     * Gets the value of the pieceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPieceNumber() {
        return pieceNumber;
    }

    /**
     * Sets the value of the pieceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPieceNumber(Long value) {
        this.pieceNumber = value;
    }

    /**
     * Gets the value of the skuDimensionUsageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSKUDimensionUsageCode() {
        return skuDimensionUsageCode;
    }

    /**
     * Sets the value of the skuDimensionUsageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSKUDimensionUsageCode(String value) {
        this.skuDimensionUsageCode = value;
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
     * Gets the value of the volumeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVolumeQuantity() {
        return volumeQuantity;
    }

    /**
     * Sets the value of the volumeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVolumeQuantity(BigDecimal value) {
        this.volumeQuantity = value;
    }

    /**
     * Gets the value of the volumeUnitOfMeasureCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVolumeUnitOfMeasureCode() {
        return volumeUnitOfMeasureCode;
    }

    /**
     * Sets the value of the volumeUnitOfMeasureCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVolumeUnitOfMeasureCode(String value) {
        this.volumeUnitOfMeasureCode = value;
    }

    /**
     * Gets the value of the weightQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWeightQuantity() {
        return weightQuantity;
    }

    /**
     * Sets the value of the weightQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWeightQuantity(BigDecimal value) {
        this.weightQuantity = value;
    }

    /**
     * Gets the value of the weightUnitOfMeasureCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeightUnitOfMeasureCode() {
        return weightUnitOfMeasureCode;
    }

    /**
     * Sets the value of the weightUnitOfMeasureCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeightUnitOfMeasureCode(String value) {
        this.weightUnitOfMeasureCode = value;
    }

    /**
     * Gets the value of the widthQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWidthQuantity() {
        return widthQuantity;
    }

    /**
     * Sets the value of the widthQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWidthQuantity(BigDecimal value) {
        this.widthQuantity = value;
    }

}
