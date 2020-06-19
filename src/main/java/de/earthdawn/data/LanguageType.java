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
 * <p>Java class for language_type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="language_type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="de"/&gt;
 *     &lt;enumeration value="en"/&gt;
 *     &lt;enumeration value="pl"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 *
 */
@XmlType(name = "language_type")
@XmlEnum
public enum LanguageType {

    @XmlEnumValue("de")
    DE("de"),
    @XmlEnumValue("en")
    EN("en"),
    @XmlEnumValue("pl")
    PL("pl");
    private final String value;

    LanguageType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LanguageType fromValue(String v) {
        for (LanguageType c: LanguageType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}