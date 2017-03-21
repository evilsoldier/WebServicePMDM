
package com.kohls.schemas.cdm.bsinputoutputtypes.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.kohls.schemas.cdm.producttypescdm.v1.ExtendedFilterOutputType;
import com.kohls.schemas.cdm.producttypescdm.v1.KohlsStyleListType;


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
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}KohlsStyleList" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}Count" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}ExtendedFilterOutput" minOccurs="0"/&gt;
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
    "kohlsStyleList",
    "count",
    "extendedFilterOutput"
})
@XmlRootElement(name = "SearchKohlsStyleOutput")
public class SearchKohlsStyleOutput {

    @XmlElement(name = "KohlsStyleList", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1")
    protected KohlsStyleListType kohlsStyleList;
    @XmlElement(name = "Count", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1")
    protected Long count;
    @XmlElement(name = "ExtendedFilterOutput", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1")
    protected ExtendedFilterOutputType extendedFilterOutput;

    /**
     * Gets the value of the kohlsStyleList property.
     * 
     * @return
     *     possible object is
     *     {@link KohlsStyleListType }
     *     
     */
    public KohlsStyleListType getKohlsStyleList() {
        return kohlsStyleList;
    }

    /**
     * Sets the value of the kohlsStyleList property.
     * 
     * @param value
     *     allowed object is
     *     {@link KohlsStyleListType }
     *     
     */
    public void setKohlsStyleList(KohlsStyleListType value) {
        this.kohlsStyleList = value;
    }

    /**
     * Gets the value of the count property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCount(Long value) {
        this.count = value;
    }

    /**
     * Gets the value of the extendedFilterOutput property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedFilterOutputType }
     *     
     */
    public ExtendedFilterOutputType getExtendedFilterOutput() {
        return extendedFilterOutput;
    }

    /**
     * Sets the value of the extendedFilterOutput property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedFilterOutputType }
     *     
     */
    public void setExtendedFilterOutput(ExtendedFilterOutputType value) {
        this.extendedFilterOutput = value;
    }

}
