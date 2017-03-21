
package com.kohls.schemas.cdm.producttypescdm.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}MasterCatalogType"/&gt;
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
    "masterCatalogType"
})
@XmlRootElement(name = "MasterCatalog")
public class MasterCatalog {

    @XmlElement(name = "MasterCatalogType", required = true)
    protected MasterCatalogType masterCatalogType;

    /**
     * Gets the value of the masterCatalogType property.
     * 
     * @return
     *     possible object is
     *     {@link MasterCatalogType }
     *     
     */
    public MasterCatalogType getMasterCatalogType() {
        return masterCatalogType;
    }

    /**
     * Sets the value of the masterCatalogType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MasterCatalogType }
     *     
     */
    public void setMasterCatalogType(MasterCatalogType value) {
        this.masterCatalogType = value;
    }

}
