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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="APPEARANCE" type="{http://earthdawn.com/datatypes}APPEARANCE_type"/&gt;
 *         &lt;element name="ATTRIBUTE" type="{http://earthdawn.com/datatypes}ATTRIBUTE_type" maxOccurs="6" minOccurs="6"/&gt;
 *         &lt;element name="DEFENSE" type="{http://earthdawn.com/datatypes}DEFENSE_type" maxOccurs="3" minOccurs="0"/&gt;
 *         &lt;element name="PROTECTION" type="{http://earthdawn.com/datatypes}PROTECTION_type" minOccurs="0"/&gt;
 *         &lt;element name="HEALTH" type="{http://earthdawn.com/datatypes}HEALTH_type" minOccurs="0"/&gt;
 *         &lt;element name="MOVEMENT" type="{http://earthdawn.com/datatypes}MOVEMENT_type" minOccurs="0"/&gt;
 *         &lt;element name="INITIATIVE" type="{http://earthdawn.com/datatypes}INITIATIVE_type" minOccurs="0"/&gt;
 *         &lt;element name="CARRYING" type="{http://earthdawn.com/datatypes}CARRYING_type" minOccurs="0"/&gt;
 *         &lt;element name="DISCIPLINE" type="{http://earthdawn.com/datatypes}DISCIPLINE_type" maxOccurs="3" minOccurs="0"/&gt;
 *         &lt;element name="QUESTOR" type="{http://earthdawn.com/datatypes}QUESTOR_type" minOccurs="0"/&gt;
 *         &lt;element name="PATH" type="{http://earthdawn.com/datatypes}PATH_type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SKILL" type="{http://earthdawn.com/datatypes}SKILL_type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="OPENSPELL" type="{http://earthdawn.com/datatypes}SPELL_type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LANGUAGE" type="{http://earthdawn.com/datatypes}CHARACTERLANGUAGE_type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="WEAPON" type="{http://earthdawn.com/datatypes}WEAPON_type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AMMUNITION" type="{http://earthdawn.com/datatypes}AMMUNITION_type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="MAGICITEM" type="{http://earthdawn.com/datatypes}MAGICITEM_type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PATTERNITEM" type="{http://earthdawn.com/datatypes}PATTERNITEM_type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="BLOODCHARMITEM" type="{http://earthdawn.com/datatypes}MAGICITEM_type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="THREADITEM" type="{http://earthdawn.com/datatypes}THREADITEM_type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="COINS" type="{http://earthdawn.com/datatypes}COINS_type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ITEM" type="{http://earthdawn.com/datatypes}ITEM_type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="KARMA" type="{http://earthdawn.com/datatypes}KARMA_type"/&gt;
 *         &lt;element name="DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RACEABILITES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="COMMENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PORTRAIT" type="{http://earthdawn.com/datatypes}base64binary_type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CALCULATEDLEGENDPOINTS" type="{http://earthdawn.com/character}CALCULATEDLEGENDPOINTS_type" minOccurs="0"/&gt;
 *         &lt;element name="EXPERIENCE" type="{http://earthdawn.com/datatypes}EXPERIENCE_type"/&gt;
 *         &lt;element name="DEVOTION" type="{http://earthdawn.com/datatypes}DEVOTION_type" minOccurs="0"/&gt;
 *         &lt;element name="CREATURE" type="{http://earthdawn.com/datatypes}CREATURE_type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="player" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="xsd-version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="1.1" /&gt;
 *       &lt;attribute name="editorpath" type="{http://www.w3.org/2001/XMLSchema}anyURI" default="" /&gt;
 *       &lt;attribute name="lang" type="{http://earthdawn.com/datatypes}language_type" default="en" /&gt;
 *       &lt;attribute name="rulesetversion" type="{http://earthdawn.com/datatypes}rulesetversion_type" default="ED3" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "appearance",
    "attribute",
    "defense",
    "protection",
    "health",
    "movement",
    "initiative",
    "carrying",
    "discipline",
    "questor",
    "path",
    "skill",
    "openspell",
    "language",
    "weapon",
    "ammunition",
    "magicitem",
    "patternitem",
    "bloodcharmitem",
    "threaditem",
    "coins",
    "item",
    "karma",
    "description",
    "raceabilites",
    "comment",
    "portrait",
    "calculatedlegendpoints",
    "experience",
    "devotion",
    "creature"
})
@XmlRootElement(name = "EDCHARACTER", namespace = "http://earthdawn.com/character")
public class EDCHARACTER {

