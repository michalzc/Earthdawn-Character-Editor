//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0.1
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: see version control commit date
//


package de.earthdawn.data;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CAPABILITY_type complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="CAPABILITY_type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LIMITATION" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="action" type="{http://earthdawn.com/datatypes}action_type" default="standard" /&gt;
 *       &lt;attribute name="strain" type="{http://www.w3.org/2001/XMLSchema}string" default="0" /&gt;
 *       &lt;attribute name="attribute" type="{http://earthdawn.com/datatypes}ATTRIBUTE_name_type" /&gt;
 *       &lt;attribute name="bonus" type="{http://www.w3.org/2001/XMLSchema}int" default="0" /&gt;
 *       &lt;attribute name="karma" type="{http://earthdawn.com/datatypes}yesno_type" default="no" /&gt;
 *       &lt;attribute name="default" type="{http://earthdawn.com/datatypes}yesno_type" default="no" /&gt;
 *       &lt;attribute name="bookref" type="{http://www.w3.org/2001/XMLSchema}string" default="" /&gt;
 *       &lt;attribute name="realigned" type="{http://earthdawn.com/datatypes}unsigned_int" default="0" /&gt;
 *       &lt;attribute name="isinitiative" type="{http://earthdawn.com/datatypes}yesno_type" default="no" /&gt;
 *       &lt;attribute name="hasonehandlimitbonus" type="{http://earthdawn.com/datatypes}yesno_type" default="no" /&gt;
 *       &lt;attribute name="notbyversatility" type="{http://earthdawn.com/datatypes}yesno_type" default="no" /&gt;
 *       &lt;attribute name="skilluse" type="{http://earthdawn.com/datatypes}unsigned_int" default="0" /&gt;
 *       &lt;attribute name="canimprovised" type="{http://earthdawn.com/datatypes}yesno_type" default="no" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CAPABILITY_type", propOrder = {
    "limitation"
})
@XmlSeeAlso({
    SKILLType.class
})
public class CAPABILITYType {

    @XmlElement(name = "LIMITATION")
    protected List<String> limitation;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "action")
    protected ActionType action;
    @XmlAttribute(name = "strain")
    protected String strain;
    @XmlAttribute(name = "attribute")
    protected ATTRIBUTENameType attribute;
    @XmlAttribute(name = "bonus")
    protected Integer bonus;
    @XmlAttribute(name = "karma")
    protected YesnoType karma;
    @XmlAttribute(name = "default")
    protected YesnoType _default;
    @XmlAttribute(name = "bookref")
    protected String bookref;
    @XmlAttribute(name = "realigned")
    protected Integer realigned;
    @XmlAttribute(name = "isinitiative")
    protected YesnoType isinitiative;
    @XmlAttribute(name = "hasonehandlimitbonus")
    protected YesnoType hasonehandlimitbonus;
    @XmlAttribute(name = "notbyversatility")
    protected YesnoType notbyversatility;
    @XmlAttribute(name = "skilluse")
    protected Integer skilluse;
    @XmlAttribute(name = "canimprovised")
    protected YesnoType canimprovised;

    /**
     * Gets the value of the limitation property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the limitation property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLIMITATION().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     *
     *
     */
    public List<String> getLIMITATION() {
        if (limitation == null) {
            limitation = new ArrayList<String>();
        }
        return this.limitation;
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
     *     {@link String }
     *
     */
    public String getStrain() {
        if (strain == null) {
            return "0";
        } else {
            return strain;
        }
    }

    /**
     * Sets the value of the strain property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStrain(String value) {
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

    /**
     * Gets the value of the bookref property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBookref() {
        if (bookref == null) {
            return "";
        } else {
            return bookref;
        }
    }

    /**
     * Sets the value of the bookref property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBookref(String value) {
        this.bookref = value;
    }

    /**
     * Gets the value of the realigned property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public int getRealigned() {
        if (realigned == null) {
            return  0;
        } else {
            return realigned;
        }
    }

    /**
     * Sets the value of the realigned property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setRealigned(Integer value) {
        this.realigned = value;
    }

    /**
     * Gets the value of the isinitiative property.
     *
     * @return
     *     possible object is
     *     {@link YesnoType }
     *
     */
    public YesnoType getIsinitiative() {
        if (isinitiative == null) {
            return YesnoType.NO;
        } else {
            return isinitiative;
        }
    }

    /**
     * Sets the value of the isinitiative property.
     *
     * @param value
     *     allowed object is
     *     {@link YesnoType }
     *
     */
    public void setIsinitiative(YesnoType value) {
        this.isinitiative = value;
    }

    /**
     * Gets the value of the hasonehandlimitbonus property.
     *
     * @return
     *     possible object is
     *     {@link YesnoType }
     *
     */
    public YesnoType getHasonehandlimitbonus() {
        if (hasonehandlimitbonus == null) {
            return YesnoType.NO;
        } else {
            return hasonehandlimitbonus;
        }
    }

    /**
     * Sets the value of the hasonehandlimitbonus property.
     *
     * @param value
     *     allowed object is
     *     {@link YesnoType }
     *
     */
    public void setHasonehandlimitbonus(YesnoType value) {
        this.hasonehandlimitbonus = value;
    }

    /**
     * Gets the value of the notbyversatility property.
     *
     * @return
     *     possible object is
     *     {@link YesnoType }
     *
     */
    public YesnoType getNotbyversatility() {
        if (notbyversatility == null) {
            return YesnoType.NO;
        } else {
            return notbyversatility;
        }
    }

    /**
     * Sets the value of the notbyversatility property.
     *
     * @param value
     *     allowed object is
     *     {@link YesnoType }
     *
     */
    public void setNotbyversatility(YesnoType value) {
        this.notbyversatility = value;
    }

    /**
     * Gets the value of the skilluse property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public int getSkilluse() {
        if (skilluse == null) {
            return  0;
        } else {
            return skilluse;
        }
    }

    /**
     * Sets the value of the skilluse property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setSkilluse(Integer value) {
        this.skilluse = value;
    }

    /**
     * Gets the value of the canimprovised property.
     *
     * @return
     *     possible object is
     *     {@link YesnoType }
     *
     */
    public YesnoType getCanimprovised() {
        if (canimprovised == null) {
            return YesnoType.NO;
        } else {
            return canimprovised;
        }
    }

    /**
     * Sets the value of the canimprovised property.
     *
     * @param value
     *     allowed object is
     *     {@link YesnoType }
     *
     */
    public void setCanimprovised(YesnoType value) {
        this.canimprovised = value;
    }

}