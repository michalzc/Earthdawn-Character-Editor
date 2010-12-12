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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CAPABILITY_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CAPABILITY_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="action" type="{http://earthdawn.com/datatypes}action_type" default="standard" />
 *       &lt;attribute name="strain" type="{http://earthdawn.com/datatypes}unsigned_int" default="0" />
 *       &lt;attribute name="attribute" type="{http://earthdawn.com/datatypes}ATTRIBUTE_name_type" />
 *       &lt;attribute name="bonus" type="{http://www.w3.org/2001/XMLSchema}int" default="0" />
 *       &lt;attribute name="limitation" type="{http://www.w3.org/2001/XMLSchema}string" default="" />
 *       &lt;attribute name="karma" type="{http://earthdawn.com/datatypes}yesno_type" default="no" />
 *       &lt;attribute name="default" type="{http://earthdawn.com/datatypes}yesno_type" default="no" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CAPABILITY_type")
@XmlSeeAlso({
    SKILLType.class
})
public class CAPABILITYType {

    @XmlAttribute(required = true)
    protected String name;
    @XmlAttribute
    protected ActionType action;
    @XmlAttribute
    protected Integer strain;
    @XmlAttribute
    protected ATTRIBUTENameType attribute;
    @XmlAttribute
    protected Integer bonus;
    @XmlAttribute
    protected String limitation;
    @XmlAttribute
    protected YesnoType karma;
    @XmlAttribute(name = "default")
    protected YesnoType _default;

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
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link ActionType }
     *     
     */
    public ActionType getAction() {
        if (action == null) {
            return ActionType.STANDARD;
        } else {
            return action;
        }
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionType }
     *     
     */
    public void setAction(ActionType value) {
        this.action = value;
    }

    /**
     * Gets the value of the strain property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getStrain() {
        if (strain == null) {
            return  0;
        } else {
            return strain;
        }
    }

    /**
     * Sets the value of the strain property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStrain(Integer value) {
        this.strain = value;
    }

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
     * Gets the value of the bonus property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getBonus() {
        if (bonus == null) {
            return  0;
        } else {
            return bonus;
        }
    }

    /**
     * Sets the value of the bonus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBonus(Integer value) {
        this.bonus = value;
    }

    /**
     * Gets the value of the limitation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLimitation() {
        if (limitation == null) {
            return "";
        } else {
            return limitation;
        }
    }

    /**
     * Sets the value of the limitation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLimitation(String value) {
        this.limitation = value;
    }

    /**
     * Gets the value of the karma property.
     * 
     * @return
     *     possible object is
     *     {@link YesnoType }
     *     
     */
    public YesnoType getKarma() {
        if (karma == null) {
            return YesnoType.NO;
        } else {
            return karma;
        }
    }

    /**
     * Sets the value of the karma property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesnoType }
     *     
     */
    public void setKarma(YesnoType value) {
        this.karma = value;
    }

    /**
     * Gets the value of the default property.
     * 
     * @return
     *     possible object is
     *     {@link YesnoType }
     *     
     */
    public YesnoType getDefault() {
        if (_default == null) {
            return YesnoType.NO;
        } else {
            return _default;
        }
    }

    /**
     * Sets the value of the default property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesnoType }
     *     
     */
    public void setDefault(YesnoType value) {
        this._default = value;
    }

}
