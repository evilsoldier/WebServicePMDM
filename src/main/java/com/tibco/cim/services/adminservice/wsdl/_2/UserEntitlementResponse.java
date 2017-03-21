
package com.tibco.cim.services.adminservice.wsdl._2;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="AccessControl" type="{http://www.tibco.com/cim/services/adminservice/wsdl/2.0}AccessControlType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Roles" type="{http://www.tibco.com/cim/services/adminservice/wsdl/2.0}RolesType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Functions" type="{http://www.tibco.com/cim/services/adminservice/wsdl/2.0}FunctionsType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "accessControl",
    "roles",
    "functions"
})
@XmlRootElement(name = "UserEntitlementResponse")
public class UserEntitlementResponse {

    @XmlElement(name = "AccessControl")
    protected List<AccessControlType> accessControl;
    @XmlElement(name = "Roles")
    protected List<RolesType> roles;
    @XmlElement(name = "Functions")
    protected List<FunctionsType> functions;

    /**
     * Gets the value of the accessControl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accessControl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccessControl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccessControlType }
     * 
     * 
     */
    public List<AccessControlType> getAccessControl() {
        if (accessControl == null) {
            accessControl = new ArrayList<AccessControlType>();
        }
        return this.accessControl;
    }

    /**
     * Gets the value of the roles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RolesType }
     * 
     * 
     */
    public List<RolesType> getRoles() {
        if (roles == null) {
            roles = new ArrayList<RolesType>();
        }
        return this.roles;
    }

    /**
     * Gets the value of the functions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the functions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFunctions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FunctionsType }
     * 
     * 
     */
    public List<FunctionsType> getFunctions() {
        if (functions == null) {
            functions = new ArrayList<FunctionsType>();
        }
        return this.functions;
    }

}
