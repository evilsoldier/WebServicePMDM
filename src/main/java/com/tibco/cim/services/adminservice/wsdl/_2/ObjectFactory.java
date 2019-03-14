
package com.tibco.cim.services.adminservice.wsdl._2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.tibco.cim.services.adminservice.wsdl._2 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Enterprise_QNAME = new QName("http://www.tibco.com/cim/services/adminservice/wsdl/2.0", "Enterprise");
    private final static QName _Password_QNAME = new QName("http://www.tibco.com/cim/services/adminservice/wsdl/2.0", "Password");
    private final static QName _UserName_QNAME = new QName("http://www.tibco.com/cim/services/adminservice/wsdl/2.0", "UserName");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.tibco.cim.services.adminservice.wsdl._2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UserEntitlementResponse }
     * 
     */
    public UserEntitlementResponse createUserEntitlementResponse() {
        return new UserEntitlementResponse();
    }

    /**
     * Create an instance of {@link AccessControlType }
     * 
     */
    public AccessControlType createAccessControlType() {
        return new AccessControlType();
    }

    /**
     * Create an instance of {@link RolesType }
     * 
     */
    public RolesType createRolesType() {
        return new RolesType();
    }

    /**
     * Create an instance of {@link FunctionsType }
     * 
     */
    public FunctionsType createFunctionsType() {
        return new FunctionsType();
    }

    /**
     * Create an instance of {@link FunctionType }
     * 
     */
    public FunctionType createFunctionType() {
        return new FunctionType();
    }

    /**
     * Create an instance of {@link RoleType }
     * 
     */
    public RoleType createRoleType() {
        return new RoleType();
    }

    /**
     * Create an instance of {@link AccessType }
     * 
     */
    public AccessType createAccessType() {
        return new AccessType();
    }

    /**
     * Create an instance of {@link AccessesType }
     * 
     */
    public AccessesType createAccessesType() {
        return new AccessesType();
    }

    /**
     * Create an instance of {@link AnyType }
     * 
     */
    public AnyType createAnyType() {
        return new AnyType();
    }

    /**
     * Create an instance of {@link BasicUserInfoType }
     * 
     */
    public BasicUserInfoType createBasicUserInfoType() {
        return new BasicUserInfoType();
    }

    /**
     * Create an instance of {@link CimFaultType }
     * 
     */
    public CimFaultType createCimFaultType() {
        return new CimFaultType();
    }

    /**
     * Create an instance of {@link DescriptionType }
     * 
     */
    public DescriptionType createDescriptionType() {
        return new DescriptionType();
    }

    /**
     * Create an instance of {@link EnterpriseType }
     * 
     */
    public EnterpriseType createEnterpriseType() {
        return new EnterpriseType();
    }

    /**
     * Create an instance of {@link ErrorType }
     * 
     */
    public ErrorType createErrorType() {
        return new ErrorType();
    }

    /**
     * Create an instance of {@link LoginRequestType }
     * 
     */
    public LoginRequestType createLoginRequestType() {
        return new LoginRequestType();
    }

    /**
     * Create an instance of {@link LoginResponseType }
     * 
     */
    public LoginResponseType createLoginResponseType() {
        return new LoginResponseType();
    }

    /**
     * Create an instance of {@link LogoutRequestType }
     * 
     */
    public LogoutRequestType createLogoutRequestType() {
        return new LogoutRequestType();
    }

    /**
     * Create an instance of {@link LogoutResponseType }
     * 
     */
    public LogoutResponseType createLogoutResponseType() {
        return new LogoutResponseType();
    }

    /**
     * Create an instance of {@link ResourceType }
     * 
     */
    public ResourceType createResourceType() {
        return new ResourceType();
    }

    /**
     * Create an instance of {@link ResourcesType }
     * 
     */
    public ResourcesType createResourcesType() {
        return new ResourcesType();
    }

    /**
     * Create an instance of {@link ResultType }
     * 
     */
    public ResultType createResultType() {
        return new ResultType();
    }

    /**
     * Create an instance of {@link ReturnCountType }
     * 
     */
    public ReturnCountType createReturnCountType() {
        return new ReturnCountType();
    }

    /**
     * Create an instance of {@link UserInfoType }
     * 
     */
    public UserInfoType createUserInfoType() {
        return new UserInfoType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.tibco.com/cim/services/adminservice/wsdl/2.0", name = "Enterprise")
    public JAXBElement<String> createEnterprise(String value) {
        return new JAXBElement<String>(_Enterprise_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.tibco.com/cim/services/adminservice/wsdl/2.0", name = "Password")
    public JAXBElement<String> createPassword(String value) {
        return new JAXBElement<String>(_Password_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.tibco.com/cim/services/adminservice/wsdl/2.0", name = "UserName")
    public JAXBElement<String> createUserName(String value) {
        return new JAXBElement<String>(_UserName_QNAME, String.class, null, value);
    }

}
