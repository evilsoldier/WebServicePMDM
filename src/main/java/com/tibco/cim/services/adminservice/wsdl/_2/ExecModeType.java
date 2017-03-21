
package com.tibco.cim.services.adminservice.wsdl._2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExecModeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExecModeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SYNCHR"/&gt;
 *     &lt;enumeration value="ASYNCHR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ExecModeType")
@XmlEnum
public enum ExecModeType {

    SYNCHR,
    ASYNCHR;

    public String value() {
        return name();
    }

    public static ExecModeType fromValue(String v) {
        return valueOf(v);
    }

}
