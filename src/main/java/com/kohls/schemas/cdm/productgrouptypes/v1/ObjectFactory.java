
package com.kohls.schemas.cdm.productgrouptypes.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.kohls.schemas.cdm.productgrouptypes.v1 package. 
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

    private final static QName _ClassBC_QNAME = new QName("http://www.kohls.com/schemas/cdm/ProductGroupTypes/V1", "ClassBC");
    private final static QName _CustomerChoiceBC_QNAME = new QName("http://www.kohls.com/schemas/cdm/ProductGroupTypes/V1", "CustomerChoiceBC");
    private final static QName _DepartmentBC_QNAME = new QName("http://www.kohls.com/schemas/cdm/ProductGroupTypes/V1", "DepartmentBC");
    private final static QName _DivisionalMerchandiseAreaBC_QNAME = new QName("http://www.kohls.com/schemas/cdm/ProductGroupTypes/V1", "DivisionalMerchandiseAreaBC");
    private final static QName _GeneralMerchandiseAreaBC_QNAME = new QName("http://www.kohls.com/schemas/cdm/ProductGroupTypes/V1", "GeneralMerchandiseAreaBC");
    private final static QName _KohlsStyleBC_QNAME = new QName("http://www.kohls.com/schemas/cdm/ProductGroupTypes/V1", "KohlsStyleBC");
    private final static QName _OperatingCompanyBC_QNAME = new QName("http://www.kohls.com/schemas/cdm/ProductGroupTypes/V1", "OperatingCompanyBC");
    private final static QName _SKUBC_QNAME = new QName("http://www.kohls.com/schemas/cdm/ProductGroupTypes/V1", "SKUBC");
    private final static QName _SubClassBC_QNAME = new QName("http://www.kohls.com/schemas/cdm/ProductGroupTypes/V1", "SubClassBC");
    private final static QName _UPCBC_QNAME = new QName("http://www.kohls.com/schemas/cdm/ProductGroupTypes/V1", "UPCBC");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.kohls.schemas.cdm.productgrouptypes.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ClassBCType }
     * 
     */
    public ClassBCType createClassBCType() {
        return new ClassBCType();
    }

    /**
     * Create an instance of {@link CustomerChoiceBCType }
     * 
     */
    public CustomerChoiceBCType createCustomerChoiceBCType() {
        return new CustomerChoiceBCType();
    }

    /**
     * Create an instance of {@link DepartmentBCType }
     * 
     */
    public DepartmentBCType createDepartmentBCType() {
        return new DepartmentBCType();
    }

    /**
     * Create an instance of {@link DivisionalMerchandiseAreaBCType }
     * 
     */
    public DivisionalMerchandiseAreaBCType createDivisionalMerchandiseAreaBCType() {
        return new DivisionalMerchandiseAreaBCType();
    }

    /**
     * Create an instance of {@link GeneralMerchandiseAreaBCType }
     * 
     */
    public GeneralMerchandiseAreaBCType createGeneralMerchandiseAreaBCType() {
        return new GeneralMerchandiseAreaBCType();
    }

    /**
     * Create an instance of {@link KohlsStyleBCType }
     * 
     */
    public KohlsStyleBCType createKohlsStyleBCType() {
        return new KohlsStyleBCType();
    }

    /**
     * Create an instance of {@link OperatingCompanyBCType }
     * 
     */
    public OperatingCompanyBCType createOperatingCompanyBCType() {
        return new OperatingCompanyBCType();
    }

    /**
     * Create an instance of {@link SKUBCType }
     * 
     */
    public SKUBCType createSKUBCType() {
        return new SKUBCType();
    }

    /**
     * Create an instance of {@link SubClassBCType }
     * 
     */
    public SubClassBCType createSubClassBCType() {
        return new SubClassBCType();
    }

    /**
     * Create an instance of {@link UPCBCType }
     * 
     */
    public UPCBCType createUPCBCType() {
        return new UPCBCType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClassBCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kohls.com/schemas/cdm/ProductGroupTypes/V1", name = "ClassBC")
    public JAXBElement<ClassBCType> createClassBC(ClassBCType value) {
        return new JAXBElement<ClassBCType>(_ClassBC_QNAME, ClassBCType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerChoiceBCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kohls.com/schemas/cdm/ProductGroupTypes/V1", name = "CustomerChoiceBC")
    public JAXBElement<CustomerChoiceBCType> createCustomerChoiceBC(CustomerChoiceBCType value) {
        return new JAXBElement<CustomerChoiceBCType>(_CustomerChoiceBC_QNAME, CustomerChoiceBCType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DepartmentBCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kohls.com/schemas/cdm/ProductGroupTypes/V1", name = "DepartmentBC")
    public JAXBElement<DepartmentBCType> createDepartmentBC(DepartmentBCType value) {
        return new JAXBElement<DepartmentBCType>(_DepartmentBC_QNAME, DepartmentBCType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DivisionalMerchandiseAreaBCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kohls.com/schemas/cdm/ProductGroupTypes/V1", name = "DivisionalMerchandiseAreaBC")
    public JAXBElement<DivisionalMerchandiseAreaBCType> createDivisionalMerchandiseAreaBC(DivisionalMerchandiseAreaBCType value) {
        return new JAXBElement<DivisionalMerchandiseAreaBCType>(_DivisionalMerchandiseAreaBC_QNAME, DivisionalMerchandiseAreaBCType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeneralMerchandiseAreaBCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kohls.com/schemas/cdm/ProductGroupTypes/V1", name = "GeneralMerchandiseAreaBC")
    public JAXBElement<GeneralMerchandiseAreaBCType> createGeneralMerchandiseAreaBC(GeneralMerchandiseAreaBCType value) {
        return new JAXBElement<GeneralMerchandiseAreaBCType>(_GeneralMerchandiseAreaBC_QNAME, GeneralMerchandiseAreaBCType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KohlsStyleBCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kohls.com/schemas/cdm/ProductGroupTypes/V1", name = "KohlsStyleBC")
    public JAXBElement<KohlsStyleBCType> createKohlsStyleBC(KohlsStyleBCType value) {
        return new JAXBElement<KohlsStyleBCType>(_KohlsStyleBC_QNAME, KohlsStyleBCType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperatingCompanyBCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kohls.com/schemas/cdm/ProductGroupTypes/V1", name = "OperatingCompanyBC")
    public JAXBElement<OperatingCompanyBCType> createOperatingCompanyBC(OperatingCompanyBCType value) {
        return new JAXBElement<OperatingCompanyBCType>(_OperatingCompanyBC_QNAME, OperatingCompanyBCType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SKUBCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kohls.com/schemas/cdm/ProductGroupTypes/V1", name = "SKUBC")
    public JAXBElement<SKUBCType> createSKUBC(SKUBCType value) {
        return new JAXBElement<SKUBCType>(_SKUBC_QNAME, SKUBCType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubClassBCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kohls.com/schemas/cdm/ProductGroupTypes/V1", name = "SubClassBC")
    public JAXBElement<SubClassBCType> createSubClassBC(SubClassBCType value) {
        return new JAXBElement<SubClassBCType>(_SubClassBC_QNAME, SubClassBCType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UPCBCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kohls.com/schemas/cdm/ProductGroupTypes/V1", name = "UPCBC")
    public JAXBElement<UPCBCType> createUPCBC(UPCBCType value) {
        return new JAXBElement<UPCBCType>(_UPCBC_QNAME, UPCBCType.class, null, value);
    }

}
