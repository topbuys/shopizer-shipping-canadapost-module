//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.13 at 11:05:37 AM EDT 
//


package ca.canadapost.cpcdp.rating.generated.rating;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CcType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 */
@XmlType(name = "CcType")
@XmlEnum
public enum CcType {

    MC,
    VIS,
    AME,
    DC,
    DIS,
    ER;

    public String value() {
        return name();
    }

    public static CcType fromValue(String v) {
        return valueOf(v);
    }

}
