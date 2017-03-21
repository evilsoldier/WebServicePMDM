
package com.kohls.schemas.cdm.producttypescdm.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DepartmentBrandVendorAssociationListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DepartmentBrandVendorAssociationListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.kohls.com/schemas/cdm/ProductTypesCDM/V1}DepartmentBrandVendorAssociation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DepartmentBrandVendorAssociationListType", propOrder = {
    "departmentBrandVendorAssociation"
})
public class DepartmentBrandVendorAssociationListType {

    @XmlElement(name = "DepartmentBrandVendorAssociation")
    protected List<DepartmentBrandVendorAssociationType> departmentBrandVendorAssociation;

    /**
     * Gets the value of the departmentBrandVendorAssociation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the departmentBrandVendorAssociation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDepartmentBrandVendorAssociation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DepartmentBrandVendorAssociationType }
     * 
     * 
     */
    public List<DepartmentBrandVendorAssociationType> getDepartmentBrandVendorAssociation() {
        if (departmentBrandVendorAssociation == null) {
            departmentBrandVendorAssociation = new ArrayList<DepartmentBrandVendorAssociationType>();
        }
        return this.departmentBrandVendorAssociation;
    }

}
