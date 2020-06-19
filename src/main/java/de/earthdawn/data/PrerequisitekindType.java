//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0.1
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: see version control commit date
//


package de.earthdawn.data;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for prerequisitekind_type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="prerequisitekind_type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="requirement"/&gt;
 *     &lt;enumeration value="restriction"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 *
 */
@XmlType(name = "prerequisitekind_type")
@XmlEnum
public enum PrerequisitekindType {


    /**
     * All elements marked with 'requirement' must be fullfilled.
     *
     */
    @XmlEnumValue("requirement")
    REQUIREMENT("requirement"),

    /**
     * One of all elements marked with 'restriction' must be fullfilled.
     *
     */
    @XmlEnumValue("restriction")
    RESTRICTION("restriction");
    private final String value;

    PrerequisitekindType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PrerequisitekindType fromValue(String v) {
        for (PrerequisitekindType c: PrerequisitekindType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}