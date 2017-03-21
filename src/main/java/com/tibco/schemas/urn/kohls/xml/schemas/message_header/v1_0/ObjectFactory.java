
package com.tibco.schemas.urn.kohls.xml.schemas.message_header.v1_0;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.tibco.schemas.urn.kohls.xml.schemas.message_header.v1_0 package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.tibco.schemas.urn.kohls.xml.schemas.message_header.v1_0
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MessageHeader }
     * 
     */
    public MessageHeader createMessageHeader() {
        return new MessageHeader();
    }

    /**
     * Create an instance of {@link FromType }
     * 
     */
    public FromType createFromType() {
        return new FromType();
    }

    /**
     * Create an instance of {@link ToType }
     * 
     */
    public ToType createToType() {
        return new ToType();
    }

    /**
     * Create an instance of {@link RoutingKeysType }
     * 
     */
    public RoutingKeysType createRoutingKeysType() {
        return new RoutingKeysType();
    }

    /**
     * Create an instance of {@link ReplyToType }
     * 
     */
    public ReplyToType createReplyToType() {
        return new ReplyToType();
    }

    /**
     * Create an instance of {@link FaultToType }
     * 
     */
    public FaultToType createFaultToType() {
        return new FaultToType();
    }

    /**
     * Create an instance of {@link FaultType }
     * 
     */
    public FaultType createFaultType() {
        return new FaultType();
    }

    /**
     * Create an instance of {@link ParameterType }
     * 
     */
    public ParameterType createParameterType() {
        return new ParameterType();
    }

    /**
     * Create an instance of {@link ParametersType }
     * 
     */
    public ParametersType createParametersType() {
        return new ParametersType();
    }

    /**
     * Create an instance of {@link RoutingKeyType }
     * 
     */
    public RoutingKeyType createRoutingKeyType() {
        return new RoutingKeyType();
    }

}
