//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.12.12 at 07:29:09 PM MEZ 
//


package de.earthdawn.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RECOVERY_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RECOVERY_type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://earthdawn.com/datatypes}STEPDICE_type">
 *       &lt;attribute name="testsperday" use="required" type="{http://earthdawn.com/datatypes}unsigned_int" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RECOVERY_type")
public class RECOVERYType
    extends STEPDICEType
{

    @XmlAttribute(required = true)
    protected int testsperday;

    /**
     * Gets the value of the testsperday property.
     * 
     */
    public int getTestsperday() {
        return testsperday;
    }

    /**
     * Sets the value of the testsperday property.
     * 
     */
    public void setTestsperday(int value) {
        this.testsperday = value;
    }

}
