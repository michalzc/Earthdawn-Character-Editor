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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for STEPDICE_type complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="STEPDICE_type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="step" type="{http://earthdawn.com/datatypes}unsigned_int" default="0" /&gt;
 *       &lt;attribute name="dice" type="{http://earthdawn.com/datatypes}dice_type" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "STEPDICE_type")
@XmlSeeAlso({
    ATTRIBUTEType.class,
    RECOVERYType.class,
    INITIATIVEType.class,
    RANKType.class,
    KARMAType.class,
    CHARACTERISTICSSTEPDICETABLE.class
})
public class STEPDICEType {

    @XmlAttribute(name = "step")
    protected Integer step;
    @XmlAttribute(name = "dice")
    protected String dice;

    /**
     * Gets the value of the step property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public int getStep() {
        if (step == null) {
            return  0;
        } else {
            return step;
        }
    }

    /**
     * Sets the value of the step property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setStep(Integer value) {
        this.step = value;
    }

    /**
     * Gets the value of the dice property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDice() {
        return dice;
    }

    /**
     * Sets the value of the dice property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDice(String value) {
        this.dice = value;
    }

}