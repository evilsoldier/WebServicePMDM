
package com.kohls.schemas.cdm.bsinputoutputtypes.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.kohls.schemas.cdm.producttypescdm.v1.AdvanceFilterType;
import com.kohls.schemas.cdm.producttypescdm.v1.CategoryTargetAttributeCrossReferenceListType;


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
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}CategoryTargetAttributeCrossReferenceList" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}AdvanceFilter" minOccurs="0"/&gt;
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
    "categoryTargetAttributeCrossReferenceList",
    "advanceFilter"
})
@XmlRootElement(name = "GetCategoryTargetAttributeCrossReferenceInput")
public class GetCategoryTargetAttributeCrossReferenceInput {

    @XmlElement(name = "CategoryTargetAttributeCrossReferenceList", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1")
    protected CategoryTargetAttributeCrossReferenceListType categoryTargetAttributeCrossReferenceList;
    @XmlElement(name = "AdvanceFilter", namespace = "http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1")
    protected AdvanceFilterType advanceFilter;

    /**
     * Gets the value of the categoryTargetAttributeCrossReferenceList property.
     * 
     * @return
     *     possible object is
     *     {@link CategoryTargetAttributeCrossReferenceListType }
     *     
     */
    public CategoryTargetAttributeCrossReferenceListType getCategoryTargetAttributeCrossReferenceList() {
        return categoryTargetAttributeCrossReferenceList;
    }

    /**
     * Sets the value of the categoryTargetAttributeCrossReferenceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoryTargetAttributeCrossReferenceListType }
     *     
     */
    public void setCategoryTargetAttributeCrossReferenceList(CategoryTargetAttributeCrossReferenceListType value) {
        this.categoryTargetAttributeCrossReferenceList = value;
    }

    /**
     * Gets the value of the advanceFilter property.
     * 
     * @return
     *     possible object is
     *     {@link AdvanceFilterType }
     *     
     */
    public AdvanceFilterType getAdvanceFilter() {
        return advanceFilter;
    }

    /**
     * Sets the value of the advanceFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdvanceFilterType }
     *     
     */
    public void setAdvanceFilter(AdvanceFilterType value) {
        this.advanceFilter = value;
    }

}
