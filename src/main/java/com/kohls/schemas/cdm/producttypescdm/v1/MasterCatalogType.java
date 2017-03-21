
package com.kohls.schemas.cdm.producttypescdm.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}MasterCatalogName"/&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ProductID"/&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ProductIDExt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ExternalKeys"/&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}QueryType"/&gt;
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
    "masterCatalogName",
    "productID",
    "productIDExt",
    "externalKeys",
    "queryType"
})
@XmlRootElement(name = "MasterCatalogType")
public class MasterCatalogType {

    @XmlElement(name = "MasterCatalogName", required = true)
    protected String masterCatalogName;
    @XmlElement(name = "ProductID", required = true)
    protected String productID;
    @XmlElement(name = "ProductIDExt")
    protected String productIDExt;
    @XmlElement(name = "ExternalKeys", required = true)
    protected ExternalKeys externalKeys;
    @XmlElement(name = "QueryType", required = true)
    @XmlSchemaType(name = "string")
    protected QueryTypeList queryType;

    /**
     * Gets the value of the masterCatalogName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMasterCatalogName() {
        return masterCatalogName;
    }

    /**
     * Sets the value of the masterCatalogName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMasterCatalogName(String value) {
        this.masterCatalogName = value;
    }

    /**
     * Gets the value of the productID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductID() {
        return productID;
    }

    /**
     * Sets the value of the productID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductID(String value) {
        this.productID = value;
    }

    /**
     * Gets the value of the productIDExt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductIDExt() {
        return productIDExt;
    }

    /**
     * Sets the value of the productIDExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductIDExt(String value) {
        this.productIDExt = value;
    }

    /**
     * Gets the value of the externalKeys property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalKeys }
     *     
     */
    public ExternalKeys getExternalKeys() {
        return externalKeys;
    }

    /**
     * Sets the value of the externalKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalKeys }
     *     
     */
    public void setExternalKeys(ExternalKeys value) {
        this.externalKeys = value;
    }

    /**
     * Gets the value of the queryType property.
     * 
     * @return
     *     possible object is
     *     {@link QueryTypeList }
     *     
     */
    public QueryTypeList getQueryType() {
        return queryType;
    }

    /**
     * Sets the value of the queryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryTypeList }
     *     
     */
    public void setQueryType(QueryTypeList value) {
        this.queryType = value;
    }

}
