
package com.kohls.schemas.productmdm.logisticsinterface.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateWarehouseAttributesOutputType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateWarehouseAttributesOutputType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SKU"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="SKUAttributes" type="{http://www.kohls.com/schemas/ProductMDM/LogisticsInterface/V1.xsd}WSUpdateOutputSKUAttributeType"/&gt;
 *                   &lt;element name="SKUDimensionList"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="SKUDimension" type="{http://www.kohls.com/schemas/ProductMDM/LogisticsInterface/V1.xsd}WSUpdateOutputSKUDimensionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateWarehouseAttributesOutputType", propOrder = {
    "sku"
})
public class UpdateWarehouseAttributesOutputType {

    @XmlElement(name = "SKU", required = true)
    protected UpdateWarehouseAttributesOutputType.SKU sku;

    /**
     * Gets the value of the sku property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateWarehouseAttributesOutputType.SKU }
     *     
     */
    public UpdateWarehouseAttributesOutputType.SKU getSKU() {
        return sku;
    }

    /**
     * Sets the value of the sku property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateWarehouseAttributesOutputType.SKU }
     *     
     */
    public void setSKU(UpdateWarehouseAttributesOutputType.SKU value) {
        this.sku = value;
    }


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
     *         &lt;element name="SKUAttributes" type="{http://www.kohls.com/schemas/ProductMDM/LogisticsInterface/V1.xsd}WSUpdateOutputSKUAttributeType"/&gt;
     *         &lt;element name="SKUDimensionList"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="SKUDimension" type="{http://www.kohls.com/schemas/ProductMDM/LogisticsInterface/V1.xsd}WSUpdateOutputSKUDimensionType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
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
        "skuAttributes",
        "skuDimensionList"
    })
    public static class SKU {

        @XmlElement(name = "SKUAttributes", required = true)
        protected WSUpdateOutputSKUAttributeType skuAttributes;
        @XmlElement(name = "SKUDimensionList", required = true)
        protected UpdateWarehouseAttributesOutputType.SKU.SKUDimensionList skuDimensionList;

        /**
         * Gets the value of the skuAttributes property.
         * 
         * @return
         *     possible object is
         *     {@link WSUpdateOutputSKUAttributeType }
         *     
         */
        public WSUpdateOutputSKUAttributeType getSKUAttributes() {
            return skuAttributes;
        }

        /**
         * Sets the value of the skuAttributes property.
         * 
         * @param value
         *     allowed object is
         *     {@link WSUpdateOutputSKUAttributeType }
         *     
         */
        public void setSKUAttributes(WSUpdateOutputSKUAttributeType value) {
            this.skuAttributes = value;
        }

        /**
         * Gets the value of the skuDimensionList property.
         * 
         * @return
         *     possible object is
         *     {@link UpdateWarehouseAttributesOutputType.SKU.SKUDimensionList }
         *     
         */
        public UpdateWarehouseAttributesOutputType.SKU.SKUDimensionList getSKUDimensionList() {
            return skuDimensionList;
        }

        /**
         * Sets the value of the skuDimensionList property.
         * 
         * @param value
         *     allowed object is
         *     {@link UpdateWarehouseAttributesOutputType.SKU.SKUDimensionList }
         *     
         */
        public void setSKUDimensionList(UpdateWarehouseAttributesOutputType.SKU.SKUDimensionList value) {
            this.skuDimensionList = value;
        }


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
         *         &lt;element name="SKUDimension" type="{http://www.kohls.com/schemas/ProductMDM/LogisticsInterface/V1.xsd}WSUpdateOutputSKUDimensionType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
            "skuDimension"
        })
        public static class SKUDimensionList {

            @XmlElement(name = "SKUDimension")
            protected List<WSUpdateOutputSKUDimensionType> skuDimension;

            /**
             * Gets the value of the skuDimension property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the skuDimension property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSKUDimension().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link WSUpdateOutputSKUDimensionType }
             * 
             * 
             */
            public List<WSUpdateOutputSKUDimensionType> getSKUDimension() {
                if (skuDimension == null) {
                    skuDimension = new ArrayList<WSUpdateOutputSKUDimensionType>();
                }
                return this.skuDimension;
            }

        }

    }

}
