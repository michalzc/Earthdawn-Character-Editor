//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: see version control commit date
//


package de.earthdawn.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CHARACTERISTICS_ENCUMBRANCE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CHARACTERISTICS_ENCUMBRANCE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="attribute" use="required" type="{http://earthdawn.com/datatypes}unsigned_int" />
 *       &lt;attribute name="carrying" use="required" type="{http://earthdawn.com/datatypes}unsigned_int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CHARACTERISTICS_ENCUMBRANCE", namespace = "http://earthdawn.com/characteristics")
public class CHARACTERISTICSENCUMBRANCE {

    @XmlAttribute(required = true)
    protected int attribute;
    @XmlAttribute(required = true)
    protected int carrying;

    /**
     * Gets the value of the attribute property.
     * 
     */
    public int getAttribute() {
        return attribute;
    }

    /**
     * Sets the value of the attribute property.
     * 
     */
    public void setAttribute(int value) {
        this.attribute = value;
    }

    /**
     * Gets the value of the carrying property.
     * 
     */
    public int getCarrying() {
        return carrying;
    }

    /**
     * Sets the value of the carrying property.
     * 
     */
    public void setCarrying(int value) {
        this.carrying = value;
    }

}