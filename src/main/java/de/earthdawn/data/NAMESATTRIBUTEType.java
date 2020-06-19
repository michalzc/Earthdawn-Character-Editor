//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0.1
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: see version control commit date
//


package de.earthdawn.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NAMES_ATTRIBUTE_type complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="NAMES_ATTRIBUTE_type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="attribute" use="required" type="{http://earthdawn.com/datatypes}ATTRIBUTE_name_type" /&gt;
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="acronym" use="required" type="{http://earthdawn.com/datatypes}acronym_type" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NAMES_ATTRIBUTE_type", namespace = "http://earthdawn.com/translation")
public class NAMESATTRIBUTEType {

    @XmlAttribute(name = "attribute", required = true)
    protected ATTRIBUTENameType attribute;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "acronym", required = true)
    protected String acronym;

    /**
     * Gets the value of the attribute property.
     *
     * @return
     *     possible object is
     *     {@link ATTRIBUTENameType }
     *
     */
    public ATTRIBUTENameType getAttribute() {
        return attribute;
    }

    /**
     * Sets the value of the attribute property.
     *
     * @param value
     *     allowed object is
     *     {@link ATTRIBUTENameType }
     *
     */
    public void setAttribute(ATTRIBUTENameType value) {
        this.attribute = value;
    }

    /**
     * Gets the value of the name property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the acronym property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAcronym() {
        return acronym;
    }

    /**
     * Sets the value of the acronym property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAcronym(String value) {
        this.acronym = value;
    }

}