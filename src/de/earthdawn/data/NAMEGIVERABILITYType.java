//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NAMEGIVERABILITY_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NAMEGIVERABILITY_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ATTRIBUTE" type="{http://earthdawn.com/namegiver}ATTRIBUTENAMEVALUE_type" maxOccurs="6" minOccurs="6"/>
 *         &lt;element name="ARMOR" type="{http://earthdawn.com/datatypes}ARMOR_type"/>
 *         &lt;element name="WOUND" type="{http://earthdawn.com/datatypes}WOUND_type"/>
 *         &lt;element name="DEFENSE" type="{http://earthdawn.com/datatypes}DEFENSEABILITY_type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TALENT" type="{http://earthdawn.com/datatypes}TALENTABILITY_type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CARRY" type="{http://earthdawn.com/datatypes}TALENTABILITY_type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ABILITY" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ORIGIN" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="NOTDEFAULTSKILL" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DEFAULTLANGUAGE" type="{http://earthdawn.com/datatypes}CHARACTERLANGUAGE_type" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="karmamodifier" type="{http://earthdawn.com/datatypes}unsigned_int" default="0" />
 *       &lt;attribute name="movement_ground" type="{http://earthdawn.com/datatypes}unsigned_int" default="0" />
 *       &lt;attribute name="movement_flight" type="{http://earthdawn.com/datatypes}unsigned_int" default="0" />
 *       &lt;attribute name="enduringarmorfactor" type="{http://www.w3.org/2001/XMLSchema}float" default="1.0" />
 *       &lt;attribute name="lang" use="required" type="{http://earthdawn.com/datatypes}language_type" />
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" default="" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NAMEGIVERABILITY_type", namespace = "http://earthdawn.com/namegiver", propOrder = {
    "attribute",
    "armor",
    "wound",
    "defense",
    "talent",
    "carry",
    "ability",
    "origin",
    "notdefaultskill",
    "defaultlanguage"
})
public class NAMEGIVERABILITYType {

