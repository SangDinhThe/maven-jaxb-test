//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.07.26 at 02:56:00 PM ICT 
//


package com.clovis.common.utils.menu.gen;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrientationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="OrientationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="HORIZONTAL"/&gt;
 *     &lt;enumeration value="VERTICAL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OrientationType")
@XmlEnum
public enum OrientationType {

    HORIZONTAL,
    VERTICAL;

    public String value() {
        return name();
    }

    public static OrientationType fromValue(String v) {
        return valueOf(v);
    }

}
