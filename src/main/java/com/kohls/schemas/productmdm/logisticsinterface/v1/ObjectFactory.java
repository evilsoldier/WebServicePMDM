
package com.kohls.schemas.productmdm.logisticsinterface.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.kohls.schemas.productmdm.logisticsinterface.v1 package. 
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

    private final static QName _Command_QNAME = new QName("http://www.kohls.com/schemas/ProductMDM/LogisticsInterface/V1.xsd", "Command");
    private final static QName _SKUDimension_QNAME = new QName("http://www.kohls.com/schemas/ProductMDM/LogisticsInterface/V1.xsd", "SKUDimension");
    private final static QName _UpdateWarehouseAttributesInput_QNAME = new QName("http://www.kohls.com/schemas/ProductMDM/LogisticsInterface/V1.xsd", "UpdateWarehouseAttributesInput");
    private final static QName _UpdateWarehouseAttributesOutput_QNAME = new QName("http://www.kohls.com/schemas/ProductMDM/LogisticsInterface/V1.xsd", "UpdateWarehouseAttributesOutput");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.kohls.schemas.productmdm.logisticsinterface.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UpdateWarehouseAttributesOutputType }
     * 
     */
    public UpdateWarehouseAttributesOutputType createUpdateWarehouseAttributesOutputType() {
        return new UpdateWarehouseAttributesOutputType();
    }

    /**
     * Create an instance of {@link UpdateWarehouseAttributesOutputType.SKU }
     * 
     */
    public UpdateWarehouseAttributesOutputType.SKU createUpdateWarehouseAttributesOutputTypeSKU() {
        return new UpdateWarehouseAttributesOutputType.SKU();
    }

    /**
     * Create an instance of {@link UpdateWarehouseAttributesInputType }
     * 
     */
    public UpdateWarehouseAttributesInputType createUpdateWarehouseAttributesInputType() {
        return new UpdateWarehouseAttributesInputType();
    }

    /**
     * Create an instance of {@link UpdateWarehouseAttributesInputType.SKU }
     * 
     */
    public UpdateWarehouseAttributesInputType.SKU createUpdateWarehouseAttributesInputTypeSKU() {
        return new UpdateWarehouseAttributesInputType.SKU();
    }

    /**
     * Create an instance of {@link WSUpdateOutputSKUDimensionType }
     * 
     */
    public WSUpdateOutputSKUDimensionType createWSUpdateOutputSKUDimensionType() {
        return new WSUpdateOutputSKUDimensionType();
    }

    /**
     * Create an instance of {@link WSUpdateInputSKUAttributeType }
     * 
     */
    public WSUpdateInputSKUAttributeType createWSUpdateInputSKUAttributeType() {
        return new WSUpdateInputSKUAttributeType();
    }

    /**
     * Create an instance of {@link WSUpdateInputSKUDimensionType }
     * 
     */
    public WSUpdateInputSKUDimensionType createWSUpdateInputSKUDimensionType() {
        return new WSUpdateInputSKUDimensionType();
    }

    /**
     * Create an instance of {@link WSUpdateOutputSKUAttributeType }
     * 
     */
    public WSUpdateOutputSKUAttributeType createWSUpdateOutputSKUAttributeType() {
        return new WSUpdateOutputSKUAttributeType();
    }

    /**
     * Create an instance of {@link UpdateWarehouseAttributesOutputType.SKU.SKUDimensionList }
     * 
     */
    public UpdateWarehouseAttributesOutputType.SKU.SKUDimensionList createUpdateWarehouseAttributesOutputTypeSKUSKUDimensionList() {
        return new UpdateWarehouseAttributesOutputType.SKU.SKUDimensionList();
    }

    /**
     * Create an instance of {@link UpdateWarehouseAttributesInputType.SKU.SKUDimensionList }
     * 
     */
    public UpdateWarehouseAttributesInputType.SKU.SKUDimensionList createUpdateWarehouseAttributesInputTypeSKUSKUDimensionList() {
        return new UpdateWarehouseAttributesInputType.SKU.SKUDimensionList();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kohls.com/schemas/ProductMDM/LogisticsInterface/V1.xsd", name = "Command")
    public JAXBElement<String> createCommand(String value) {
        return new JAXBElement<String>(_Command_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WSUpdateOutputSKUDimensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kohls.com/schemas/ProductMDM/LogisticsInterface/V1.xsd", name = "SKUDimension")
    public JAXBElement<WSUpdateOutputSKUDimensionType> createSKUDimension(WSUpdateOutputSKUDimensionType value) {
        return new JAXBElement<WSUpdateOutputSKUDimensionType>(_SKUDimension_QNAME, WSUpdateOutputSKUDimensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateWarehouseAttributesInputType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kohls.com/schemas/ProductMDM/LogisticsInterface/V1.xsd", name = "UpdateWarehouseAttributesInput")
    public JAXBElement<UpdateWarehouseAttributesInputType> createUpdateWarehouseAttributesInput(UpdateWarehouseAttributesInputType value) {
        return new JAXBElement<UpdateWarehouseAttributesInputType>(_UpdateWarehouseAttributesInput_QNAME, UpdateWarehouseAttributesInputType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateWarehouseAttributesOutputType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kohls.com/schemas/ProductMDM/LogisticsInterface/V1.xsd", name = "UpdateWarehouseAttributesOutput")
    public JAXBElement<UpdateWarehouseAttributesOutputType> createUpdateWarehouseAttributesOutput(UpdateWarehouseAttributesOutputType value) {
        return new JAXBElement<UpdateWarehouseAttributesOutputType>(_UpdateWarehouseAttributesOutput_QNAME, UpdateWarehouseAttributesOutputType.class, null, value);
    }

}