    @XmlElement(name = "APPEARANCE", namespace = "http://earthdawn.com/character", required = true)
    protected APPEARANCEType appearance;
    @XmlElement(name = "ATTRIBUTE", namespace = "http://earthdawn.com/character", required = true)
    protected List<ATTRIBUTEType> attribute;
    @XmlElement(name = "DEFENSE", namespace = "http://earthdawn.com/character")
    protected List<DEFENSEType> defense;
    @XmlElement(name = "PROTECTION", namespace = "http://earthdawn.com/character")
    protected PROTECTIONType protection;
    @XmlElement(name = "HEALTH", namespace = "http://earthdawn.com/character")
    protected HEALTHType health;
    @XmlElement(name = "MOVEMENT", namespace = "http://earthdawn.com/character")
    protected MOVEMENTType movement;
    @XmlElement(name = "INITIATIVE", namespace = "http://earthdawn.com/character")
    protected INITIATIVEType initiative;
    @XmlElement(name = "CARRYING", namespace = "http://earthdawn.com/character")
    protected CARRYINGType carrying;
    @XmlElement(name = "DISCIPLINE", namespace = "http://earthdawn.com/character")
    protected List<DISCIPLINEType> discipline;
    @XmlElement(name = "QUESTOR", namespace = "http://earthdawn.com/character")
    protected QUESTORType questor;
    @XmlElement(name = "PATH", namespace = "http://earthdawn.com/character")
    protected List<PATHType> path;
    @XmlElement(name = "SKILL", namespace = "http://earthdawn.com/character")
    protected List<SKILLType> skill;
    @XmlElement(name = "OPENSPELL", namespace = "http://earthdawn.com/character")
    protected List<SPELLType> openspell;
    @XmlElement(name = "LANGUAGE", namespace = "http://earthdawn.com/character")
    protected List<CHARACTERLANGUAGEType> language;
    @XmlElement(name = "WEAPON", namespace = "http://earthdawn.com/character")
    protected List<WEAPONType> weapon;
    @XmlElement(name = "AMMUNITION", namespace = "http://earthdawn.com/character")
    protected List<AMMUNITIONType> ammunition;
    @XmlElement(name = "MAGICITEM", namespace = "http://earthdawn.com/character")
    protected List<MAGICITEMType> magicitem;
    @XmlElement(name = "PATTERNITEM", namespace = "http://earthdawn.com/character")
    protected List<PATTERNITEMType> patternitem;
    @XmlElement(name = "BLOODCHARMITEM", namespace = "http://earthdawn.com/character")
    protected List<MAGICITEMType> bloodcharmitem;
    @XmlElement(name = "THREADITEM", namespace = "http://earthdawn.com/character")
    protected List<THREADITEMType> threaditem;
    @XmlElement(name = "COINS", namespace = "http://earthdawn.com/character")
    protected List<COINSType> coins;
    @XmlElement(name = "ITEM", namespace = "http://earthdawn.com/character")
    protected List<ITEMType> item;
    @XmlElement(name = "KARMA", namespace = "http://earthdawn.com/character", required = true)
    protected KARMAType karma;
    @XmlElement(name = "DESCRIPTION", namespace = "http://earthdawn.com/character", defaultValue = "")
    protected String description;
    @XmlElement(name = "RACEABILITES", namespace = "http://earthdawn.com/character", defaultValue = "")
    protected String raceabilites;
    @XmlElement(name = "COMMENT", namespace = "http://earthdawn.com/character", defaultValue = "")
    protected String comment;
    @XmlElement(name = "PORTRAIT", namespace = "http://earthdawn.com/character")
    protected List<Base64BinaryType> portrait;
    @XmlElement(name = "CALCULATEDLEGENDPOINTS", namespace = "http://earthdawn.com/character")
    protected CALCULATEDLEGENDPOINTSType calculatedlegendpoints;
    @XmlElement(name = "EXPERIENCE", namespace = "http://earthdawn.com/character", required = true)
    protected EXPERIENCEType experience;
    @XmlElement(name = "DEVOTION", namespace = "http://earthdawn.com/character")
    protected DEVOTIONType devotion;
    @XmlElement(name = "CREATURE", namespace = "http://earthdawn.com/character")
    protected List<CREATUREType> creature;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "player")
    protected String player;
    @XmlAttribute(name = "xsd-version", required = true)
    protected String xsdVersion;
    @XmlAttribute(name = "editorpath")
    @XmlSchemaType(name = "anyURI")
    protected String editorpath;
    @XmlAttribute(name = "lang")
    protected LanguageType lang;
    @XmlAttribute(name = "rulesetversion")
    protected RulesetversionType rulesetversion;

    /**
     * Gets the value of the appearance property.
     *
     * @return
     *     possible object is
     *     {@link APPEARANCEType }
     *
     */
    public APPEARANCEType getAPPEARANCE() {
        return appearance;
    }

    /**
     * Sets the value of the appearance property.
     *
     * @param value
     *     allowed object is
     *     {@link APPEARANCEType }
     *
     */
    public void setAPPEARANCE(APPEARANCEType value) {
        this.appearance = value;
    }

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
     * {@link ATTRIBUTEType }
     *
     *
     */
    public List<ATTRIBUTEType> getATTRIBUTE() {
        if (attribute == null) {
            attribute = new ArrayList<ATTRIBUTEType>();
        }
        return this.attribute;
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
     * {@link DEFENSEType }
     *
     *
     */
    public List<DEFENSEType> getDEFENSE() {
        if (defense == null) {
            defense = new ArrayList<DEFENSEType>();
        }
        return this.defense;
    }

    /**
     * Gets the value of the protection property.
     *
     * @return
     *     possible object is
     *     {@link PROTECTIONType }
     *
     */
    public PROTECTIONType getPROTECTION() {
        return protection;
    }

    /**
     * Sets the value of the protection property.
     *
     * @param value
     *     allowed object is
     *     {@link PROTECTIONType }
     *
     */
    public void setPROTECTION(PROTECTIONType value) {
        this.protection = value;
    }

    /**
     * Gets the value of the health property.
     *
     * @return
     *     possible object is
     *     {@link HEALTHType }
     *
     */
    public HEALTHType getHEALTH() {
        return health;
    }

    /**
     * Sets the value of the health property.
     *
     * @param value
     *     allowed object is
     *     {@link HEALTHType }
     *
     */
    public void setHEALTH(HEALTHType value) {
        this.health = value;
    }

    /**
     * Gets the value of the movement property.
     *
     * @return
     *     possible object is
     *     {@link MOVEMENTType }
     *
     */
    public MOVEMENTType getMOVEMENT() {
        return movement;
    }

    /**
     * Sets the value of the movement property.
     *
     * @param value
     *     allowed object is
     *     {@link MOVEMENTType }
     *
     */
    public void setMOVEMENT(MOVEMENTType value) {
        this.movement = value;
    }

    /**
     * Gets the value of the initiative property.
     *
     * @return
     *     possible object is
     *     {@link INITIATIVEType }
     *
     */
    public INITIATIVEType getINITIATIVE() {
        return initiative;
    }

    /**
     * Sets the value of the initiative property.
     *
     * @param value
     *     allowed object is
     *     {@link INITIATIVEType }
     *
     */
    public void setINITIATIVE(INITIATIVEType value) {
        this.initiative = value;
    }

    /**
     * Gets the value of the carrying property.
     *
     * @return
     *     possible object is
     *     {@link CARRYINGType }
     *
     */
    public CARRYINGType getCARRYING() {
        return carrying;
    }

    /**
     * Sets the value of the carrying property.
     *
     * @param value
     *     allowed object is
     *     {@link CARRYINGType }
     *
     */
    public void setCARRYING(CARRYINGType value) {
        this.carrying = value;
    }

    /**
     * Gets the value of the discipline property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the discipline property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDISCIPLINE().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DISCIPLINEType }
     *
     *
     */
    public List<DISCIPLINEType> getDISCIPLINE() {
        if (discipline == null) {
            discipline = new ArrayList<DISCIPLINEType>();
        }
        return this.discipline;
    }

    /**
     * Gets the value of the questor property.
     *
     * @return
     *     possible object is
     *     {@link QUESTORType }
     *
     */
    public QUESTORType getQUESTOR() {
        return questor;
    }

    /**
     * Sets the value of the questor property.
     *
     * @param value
     *     allowed object is
     *     {@link QUESTORType }
     *
     */
    public void setQUESTOR(QUESTORType value) {
        this.questor = value;
    }

    /**
     * Gets the value of the path property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the path property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPATH().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PATHType }
     *
     *
     */
    public List<PATHType> getPATH() {
        if (path == null) {
            path = new ArrayList<PATHType>();
        }
        return this.path;
    }

    /**
     * Gets the value of the skill property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the skill property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSKILL().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SKILLType }
     *
     *
     */
    public List<SKILLType> getSKILL() {
        if (skill == null) {
            skill = new ArrayList<SKILLType>();
        }
        return this.skill;
    }

    /**
     * Gets the value of the openspell property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the openspell property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOPENSPELL().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SPELLType }
     *
     *
     */
    public List<SPELLType> getOPENSPELL() {
        if (openspell == null) {
            openspell = new ArrayList<SPELLType>();
        }
        return this.openspell;
    }

    /**
     * Gets the value of the language property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the language property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLANGUAGE().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CHARACTERLANGUAGEType }
     *
     *
     */
    public List<CHARACTERLANGUAGEType> getLANGUAGE() {
        if (language == null) {
            language = new ArrayList<CHARACTERLANGUAGEType>();
        }
        return this.language;
    }

    /**
     * Gets the value of the weapon property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the weapon property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWEAPON().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WEAPONType }
     *
     *
     */
    public List<WEAPONType> getWEAPON() {
        if (weapon == null) {
            weapon = new ArrayList<WEAPONType>();
        }
        return this.weapon;
    }

    /**
     * Gets the value of the ammunition property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ammunition property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAMMUNITION().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AMMUNITIONType }
     *
     *
     */
    public List<AMMUNITIONType> getAMMUNITION() {
        if (ammunition == null) {
            ammunition = new ArrayList<AMMUNITIONType>();
        }
        return this.ammunition;
    }

    /**
     * Gets the value of the magicitem property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the magicitem property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMAGICITEM().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MAGICITEMType }
     *
     *
     */
    public List<MAGICITEMType> getMAGICITEM() {
        if (magicitem == null) {
            magicitem = new ArrayList<MAGICITEMType>();
        }
        return this.magicitem;
    }

    /**
     * Gets the value of the patternitem property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the patternitem property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPATTERNITEM().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PATTERNITEMType }
     *
     *
     */
    public List<PATTERNITEMType> getPATTERNITEM() {
        if (patternitem == null) {
            patternitem = new ArrayList<PATTERNITEMType>();
        }
        return this.patternitem;
    }

    /**
     * Gets the value of the bloodcharmitem property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bloodcharmitem property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBLOODCHARMITEM().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MAGICITEMType }
     *
     *
     */
    public List<MAGICITEMType> getBLOODCHARMITEM() {
        if (bloodcharmitem == null) {
            bloodcharmitem = new ArrayList<MAGICITEMType>();
        }
        return this.bloodcharmitem;
    }

    /**
     * Gets the value of the threaditem property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the threaditem property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTHREADITEM().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link THREADITEMType }
     *
     *
     */
    public List<THREADITEMType> getTHREADITEM() {
        if (threaditem == null) {
            threaditem = new ArrayList<THREADITEMType>();
        }
        return this.threaditem;
    }

    /**
     * Gets the value of the coins property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coins property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCOINS().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COINSType }
     *
     *
     */
    public List<COINSType> getCOINS() {
        if (coins == null) {
            coins = new ArrayList<COINSType>();
        }
        return this.coins;
    }

    /**
     * Gets the value of the item property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the item property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getITEM().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ITEMType }
     *
     *
     */
    public List<ITEMType> getITEM() {
        if (item == null) {
            item = new ArrayList<ITEMType>();
        }
        return this.item;
    }

    /**
     * Gets the value of the karma property.
     *
     * @return
     *     possible object is
     *     {@link KARMAType }
     *
     */
    public KARMAType getKARMA() {
        return karma;
    }

    /**
     * Sets the value of the karma property.
     *
     * @param value
     *     allowed object is
     *     {@link KARMAType }
     *
     */
    public void setKARMA(KARMAType value) {
        this.karma = value;
    }

    /**
     * Gets the value of the description property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDESCRIPTION() {
        return description;
    }

    /**
     * Sets the value of the description property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDESCRIPTION(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the raceabilites property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRACEABILITES() {
        return raceabilites;
    }

    /**
     * Sets the value of the raceabilites property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRACEABILITES(String value) {
        this.raceabilites = value;
    }

    /**
     * Gets the value of the comment property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCOMMENT() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCOMMENT(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the portrait property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the portrait property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPORTRAIT().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Base64BinaryType }
     *
     *
     */
    public List<Base64BinaryType> getPORTRAIT() {
        if (portrait == null) {
            portrait = new ArrayList<Base64BinaryType>();
        }
        return this.portrait;
    }

    /**
     * Gets the value of the calculatedlegendpoints property.
     *
     * @return
     *     possible object is
     *     {@link CALCULATEDLEGENDPOINTSType }
     *
     */
    public CALCULATEDLEGENDPOINTSType getCALCULATEDLEGENDPOINTS() {
        return calculatedlegendpoints;
    }

    /**
     * Sets the value of the calculatedlegendpoints property.
     *
     * @param value
     *     allowed object is
     *     {@link CALCULATEDLEGENDPOINTSType }
     *
     */
    public void setCALCULATEDLEGENDPOINTS(CALCULATEDLEGENDPOINTSType value) {
        this.calculatedlegendpoints = value;
    }

    /**
     * Gets the value of the experience property.
     *
     * @return
     *     possible object is
     *     {@link EXPERIENCEType }
     *
     */
    public EXPERIENCEType getEXPERIENCE() {
        return experience;
    }

    /**
     * Sets the value of the experience property.
     *
     * @param value
     *     allowed object is
     *     {@link EXPERIENCEType }
     *
     */
    public void setEXPERIENCE(EXPERIENCEType value) {
        this.experience = value;
    }

    /**
     * Gets the value of the devotion property.
     *
     * @return
     *     possible object is
     *     {@link DEVOTIONType }
     *
     */
    public DEVOTIONType getDEVOTION() {
        return devotion;
    }

    /**
     * Sets the value of the devotion property.
     *
     * @param value
     *     allowed object is
     *     {@link DEVOTIONType }
     *
     */
    public void setDEVOTION(DEVOTIONType value) {
        this.devotion = value;
    }

    /**
     * Gets the value of the creature property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creature property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCREATURE().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CREATUREType }
     *
     *
     */
    public List<CREATUREType> getCREATURE() {
        if (creature == null) {
            creature = new ArrayList<CREATUREType>();
        }
        return this.creature;
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
     * Gets the value of the player property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPlayer() {
        return player;
    }

    /**
     * Sets the value of the player property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPlayer(String value) {
        this.player = value;
    }

    /**
     * Gets the value of the xsdVersion property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getXsdVersion() {
        if (xsdVersion == null) {
            return "1.1";
        } else {
            return xsdVersion;
        }
    }

    /**
     * Sets the value of the xsdVersion property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setXsdVersion(String value) {
        this.xsdVersion = value;
    }

    /**
     * Gets the value of the editorpath property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEditorpath() {
        if (editorpath == null) {
            return "";
        } else {
            return editorpath;
        }
    }

    /**
     * Sets the value of the editorpath property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEditorpath(String value) {
        this.editorpath = value;
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
        if (lang == null) {
            return LanguageType.EN;
        } else {
            return lang;
        }
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
     * Gets the value of the rulesetversion property.
     *
     * @return
     *     possible object is
     *     {@link RulesetversionType }
     *
     */
    public RulesetversionType getRulesetversion() {
        if (rulesetversion == null) {
            return RulesetversionType.ED_3;
        } else {
            return rulesetversion;
        }
    }

    /**
     * Sets the value of the rulesetversion property.
     *
     * @param value
     *     allowed object is
     *     {@link RulesetversionType }
     *
     */
    public void setRulesetversion(RulesetversionType value) {
        this.rulesetversion = value;
    }

}