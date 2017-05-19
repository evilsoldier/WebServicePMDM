
package com.kohls.schemas.productmdm.logisticsinterface.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateWarehouseAttributesInputType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateWarehouseAttributesInputType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SKU"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="SKUAttributes" type="{http://www.kohls.com/schemas/ProductMDM/LogisticsInterface/V1.xsd}WSUpdateInputSKUAttributeType"/&gt;
 *                   &lt;element name="SKUDimensionList"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="SKUDimension" type="{http://www.kohls.com/schemas/ProductMDM/LogisticsInterface/V1.xsd}WSUpdateInputSKUDimensionType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "UpdateWarehouseAttributesInputType", propOrder = {
    "sku"
})
public class UpdateWarehouseAttributesInputType {

    @XmlElement(name = "SKU", required = true)
    protected UpdateWarehouseAttributesInputType.SKU sku;

    /**
     * Gets the value of the sku property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateWarehouseAttributesInputType.SKU }
     *     
     */
    public UpdateWarehouseAttributesInputType.SKU getSKU() {
        return sku;
    }

    /**
     * Sets the value of the sku property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateWarehouseAttributesInputType.SKU }
     *     
     */
    public void setSKU(UpdateWarehouseAttributesInputType.SKU value) {
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
     *         &lt;element name="SKUAttributes" type="{http://www.kohls.com/schemas/ProductMDM/LogisticsInterface/V1.xsd}WSUpdateInputSKUAttributeType"/&gt;
     *         &lt;element name="SKUDimensionList"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="SKUDimension" type="{http://www.kohls.com/schemas/ProductMDM/LogisticsInterface/V1.xsd}WSUpdateInputSKUDimensionType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        protected WSUpdateInputSKUAttributeType skuAttributes;
        @XmlElement(name = "SKUDimensionList", required = true)
        protected UpdateWarehouseAttributesInputType.SKU.SKUDimensionList skuDimensionList;

        /**
         * Gets the value of the skuAttributes property.
         * 
         * @return
         *     possible object is
         *     {@link WSUpdateInputSKUAttributeType }
         *     
         */
        public WSUpdateInputSKUAttributeType getSKUAttributes() {
            return skuAttributes;
        }

        /**
         * Sets the value of the skuAttributes property.
         * 
         * @param value
         *     allowed object is
         *     {@link WSUpdateInputSKUAttributeType }
         *     
         */
        public void setSKUAttributes(WSUpdateInputSKUAttributeType value) {
            this.skuAttributes = value;
        }

        /**
         * Gets the value of the skuDimensionList property.
         * 
         * @return
         *     possible object is
         *     {@link UpdateWarehouseAttributesInputType.SKU.SKUDimensionList }
         *     
         */
        public UpdateWarehouseAttributesInputType.SKU.SKUDimensionList getSKUDimensionList() {
            return skuDimensionList;
        }

        /**
         * Sets the value of the skuDimensionList property.
         * 
         * @param value
         *     allowed object is
         *     {@link UpdateWarehouseAttributesInputType.SKU.SKUDimensionList }
         *     
         */
        public void setSKUDimensionList(UpdateWarehouseAttributesInputType.SKU.SKUDimensionList value) {
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
         *         &lt;element name="SKUDimension" type="{http://www.kohls.com/schemas/ProductMDM/LogisticsInterface/V1.xsd}WSUpdateInputSKUDimensionType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
            protected List<WSUpdateInputSKUDimensionType> skuDimension;

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
             * {@link WSUpdateInputSKUDimensionType }
             * 
             * 
             */
            public List<WSUpdateInputSKUDimensionType> getSKUDimension() {
                if (skuDimension == null) {
                    skuDimension = new ArrayList<WSUpdateInputSKUDimensionType>();
                }
                return this.skuDimension;
            }

        }

    }

}