    @XmlElement(name = "ATTRIBUTE", required = true)
    protected List<ATTRIBUTENAMEVALUEType> attribute;
    @XmlElement(name = "ARMOR", required = true)
    protected ARMORType armor;
    @XmlElement(name = "WOUND", required = true)
    protected WOUNDType wound;
    @XmlElement(name = "DEFENSE")
    protected List<DEFENSEABILITYType> defense;
    @XmlElement(name = "TALENT")
    protected List<TALENTABILITYType> talent;
    @XmlElement(name = "CARRY")
    protected List<TALENTABILITYType> carry;
    @XmlElement(name = "ABILITY")
    protected List<String> ability;
    @XmlElement(name = "ORIGIN")
    protected List<String> origin;
    @XmlElement(name = "NOTDEFAULTSKILL")
    protected List<String> notdefaultskill;
    @XmlElement(name = "DEFAULTLANGUAGE")
    protected List<CHARACTERLANGUAGEType> defaultlanguage;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "karmamodifier")
    protected Integer karmamodifier;
    @XmlAttribute(name = "movement_ground")
    protected Integer movementGround;
    @XmlAttribute(name = "movement_flight")
    protected Integer movementFlight;
    @XmlAttribute(name = "enduringarmorfactor")
    protected Float enduringarmorfactor;
    @XmlAttribute(name = "lang", required = true)
    protected LanguageType lang;
    @XmlAttribute(name = "type")
    protected String type;

    /**
     * Gets the value of the attribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getATTRIBUTE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATTRIBUTENAMEVALUEType }
     * 
     * 
     */
    public List<ATTRIBUTENAMEVALUEType> getATTRIBUTE() {
        if (attribute == null) {
            attribute = new ArrayList<ATTRIBUTENAMEVALUEType>();
        }
        return this.attribute;
    }

    /**
     * Gets the value of the armor property.
     * 
     * @return
     *     possible object is
     *     {@link ARMORType }
     *     
     */
    public ARMORType getARMOR() {
        return armor;
    }

    /**
     * Sets the value of the armor property.
     * 
     * @param value
     *     allowed object is
     *     {@link ARMORType }
     *     
     */
    public void setARMOR(ARMORType value) {
        this.armor = value;
    }

    /**
     * Gets the value of the wound property.
     * 
     * @return
     *     possible object is
     *     {@link WOUNDType }
     *     
     */
    public WOUNDType getWOUND() {
        return wound;
    }

    /**
     * Sets the value of the wound property.
     * 
     * @param value
     *     allowed object is
     *     {@link WOUNDType }
     *     
     */
    public void setWOUND(WOUNDType value) {
        this.wound = value;
    }

    /**
     * Gets the value of the defense property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the defense property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDEFENSE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DEFENSEABILITYType }
     * 
     * 
     */
    public List<DEFENSEABILITYType> getDEFENSE() {
        if (defense == null) {
            defense = new ArrayList<DEFENSEABILITYType>();
        }
        return this.defense;
    }

    /**
     * Gets the value of the talent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the talent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTALENT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TALENTABILITYType }
     * 
     * 
     */
    public List<TALENTABILITYType> getTALENT() {
        if (talent == null) {
            talent = new ArrayList<TALENTABILITYType>();
        }
        return this.talent;
    }

    /**
     * Gets the value of the carry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCARRY().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TALENTABILITYType }
     * 
     * 
     */
    public List<TALENTABILITYType> getCARRY() {
        if (carry == null) {
            carry = new ArrayList<TALENTABILITYType>();
        }
        return this.carry;
    }

    /**
     * Gets the value of the ability property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ability property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getABILITY().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getABILITY() {
        if (ability == null) {
            ability = new ArrayList<String>();
        }
        return this.ability;
    }

    /**
     * Gets the value of the origin property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the origin property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getORIGIN().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getORIGIN() {
        if (origin == null) {
            origin = new ArrayList<String>();
        }
        return this.origin;
    }

    /**
     * Gets the value of the notdefaultskill property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notdefaultskill property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNOTDEFAULTSKILL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNOTDEFAULTSKILL() {
        if (notdefaultskill == null) {
            notdefaultskill = new ArrayList<String>();
        }
        return this.notdefaultskill;
    }

    /**
     * Gets the value of the defaultlanguage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the defaultlanguage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDEFAULTLANGUAGE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CHARACTERLANGUAGEType }
     * 
     * 
     */
    public List<CHARACTERLANGUAGEType> getDEFAULTLANGUAGE() {
        if (defaultlanguage == null) {
            defaultlanguage = new ArrayList<CHARACTERLANGUAGEType>();
        }
        return this.defaultlanguage;
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
     * Gets the value of the karmamodifier property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getKarmamodifier() {
        if (karmamodifier == null) {
            return  0;
        } else {
            return karmamodifier;
        }
    }

    /**
     * Sets the value of the karmamodifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setKarmamodifier(Integer value) {
        this.karmamodifier = value;
    }

    /**
     * Gets the value of the movementGround property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getMovementGround() {
        if (movementGround == null) {
            return  0;
        } else {
            return movementGround;
        }
    }

    /**
     * Sets the value of the movementGround property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMovementGround(Integer value) {
        this.movementGround = value;
    }

    /**
     * Gets the value of the movementFlight property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getMovementFlight() {
        if (movementFlight == null) {
            return  0;
        } else {
            return movementFlight;
        }
    }

    /**
     * Sets the value of the movementFlight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMovementFlight(Integer value) {
        this.movementFlight = value;
    }

    /**
     * Gets the value of the enduringarmorfactor property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getEnduringarmorfactor() {
        if (enduringarmorfactor == null) {
            return  1.0F;
        } else {
            return enduringarmorfactor;
        }
    }

    /**
     * Sets the value of the enduringarmorfactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setEnduringarmorfactor(Float value) {
        this.enduringarmorfactor = value;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link LanguageType }
     *     
     */
    public LanguageType getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link LanguageType }
     *     
     */
    public void setLang(LanguageType value) {
        this.lang = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        if (type == null) {
            return "";
        } else {
            return type;
        }
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}
